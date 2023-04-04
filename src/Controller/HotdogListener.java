package Controller;

import Model.SignUpModel;
import View.InCashCartView;
import View.Manager;
import static View.Manager.jButtonFavoriteHotdogView;
import static View.Manager.signUpModel;
import View.QRCartView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JButton;

public class HotdogListener  implements ActionListener{

    private Manager mng;
    public HotdogListener(Manager mng) {
        this.mng = mng;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == Manager.jButtonBackHotdogView){
            Manager.jPanelHotdogView.setVisible(false);
            Manager.jPanelMainView.setVisible(true);
            Manager.jFrameMain.setSize(885, 650);
            Manager.jFrameMain.getContentPane().setBackground(Color.WHITE);
        } else if (clicked == mng.jButtonPayWithQRCodeHotdogView){
            mng.jPanelHotdogView.setVisible(false);
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
        } else if (clicked == mng.jButtonPayInCashHotdogView){
            mng.jPanelHotdogView.setVisible(false);
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
        } else if (clicked == mng.jButtonAddHotdogView){
            long localSumMoneyHotdog=0;
            int localNumberHotdogInBill=0;
            mng.hotdogWriteBill="";
            //format  (String) "20,000" ->  (long) 20000
            DecimalFormat formatRemoveComma = new DecimalFormat("#,##0");
            Number number;
            try{
                for (int i = 0; i < mng.jTableMenuOfHotdog.getRowCount(); i++) {
                    if ((int)mng.jTableMenuOfHotdog.getValueAt(i, 3) != 0){
                        String numberString = (String) mng.jTableMenuOfHotdog.getValueAt(i, 2);
                        number = formatRemoveComma.parse(numberString);
                        long resultRemoveComma = number.longValue();
                        localSumMoneyHotdog+=resultRemoveComma*(int)mng.jTableMenuOfHotdog.getValueAt(i, 3);
                        
                        //duyet cho vao invoice
                        localNumberHotdogInBill++;
                        //format a x b  c
                        DecimalFormat formatAddComma = new DecimalFormat("#,###");
                        String a = formatAddComma.format((int)mng.jTableMenuOfHotdog.getValueAt(i, 3));
                        String b = numberString;
                        String c = formatAddComma.format(resultRemoveComma*(int)mng.jTableMenuOfHotdog.getValueAt(i, 3));
                        String aAddSpace = String.format("%1$-"+(15-a.length())+"s", a).replace(' ', ' ');
                        String bAddSpace = String.format("%1$"+(13-b.length())+"s", b).replace(' ', ' ');
                        String cAddSpace = String.format("%1$"+(28-c.length())+"s", c).replace(' ', ' ');
                        String multiplyAddSpace = String.format("%1$-4s", "x").replace(' ', ' ');
                        String nameFood =  (String) mng.jTableMenuOfHotdog.getValueAt(i, 1);
                        
                        //Cut tên chuỗi nếu dài
                        int maxLength = 45; // độ dài tối đa của chuỗi
                        if ( nameFood.length() > maxLength) {
                            nameFood =  nameFood.substring(0, maxLength-3) + "...";
                        }
                        
                        mng.hotdogWriteBill= mng.hotdogWriteBill +"    " + nameFood+"\t\t\t\n" 
                             +"    " +aAddSpace+ multiplyAddSpace+ "\t" + bAddSpace+" VNĐ\t\t" + cAddSpace+ " VNĐ\n";
                    }
                }
            }catch(ParseException e1){
                System.out.println("Lỗi kìa ba");
            }
            //Format (long )20000 -> (String) "20,000";
            DecimalFormat formatAddComma = new DecimalFormat("#,###");
            String formattedNumberAddComma = formatAddComma.format(localSumMoneyHotdog);
            //Format (String) "20,000" -> (String) "     20,000 " or (String) "0" -> (String) "          0"
            String formattedAddSpace = String.format("%1$"+(51-formattedNumberAddComma.length())+"s", formattedNumberAddComma).replace(' ', ' ');
            mng.jLabelMoneyHotdogView.setText(formattedAddSpace);
            mng.sumMoneyHotdog =localSumMoneyHotdog;
            mng.numberHotdogInBill = localNumberHotdogInBill;
        }
        else if (clicked == jButtonFavoriteHotdogView){
            mng.jTextAreaLikeUserView.setText(mng.jTextAreaLikeUserView.getText()+"- Hamada Hotdog - Lý Nam Đế\n");
            for (SignUpModel account : signUpModel){
                if (account.getStatus().equals("online")){
                    account.setLikeShop(mng.jTextAreaLikeUserView.getText());
                }
                       
            }
            mng.writeAccountInToFile();
        }
    }
    
}
