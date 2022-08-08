/**
 * Shape class
 * @author Onur
 * @version 09.03.2020
 */
public abstract class Shape implements Locatable
{
   //properties
   int x; //x coordinate
   int y; //y coordinate
   
   // methods
   
   /**
    * Method to generate unique areas for each shape
    */
   public abstract double getArea();
   
   /**
    * to get x coordinate
    * @return x
    */
   public int getX()
   {
      return x;   
   }
   
   /**
    * to get y coordinate
    * @return y
    */
   public int getY()
   {
      return y;   
   }
   
   /**
    * to change/set coordinates
    * @param x is the x coordinate to change/set
    * @param y is the y coordinate to change/set
    */
   public void setLocation( int x, int y)
   {
      this.x = x;
      this.y = y;
   }
}