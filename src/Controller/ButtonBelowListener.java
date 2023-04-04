package Controller;

import Model.SignUpModel;
import View.Manager;
import static View.Manager.jButtonFavoriteBubbleTeaView;
import static View.Manager.jFrameMain;
import static View.Manager.jPanelBreadView;
import static View.Manager.signUpModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ButtonBelowListener implements ActionListener{
    
    private Manager mng;
    public ButtonBelowListener(Manager mng) {
        this.mng = mng;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == mng.jButtonHomePage){
            int n = JOptionPane.showConfirmDialog(Manager.jFrameMain,"Bạn có chắc chắn muốn đăng xuất?","Đăng xuất",JOptionPane.YES_NO_OPTION);
            try {
                if (n == JOptionPane.YES_OPTION ){
                mng.jPanelMainView.setVisible(false);
                jFrameMain.add(mng.jPanelSignInGUI);
                mng.jPanelSignInGUI.setVisible(true);
                mng.jFrameMain.setSize(861, 488);
                for (SignUpModel account : signUpModel){
                    if (account.getStatus().equals("online")){
                        account.setLikeShop(mng.jTextAreaLikeUserView.getText());
                    }
                       
                }
                mng.writeAccountInToFile();
                } 
            } catch (Exception e1) {
            
            }
        } else if (clicked == mng.jButtonOrder){
            mng.jPanelMainView.setVisible(false);
            if (mng.checkBill == 1){
                jFrameMain.add(this.mng.jPanelBillView);
                mng.checkBill = 2;
            }
            mng.jPanelBillView.setVisible(true);
            mng.jFrameMain.setSize(885, 650);
            mng.checkCartViewOrMainView =2;
            mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
        } else if (clicked == mng.jButtonMe){
            mng.jPanelMainView.setVisible(false);
            if (mng.checkUser == 1){
                jFrameMain.add(this.mng.jPanelUserView);
                mng.checkUser = 2;
            }
            mng.jPanelUserView.setVisible(true);
            mng.jFrameMain.setSize(885, 650);
            mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
        } 
    }
    
}
