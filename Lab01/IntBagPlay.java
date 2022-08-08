import java.util.Scanner;

/**
 * program to efficiently compute & display the first 100 prime numbers
 * @author Onur
 * @version 16/02/2020
 */ 
public class IntBagPlay
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final int max = 100;
      
      // variables
      IntBag keeper;
      int counter;
      int no;
      boolean prime;
      
      // program code
      keeper = new IntBag();
      keeper.add(2);
      System.out.println( keeper );
      no = 3; //Generate and check candidate values sequentially from 3 onwards
      counter = keeper.size();
      
      while (counter != max) //adding any value found to be prime to the collection until the number of values in the collection is 100
      {
         prime = true;
         for (int k = 0; k < counter; k++) 
         {
            if ( no % keeper.get(k) == 0) //Efficiently check whether a candidate value is prime by attempting to divide it by each of the values in the collection. 
               prime = false;  
         }
         
         if (prime) 
            keeper.add(no);
         
         no = no + 1;
         counter = keeper.size();
      }
      
      ;
   }
   
}