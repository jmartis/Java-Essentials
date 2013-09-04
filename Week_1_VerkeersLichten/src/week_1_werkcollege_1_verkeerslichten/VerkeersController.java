package week_1_werkcollege_1_verkeerslichten;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;




public class VerkeersController extends JPanel implements ActionListener
{
  private VerkeersLichtModel model;
  private VerkeersLichtView  view;
  private JButton roodKnop, oranjeKnop, groenKnop;


  public VerkeersController ( VerkeersLichtModel model, VerkeersLichtView view )
  {
	
    // wat doe je met model en view?
	  this.model = model;
	  this.view = view;
	  

    // maak de achtergrondkleur van dit paneel donker-grijs
	  this.setBackground(Color.darkGray);

    // maak de knoppen
	  roodKnop = new JButton("Rood");
	  oranjeKnop = new JButton("Oranje");
	  groenKnop = new JButton("Groen");

    // voeg een ActionListener toe aan de knoppen
	  roodKnop.addActionListener(this);
	  oranjeKnop.addActionListener(this);
	  groenKnop.addActionListener(this);

    // maak de knoppen zichtbaar op het paneel
	  add(roodKnop);
	  add(oranjeKnop);
	  add(groenKnop);
  }


  public void actionPerformed( ActionEvent e )
  {
     if ( e.getSource() == roodKnop )
     {
       // zet het rode licht aan
    	 model.setRood();
     }
     if (e.getSource()== oranjeKnop)
     {
    	 model.setOranje();
     }
     if(e.getSource()== groenKnop)
     {
    	 model.setGroen();
     }
     view.repaint();

  }

}