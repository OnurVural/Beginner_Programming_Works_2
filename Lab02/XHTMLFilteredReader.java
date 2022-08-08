import cs1.SimpleURLReader;
import java.util.ArrayList;
/**
 * class for Computing the overhead due to the html code (the percentage increase in size between the html and no-html contents.)
 * @author ONUR
 * @version 01.03.2020
 */ 
public class XHTMLFilteredReader extends HTMLFilteredReader
{
  // properties
  
  // constructors
  public XHTMLFilteredReader( String url )
  {
    super(url);  
  }
  // methods
  /**
   * computes the overhead due to the html code (the percentage increase in size between the html and no-html contents.)
   * @return the percentage increase
   */
  public int overhead()
  {
    String temp1;
    String temp2;
    int length1;
    int length2;
    int percentage;
    temp1 = super.getUnfilteredPageContents();
    temp2 = super.getPageContents();
    length1 = temp1.length();
    length2 = temp2.length();
    percentage = ((length1 - length2)/(length1)) * 100;
    return percentage;
  }
  /**
   * gives a list of the url's that the page links to
   * @return the list of links as a String array
   */
  public ArrayList<String> getLinks()
  {
    ArrayList<String> temp;
    temp = new ArrayList<String>();
    String tempS;
    tempS = super.getUnfilteredPageContents();
    String s;
    s = "";
    
    for ( int i = 0; i < tempS.length(); i++ )
    {
      if (  tempS.indexOf( "href=", i) == i )
      {
        for ( int k = i + 5; tempS.charAt(k) != '>'; k++ )
        {
          s = s + tempS.charAt(k);
         
        }
        temp.add(s);
        s = "";
      }
      
    }
    return temp;
  }
}