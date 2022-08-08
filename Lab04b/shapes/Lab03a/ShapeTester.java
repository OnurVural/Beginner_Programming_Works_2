import java.util.Scanner;

/**
 * TESTING SHAPE CLASS BY CREATÝNG A MENU WITH MULTIPLE OPTÝONS 
 * @author ONUR
 * @version 09.03.2020
 */ 
public class ShapeTester
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      
      
      // variables
      int radius;
      int selection;
      int heigth;
      int width;
      int x;
      int y;
      Shape s;
      ShapeContainer container;
         
      // program code
      container = null;
      
      do
      {
         System.out.println( "----------------------------------------------------------");
         
         System.out.println( " Enter option number accordingly...");
         System.out.println( " 1) create an empty set of shapes ");
         System.out.println( " 2) add as many circle and rectangle shapes");
         System.out.println( " 3) learn the total surface area of the entire set of shapes ");
         System.out.println( " 4) print out information about all of the shapes in the container ");
         System.out.println( " 5) find the first Shape that contains a given x, y point and, afterwards, toggle its selected state ");
         System.out.println( " 6) remove all selected shapes from the set of shapes ");
         System.out.println( " 7) EXIT ");
         System.out.println( "----------------------------------------------------------");
         
         selection = scan.nextInt();
         
         if ( selection == 1)
         {
            container = new ShapeContainer();  
            System.out.println( " CREATED...");
         }
         
         else if ( selection == 2)
         {
            if ( container == null)
            {
               System.out.println( " YOU SHOULD CREATE CONTAINER FIRST TO HOLD SHAPES...");   
            }
            
            else
            {
               System.out.println( " Enter option number accordingly...");
               System.out.println( " 1) create circle "); 
               System.out.println( " 2) create rectangle "); 
               System.out.println( " 3) create square "); 
               
               selection = scan.nextInt();
               
               if ( selection == 1 )
               {
                  System.out.println( " Enter radius...");
                  radius = scan.nextInt();
                  s = new Circle(radius);
//                  System.out.println( " Enter location points as x and y respectively...");
//                  x = scan.nextInt();
//                  y = scan.nextInt(); 
//                  s.setLocation( x, y );
                  container.add(s);
                  System.out.println( " CIRCLE CREATED AND ADDED...");
               }
               
               else if ( selection == 2 )
               {
                  System.out.println( " Enter width...");
                  width = scan.nextInt();
                  System.out.println( " Enter heigth...");
                  heigth = scan.nextInt();
                  s = new Rectangle( width, heigth);   
//                  System.out.println( " Enter location points as x and y respectively...");
//                  x = scan.nextInt();
//                  y = scan.nextInt(); 
//                  s.setLocation( x, y );
                  container.add(s);
                  System.out.println( " RECTANGLE CREATED AND ADDED...");
               }
               
               else if ( selection == 3 )
               {
                  System.out.println( " Enter side...");
                  width = scan.nextInt();
                  s = new Square( width );  
//                  System.out.println( " Enter location points as x and y respectively...");
//                  x = scan.nextInt();
//                  y = scan.nextInt(); 
//                  s.setLocation( x, y );
                  container.add(s);
                  System.out.println( " SQUARE CREATED AND ADDED...");
               }
            }
         }
         
         else if ( selection == 3)
         {
            if ( container == null)
            {
               System.out.println( " YOU SHOULD CREATE CONTAINER FIRST TO HOLD SHAPES...");   
            }
            
            else
            {
               System.out.println( " TOTAL AREA IS " + container.getArea());
            }
         }
         
         else if ( selection == 4)
         {
            if ( container == null)
            {
               System.out.println( " YOU SHOULD CREATE CONTAINER FIRST TO HOLD SHAPES...");   
            }
            else
            {
               System.out.println( container );  
            }
         }
         
         else if ( selection == 5)
         {
            if ( container == null)
            {
               System.out.println( " YOU SHOULD CREATE CONTAINER FIRST TO HOLD SHAPES...");   
            }
            else
            {
               System.out.println( "Enter point as x and y respectively..." );  
               x = scan.nextInt();
               y = scan.nextInt();       
               
//               container.find(x,y);
               container.selectAllAt(x,y);
            }
         }
         
         else if ( selection == 6)
         {
            if ( container == null)
            {
               System.out.println( " YOU SHOULD CREATE CONTAINER FIRST TO HOLD SHAPES...");   
            }
            else
            {
               container.removeSelected();
            }
         }
      } while ( selection != 7 );
      
      System.out.println( " Bye, see you next time...");
      
   }
   
}