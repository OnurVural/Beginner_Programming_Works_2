/**
 * Rectangle class
 * @author Onur
 * @version 09.03.2020
 */
public class Rectangle extends Shape implements Selectable
{
   // properties
   int width;
   int heigth;
   boolean selected;
   
   // constructors
   public Rectangle(int width, int heigth)
   {
      this.width = width;
      this.heigth = heigth;
      selected = false;
   }
   
   // methods
   
   /**
    * rectangle area method
    * @return area as double value
    */
   public double getArea()
   {
      return width * heigth;    
   }
   
   /**
    * to find out the selected
    * @return selected
    */
   public boolean getSelected()
   {
      return selected;   
   }
   
   /**
    * to change the fact if it is selected or not
    * @param truth is the truth value to set the selected property accordingly
    */
   public void setSelected( boolean truth )
   {
      selected = truth;   
   }
   
   /**
    * to give shape containing desire points
    * @param x is the x coordinate of point
    * @param y is the y coordinate of point
    * @return s is the shape if contains, null if not indicating the shape does not contain the desired point
    */
   public Shape contains( int x, int y)
   {
      Shape s;
      
      if ( this.x == x && this.y == y )
      {
         s = this;
      }
      else
      {
         s = null;
      }
      
      return s; 
   }
   
   /**
    * to represent the info as a String
    * @return the width, heigth, area, location and selected info
    */
   public String toString()
   {
      return " rectangle with width of " + width + ", heigth of " + heigth + ", area of " + getArea() + " on location " + getX() + "," + getY() + " and it being selected is " + getSelected();  
   }
   
   
}