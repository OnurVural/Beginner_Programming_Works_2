import java.awt.*;
/**
 * A simple Java class!
 * @ONUR
 */
public class MyDrawingPanel extends Panel
{
   // properties

   // constructors
   public MyDrawingPanel()
   {
       setSize( 300, 250);   
       setBackground(Color.yellow);
   }
   
   public MyDrawingPanel(int width, int heigth)
   {
       setSize( width, heigth);   
       setBackground(Color.yellow);
   }
   
   // methods
   public void changeColour()
   {
      setBackground(Color.cyan);  
   }

}