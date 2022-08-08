
import java.awt.*;

/**
 *  
 * @ONUR 
 * @version 
 */ 
public class MyFrame extends Frame
{
   // properties

   // constructors
   public MyFrame()
   {
      Button b;
      Panel  p;
      
      // setSize( 400, 300);
      setLayout( new GridLayout(1,3) );
      
      p = new MyDrawingPanel();
      add( new MyPanel() );
      add( new MyPanel() ); 
      
      p.setLayout( new GridLayout(2,3) );
//      
//      p.add( new Label( "Welcome to the ONLINE world") );
//
//      p.add( new TextField( 25) );
//
//      b = new Button( "Neat");
//      p.add( b);
//      p.add( new Button( "OK, time to go!") );
      
      add( p);
      
      pack();
      setVisible( true);      
   }
   

   // methods
     
}