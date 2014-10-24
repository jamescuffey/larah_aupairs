package larah.aupairs;

import java.awt.*;
import larah.aupairs.login.LoginHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.LayerUI;
import larah.aupairs.developer.FPS;
import larah.aupairs.frames.AupairFrame;
import larah.aupairs.task.Task;
import larah.aupairs.task.TaskScheduler;

/**
 *
 * @author James
 * 
 * This will be the main class that handles the user interface.
 */
public class Main extends javax.swing.JFrame {

    /**
     * Initialises the task scheduler class instance.
     */
    public static TaskScheduler scheduler = new TaskScheduler();
    
    /**
     * Gets the task scheduler class instance.
     * @return scheduler
     */
    public static TaskScheduler getTaskScheduler() {
        return scheduler;
    }
    
    /**
     * Initialises the frames per second class instance.
     */
    public static FPS frames = new FPS();
    
    /**
     * Gets the frames per second class instance.
     * @return framesPerSecond
     */
    public static FPS getFramesPerSecond() {
        return frames;
    }
  

    /**
     * Small documentation notes:
     * 
     * http://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/_nimbusDefaults.html#primary
     *  UIManager.put("nimbusBase", new Color(...)); - buttons etc
        UIManager.put("nimbusBlueGrey", new Color(...)); - the whole frame
        UIManager.put("control", new Color(...)); - background
     * 
     */

    /**
     * Creates new form Main.
     */
    public Main() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.labelMainLoading.setVisible(false);
        
        //our main application cycle - to update objects.
        scheduler.schedule(new Task() {
	@Override
	protected void execute() {   
                generateTime();
                if(Constants.DEBUG_MODE) {
                    frames.display();
                    //System.out.println("FPS: " + fps.notifyDeveloper()); 
                }
  
            }
        });
       displayAnimation();
       
      // ButtonGroup group = new ButtonGroup();
    }
   
    private void generateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        labelDate.setText("Local time: " + dateFormat.format(date));         
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        group = new javax.swing.ButtonGroup();
        buttonNewAupair = new javax.swing.JButton();
        buttonMatchAupair = new javax.swing.JButton();
        buttonNewFamily = new javax.swing.JButton();
        labelTime = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelMainLoading = new javax.swing.JLabel(Constants.loading);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		
		//jPanel1.setBorder(new LineBorder(Color.blue));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Larah aupairs");

        buttonNewAupair.setLabel("New aupair");
        buttonNewAupair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewAupairActionPerformed(evt);
            }
        });

        buttonMatchAupair.setText("Match aupair");
        buttonMatchAupair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMatchAupairActionPerformed(evt);
            }
        });

        buttonNewFamily.setLabel("New family");

        labelTime.setToolTipText("The date and time.");

        labelDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDate.setText("Local time:");

        labelMainLoading.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMainLoading.setText("Loading...");
        labelMainLoading.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                labelMainLoadingPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buttonNewAupair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(buttonMatchAupair)
                        .addGap(128, 128, 128)
                        .addComponent(buttonNewFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelMainLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179)
                                .addComponent(labelTime)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewAupair)
                    .addComponent(buttonMatchAupair)
                    .addComponent(buttonNewFamily))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(labelTime))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelMainLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonNewAupair.getAccessibleContext().setAccessibleName("buttonNewAupair");
        buttonMatchAupair.getAccessibleContext().setAccessibleName("buttonMatchAupair");
        buttonNewFamily.getAccessibleContext().setAccessibleName("buttonNewFamily");
		
        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonNewAupairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewAupairActionPerformed
        this.labelMainLoading.setVisible(true);
        scheduler.schedule(new Task(5) {
	@Override
	protected void execute() {  
                labelMainLoading.setVisible(false);
                new AupairFrame().setVisible(true);
                super.stop();
            }
        });
    }//GEN-LAST:event_buttonNewAupairActionPerformed
  
    private void buttonMatchAupairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMatchAupairActionPerformed

    }//GEN-LAST:event_buttonMatchAupairActionPerformed

    private void labelMainLoadingPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_labelMainLoadingPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_labelMainLoadingPropertyChange


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //javax.swing.UIManager.put("nimbusBase", Color.lightGray);
                    UIManager.put("nimbusBlueGrey", Color.getHSBColor(242,242,189));
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(Constants.DEBUG_MODE) {
                    new Main().setVisible(true);
                } else {
                    new LoginHandler().setVisible(true);
                }
            }

        });
    }

    private final SoftJButton softButton1 = new SoftJButton("A new aupair directory has been completed.");
    private final SoftJButton softButton2 = new SoftJButton("A new family directory has been completed.");
    private Timer alphaChanger;
  
    private void displayAnimation() {
        softButton1.setBackground(Color.getHSBColor(275, 59, 86));
        //softButton2.setBackground(Color.getHSBColor(168, 83, 89));
        softButton2.setBackground(Color.getHSBColor(275, 59, 86));
        softButton1.setBounds(10, 312, 350, 30);
        softButton2.setBounds(10, 312, 350, 30);
        setAnimationLogic(1);
      
        
        alphaChanger = new Timer(50, new ActionListener() {

            private float incrementer = -.03f;

            @Override
            public void actionPerformed(ActionEvent e) {
                float newAlpha = softButton1.getAlpha() + incrementer;
                if (newAlpha < 0) {
                    newAlpha = 0;
                    incrementer = -incrementer;
                } else if (newAlpha > 1f) {
                    newAlpha = 1f;
                    incrementer = -incrementer;
                }
                softButton1.setAlpha(newAlpha);
                softButton2.setAlpha(newAlpha);
            }
        });
        alphaChanger.start();
    }
    
    private static class SoftJButton extends JButton {

        private static final JButton lafDeterminer = new JButton();
        private static final long serialVersionUID = 1L;
        private boolean rectangularLAF;
        private float alpha = 1f;

        SoftJButton() {
            this(null, null);
        }

        SoftJButton(String text) {
            this(text, null);
        }

        SoftJButton(String text, Icon icon) {
            super(text, icon);

            setOpaque(false);
            setFocusPainted(false);
        }

        public float getAlpha() {
            return alpha;
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
            repaint();
        }

        @Override
        public void paintComponent(java.awt.Graphics g) {
            java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            if (rectangularLAF && isBackgroundSet()) {
                Color c = getBackground();
                g2.setColor(c);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
            super.paintComponent(g2);
        }

        @Override
        public void updateUI() {
            super.updateUI();
            lafDeterminer.updateUI();
            rectangularLAF = lafDeterminer.isOpaque();
        }
    }
    
    /**
     * Sets the animation logic of a button.
     * @param logic 
     */
    private void setAnimationLogic(int logic) { 
        switch(logic) {
            case 0:
                add(softButton1);
                scheduler.schedule(new Task(Constants.TIMER_AMOUNT) {
                @Override
                protected void execute() {   
                    remove(softButton1);
                    validate();
                    repaint();
                    super.stop();
                    }
                });
                break;
            case 1:
                 add(softButton2);
                 scheduler.schedule(new Task(Constants.TIMER_AMOUNT) {
                  @Override
                 protected void execute() {   
                       remove(softButton2);
                       validate();  
                       repaint();
                       super.stop();
                }
               });
           break;    
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMatchAupair;
    public javax.swing.JButton buttonNewAupair;
    private javax.swing.JButton buttonNewFamily;
    private javax.swing.ButtonGroup group;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labelDate;
    public javax.swing.JLabel labelMainLoading;
    private javax.swing.JLabel labelTime;
    // End of variables declaration//GEN-END:variables
      

}





