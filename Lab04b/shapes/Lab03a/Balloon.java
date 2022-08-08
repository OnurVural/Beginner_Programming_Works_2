import java.awt.Graphics;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;

/**
 * The game where you pop balloons and gain points
 * @author ONUR
 * @version 6.04.2020
 */ 

public class Balloon extends Circle implements Drawable 
{
   // properties
   final int limitOfCircleMargin = 600;
   Random r;
   int x;
   int y;
   Color c;
   int red;
   int blue;
   int green;
   
   // constructors
   public Balloon()
   {
      super( 25 );   
      r = new Random();
      y = r.nextInt(limitOfCircleMargin);
      x = r.nextInt(limitOfCircleMargin);
//      c = new Color((int)(Math.random() * 0x1000000));
      setLocation(x,y);
      
      red = (int) (Math.random() * 256);
      green = (int) (Math.random() * 256);
      blue = (int) (Math.random() * 256);
      c = new Color(red, green, blue);
   }
   
   // methods
   /**
    * implements Drawable and draws a circle at specified coordinates
    */ 
   public void draw( Graphics g)
   { 
      
      g.setColor( c);
      g.fillOval( getX() - radius , getY() - radius , radius * 2, radius *2);   
   }
   
   /**
    * increases the radius of the balloon (Circle) by a fixed number of units, 
    * up to a maximum size, say 100, 
    * at which point the circle should be selected and the radius set to zero
    */ 
   public void grow()
   {
     int unit;
     unit = 2;
     if ( radius < 100 )
     {
        radius = radius + unit; 
     }
     else
     {
         setSelected( true );
         radius = 0;   
     }
     
   }
}