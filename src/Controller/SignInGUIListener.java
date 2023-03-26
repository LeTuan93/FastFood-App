package Controller;

import Model.SignUpModel;
import View.MainView;
import View.Manager;
import static View.Manager.checkSignInFromSignUp;
import static View.Manager.jFrameMain;
import static View.Manager.jPanelDealHotTodayView;
import static View.Manager.jPanelKFCView;
import static View.Manager.jPanelMainView;
import static View.Manager.jPanelPizzaView;
import static View.Manager.jPanelSignInGUI;
import static View.Manager.jPanelSignUpGUI;
import static View.Manager.signUpModel;
import View.SignInGUI;
import View.SignUpGUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SignInGUIListener implements ActionListener{
    
    private Manager mng;
    public SignInGUIListener(Manager mng) {
        this.mng = mng;
    }

    public void actionPerformed(ActionEvent e) {
        String find = e.getActionCommand();
        if (find.equals("Login")){
            if (mng.loggedInSuccessfully() == true){
                mng.jPanelSignInGUI.setVisible(false);
                mng.jFrameMain.add(jPanelMainView);
                mng.jPanelMainView.setVisible(true);
                mng.jFrameMain.setSize(885, 650);
            }
            else{
                JOptionPane.showMessageDialog(mng.jFrameMain,"Thông tin đăng nhập sai hoặc không tồn tại!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (find.equals("Forgot your password?")){
            
        }
        else if (find.equals("Sign up here")){
            jPanelSignInGUI.setVisible(false);
            if (checkSignInFromSignUp==1){ 
                jFrameMain.add(jPanelSignUpGUI);
                System.out.println("x");
                checkSignInFromSignUp=2;
            }
            jFrameMain.setSize(870, 520);
            jPanelSignUpGUI.setVisible(true);
        }
    }
}
