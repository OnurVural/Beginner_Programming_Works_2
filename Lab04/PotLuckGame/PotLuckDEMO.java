import java.util.Scanner;

/**
 * TO ACTIVATE THE POTLUCK GAME WE NEED TO USE A MAIN METHOD CLASS
 * @author ONUR
 * @version 30.03.2020
 */ 
public class PotLuckDEMO
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      PotLuck game;
      
      // program code
      System.out.println( "Start...");
      game = new PotLuck();
      System.out.println( "End.");
   }
}