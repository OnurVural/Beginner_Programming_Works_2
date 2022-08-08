package hangmangame.extras;
import cs102.hangman.Hangman;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
/**
 *Class to interact with the text field of hangman game
 * @author Onur
 * @version 11.04.2020
 */
public class TextFieldControlPanel extends JPanel
{
   // properties
   Hangman man;
   JTextField tf;
   
   // constructors
   public TextFieldControlPanel(Hangman man)
   {
      this.man = man;   
      this.tf = new JTextField(20);
      tf.addActionListener( new TextFieldListener());
      add(tf);
   }
   // methods
   
   /**
    *class to implement and add an instance of the Actionlistener@TM 
    */
   //named inner class
   class TextFieldListener implements ActionListener
   {
      String text;
      char letter;
      
      public void actionPerformed( ActionEvent e )
      {
         text = (String) tf.getText();   
         for ( int i = 0; i < text.length(); i++ )
         {
            letter = text.charAt(i);  
            man.tryThis(letter);
         }
         tf.setText("");
         
      } 
   }
   
}