package hangmangame.extras;

import java.awt.event.*;
import javax.swing.*;
import cs102.hangman.*;
/**
 * class to control the buttons 
 * @author ONUR
 * @version 11.04.2020
 */
public class HangmanLetterButtonsController implements ActionListener 
{
   // properties
   HangmanModel hm;
   
   // constructors
   public HangmanLetterButtonsController(HangmanModel hm)
   {
      this.hm = hm;
   }
   
   /**
    * evoked when button pressed and after it makes the button disabled
    * @param e is to perform actions
    */
   // methods
   public void actionPerformed( ActionEvent e )
   {
      JButton b;
      b = (JButton)e.getSource();
      hm.tryThis(b.getText().charAt(0));
//      b.setEnabled(false);
      
   } 
}