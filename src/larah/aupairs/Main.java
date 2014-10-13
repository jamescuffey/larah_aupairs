package larah.aupairs;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;
import larah.aupairs.frames.AupairFrame;

/**
 * This will be the main class that handles the user interface.
 * @author James
 */
public class Main extends javax.swing.JFrame {
    

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
     * Creates new form Main
     */
    public Main() {
        initComponents();
          
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        buttonNewAupair = new javax.swing.JButton();
        buttonMatchAupair = new javax.swing.JButton();
        buttonNewFamily = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(buttonNewAupair)
                .addGap(89, 89, 89)
                .addComponent(buttonNewFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(buttonMatchAupair)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewAupair)
                    .addComponent(buttonNewFamily)
                    .addComponent(buttonMatchAupair))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        buttonNewAupair.getAccessibleContext().setAccessibleName("buttonNewAupair");
        buttonMatchAupair.getAccessibleContext().setAccessibleName("buttonMatchAupair");
        buttonNewFamily.getAccessibleContext().setAccessibleName("buttonNewFamily");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewAupairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewAupairActionPerformed
        // TODO add your handling code here:
        new AupairFrame().setVisible(true);
    }//GEN-LAST:event_buttonNewAupairActionPerformed

    private void buttonMatchAupairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMatchAupairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMatchAupairActionPerformed

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
                new Main().setVisible(true);
        
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMatchAupair;
    private javax.swing.JButton buttonNewAupair;
    private javax.swing.JButton buttonNewFamily;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
