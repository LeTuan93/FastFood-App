/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import static View.Manager.jFrameMain;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author min
 */
public class InCashCartView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InCashCartView
     */
    private Manager mng;
    public InCashCartView() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInCash = new javax.swing.JPanel();
        jLabelHeaderInCashCartView = new javax.swing.JLabel();
        jTextFieldNameInCashCartView = new javax.swing.JTextField();
        jLabelNameInCashCartView = new javax.swing.JLabel();
        jButtonCheckBilInCashCartView = new javax.swing.JButton();
        jButtonPaymentInCashCartView = new javax.swing.JButton();
        jTextFieldPhoneNumberInCashCartView = new javax.swing.JTextField();
        jLabelPhoneNumberInCashCartView = new javax.swing.JLabel();
        jTextFieldGmailInCashCartView = new javax.swing.JTextField();
        jLabelGmailInCashCartView = new javax.swing.JLabel();
        jLabelAddressInCashCartView = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddressInCashCartView = new javax.swing.JTextArea();

        jPanelInCash.setBackground(new java.awt.Color(255, 255, 255));

        jLabelHeaderInCashCartView.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelHeaderInCashCartView.setText("     Thông tin thanh toán");

        jTextFieldNameInCashCartView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelNameInCashCartView.setText("Họ và tên");

        jButtonCheckBilInCashCartView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCheckBilInCashCartView.setText("Xem hóa đơn");
        jButtonCheckBilInCashCartView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckBilInCashCartViewActionPerformed(evt);
            }
        });

        jButtonPaymentInCashCartView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPaymentInCashCartView.setText("Thanh toán");
        jButtonPaymentInCashCartView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaymentInCashCartViewActionPerformed(evt);
            }
        });

        jTextFieldPhoneNumberInCashCartView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelPhoneNumberInCashCartView.setText("Số điện thoại");

        jTextFieldGmailInCashCartView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelGmailInCashCartView.setText("Gmail");

        jLabelAddressInCashCartView.setText("Địa chỉ");

        jTextAreaAddressInCashCartView.setColumns(20);
        jTextAreaAddressInCashCartView.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAddressInCashCartView);

        javax.swing.GroupLayout jPanelInCashLayout = new javax.swing.GroupLayout(jPanelInCash);
        jPanelInCash.setLayout(jPanelInCashLayout);
        jPanelInCashLayout.setHorizontalGroup(
            jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInCashLayout.createSequentialGroup()
                .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInCashLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldNameInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelInCashLayout.createSequentialGroup()
                                    .addComponent(jLabelNameInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(365, 365, 365)))
                            .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelInCashLayout.createSequentialGroup()
                                    .addComponent(jLabelPhoneNumberInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(jTextFieldPhoneNumberInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelInCashLayout.createSequentialGroup()
                                    .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelAddressInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelGmailInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldGmailInCashCartView, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))))))
                    .addGroup(jPanelInCashLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButtonCheckBilInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonPaymentInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInCashLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabelHeaderInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 211, Short.MAX_VALUE))
        );
        jPanelInCashLayout.setVerticalGroup(
            jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInCashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeaderInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameInCashCartView))
                .addGap(18, 18, 18)
                .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumberInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPhoneNumberInCashCartView))
                .addGap(18, 18, 18)
                .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGmailInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGmailInCashCartView))
                .addGap(18, 18, 18)
                .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddressInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanelInCashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCheckBilInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPaymentInCashCartView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInCash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCheckBilInCashCartViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckBilInCashCartViewActionPerformed
        // TODO add your handling code here:
        this.mng.jPanelCartView.setVisible(false);
        if (this.mng.checkBill == 1){
            jFrameMain.add(this.mng.jPanelBillView);
            this.mng.checkBill = 2;
        }
        mng.jPanelBillView.setVisible(true);
        this.mng.jFrameMain.setSize(885, 650);
        this.mng.checkCartViewOrMainView =1;
        this.mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonCheckBilInCashCartViewActionPerformed

    private void jButtonPaymentInCashCartViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaymentInCashCartViewActionPerformed
        // TODO add your handling code here:
        if (jTextFieldNameInCashCartView.getText().equals("") || jTextFieldPhoneNumberInCashCartView.getText().equals("") || jTextFieldGmailInCashCartView.getText().equals("")|| jTextAreaAddressInCashCartView.getText().equals("")){
            JOptionPane.showMessageDialog(jFrameMain,"Chưa điền đủ thông tin!","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(jFrameMain,"Thanh toán thành công!","Accept",JOptionPane.INFORMATION_MESSAGE);         
            mng.checkPayedorNotInCash=1;
            mng.varUpdateTransactionInCash =             "    Thông tin người dùng thanh toán\n"
                                                    +"    Tên: "+jTextFieldNameInCashCartView.getText() +"\n"
                                                    +"    Số điện thoại: "+jTextFieldPhoneNumberInCashCartView.getText()
                                                    +"    Gmail: "+jTextFieldGmailInCashCartView.getText()+"\n"
                                                    +"    Địa chỉ: "+jTextAreaAddressInCashCartView.getText()+"\n"
                                                    +"    Loại hình thanh toán: tiền mặt\n";
        }
    }//GEN-LAST:event_jButtonPaymentInCashCartViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheckBilInCashCartView;
    private javax.swing.JButton jButtonPaymentInCashCartView;
    private javax.swing.JLabel jLabelAddressInCashCartView;
    private javax.swing.JLabel jLabelGmailInCashCartView;
    private javax.swing.JLabel jLabelHeaderInCashCartView;
    private javax.swing.JLabel jLabelNameInCashCartView;
    private javax.swing.JLabel jLabelPhoneNumberInCashCartView;
    private javax.swing.JPanel jPanelInCash;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaAddressInCashCartView;
    private javax.swing.JTextField jTextFieldGmailInCashCartView;
    private javax.swing.JTextField jTextFieldNameInCashCartView;
    private javax.swing.JTextField jTextFieldPhoneNumberInCashCartView;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonCheckBilInCashCartView() {
        return jButtonCheckBilInCashCartView;
    }

    public void setjButtonCheckBilInCashCartView(JButton jButtonCheckBilInCashCartView) {
        this.jButtonCheckBilInCashCartView = jButtonCheckBilInCashCartView;
    }
}
