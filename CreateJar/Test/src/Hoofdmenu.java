import javax.swing.JFrame;


public class Hoofdmenu {

	private int width = 800;
	private int height = 600;
	
	public int getWidth(){
		return width;
	}
	
	public void setWidth(int newWidth){
		width = newWidth;
		
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int newHeight){
		height = newHeight;
	}
	
	
	public Hoofdmenu(){
		
		JFrame venster = new JFrame();
		venster.setTitle("Test");
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setSize(width,height);
		venster.setLocation(100,100);
		venster.add(new achtergrond());
		venster.setResizable(false);
		venster.setVisible(true);
	}
}
