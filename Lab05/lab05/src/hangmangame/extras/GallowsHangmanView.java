package hangmangame.extras;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import cs102.hangman.*;
import cs102.hangman.IHangmanView;
/**
 * The class to draw the gallows
 * @author ONUR
 * @version 11.04.2020
 */
public class GallowsHangmanView extends JPanel implements IHangmanView 
{
   // properties
   HangmanModel hm;
   Timer t;
  
   int y;
   int dy;
 
   
   // constructors
   public GallowsHangmanView(HangmanModel hm)
   {
      setBackground( Color.cyan);
      this.hm = hm; 
      t = new Timer( 1000, new MoveListener());
      y = 130;
      dy = -30;
      t.stop();
   }
   // methods
   /**
    * The method to paint the gallow
    * @param g graphics object to do the work of drawing
    */
   @Override
   public void paintComponent( Graphics g)
   {
      
      super.paintComponent(g);   
      g.fillRect(15,235,145,25);
      g.fillRect(35,50,15,195);
      g.fillRect(35,50,80,10);
      g.fillRect(110,50,5,30);
      g.setColor( Color.RED);
      
      if ( hm.getNumOfIncorrectTries() >= 1 )
      {
         g.fillOval(95,75,30,30);
      }
      if ( hm.getNumOfIncorrectTries() >= 2)
      {
         g.drawLine(110,75,110,180);  
      }
      if ( hm.getNumOfIncorrectTries() >= 3)
      {
         g.drawLine(110,110,65,y);

      }
      if ( hm.getNumOfIncorrectTries() >= 4)
      {
         g.drawLine(110,110,155,y);  

      }
      if ( hm.getNumOfIncorrectTries() >= 5)
      {
         g.drawLine(110,180,65,215);  
      }
      if ( hm.getNumOfIncorrectTries() >= 6)
      {
         g.drawLine(110,180,155,215);  
         g.drawString("GAME OVER!", 120,150);
         g.drawString("SECRET WORD: " + hm.getKnownSoFar(), 6,280);
         t.start(); //starts animation if stickman is fully drawn
      }
      if ( !(hm.hasLost()) && hm.isGameOver())
      {
          g.drawString("YOU WON!", 120,150); 
          g.drawString("SECRET WORD: " + hm.getKnownSoFar(), 6,280);
      }

      updateView( hm );
            
   }
   
   /**
    * The method to remind paintComponent method to repaint to restroe the previous drawings
    * @param hm is the attached hangman object
    */
   @Override
   public void updateView( Hangman hm )
   {
      if ( hm.getNumOfIncorrectTries() == 0 )//if the trial no is 0 that means new game has started
      {
         t.stop();   
      }
      repaint(); 
   }
   
   //inner class
   public class MoveListener implements ActionListener
   {
       @Override
       public void actionPerformed( ActionEvent e )
       {
              y = y + dy; 
              dy = -dy;//adds and substracts the value continously to give a sense of alternating movement
              updateView(  hm );
       }
     
   }
}