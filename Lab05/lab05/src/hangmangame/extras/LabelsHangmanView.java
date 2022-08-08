package hangmangame.extras;
import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.HangmanModel;
import cs102.hangman.IHangmanView;
import cs102.hangman.Hangman;
import java.awt.*;

/**
 * class to control labels to displayed them on frame
 * @author Onur
 * @version 11.04.2020
 */
public class LabelsHangmanView extends JPanel implements IHangmanView
{
   // properties
   JLabel l1;
   JLabel l2;
   JLabel l3;
   JLabel l4;
   final int height = 200;
   final int width = 100;
   
   // constructors
   public LabelsHangmanView()
   {
      setPreferredSize(new Dimension(height,width));
      setLayout( new GridLayout(4,1));
      l1 = new JLabel(); 
      l2 = new JLabel(); 
      l3 = new JLabel(); 
      l4 = new JLabel(); 
      add(l1);
      add(l2);
      add(l3);
      add(l4);
      setBackground(Color.green);
      
   }
   
   // methods
   /**
    * method to update the labels whenever scores changes
    * @param hm is HangMan object to interact with
    */
   @Override
   public void updateView( Hangman hm )
   {
      l1.setText( "KnownSoFar      = " + hm.getKnownSoFar() );
      l2.setText( "UsedLetters     = " + hm.getUsedLetters() );
      l3.setText( "IncorrectTries  = " + hm.getNumOfIncorrectTries());
      l4.setText( "HasLost         = " + hm.hasLost() );
//      System.out.println("AllLetters      = " + hm.getAllLetters() );
//      System.out.println("UsedLetters     = " + hm.getUsedLetters() );
//      System.out.println("IncorrectTries  = " + hm.getNumOfIncorrectTries() );
//      System.out.println("MaxAllowedTries = " + hm.getMaxAllowedIncorrectTries() );
//      System.out.println("HasLost         = " + hm.hasLost() );
//      System.out.println("GameOver        = " + hm.isGameOver() );         
   }
   
}