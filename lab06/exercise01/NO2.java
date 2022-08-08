import java.util.Scanner;

/**
 * Write a recursive method double power( double x, int y) that computes x to the power y using repeated multiplication
 * @author Onur
 * @version 25.04.2020
 */ 
public class NO2
{
   //BASIC VERSION(without negative values)
//   public static double power( double x, int y)
//   {
//      if ( y != 0)
//      {
//         return x * power( x, y-1);  
//      }
//      return 1;
//   }
   //DEVELOPED VERSION
   public static double power( double x, int y)
   {
      if ( y < 0 )
      {
         return (1/x)*(power( x, y+1));  //if y is negative divide take x^-1(1/x)==> x^(y) 1/x^-y = x^-1 * x^y+1
      }
      else if ( y > 0 )
      {
         return x * power( x, y-1);  //y is decremented ( ex x^y = x*x^(y-1) = x*x*x^(y-2).......
      }
      return 1;
   }
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int no = 3;
      final int power = 3;
      // variables

      // program code
      System.out.println( power( no, power) );
      
      
      System.out.println( "End.");
   }

}