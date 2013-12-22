

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

    private Timer timer;
    private SpaceCraft[] ships;
    
    
    public LocalSpace() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.DARK_GRAY);
        setDoubleBuffered(true);

        

        timer = new Timer(10, this);
        timer.start();
    }


    public void paint(Graphics g, int shipnumber) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(ships[shipnumber].modules[0][0].getImage(), ships[shipnumber].getX(), ships[shipnumber].getY(), this);
        //ritar bara modul #1 just nu
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
        
    }


    public void actionPerformed(ActionEvent e) {
       // craft.move();
        repaint();  
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