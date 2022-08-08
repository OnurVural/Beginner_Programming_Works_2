import java.util.Scanner;

/**
 * Write a recursive method that returns the maximum value in the first n elements of an int array x
 * @author Onur
 * @version 25.04.2020
 */ 
public class NO3
{
   public static int max( int n, int[] x )
   {
      if( n == 1)//only checking one element = basic case
      {
         return x[n];//returns the element directly
      } 
      else 
      {           
         return Math.max(x[n-1], max (n-1, x));
      }
   }
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int[] x = {3,5,3,6,8,2,3,2};
      final int limit = 3;
      // variables

      // program code
      System.out.println(max( limit, x ));
   }

}