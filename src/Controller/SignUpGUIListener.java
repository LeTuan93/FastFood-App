package Controller;


import View.BeerView;
import View.BreadView;
import View.BubbleTeaView;
import View.CoffeeView;
import View.DealHotTodayView;
import View.HamburgerView;
import View.HotdogView;
import View.KFCView;
import View.MainView;
import View.Manager;
import static View.Manager.jFrameMain;
import static View.Manager.jPanelSignInGUI;
import static View.Manager.jPanelSignUpGUI;
import View.PizzaView;
import View.SignUpGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpGUIListener implements ActionListener{
    
    private SignUpGUIListener signUpGUIListener;
    
    public SignUpGUIListener() {
    }

    public void actionPerformed(ActionEvent e) {
        String find = e.getActionCommand();
        if (find.equals("Sign Up")){
                
        }
        else {
            jPanelSignUpGUI.setVisible(false);
            jPanelSignInGUI.setVisible(true);
        }
    }
}
