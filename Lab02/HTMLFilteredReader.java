import cs1.SimpleURLReader;
/**
 * class printing the contents of url (an html version of the original plain text) and have it appear as in the part (a) without any of the html code in it!
 * @author ONUR
 * @version 01.03.2020
 */ 
public class HTMLFilteredReader extends MySimpleURLReader 
{
  // properties
  
  // constructors
  public HTMLFilteredReader( String url )
  {
    super(url);  
  }
  // methods
  
  /**
   * overrides the corresponding method in the new sub-class
   * @return only the text, without the html
   */
  @Override
  public String getPageContents()
  {
    boolean isTag;
    isTag = false;
    String htmlCode;
    htmlCode = super.getPageContents();
    String temp;
    temp = "";
    String filtered;
    filtered = "";
    
    for ( int i = 0; i < htmlCode.length(); i++ )
    {
      if (  htmlCode.charAt(i) == '<' ||  htmlCode.charAt(i) == '>' )
        isTag = !isTag;  
      if ( !isTag )
        temp = temp + htmlCode.charAt(i);
    }
    for ( int j = 0; j < temp.length(); j++ )
    {
      if (  temp.charAt(j) != '>' )
        filtered = filtered + temp.charAt(j);
      
    }
    return filtered;
  }
  
//     String temp;
//     temp = "";
//     String filtered;
//     filtered = "";
//     for ( int i = 0; i < htmlCode.length(); i++ )
//     {
//       if ( htmlCode.charAt(i) == '<')
//       { 
//          for ( int k = i; k != '>'; k++ )
//          {
//             temp = temp + temp.charAt(k); 
//             
//          }
//          filtered = filtered + filtered.concat(temp);
//       }
//       
//     }
//     return filtered;  
//   }
  
  
  public String getUnfilteredPageContents()
  {
    String htmlCode;
    htmlCode = super.getPageContents();
    return htmlCode;
  }
}
