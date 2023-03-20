package Controller;

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
import View.SignInGUI;
import View.SignUpGUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInGUIListener implements ActionListener{
    
    public SignInGUIListener() {
    }

    public void actionPerformed(ActionEvent e) {
        String find = e.getActionCommand();
        if (find.equals("Login")){
            jPanelSignInGUI.setVisible(false);
            jFrameMain.add(jPanelMainView);
            jPanelMainView.setVisible(true);
            jFrameMain.setSize(885, 650);
        
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
