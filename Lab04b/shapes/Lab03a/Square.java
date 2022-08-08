/**
 * Square class
 * @author Onur
 * @version 09.03.2020
 */
public class Square extends Rectangle implements Selectable
{
   // properties
   int side;
   
   // constructors
   public Square( int side)
   {
      super( side, side);
      this.side = side;
   }
   
   //methods
   
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
   public void setSelected( boolean truth)
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
      
      if ( this.x == x && this.y == y)
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
    * @return the radius, location and selected info
    */
   public String toString()
   {
      return " square with side of " + side +  ", area of " + getArea() + " on location " + getX() + "," + getY() + " and it being selected is " + selected;  
   }
   
}