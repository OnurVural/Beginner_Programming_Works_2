//convert the code we wrote in the lecture to use Swing components instead of awt ones (what changes are needed?)
import java.util.Scanner;
//import java.awt.Frame;
//import java.awt.Button;
import java.awt.*;


/**
 * GUIDemo1
 * @author ONUR
 * @version 13/03/2020
 */ 
public class GUIDemo1
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      Frame  f;
      MyDrawingPanel p;
//      Button b;

      // program code
      System.out.println( "Start...");

      f = new Frame();
      
      new MyFrame();
      new MyFrame();
      
//      f.setSize( 400, 300);
//      f.setLayout( new FlowLayout() );
//      
//      b = new Button( "Neat");
//      f.add( b);
//      f.add( new Button( "OK, time to go!") );
//      
//      f.setVisible( true);
      p = new MyDrawingPanel();
      f.add(p);
      System.out.println( "End.");
   }

}