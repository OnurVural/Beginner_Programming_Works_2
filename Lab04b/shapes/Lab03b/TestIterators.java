import java.util.Scanner;
import java.util.Iterator;

/**
 * Testing our own iterator specifically designed for IntBag Objects
 * @author ONUR
 * @version 09.03.2020
 */ 
public class TestIterators 
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables

      // program code
      IntBag bag;
      bag = new IntBag();
      Iterator i, j;
      bag.add(1453);
      bag.add(1453);
      bag.add(1453);
      bag.add(1453);

//      bag.add(1);
//      bag.add(1);
//      bag.add(1);
//      bag.add(1);
//      bag.add(1);
      i = new IntBagIterator( bag);
      
      while ( i.hasNext() ) 
      {
        System.out.println( i.next() );
        
//        j = new IntBagIterator( bag);
         j = bag.iterator();
        
        while ( j.hasNext() )
        {
          System.out.println( "--" + j.next() );
        }
      }
   }

}