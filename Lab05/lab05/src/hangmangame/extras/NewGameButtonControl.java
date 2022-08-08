package hangmangame.extras;
import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.*;
/**
 * class to control new game button
 * @author Onur
 * @version 11.04.2020
 */
public class NewGameButtonControl extends JButton implements IHangmanView
{
   // properties
   HangmanModel hm;
   
   // constructors
   public NewGameButtonControl(HangmanModel hm)
   {
      this.hm = hm;
      setText( "New Game" );
      addActionListener( new ButtonListener());
      setEnabled(false);
      
   }
   // methods
   /**
    * method to update whether the button is disabled or not
    * @param hm is hangman object to interact w,th
    */
   @Override
   public void updateView( Hangman hm )
   {
      if ( this.hm.isGameOver())
      {
         setEnabled(true);   
      }
   }
   
   /**
    *class to implement and add an instance of the Actionlistener@TM 
    */
   //named inner class
   class ButtonListener implements ActionListener
   {
      
      public void actionPerformed( ActionEvent e )
      {
//         GallowsHangmanView.t.stop();
         hm.initNewGame();  
         setEnabled(false);
      } 
   }
   
   
   
}