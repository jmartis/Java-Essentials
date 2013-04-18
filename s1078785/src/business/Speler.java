package business;

import java.util.ArrayList;

public class Speler {
	
	Highscores highscores;
	
	private ArrayList <String> Speler = new ArrayList<String>();
	
	public Speler(Highscores highscores){
		
		this.highscores = highscores;
		
	
		
		
	}


	
	
	
	
	public ArrayList<String> getSpeler() {
		return Speler;
	}

	public void setSpeler(ArrayList<String> speler) {
		Speler = speler;
	}

}
