import java.util.*;

/**
 * Given an int array x, write recursive methods to find the location of: 
 * (a) the first instance of a target value in x, 
 * (b) the last instance of a target value in x 
 * (c) the locations of all instances of the target value in x.
 * @author Onur
 * @version 25.04.2020
 */ 
public class NO5
{
   public static int firstIntanceLocation( int target, int[] x, int left, int right )
   {
      
      if (right < left) 
         return -1; 
      if (x[left] == target) 
         return left; 
      if (x[right] == target) 
         return right; 
      return firstIntanceLocation(target, x, left+1, right-1); 
      
      
   }
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int[] x = {2,4,5,6,9,2,7,9,2,4,6};
      final int target = 6;
      // variables

      // program code
      System.out.println( firstIntanceLocation(target,x,0,x.length-1));


      System.out.println( "End.");
   }

}