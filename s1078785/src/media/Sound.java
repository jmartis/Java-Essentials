package media;

import java.io.*;
import java.net.URL;

import javax.sound.sampled.*;

public class Sound {


	
	//private ClassLoader cldr = this.getClass().getClassLoader();
	
	//private final URL path = cldr.getResource("res-sounds/main-loop.wav");
	
		public static void starter(){
		sound = new File("res-sounds/main-loop.wav");
		new Thread(play).start();
		}
	
	static File sound;
	static boolean muted = false;
	static float volume = 100.0f; 
	static float pan = 0.0f; 
	
	static double seconds = 0.0d; 
	
	static boolean looped_forever = true; 
	
	static int loop_times = 0; 
	static int loops_done = 0; 
	
	final static Runnable play = new Runnable()
	{
		public void run()
		{
			try
			{
				
				if (sound.getName().toLowerCase().contains(".wav"))
				{
					AudioInputStream stream = AudioSystem.getAudioInputStream(sound);
					
					AudioFormat format = stream.getFormat();
					
					if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED)
					{
						format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
								format.getSampleRate(),
								format.getSampleSizeInBits() * 2,
								format.getChannels(),
								format.getFrameSize() * 2,
								format.getFrameRate(),
								true);
						
						stream = AudioSystem.getAudioInputStream(format, stream);
					}
					
					SourceDataLine.Info info = new DataLine.Info(
							SourceDataLine.class,
							stream.getFormat(),
							(int) (stream.getFrameLength() * format.getFrameSize()));
					
					SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
					line.open(stream.getFormat());
					line.start();
					
					
					FloatControl volume_control = (FloatControl) line.getControl(FloatControl.Type.MASTER_GAIN);
					volume_control.setValue((float) (Math.log(volume / 100.0f) / Math.log(10.0f) * 20.0f));
					
				
					BooleanControl mute_control = (BooleanControl) line.getControl(BooleanControl.Type.MUTE);
					mute_control.setValue(muted);
					
					//FloatControl pan_control = (FloatControl) line.getControl(FloatControl.Type.PAN);
				//	pan_control.setValue(pan);
					
					long last_update = System.currentTimeMillis();
					double since_last_update = (System.currentTimeMillis() - last_update) / 1000.0d;
					
				
					while (since_last_update < seconds)
					{
						since_last_update = (System.currentTimeMillis() - last_update) / 1000.0d;
					}
					
					System.out.println("Playing!");
					
					int num_read = 0;
					byte[] buf = new byte[line.getBufferSize()];
					
					while ((num_read = stream.read(buf, 0, buf.length)) >= 0)
					{
						int offset = 0;
						
						while (offset < num_read)
						{
							offset += line.write(buf, offset, num_read - offset);
						}
					}
					
					try {
						line.drain();
						line.stop();
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					if (looped_forever)
					{
						new Thread(play).start();
					}
					else if (loops_done < loop_times)
					{
						loops_done++;
						new Thread(play).start();
					}
				}
			}
			catch (Exception ex) { ex.printStackTrace(); }
		}
	};
}