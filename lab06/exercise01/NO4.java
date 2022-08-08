import java.util.*;

/**
 * Write a recursive method that prints out all the integers from a starting value s, to an end value e. 
 * Can you write a method that doesn't print the values, but returns them (in an ArrayList for example), 
 * so they can be further processed before printing?
 * @author Onur
 * @version 25.04.2020
 */ 
public class NO4
{
   //method that prints out all the integers from a starting value s, to an end value e
   public static void print( int s, int e ) 
   {
      if ( s <= e )
      {
         System.out.print( s + " ");
         print( s + 1, e );
      }
   }
   
   //method that doesn't print the values, but returns them (in an ArrayList for example)
   public static ArrayList transferToList( int s, int e, ArrayList list)
   {
     
      if ( s <= e )
      {
        
         list.add(s);
         transferToList( s+1, e, list ); 
      } 
      return list;
         
         

   }
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int s = 3;
      final int e = 7;
       
      // variables
      ArrayList list;
      // program code
      list = new ArrayList();
      print( s, e ); 
      System.out.println();
      System.out.println(transferToList( s,e, list ));
      
   }

}