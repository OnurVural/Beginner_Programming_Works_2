
import java.util.Iterator;
import java.util.ArrayList;

/**
 * A simple solution to this is to write a new class, say, IntBagIterator, which implements Iterator. 
 * This class need have only two properties; aBag (a reference to the IntBag it is to iterate through) and index (the position of the next element to return from aBag).
 * @ONUR
 * @09.03.2020
 */
public class myIterator implements Iterator 
{
   // properties
   int position;
   ArrayList<Shape> container; 
   // constructors
   public myIterator()
   {
      position = 0;
      container = ShapeContainer.container; 
   }
   // methods
   /**
    * Tells if there is an element next in container
    * return true is there exists a next object false otherwise
    */
   public boolean hasNext() 
   {
      if ( position < container.size())
         return true;
      else
         return false;
   }
   
   /**
    * Gives the element next in container
    * return object is there exists a next object null otherwise
    */
   public Shape next() 
   {
      if ( this.hasNext())
         return container.get(position++);
      else
         return null;
   }
}