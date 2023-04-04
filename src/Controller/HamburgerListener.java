/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.SignUpModel;
import View.InCashCartView;
import View.Manager;
import static View.Manager.jButtonFavoriteHamburgerView;
import static View.Manager.signUpModel;
import View.QRCartView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JButton;

public class HamburgerListener implements ActionListener{
    
    private Manager mng;
    public HamburgerListener(Manager mng) {
        this.mng = mng;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == Manager.jButtonBackHamburgerView){
            mng.jPanelHamburgerView.setVisible(false);
            mng.jPanelMainView.setVisible(true);
            mng.jFrameMain.setSize(885, 650);
            mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
        }else if (clicked == mng.jButtonPayWithQRCodeHamburgerView){
            mng.jPanelHamburgerView.setVisible(false);
            if (mng.checkCart == 1){
                mng.jFrameMain.add(mng.jPanelCartView);
                mng.checkCart=2;
            }
            mng.jPanelCartView.setVisible(true); 
            
            //Stranfer in QRWindow
            mng.jPanelInCashCartView.setBackground(mng.DefaultColorCartView);
            mng.jPanelQRCartView.setBackground(mng.clickedColorCartView);

            mng.jLabelWordCartView.setText("Quét mã QR");
            mng.jLabelImageCartView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-qr-code.gif")));
            QRCartView qr = new QRCartView();
            mng.jDesktopPanelCartView.removeAll();
            mng.jDesktopPanelCartView.add(qr).setVisible(true);
            //
        } else if (clicked == mng.jButtonPayInCashHamburgerView){
            mng.jPanelHamburgerView.setVisible(false);
            if (mng.checkCart == 1){
                mng.jFrameMain.add(mng.jPanelCartView);
                mng.checkCart=2;
            }
            mng.jPanelCartView.setVisible(true); 
            
            //Stransfer in InCashWindow
            mng.jPanelInCashCartView.setBackground(mng.clickedColorCartView);
            mng.jPanelQRCartView.setBackground(mng.DefaultColorCartView);
        
            mng.jLabelWordCartView.setText("Thanh toán bằng tiền mặt");
            mng.jLabelImageCartView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cash.gif")));
            
            InCashCartView inCash = new InCashCartView();
            mng.jDesktopPanelCartView.removeAll();
            mng.jDesktopPanelCartView.add(inCash).setVisible(true);
            //
        } else if (clicked == mng.jButtonAddHamburgerView){
            long localSumMoneyHamburger=0;
            int localNumberHamburgerInBill=0;
            mng.hamburgerWriteBill="";
            //format  (String) "20,000" ->  (long) 20000
            DecimalFormat formatRemoveComma = new DecimalFormat("#,##0");
            Number number;
            try{
                for (int i = 0; i < mng.jTableMenuOfHamburger.getRowCount(); i++) {
                    if ((int)mng.jTableMenuOfHamburger.getValueAt(i, 3) != 0){
                        String numberString = (String) mng.jTableMenuOfHamburger.getValueAt(i, 2);
                        number = formatRemoveComma.parse(numberString);
                        long resultRemoveComma = number.longValue();
                        localSumMoneyHamburger+=resultRemoveComma*(int)mng.jTableMenuOfHamburger.getValueAt(i, 3);
                        
                        //duyet cho vao invoice
                        localNumberHamburgerInBill++;
                        //format a x b  c
                        DecimalFormat formatAddComma = new DecimalFormat("#,###");
                        String a = formatAddComma.format((int)mng.jTableMenuOfHamburger.getValueAt(i, 3));
                        String b = numberString;
                        String c = formatAddComma.format(resultRemoveComma*(int)mng.jTableMenuOfHamburger.getValueAt(i, 3));
                        String aAddSpace = String.format("%1$-"+(15-a.length())+"s", a).replace(' ', ' ');
                        String bAddSpace = String.format("%1$"+(13-b.length())+"s", b).replace(' ', ' ');
                        String cAddSpace = String.format("%1$"+(28-c.length())+"s", c).replace(' ', ' ');
                        String multiplyAddSpace = String.format("%1$-4s", "x").replace(' ', ' ');
                        String nameFood =  (String) mng.jTableMenuOfHamburger.getValueAt(i, 1);
                        
                        //Cut tên chuỗi nếu dài
                        int maxLength = 45; // độ dài tối đa của chuỗi
                        if ( nameFood.length() > maxLength) {
                            nameFood =  nameFood.substring(0, maxLength-3) + "...";
                        }
                        
                        mng.hamburgerWriteBill= mng.hamburgerWriteBill +"    " + nameFood+"\t\t\t\n" 
                             +"    " +aAddSpace+ multiplyAddSpace+ "\t" + bAddSpace+" VNĐ\t\t" + cAddSpace+ " VNĐ\n";
                    }
                }
            }catch(ParseException e1){
                System.out.println("Lỗi kìa ba");
            }
            //Format (long )20000 -> (String) "20,000";
            DecimalFormat formatAddComma = new DecimalFormat("#,###");
            String formattedNumberAddComma = formatAddComma.format(localSumMoneyHamburger);
            //Format (String) "20,000" -> (String) "     20,000 " or (String) "0" -> (String) "          0"
            String formattedAddSpace = String.format("%1$"+(51-formattedNumberAddComma.length())+"s", formattedNumberAddComma).replace(' ', ' ');
            mng.jLabelMoneyHamburgerView.setText(formattedAddSpace);
            mng.sumMoneyHamburger =localSumMoneyHamburger;
            mng.numberHamburgerInBill = localNumberHamburgerInBill;
        } else if (clicked == jButtonFavoriteHamburgerView){
            mng.jTextAreaLikeUserView.setText(mng.jTextAreaLikeUserView.getText()+"- Hello Burger - Hamburger & Chicken\n");
            for (SignUpModel account : signUpModel){
                if (account.getStatus().equals("online")){
                    account.setLikeShop(mng.jTextAreaLikeUserView.getText());
                }
                       
            }
            mng.writeAccountInToFile();
        }
    }
}
