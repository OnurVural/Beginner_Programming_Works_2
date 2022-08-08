import cs1.SimpleURLReader;
/**
 * extends the SimpleURLReader class, adding two methods to it: getURL() that returns the url String used to create the SimpleURLReader object, and getName() that returns the filename part of the url, that is, the part of the url following the last '/' character
 * @author ONUR
 * @version 01.03.2020
 */ 

public class MySimpleURLReader extends SimpleURLReader
{
  // properties
  String url;
  
  // constructors
  public MySimpleURLReader( String url )
  {
    super(url);  
    this.url = url;
  }
  // methods
  /**
   * returns the url String used to create the SimpleURLReader object
   * @return url string
   */
  public String getURL()
  {
    return url;
  }
  
  /**
   * returns the filename part of the url, that is, the part of the url following the last '/' character
   * @return url filename
   */
  public String getName()
  {
    String temp;
    temp = "";
    String temp2;
    temp2 = "";
    
    for ( int i = url.length()- 1; url.charAt(i) != '/'; i-- )
    {
      temp = temp + url.charAt(i);  
    }
    
    for ( int k = temp.length()- 1; k >= 0; k-- )
    {
      temp2 = temp2 + temp.charAt(k);  
    }
    return temp2;
  }
  
  /**
   * overrides the corresponding method in the new sub-class
   * @return the string representations inside the url using the url finder integrated in the method
   */
  @Override
  public String getPageContents()
  {
    String temp;
    temp = super.getPageContents(); 
    temp = temp.substring(4);
    return temp;
  }
  
  
}