package week_1_werkcollege_1_verkeerslichten;


public class VerkeersLichtModel
{
  private boolean rood, oranje, groen;

  public VerkeersLichtModel ( boolean rood, boolean oranje, boolean groen )
  {
    this.rood = rood;
    this.oranje = oranje;
    this.groen = groen;
  }

  // settters
  public void setRood()
  {
    // zet alle lichten uit
	  reset();
    // zet rood aan
	  rood = true;
  }

  public void setOranje()
  {
    // alle lichten uit
	  reset();
    // zet oranje aan
	  oranje = true;
  }

  public void setGroen()
  {
    // alle lichten uit
	  reset();
    // zet groen aan
	  groen = true;

  }

  public void reset() // alle lichten uit
  {
    rood = false;
    oranje = false;
    groen = false;
    
  }

  // getters
  public boolean getRood()
  {
	return rood;
  }

  public boolean getOranje()
  {
	return oranje;
  }

  public boolean getGroen()
  {
	return groen;
  }


}