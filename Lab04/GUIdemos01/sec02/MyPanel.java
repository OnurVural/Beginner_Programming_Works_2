import java.awt.*;

public class MyPanel extends Panel
{
   
   public MyPanel()
   {
      Button b;
      
      setLayout( new FlowLayout() );
      
      add( new Label( "Welcome to ONLINE Java") );   
      b = new Button( "Hello");
      add( b);
     
      add( new TextField( 25) );
   }
}
