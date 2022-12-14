import java.util.Iterator;
/**
 * Lab01 ~ Bags of integers!
 * Using array to develop an arrayList in a sense
 * @author Onur
 * version 16/02/2020
 */
public class IntBag 
{
   // properties
   private int[] bag;
   public int valid = 0;
   
   // constructors
   //creates an empty collection (with room for up to 100 elements)
   public IntBag()
   {
      bag = new int[100];
   }
   
   //makes the desired maximum number of elements as a parameter
   public IntBag( int noOfElements )
   {
      bag = new int[noOfElements];   
   }
   
   // methods
   
   /**
    * add a value to the end of the collection
    * @param num is the desired number to add the bag array
    */
   public void add( int num )
   {
      if ( bag.length > valid )
      {
         bag[valid] = num;
         valid++;
      }
      else
         System.out.println( "The array is full" );
   }
   
   /**
    * add a value at a particular index location i within it (moving other values "up" to make room and checking i is within bounds)
    * @param i is the desired location
    * @param num is the desired number to add the bag array
    */
   public void add( int i, int num)
   {
      if ( bag.length > valid && i <= valid)
      {
         valid++;
         for ( int j = valid - 1; j > i; j--)
         {
            bag[ j ] = bag[j - 1];   
         }
         bag[i] = num;
      }
      else
         System.out.println( "The LOCAT?ON ?S OFF BOUNDRIES..." );
   }
   
   /**
    * remove the value at a given index (moving other values back "down" the array)
    * @param i is the desired location
    */
   public void remove( int i)
   {
      for ( int j = i + 1; j < bag.length; j++)
      {
         bag[ j - 1] = bag[j];   
      }
      valid--;
   }
   
   /**
    * test whether the collection contains a given value or not
    * @param num is the searched number
    * @return true if the num is included on the list
    */
   public boolean contains( int num )
   {
      int pos = 0;
      while ( bag[pos] != num && pos <= valid )
      {
         pos++;
         if ( bag[pos] == num )
            return true; //found        
      }
      return false; //not found
   }
   
   /**
    * returns a String representation of the collection
    * @return array as a String
    */
   public String toString()
   {
      String temp;
      temp = "";
      
      for ( int i = 0; i < valid; i++ )
      {
         temp = temp + bag[i] + ",";      
      }
      
      return temp;
   }
   
   /**
    * returns the number of values currently in the collection
    * @return valid/used numbers
    */
   public int size()
   {
      return valid;
   }
   
   /**
    * allows you to get the value at location i within the collection.
    * @param i is the searching location
    * @return value at i
    */
   public int get( int i )
   {
      return bag[i];   
   }
   
   /**
    * returns the locations (indexes) of all instances of a given value in the collection
    * @param num is the searched number
    * @return the indexes respectively
    */
   public String findAll( int num )
   {
      String temp;
      temp = ":";
      
      for ( int j = 0; j <= valid; j++ )
      {
         if ( bag[j] == num )
            temp = temp + Integer.toString(j) + ","; 
      }
      
      return temp; 
//     int pos;
//     pos = 0;
//     ArrayList<Integer> temp;
//     temp = new ArrayList<Integer>();
//     for ( int j = 0; j <= valid; j++ )
//      {
//         if ( bag[pos] == num )
//            temp.add(num); 
//      }
//     return temp;
   }
   
   /**
    * create an instance of IntBagIterator and return it as the interface type
    * @return instance of IntBagIterator
    */
   public Iterator iterator()
   {
      Iterator temp;
      temp = new IntBagIterator(this);
      return temp;
      
   }
   
   
}