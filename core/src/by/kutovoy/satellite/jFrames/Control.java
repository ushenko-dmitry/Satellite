package by.kutovoy.satellite.jFrames;

//import com.mygdx.game.enums.Constants;
//import com.mygdx.game.PlanetParameters;
import by.kutovoy.satellite.enums.Icons;
import by.kutovoy.satellite.enums.Other;
import by.kutovoy.satellite.positions.NullPosition;
import by.kutovoy.satellite.positions.NullScale;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author dmitry
 */
public class Control extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Control() {
        initComponents();
        this.btnSceneDown.setIcon(Icons.BTN_ICON_DOWN);
        this.btnSceneLeft.setIcon(Icons.BTN_ICON_LEFT);
        this.btnSceneRight.setIcon(Icons.BTN_ICON_RIGHT);
        this.btnSceneUp.setIcon(Icons.BTN_ICON_UP);
        this.btnZoomUp.setIcon(Icons.BTN_ICON_ZOOM_UP);
        this.btnZoomDown.setIcon(Icons.BTN_ICON_ZOOM_DOWN);

        this.btnSceneDown.setText("");
        this.btnSceneLeft.setText("");
        this.btnSceneRight.setText("");
        this.btnSceneUp.setText("");

        this.btnSceneDown.setPreferredSize(new Dimension(Other.getBTN_WIDTH(), Other.getBTN_HEIGHT()));
        this.btnSceneLeft.setPreferredSize(new Dimension(Other.getBTN_WIDTH(), Other.getBTN_HEIGHT()));
        this.btnSceneRight.setPreferredSize(new Dimension(Other.getBTN_WIDTH(), Other.getBTN_HEIGHT()));
        this.btnSceneUp.setPreferredSize(new Dimension(Other.getBTN_WIDTH(), Other.getBTN_HEIGHT()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSceneDown = new javax.swing.JButton();
        btnSceneUp = new javax.swing.JButton();
        btnSceneRight = new javax.swing.JButton();
        btnSceneLeft = new javax.swing.JButton();
        btnZoomDown = new javax.swing.JButton();
        btnZoomUp = new javax.swing.JButton();

        setTitle("Control");
        setBounds(new java.awt.Rectangle(0, 200, 0, 0));
        setResizable(false);

        btnSceneDown.setText("1");
        btnSceneDown.setPreferredSize(new java.awt.Dimension(42, 42));
        btnSceneDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSceneDownMouseClicked(evt);
            }
        });

        btnSceneUp.setText("1");
        btnSceneUp.setMaximumSize(new java.awt.Dimension(42, 42));
        btnSceneUp.setMinimumSize(new java.awt.Dimension(42, 42));
        btnSceneUp.setPreferredSize(new java.awt.Dimension(42, 42));
        btnSceneUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSceneUpActionPerformed(evt);
            }
        });

        btnSceneRight.setPreferredSize(new java.awt.Dimension(42, 42));
        btnSceneRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSceneRightMouseClicked(evt);
            }
        });

        btnSceneLeft.setText("1");
        btnSceneLeft.setPreferredSize(new java.awt.Dimension(42, 42));
        btnSceneLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSceneLeftMouseClicked(evt);
            }
        });

        btnZoomDown.setPreferredSize(new java.awt.Dimension(42, 42));
        btnZoomDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnZoomDownMouseClicked(evt);
            }
        });

        btnZoomUp.setPreferredSize(new java.awt.Dimension(42, 42));
        btnZoomUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnZoomUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSceneLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSceneDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSceneRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnZoomDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSceneUp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZoomUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnZoomUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSceneRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSceneUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnZoomDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSceneDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSceneLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSceneUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSceneUpActionPerformed
        NullPosition.setINSTANSE_Y(-Other.getY_STEP());
    }//GEN-LAST:event_btnSceneUpActionPerformed

    private void btnZoomUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZoomUpMouseClicked
        NullScale.setScale(Other.getSCALE_STEP());
    }//GEN-LAST:event_btnZoomUpMouseClicked

    private void btnZoomDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZoomDownMouseClicked
        NullScale.setScale(-Other.getSCALE_STEP());
    }//GEN-LAST:event_btnZoomDownMouseClicked

    private void btnSceneDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSceneDownMouseClicked
        NullPosition.setINSTANSE_Y(Other.getY_STEP());
    }//GEN-LAST:event_btnSceneDownMouseClicked

    private void btnSceneRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSceneRightMouseClicked
        NullPosition.setINSTANSE_X(-Other.getX_STEP());
    }//GEN-LAST:event_btnSceneRightMouseClicked

    private void btnSceneLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSceneLeftMouseClicked
        NullPosition.setINSTANSE_X(Other.getX_STEP());
    }//GEN-LAST:event_btnSceneLeftMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//              new Control().setVisible(true);
//            }
//        });
//        
//    }    /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Control().setVisible(true);
//            }
//        });
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSceneDown;
    private javax.swing.JButton btnSceneLeft;
    private javax.swing.JButton btnSceneRight;
    private javax.swing.JButton btnSceneUp;
    private javax.swing.JButton btnZoomDown;
    private javax.swing.JButton btnZoomUp;
    // End of variables declaration//GEN-END:variables
}
