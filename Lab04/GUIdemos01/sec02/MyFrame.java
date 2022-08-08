import java.awt.*;

/**
 *  
 * @author 
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
      
      // setSize( 450, 300);
      setLayout( new FlowLayout() );
      
      add( new MyPanel() );
      add( new MyPanel() );
      add( new MyPanel() );

//      p = new Panel();
//      p.setLayout( new FlowLayout() );
//      
//      p.add( new Label( "Welcome to ONLINE Java") );
//      
//      b = new Button( "Hello");
//      p.add( b);
//      // add(  new Button( "Time for a break!" ) );
//      
//      p.add( new TextField( 25) );
      
//      add(p);
      
      pack();
      setVisible( true);      
   }

   // methods
     
}