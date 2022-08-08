/**
 * Design and implement a GUI application that presents a game based on a 5 by 5 grid of buttons. 
 * One of the buttons (selected at random) "hides" the prize. 
 * A status bar at the top of the window shows the number of guesses.
 * When the prize button is pressed, the status bar shows "You got it in x attempts!"
 * @author Onur
 * @version 30.03.2020
 */
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PotLuck extends Frame implements ActionListener
{

   //constants
   final int HEIGHT = 5;
   final int WIDTH = 5;
   
   // properties
   int counter;
   Button prizeButton;
   Button exit;
   Button newGame;
   int prizeNo;
   Panel topBar;
   Panel p;
   Frame f;
   Button b;
   Button[] buttons;
   Label l;
   
   // constructors
   public PotLuck()
   {
      
      counter = 0;
      
      
      topBar =  new Panel();
      p = new Panel();
      f = new Frame();
      buttons = new Button[HEIGHT * WIDTH];
      prizeNo = (int)(Math.random() * buttons.length + 1 );
      l = new Label("WELOME TO THE POTLUCK GAME, GOOD LUCK ");
      exit = new Button( "EXIT" );
      newGame = new Button("RESTART");
      topBar.add( l );
      topBar.add( newGame );
      topBar.add( exit );
      System.out.println(prizeNo);
      
      f.setLayout( new BorderLayout());
      p.setLayout( new GridLayout( HEIGHT,WIDTH));
      topBar.setLayout( new FlowLayout());
      f.setSize( 800, 800 );
      f.addWindowListener( new MyWindowListener());
      exit.addActionListener( new CloseListener());
      newGame.addActionListener( new RestartListener() );
      
      for ( int i = 0; i < buttons.length ; i++ )
      {
         String s;
         s = Integer.toString(i+1);
         buttons[i] = new Button(s);  
         if ( i % 3 == 0 )
            buttons[i].setBackground(Color.ORANGE);
         else if ( i % 3 == 1 )
            buttons[i].setBackground(Color.GREEN);
         else 
            buttons[i].setBackground(Color.LIGHT_GRAY);

          p.add( buttons[i] );
         (buttons[i]).addActionListener( this );
      }
      
      f.add( topBar, BorderLayout.NORTH );
      f.add( p, BorderLayout.CENTER );
      prizeButton = buttons[prizeNo-1];
      f.setVisible(true);
   }
   
   //methods
   
   public void actionPerformed( ActionEvent e)
   {
      counter++;
      l.setText( "The Number Of Guesses Is " + counter + " Try again please" );   
      Button pressed = (Button)e.getSource();
      pressed.disable();

      if ( prizeButton.equals( pressed ))
      {
         l.setText( "You got it in " + counter + " attempts!" );
         
         for( int i = 0; i < buttons.length ; i++ )
         {
            (buttons[i]).disable(); 
         }
         
      }
   }
   //NAMED INNER CLASS1
   public class RestartListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e) 
      {
         f.dispose();
         new PotLuck();
      }
   }
   //NAMED INNER CLASS2
   public class CloseListener implements ActionListener
   {
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        f.dispose();
//        System.exit(0);
    }
}
   //NAMED INNER CLASS3
   public class MyWindowListener extends WindowAdapter // MyWindowAdapter
   {    
      @Override
      public void windowClosing( WindowEvent e)  
      {
         System.out.println( "Closing window!");
         f.dispose();
         
      }   
   }
   
}
