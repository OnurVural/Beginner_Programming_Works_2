package hangmangame.extras;
import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.*;
/**
 * Button controller to interact with buttons 
 * @author ONUR
 * @version 11.04.2020
 */
public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView 
{
   // properties
   HangmanModel hm;
   
   // constructors
   public HangmanLetterButtonControls( HangmanModel hm)
   {
      super( "abcdefgh?jklmnopqrstuvwxyz"); 
      this.hm = hm;  
   }
   
   // methods
   /**
    * The method to interact with buttons
    * @param hm is the attached hangman object
    */
   @Override
   public void updateView( Hangman hnm )
   {
      setDisabled(hm.getUsedLetters());
      
      if ( hm.isGameOver())
      {  
         setEnabledAll(true); 
      }
   }
}