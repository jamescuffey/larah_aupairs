package larah.aupairs.client.frames;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
import larah.aupairs.Engine;
import larah.aupairs.client.Constants;
import larah.aupairs.client.Utilities;
import larah.aupairs.client.tools.developer.FPS;
import larah.aupairs.client.task.Task;
import larah.aupairs.client.tools.developer.BlurredLightCells;


/**
 *
 * @author James
 * 
 * This will be the main class that handles the user interface.
 */
public final class Main extends javax.swing.JFrame implements Runnable {
  

    /**
     * Initialises the frames per second class instance.
     */
    private static final FPS frames = new FPS();
    
    /**
     * Gets the frames per second class instance.
     * @return framesPerSecond
     */
    public static FPS getFramesPerSecond() {
        return frames;
    }
    
    /**
     * Creates new form Main.
     */
    public Main() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("images/salutation.png"));
        Utilities.setTrayIcon();
        
        jPanel2.setOpaque(false);
  
    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        group = new javax.swing.ButtonGroup();
        labelTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonNewFamily = new javax.swing.JButton();
        buttonMatchAupair = new javax.swing.JButton();
        buttonNewAupair = new javax.swing.JButton();
        labelDate = new javax.swing.JLabel();
        websiteButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        setName("mainFrame"); // NOI18N
        setResizable(false);

        labelTime.setToolTipText("The date and time.");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client options\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        buttonNewFamily.setLabel("New family");
        buttonNewFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewFamilyActionPerformed(evt);
            }
        });

        buttonMatchAupair.setText("Match aupair");
        buttonMatchAupair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMatchAupairActionPerformed(evt);
            }
        });

        buttonNewAupair.setLabel("New aupair");
        buttonNewAupair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewAupairActionPerformed(evt);
            }
        });

        labelDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDate.setText("Local time:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonNewAupair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(buttonMatchAupair)
                .addGap(91, 91, 91)
                .addComponent(buttonNewFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewFamily)
                    .addComponent(buttonMatchAupair)
                    .addComponent(buttonNewAupair))
                .addGap(18, 18, 18)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        buttonNewFamily.getAccessibleContext().setAccessibleName("buttonNewFamily");
        buttonMatchAupair.getAccessibleContext().setAccessibleName("buttonMatchAupair");
        buttonNewAupair.getAccessibleContext().setAccessibleName("buttonNewAupair");

        websiteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\James\\Desktop\\Larah aupairs\\images\\view.png")); // NOI18N
        websiteButton.setText("View website");
        websiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                websiteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(labelTime)
                            .addGap(15, 15, 15))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(websiteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(websiteButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void buttonNewAupairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewAupairActionPerformed
        if(Utilities.rights.getRights() != 1) {
            Utilities.setAlert(3);
        } else {
            Engine.scheduler.schedule(new Task(2) {
            @Override
            protected void execute() {  
                new AupairFrame().setVisible(true);
                super.stop();
            }
        });
        }
    }//GEN-LAST:event_buttonNewAupairActionPerformed
  
    private void buttonMatchAupairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMatchAupairActionPerformed
        if(Utilities.rights.getRights() != 1) {
            Utilities.setAlert(3);
        } else {
            Engine.scheduler.schedule(new Task(2) {
            @Override
            protected void execute() {  
                new MatchFrame().setVisible(true);
                super.stop();
            }
        });
        }
    }//GEN-LAST:event_buttonMatchAupairActionPerformed

    private void websiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_websiteButtonActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("http://www.larahaupairs.co.uk").toURI());    
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }//GEN-LAST:event_websiteButtonActionPerformed

    private void buttonNewFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewFamilyActionPerformed
        if(Utilities.rights.getRights() != 1) {
            Utilities.setAlert(3);
        } else { 
            new FamilyFrame().setVisible(true);
        }
    }//GEN-LAST:event_buttonNewFamilyActionPerformed

    @Override
    public void run() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //javax.swing.UIManager.put("nimbusBase", Color.lightGray);
                    //UIManager.put("nimbusBlueGrey", Color.getHSBColor(242,242,189));
                    UIManager.put("nimbusBlueGrey", new Color(210,198,224));
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
                    Utilities.rights.setRights(1);
                } else {
                    new LoginHandler().setVisible(true);
                }
            }

        });
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMatchAupair;
    public javax.swing.JButton buttonNewAupair;
    private javax.swing.JButton buttonNewFamily;
    private javax.swing.ButtonGroup group;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTime;
    private javax.swing.JButton websiteButton;
    // End of variables declaration//GEN-END:variables

}





