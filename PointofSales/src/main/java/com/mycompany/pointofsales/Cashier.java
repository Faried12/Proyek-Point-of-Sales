/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pointofsales;

/**
 *
 * @author bangu
 */
public class Cashier extends javax.swing.JFrame {

    /**
     * Creates new form Cashier
     */
    public Cashier() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        addMemberButton = new javax.swing.JButton();
        editMember = new javax.swing.JButton();
        listMember = new javax.swing.JButton();
        pointOfSales = new javax.swing.JButton();
        removeMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cashier");

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        addMemberButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addMemberButton.setText("Add Member");
        addMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberButtonActionPerformed(evt);
            }
        });

        editMember.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editMember.setText("Edit Member Data");
        editMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMemberActionPerformed(evt);
            }
        });

        listMember.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listMember.setText("List of Member");
        listMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMemberActionPerformed(evt);
            }
        });

        pointOfSales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pointOfSales.setText("Point of Sales");
        pointOfSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointOfSalesActionPerformed(evt);
            }
        });

        removeMember.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removeMember.setText("Remove Member");
        removeMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addMemberButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listMember, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pointOfSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(removeMember)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addMemberButton)
                        .addGap(56, 56, 56)
                        .addComponent(editMember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listMember)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pointOfSales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        LoginGUI a = new LoginGUI();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void addMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberButtonActionPerformed
        // TODO add your handling code here:
        AddMember a = new AddMember();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_addMemberButtonActionPerformed

    private void editMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMemberActionPerformed
        // TODO add your handling code here:
        EditMember a = new EditMember();
        this.dispose();
        a.setVisible(true);

    }//GEN-LAST:event_editMemberActionPerformed

    private void listMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMemberActionPerformed
        // TODO add your handling code here:
        ListMember a = new ListMember();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_listMemberActionPerformed

    private void pointOfSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointOfSalesActionPerformed
        // TODO add your handling code here:
        PointOfSalesGUI a = new PointOfSalesGUI();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_pointOfSalesActionPerformed

    private void removeMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMemberActionPerformed
        // TODO add your handling code here:
        RemoveMember a = new RemoveMember();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_removeMemberActionPerformed

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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton editMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listMember;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton pointOfSales;
    private javax.swing.JButton removeMember;
    // End of variables declaration//GEN-END:variables
}
