import java.util.Scanner;
import java.util.ArrayList;
/**
 * simple menu-driven program that will maintain a collection of MySimpleURLReader objects
 * @author Onur
 * @version 02.03.2020
 */ 
public class Menu
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);

    // constants
    
    // variables
    ArrayList<MySimpleURLReader> readerCollection;
    MySimpleURLReader urlRead;
    int selection;
    int indexNo;
    int menuNo;
    String url;
    
    // program code
    url = "";
    urlRead = new MySimpleURLReader(url);
    readerCollection = new ArrayList<MySimpleURLReader>();
    
    do
    {
      System.out.println("--------------------------------------------------------------------------------");
      System.out.println("Welcome to the poem collection, enter the number to select the desired option...");
      System.out.println(" (1) Enter the url of the poem to add to collection ");
      System.out.println(" (2) List all poems in the collection ");
      System.out.println(" (3) Quit ");
      System.out.println("--------------------------------------------------------------------------------");
      
      selection = scan.nextInt();
      
      if ( selection == 1 )
      {
        System.out.println("Enter url");
        url = scan.next();
        
        for (int i = 0; i < url.length(); i++ ) 
        {
          if ( url.indexOf( "htm" ) == i)
          {
            urlRead = new HTMLFilteredReader(url);  
          }
          
          else if ( url.indexOf( "html" ) == i)
          {
            urlRead = new XHTMLFilteredReader(url);  
          }
          
          else if (url.indexOf( "txt" ) == i)
          {
            urlRead = new MySimpleURLReader(url);
            
          }
        } 
        
        readerCollection.add( urlRead );
        System.out.println("addition completed");
        
      }
      
      else if ( selection == 2 )
      {
        if ( readerCollection.size() != 0 )
        {
           
           do
           {
              for ( int i = 0; i < readerCollection.size(); i++ )
              {
                 System.out.println( "document is " + readerCollection.get(i).getName() + " index is " + i + "," );
              }
              
              System.out.println( "Enter the index no to view the desired document, Enter the LAST index no+1 to return main menu" );
              indexNo = scan.nextInt();
              
              if ( indexNo < readerCollection.size() );//readerCollection.size()NO WORK
              {
                 System.out.println( readerCollection.get(indexNo).getPageContents() ); 
              }
 
           }while ( indexNo!= readerCollection.size() );

        }
        else
          System.out.println( "there are no poems" );  
      }
      
      
    } while ( selection != 3 );
    System.out.println( "Bye, see you next time..." );  
  }
  
}