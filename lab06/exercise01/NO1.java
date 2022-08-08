import java.util.Scanner;

/**
 * Write the Java code for each of the basic printReverse & printForward routines
 * @author Onur
 * @version 25.04.2020
 */ 
public class NO1
{
   //FIRST WAY--------------------------------------------------------------------
   public static void printReverse( int n, int[] x)
   {
      if ( n > 0 )
      {
          System.out.print(x[n-1] + ","); //first prints the nth value 
          printReverse( n-1, x); //then proceeds
      }
   }
   
   public static void printForward( int n, int[] x)
   {
      if ( n > 0 )
      {
          printForward( n-1, x); //first proceeds which means it will go on until reaches the first
          System.out.print(x[n-1] + ",");  //then prints
      }
   }
   //------------------------------------------------------------------------------------
   //SECOND WAY--------------------------------------------------------------------  
   public static void printR( int s, int e, int[] x)
   {
      if ( s < e )
      {
          printR( s+1, e, x); //first proceeds which means it will go on until reaches the first
          System.out.print(x[s] + ","); //then prints the first value 
      }
   }
   
   public static void printF( int s, int e, int[] x)
   {
      if ( s < e )
      {
          System.out.print(x[s] + ","); //first prints the first value 
          printF( s+1, e, x); //then proceeds 
      }
   }
   //-------------------------------------------------------------------------------------
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int[] x = {3,4,8,3,1,2,9};
      final int n = 5;
      final int s = 1;
      // variables
      
      // program code
      System.out.println( "1ST WAY");
      printReverse(n, x); 
      System.out.println();
      printForward( n, x);
      System.out.println();
      System.out.println("2ND WAY");
      printR(s,n,x);
      System.out.println();
      printF(s,n,x);
      
      

   }

}