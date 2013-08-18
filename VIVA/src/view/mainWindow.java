/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LPRotation;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JLayeredPane;
import model.Alignment;
import model.LPMoveRightTemp;
import model.lpApperance;

/**
 *
 * @author Naveen
 */
public class mainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        initComponents();
        setAlignment();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPane = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        left1mouse = new javax.swing.JPanel();
        left2mouse = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        homepanel = new javax.swing.JLayeredPane();
        left1panel = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        left2panel = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        right1panel = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        right2panel = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(40, 150, 73, 23);
        BGPane.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        left1mouse.setOpaque(false);
        left1mouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                left1mouseMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout left1mouseLayout = new javax.swing.GroupLayout(left1mouse);
        left1mouse.setLayout(left1mouseLayout);
        left1mouseLayout.setHorizontalGroup(
            left1mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        left1mouseLayout.setVerticalGroup(
            left1mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        left1mouse.setBounds(190, 160, 130, 440);
        BGPane.add(left1mouse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        left2mouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                left2mouseMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout left2mouseLayout = new javax.swing.GroupLayout(left2mouse);
        left2mouse.setLayout(left2mouseLayout);
        left2mouseLayout.setHorizontalGroup(
            left2mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        left2mouseLayout.setVerticalGroup(
            left2mouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        left2mouse.setBounds(80, 220, 110, 330);
        BGPane.add(left2mouse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home2.png"))); // NOI18N
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
        });
        l1.setBounds(190, 160, 130, 630);
        BGPane.add(l1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home3.png"))); // NOI18N
        l2.setBounds(80, 220, 110, 480);
        BGPane.add(l2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home4.png"))); // NOI18N
        r1.setBounds(1047, 160, 130, 630);
        BGPane.add(r1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home5.png"))); // NOI18N
        r2.setBounds(1177, 220, 110, 480);
        BGPane.add(r2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        homepanel.setBackground(new java.awt.Color(255, 204, 204));
        homepanel.setOpaque(true);
        homepanel.setBounds(320, 60, 727, 610);
        BGPane.add(homepanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        left1panel.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ThemeBG.jpg"))); // NOI18N
        jLabel1.setBounds(0, 0, 727, 709);
        left1panel.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        left1panel.setBounds(320, 60, 727, 610);
        BGPane.add(left1panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\important\\images\\wallpapers\\background\\Wallpapers\\Desktop\\the-darkness-2.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBounds(0, 0, 727, 610);
        left2panel.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        left2panel.setBounds(320, 60, 727, 610);
        BGPane.add(left2panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        right1panel.setBackground(new java.awt.Color(153, 255, 153));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\important\\images\\wallpapers\\background\\Wallpapers\\New folder\\army_gas_mask-wallpaper-1366x768.jpg")); // NOI18N
        jLabel4.setBounds(0, 0, 1366, 768);
        right1panel.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        right1panel.setBounds(320, 60, 727, 610);
        BGPane.add(right1panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        right2panel.setBackground(new java.awt.Color(102, 51, 255));
        right2panel.setOpaque(true);
        right2panel.setBounds(320, 60, 727, 610);
        BGPane.add(right2panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home1.png"))); // NOI18N
        jLabel2.setBounds(319, 60, 730, 760);
        BGPane.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ThemeBG.jpg"))); // NOI18N
        background.setBounds(0, 0, 1366, 768);
        BGPane.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGPane, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
    }//GEN-LAST:event_l1MouseEntered

    private void left2mouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left2mouseMouseEntered
    }//GEN-LAST:event_left2mouseMouseEntered

    private void left1mouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left1mouseMouseEntered
        // TODO add your handling code here:
//        Component getComp1 = BGPane.getComponentAt(320, 60);
//        Component getComp2 = BGPane.getComponentAt(80, 170);
//        Component getComp3 = BGPane.getComponentAt(450, 110);
        // new LPRotationRight().left1Pane(getComp, BGPane);z
        //                 int x = (int) left1panel.getLocation().getX();
        //        int y = (int) left1panel.getLocation().getY();
        new LPRotation().rightAction(BGPane.getComponentAt(190, 110), BGPane.getComponentAt(80, 170), BGPane.getComponentAt(320, 60), BGPane);
//        BGPane.moveToFront(BGPane.getComponentAt(320, 60).getParent());
//        System.out.println(BGPane.getComponentAt(320, 60).get);
//        if(left1panel.getLocation().getX()==320 && left1panel.getLocation().getY()==60){
//            BGPane.moveToFront(left1panel);
//        }else if(left2panel.getLocation().getX()==320 && left2panel.getLocation().getY()==60){
//            BGPane.moveToFront(left2panel);
//        }else if(right1panel.getLocation().getX()==320 && right1panel.getLocation().getY()==60){
//            BGPane.moveToFront(right1panel);
//        }else if(right2panel.getLocation().getX()==320 && right2panel.getLocation().getY()==60){
//            BGPane.moveToFront(right2panel);
//        }
        BGPane.moveToFront(BGPane.getComponentAt(320, 60));
        System.out.println(BGPane.getComponentAt(320, 60));
    }//GEN-LAST:event_left1mouseMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        System.out.println(BGPane.getComponentAt(320, 60));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane BGPane;
    private javax.swing.JLabel background;
    private javax.swing.JLayeredPane homepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JPanel left1mouse;
    private javax.swing.JLayeredPane left1panel;
    private javax.swing.JPanel left2mouse;
    private javax.swing.JLayeredPane left2panel;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLayeredPane right1panel;
    private javax.swing.JLayeredPane right2panel;
    // End of variables declaration//GEN-END:variables

    public void setAlignment() {
        JLayeredPane lp[] = {left1panel, left2panel, right1panel, right2panel};
        new Alignment().intialAlignment(lp);
        new lpApperance().pVisible(lp);
    }

    public void left1panel2() {
        Component getComp = BGPane.getComponentAt(80, 170);
        int x = getComp.getX();
        int y = getComp.getY();
        if (x < 190 && y > 110) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int l2x = 80, l2y = 163, l2h = 480; l2x <= 190 && l2y >= 110 && l2h <= 610; l2x++, l2h++, l2y--) {
                        l2x++;
                        left2panel.setLocation(l2x, l2y);
                        l2x++;
                        try {
                            Thread.sleep(4);
                        } catch (Exception e) {
                            e.printStackTrace();
                            
                        }
                    }
//                    jLayeredPane1.moveToFront(left1panel);
//                    left1panel.grabFocus();
                }
            }).start();
        }
    }
}
