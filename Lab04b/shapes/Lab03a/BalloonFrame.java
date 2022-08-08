import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * The BALLOONFRAME
 * @author ONUR
 * @version 6.04.2020
 */ 

public class BalloonFrame extends JFrame 
{
   // properties
   BalloonsGamePanel p;
  
   
   // constructors
   public BalloonFrame()
   {
      setTitle( "Lab04b - Balloons");
      setLayout( new FlowLayout());
      p = new BalloonsGamePanel();
      add(p);
      setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
      pack();
      setVisible(true);
  
   }
   // methods
  
   
}