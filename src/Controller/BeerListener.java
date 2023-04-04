package Controller;

import Model.SignUpModel;
import View.InCashCartView;
import View.Manager;
import static View.Manager.jButtonFavoriteBeerView;
import static View.Manager.signUpModel;
import View.QRCartView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JButton;

public class BeerListener implements ActionListener{
    
    private Manager mng;
    public BeerListener(Manager mng) {
        this.mng= mng;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == mng.jButtonBackBeer){
            mng.jPanelBeerView.setVisible(false);
            mng.jPanelMainView.setVisible(true);
            mng.jFrameMain.setSize(885, 650);
            mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
        }else if (clicked == mng.jButtonPayWithQRCodeBeerView){
            mng.jPanelBeerView.setVisible(false);
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
        } else if (clicked == mng.jButtonPayInCashBeerView){
            mng.jPanelBeerView.setVisible(false);
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
        } else if (clicked == mng.jButtonAddBeerView){
            long localSumMoneyBeer=0;
            int localNumberBeerInBill=0;
            mng.beerWriteBill="";
            //format  (String) "20,000" ->  (long) 20000
            DecimalFormat formatRemoveComma = new DecimalFormat("#,##0");
            Number number;
            try{
                for (int i = 0; i < mng.jTableMenuOfBeer.getRowCount(); i++) {
                    if ((int)mng.jTableMenuOfBeer.getValueAt(i, 3) != 0){
                        String numberString = (String) mng.jTableMenuOfBeer.getValueAt(i, 2);
                        number = formatRemoveComma.parse(numberString);
                        long resultRemoveComma = number.longValue();
                        localSumMoneyBeer+=resultRemoveComma*(int)mng.jTableMenuOfBeer.getValueAt(i, 3);
                        //duyet cho vao invoice
                        localNumberBeerInBill++;
                        //format a x b  c
                        DecimalFormat formatAddComma = new DecimalFormat("#,###");
                        String a = formatAddComma.format((int)mng.jTableMenuOfBeer.getValueAt(i, 3));
                        String b = numberString;
                        String c = formatAddComma.format(resultRemoveComma*(int)mng.jTableMenuOfBeer.getValueAt(i, 3));
                        String aAddSpace = String.format("%1$-"+(15-a.length())+"s", a).replace(' ', ' ');
                        String bAddSpace = String.format("%1$"+(13-b.length())+"s", b).replace(' ', ' ');
                        String cAddSpace = String.format("%1$"+(28-c.length())+"s", c).replace(' ', ' ');
                        String multiplyAddSpace = String.format("%1$-4s", "x").replace(' ', ' ');
                        String nameFood =  (String) mng.jTableMenuOfBeer.getValueAt(i, 1);
                        
                        //Cut tên chuỗi nếu dài
                        int maxLength = 45; // độ dài tối đa của chuỗi
                        if ( nameFood.length() > maxLength) {
                            nameFood =  nameFood.substring(0, maxLength-3) + "...";
                        }
                        //System.out.println(mng.beerWriteBill);
                        mng.beerWriteBill= mng.beerWriteBill+"    " + nameFood+"\n" 
                             +"    "+aAddSpace+ multiplyAddSpace+ "\t" + bAddSpace+" VNĐ\t\t" + cAddSpace+ " VNĐ\n";
                    }
                }
            }catch(ParseException e1){
                System.out.println("Lỗi kìa ba");
            }
            //Format (long )20000 -> (String) "20,000";
            DecimalFormat formatAddComma = new DecimalFormat("#,###");
            String formattedNumberAddComma = formatAddComma.format(localSumMoneyBeer);
            //Format (String) "20,000" -> (String) "     20,000 " or (String) "0" -> (String) "          0"
            String formattedAddSpace = String.format("%1$"+(51-formattedNumberAddComma.length())+"s", formattedNumberAddComma).replace(' ', ' ');
            mng.jLabelMoneyBeerView.setText(formattedAddSpace);
            mng.numberBeerInBill = localNumberBeerInBill;
            mng.sumMoneyBeer =localSumMoneyBeer;
        } else if (clicked == jButtonFavoriteBeerView){
            mng.jTextAreaLikeUserView.setText(mng.jTextAreaLikeUserView.getText()+"- Lão Hạc Quán - Beer & Cafe\n");
            for (SignUpModel account : signUpModel){
                if (account.getStatus().equals("online")){
                    account.setLikeShop(mng.jTextAreaLikeUserView.getText());
                    System.out.println("xx");
                }         
            }
            mng.writeAccountInToFile();
        }
    }
}
