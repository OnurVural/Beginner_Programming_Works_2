import java.util.Iterator;
/**
 * A simple solution to this is to write a new class, say, IntBagIterator, which implements Iterator. 
 * This class need have only two properties; aBag (a reference to the IntBag it is to iterate through) and index (the position of the next element to return from aBag).
 * @ONUR
 * @09.03.2020
 */
public class IntBagIterator implements Iterator 
{
   // properties
   IntBag aBag;
   int index;
   
   // constructors
   public IntBagIterator(IntBag bag)
   {
     aBag = bag;
     index = 0;
     
   }
   // methods
   
   public Object next()
   {
     return (Integer)(aBag.get(index));  
   }
   
   public boolean hasNext()
   {
     if ( index < aBag.size() )
     {   
         index++;
         return true;  
     }
     return false;
   }
}