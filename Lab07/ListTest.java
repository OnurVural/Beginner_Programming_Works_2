import java.util.Scanner;
import junit.framework.TestCase;

/**
 * Test class for our List class
 * @author Onur
 * @version 10.05.2020
 */ 
public class ListTest extends TestCase
{
   /**
    * method that creates a new list initialised from the given array of Strings
    * @param stringArray is the given array of Strings
    * @return newly created list
    */ 
   public static List createFrom( String[] stringArray )
   {
      List list;
      list = new List();
      
      for ( int i = stringArray.length - 1; i >= 0; i-- )
      {
         list.addToHead( stringArray[i]);    
      }
      
      return list;     
   }
   
   /**
    * method that creates a new list initialised from the given  Strings
    * @param string is the given String
    * @return newly created list
    */ 
   public static List createFrom( String string )
   {
      List list;
      list = new List();  
      
      while ( string.length() > 0)
      {
         list.addToTail(string.substring(0,1));  
         string = string.substring(1);
      }
      
      return list;
   }
   //testing boolean methods------------------------------------------------------------------
   
   //method for testing isEmpty()
   public void testIsEmpty()
   {
      List list;
      boolean truth;
      
      list = new List();
      //must return true because we did not add any elements
      truth = list.isEmpty();  
      assertTrue( "true", truth); 
   }
   
   //method for testing contains( String target)
   public void testContains()
   {
      List list;
      boolean truth;
      
      list = new List();
      
      //add some elements 
      list.addToHead( "dog");
      list.addToHead( "horse");
      list.addToHead( "snake");
      
      truth = list.contains( "snake"); // true if target is in the list, else false
      assertTrue( "true", truth); 
   }
   
   //method for testing isOrdered()
   public void testIsOrdered()
   {
      List list;
      boolean truth;
      
      list = new List();
      
      //add some elements 
      list.addToTail( "apple");
      list.addToTail( "banana");
      list.addToTail( "orange");
      
      truth = list.isOrdered(); // true if list is ordered alphabetically
      assertTrue( "true", truth);      
   }
   //end of boolean methods testing-----------------------------------------------------------
   
   //String methods unit tests----------------------------------------------------------------
   
   //method for testing removeFromHead()
   public void testRemoveFromHead()
   {
      
      List list;
      String expected;  
      String actual;
      
      list = new List();
      
      //add some elements 
      list.addToHead( "dog");
      list.addToHead( "horse");
      list.addToHead( "snake");   
      
      expected = "snake";  
      actual = list.removeFromHead();
      assertEquals( "must remove and return at the head", expected, actual);
   }
   
   //method for testing getData( int index)
   public void testGetData()
   {
      int index;
      List list;
      String expected;  
      String actual;
      
      index = 1;
      list = new List();
      
      //add some elements 
      list.addToHead( "dog");
      list.addToHead( "horse");
      list.addToHead( "snake");   
      
      expected = "horse";  
      actual = list.getData( index); //calls method to get element at desired index
      assertEquals( "must return data at index", expected, actual);
      
      //lets try with invalid index
      index = 10;
      expected = null;  
      actual = list.getData( index); //invalid index returns null
      assertEquals( "invalid index must return null", expected, actual);
   }
   
   //end of String methods testing-----------------------------------------------------------
   
   
   
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final String[] s = {"apple","banana","potato","orange"};
      final String[] ss1 = {"A","D","C"};
      final String[] ss2 = {"K","B","A","C","R"};
      final String first = "ADC";
      final String second = "KBACR";
      final int index = 2;
      
      // variables
      List list;
      List stringcopy;
      List l1;
      List l2;
      String str;
      
      // program code
      //-----------------------------------------------------------------------
      System.out.println("-----------------------------------------------------");
      System.out.println( "PART 1: GENERAL METHODS"); 
      list = new List();
      str = "Monkey";
      System.out.println( "List being empty is " + list.isEmpty()); 
      
      //add some elements 
      list.addToHead( "dog"); 
      list.addToHead( "horse");
      list.addToHead( "snake");
      System.out.println();
      System.out.println( "The list is = " + list);
      System.out.println();
      
      //demonstrating print method
      System.out.println( "List before removal from head is: ");
      list.print();
      list.removeFromHead();
      System.out.println();
      
      System.out.println();
      System.out.println( "List after removal from head is: ");
      list.print(); // use print method
      System.out.println();
      
      System.out.println();
      System.out.println("List being empty is " + list.isEmpty()); // calling is empty
      System.out.println();
      
      System.out.println( "Reverse printing our list:"); 
      list.printReverse(); // calling print reverse
      System.out.println();
      
      list.addToTail( "dragon"); // using addToTail
      list.addToTail( "mouse");  // using addToTail
      System.out.println();
      
      System.out.println( "List after adding two elements to tail:"); 
      list.print(); // use print method
      System.out.println();
      
      System.out.println();
      System.out.println("List containing the element named horse is: " + list.contains( "horse")); // using contains
      System.out.println("List containing the element named horse is: " + list.contains( "cat")); // using contains
      System.out.println();
      
      System.out.println("The list is: " + list);
      System.out.println();
      
      System.out.println( "The element at index " + index + " is: " + list.getData( index )); // use getData method
      System.out.println();
      
      System.out.println( "list being ordered is " + list.isOrdered() ); 
      list.removeFromHead(); // using our removal method
      System.out.println( "list being ordered after removal of horse is " + list.isOrdered() ); 
      System.out.println( "END OF PART 1"); 
      System.out.println("-----------------------------------------------------");
      System.out.println();
      
      //-----------------------------------------------------------------------
      System.out.println( "PART 2: FURTHER APPLICATIONS"); 
      stringcopy = createFrom( s ); // using create method from array
      System.out.println( "The list created from string array is " + stringcopy ); 
      stringcopy = createFrom( str ); // using create method from string
      System.out.println( "The list created from string is " + stringcopy ); 
      System.out.println( "END OF PART 2");
      System.out.println("-----------------------------------------------------");
      System.out.println();
      
      //-----------------------------------------------------------------------
      System.out.println( "PART 3: LIST MERGER"); 
      
      l1 = createFrom( ss1 );
      l2 = createFrom( ss2 );
      System.out.println( "Our first list is " + l1);
      System.out.println( "Our second list is " + l2);
      
      stringcopy = list.merger( l1, l2 ); // calling merger method
      System.out.println( "New list after calling merger( List a, List b) is: " + stringcopy );
      System.out.println( "END OF PART 3");
      System.out.println("-----------------------------------------------------");
      //-----------------------------------------------------------------------
   }
   
}