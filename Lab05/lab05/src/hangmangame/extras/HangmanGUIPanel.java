package hangmangame.extras;

import cs102.hangman.HangmanModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JPanel;
import cs102.hangman.Hangman;


/**
 * Collection of UI components to form a complete Hangman game. 
 * View components implement IHangmanView, so they can automatically update
 * whenever the hangmanModel associated with changes, changes.
 * Other components are hangman controllers that update the model.
 * @author ONUR
 * @version 11.04.2020
 */
public class HangmanGUIPanel extends JPanel {
   
   final int height = 550;
   final int width = 350;
   HangmanModel hm;
   TextFieldControlPanel tfcp;
   NewGameButtonControl ngbc;
   HangmanConsoleView hmcv;
   LabelsHangmanView lhv;
   GallowsHangmanView ghv;
   HangmanLetterButtonControls hlbc;
   
   public HangmanGUIPanel( HangmanModel hm) 
   {
      this.hm = hm;
      tfcp = new TextFieldControlPanel(hm);
      ngbc = new NewGameButtonControl(hm);
      lhv = new LabelsHangmanView();
      ghv = new GallowsHangmanView(hm);
      hlbc = new HangmanLetterButtonControls(hm);
      hlbc.addActionListener( new HangmanLetterButtonsController(hm));
      setPreferredSize( new Dimension( height, width) );
      setLayout( new BorderLayout() );
      setBackground(Color.cyan);
      hm.addView(lhv);
      hm.addView(ngbc);
      hm.addView(hlbc);
      add( tfcp, BorderLayout.NORTH);
      add( ngbc, BorderLayout.SOUTH);
      add( lhv, BorderLayout.WEST);
      add( ghv, BorderLayout.CENTER);
      add( hlbc, BorderLayout.EAST);
  
   }
   
}
