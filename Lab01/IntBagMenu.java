import java.util.Scanner;

/**
 * program that presents the user with a menu having the following options to test IntBag (which can be selected in any order by typing the corresponding number):
 * @author Onur
 * @version 16/02/2020
 */ 
public class IntBagMenu
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int selection;
      int capacity;
      int location;
      int inputNo;
      int testNo;
      String locations;
      IntBag list;
      
      // program code
      list = new IntBag();
      locations = "";
      testNo = 0;
      
      do
      {
         System.out.println( "-------------------------------------------------" );
         System.out.println( "Welcome, please enter the number accordingly " );
         System.out.println( "1) Create a new empty collection with a specified maximum capacity (any previous values are lost!) " );                      
         System.out.println( "2) Read a set of positive values into the collection (use a negative value to indicate all the values have been entered.) ");                                                                                                                                                                                                       
         System.out.println( "3) Print the collection of values." );
         System.out.println( "4) Add a value to the collection of values at a specified location" );                      
         System.out.println( "5) Remove the value at a specified location from the collection of values ");                      
         System.out.println( "6) Read a single test value. " );                      
         System.out.println( "7) Compute the set of locations of the test value within the collection " );                      
         System.out.println( "8) Print the set of locations. " );                      
         System.out.println( "9) Quit the program. ");                
         System.out.println( "-------------------------------------------------" );  
         selection = scan.nextInt();
         
         if ( selection == 1 )
         {
            System.out.println( "Enter the capacity..." ); 
            capacity = scan.nextInt();
            list = new IntBag( capacity ); 
         }
         else if ( selection == 2 )
         {
            System.out.println( "Enter values to add the list, enter negative to stop..." );
            inputNo = 0;
            inputNo = scan.nextInt();
            while ( inputNo >= 0 )
            {
               list.add( inputNo );
               inputNo = scan.nextInt();
            }
         }
         else if ( selection == 3 )
         {
            System.out.println( list );     
         }
         else if ( selection == 4 )
         {
            System.out.println( "Enter location..." ); 
            location = scan.nextInt();
            System.out.println( "Enter value..." );
            inputNo = scan.nextInt();
            list.add( location, inputNo );    
         }
         else if ( selection == 5 )
         {
            System.out.println( "Enter location to remove the value..." ); 
            location = scan.nextInt();   
            list.remove( location );
         }
         else if ( selection == 6 )
         {
            System.out.println( "Enter test value..." ); 
            testNo = scan.nextInt();      
         }
         else if ( selection == 7 )
         {  
            locations = list.findAll( testNo );       
         }
         else if ( selection == 8 )
         {
            System.out.println( locations );     
         }
         
      }while( selection != 9);
      System.out.println( " Bye, see you next time... " );
      
      
   }
   
}