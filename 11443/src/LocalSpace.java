

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;


public class LocalSpace extends JPanel implements ActionListener {

    private SpaceCraft[] ships;
    
    
    public LocalSpace() {

    }


    public void paintShip(int shipnumber) {
   
    }


    public void actionPerformed(ActionEvent e) {
 
    }


    private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
         //   craft.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
         // craft.keyPressed(e);
        }
    }

}