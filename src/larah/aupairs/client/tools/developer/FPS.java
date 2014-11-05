/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package larah.aupairs.client.tools.developer;

import java.awt.BorderLayout;
import java.awt.MouseInfo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import larah.aupairs.client.Constants;

/**
 *
 * @author James
 * 
 * A class which represents the frames per second.
 */
public class FPS {
    
    private JFrame Jframe = new JFrame("Developer console.");
    private JPanel panel = new JPanel();
    private JLabel frameLabel = new JLabel("FPS: ");
    private JLabel cursorLabel = new JLabel("Mouse position: ");
    
    private long nextSecond = System.currentTimeMillis() + 1000;
    private int frameInLastSecond = 0;
    private int framesInCurrentSecond = 0;

    public FPS() {
        if(Constants.DEBUG_MODE) {
            panel.add(frameLabel, BorderLayout.SOUTH);
            panel.add(cursorLabel, BorderLayout.CENTER);        
            Jframe.add(panel);
            Jframe.setLocationRelativeTo(null);        
            Jframe.setSize(250, 65);
            Jframe.setVisible(true);
        } else {
            Jframe.setVisible(false);
        }
    }
    
    public int notifyDeveloper() {
        long currentTime = System.currentTimeMillis();
        if (currentTime > nextSecond) {
            nextSecond += 1000;
            frameInLastSecond = framesInCurrentSecond;
            framesInCurrentSecond = 0;
        }
        framesInCurrentSecond++;
        return frameInLastSecond;
    }
    
    public void display() {    
        frameLabel.setText("FPS: " + notifyDeveloper());
        cursorLabel.setText("Mouse position: "+ MouseInfo.getPointerInfo().getLocation().x + ", " + MouseInfo.getPointerInfo().getLocation().y);
    }
}
