import cs1.SimpleURLReader;
/**
 * Test program that will read the contents of this url and print its contents and the number of lines it contains, on the console
 * @author ONUR
 * @version 01.03.2020
 */ 
public class urlTester
{
   public static void main( String[] args)
   {

      // constants

      // variables
      XHTMLFilteredReader sur;
      String url;
      
      // program code
      url = "http://www.cs.bilkent.edu.tr/~david/index.html";
      sur = new XHTMLFilteredReader(url);
      System.out.println( sur.overhead());
      System.out.println( sur.getPageContents());
      System.out.println( sur.getLineCount());
      System.out.println( sur.getURL());
      System.out.println( sur.getName());
      System.out.println( sur.getLinks());
   }

}