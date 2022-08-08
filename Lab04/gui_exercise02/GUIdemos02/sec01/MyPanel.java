import java.awt.*;
import java.awt.event.*;

/**
 *  
 * @author 
 * @version 
 */ 
public class MyPanel extends Panel implements ActionListener
{
   // properties
   Label      label;
   TextField  tf;
   Panel p;
   Button b;   
   // constructors
   public MyPanel()
   {
      
      
      setLayout( new FlowLayout() );
      
      label = new Label( "Welcome to the ONLINE world");
      add( label);

      tf = new TextField( 25);
      tf.addActionListener( this);
      add( tf );

      b = new Button( "Neat");
      b.setText("ooo");
      add( b);
      b.addActionListener( this );
      b.addActionListener( new MyActionListener() );
      b.addActionListener( new ActionListener() {
         public void actionPerformed( ActionEvent e)
         {
            int i = 0;
            System.out.println( "Button Pressed! in MALAnon");
            if ( i % 2 == 0 )
            {
               b.setText("OK");   
            }
            else
            {
                b.setText("MAY BE");     
            }
            i++;
         }    
      });
//      b.addActionListener( 
//         e -> System.out.println( "Button Pressed! in Lambda")  
//      );
      
      // add( new Button( "OK, time to go!") );
      
      
      p = new Panel();
      p.setBackground( Color.cyan);
      p.setPreferredSize( new Dimension( 300, 300) );
      add( p);
      
      
   }

   // methods
   public void actionPerformed( ActionEvent e)
   {
      if ( e.getSource() != tf ) 
         System.out.println( "Button Pressed! in MPAL");
      else
         System.out.println( "TextField enter Pressed! in MPAL");
      
      label.setText( tf.getText() );
   }
   
   // Named Inner class
   public class MyActionListener implements ActionListener
   {
      public void actionPerformed( ActionEvent e)
      {
         System.out.println( "Button Pressed! in MALNIL");
         
         // wrong way to do it!
         // proper way is overriding the paint method.
         Graphics g;
         g = p.getGraphics();
         g.drawString( "Pressed!", 100, 100 );
      }
   }
   
   // other Named Inner class
   public class MyOtherActionListener implements ActionListener
   {
      public void actionPerformed( ActionEvent e)
      {
         System.out.println( "button pressed");
         
         // wrong way to do it!
         // proper way is overriding the paint method.
         Graphics g;
         g = p.getGraphics();
         g.drawString( "Pressed!", 100, 100 );
      }
   }

     
}