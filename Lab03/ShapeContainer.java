import java.util.ArrayList;
/**
 * Shape container class based on java's arraylist(TM)
 * @author Onur
 * @version 09.03.2020
 */
public class ShapeContainer
{
   // properties
   ArrayList<Shape> container;

   // constructors
   public ShapeContainer()
   {
      container = new ArrayList<Shape>();   
   }
   // methods
   
   /**
    * add !(ANY)! shape to collection
    * @param s is ANY shape
    */
   public void add( Shape s)
   {
      container.add(s);   
   }
   
   /**
    * total area method
    * @return the total area of all shapes inside the collection
    */
   public double getArea()
   {
      double area;
      area = 0;
      
      for ( int i = 0; i < container.size(); i++ ) 
      {
         area = area + container.get(i).getArea();   
      }
      
      return area;
      
   }
   
   /**
    * information about shape
    * @return String representation as information about the string
    */
    public String toString()
    {
       String info;
       info = "";
       
       for ( int i = 0; i < container.size(); i++)
       {
           info = info + " At location " + i + ", there is a " + container.get(i) + '\n';   
       }
       return info;
    }
    
    /**
    * find the first Shape that contains a given x, y point and, afterwards, toggles its selected state
    * @param x is the x coordinate to search
    * @param y is the y coordinate to search
    */
    public void find(int x, int y)
    {
//       Shape anyShape; //
       boolean found;
       found = false;
       
       for ( int i = 0; i < container.size() && found == false; i++ )
       {

          if ( container.get(i) instanceof Circle && ((Circle)container.get(i)).contains(  x,  y) != null )
          {
             ((Circle)container.get(i)).setSelected( true );
             found = true;
          }
          
          else if ( container.get(i) instanceof Rectangle && ( (Rectangle)container.get(i)).contains(  x,  y) != null )
          {
             ((Rectangle)container.get(i)).setSelected( true );
             found = true;
          }
//           }
//           else if ( (Square)container.get(i) )
//           {
//             else if ( container.get(i) instanceof Square &&( (Square)container.get(i)).contains(  x,  y) != null )
//               {
//                  ((Square)container.get(i)).setSelected( true );
//                  found = true;
//               }   
//                
//           }
       }

    }

    //------------
    public void removeSelected()
    {
       for ( int i = 0; i < container.size(); i++ )   
       {
          if ( container.get(i) instanceof Circle && ((Circle)container.get(i)).getSelected() == true )
          {
             container.remove(i);   
          }
          
          else if ( container.get(i) instanceof Rectangle && ((Rectangle)container.get(i)).getSelected() == true )
          {
             container.remove(i);   
          }
       }
    }

}