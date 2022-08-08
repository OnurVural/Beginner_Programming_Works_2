/**
 * A simple Java interface for shapes to be for shapes to be Selectable
 * @author ONUR
 * @version 09.03.2020
 */
public interface Selectable
{
   // properties

   // constructors
   
   // methods
   //to find out the selected
   boolean getSelected();
   
   //to change the fact if it is selected or not
   void setSelected( boolean truth);
   
   //to give shape containing desire points
   Shape contains( int x, int y);
   

}