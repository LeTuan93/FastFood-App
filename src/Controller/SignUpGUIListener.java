package Controller;


import Model.SignUpModel;
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
import java.util.ArrayList;
import java.util.List;

public class SignUpGUIListener implements ActionListener{
    
    private Manager mng;
    public SignUpGUIListener(Manager mng) {
        this.mng=mng;
    }

    public void actionPerformed(ActionEvent e) {
        String find = e.getActionCommand();
        if (find.equals("Sign Up")){
            mng.addAccount();
            mng.writeAccountInToFile();
        }
        else {
            jPanelSignUpGUI.setVisible(false);
            jPanelSignInGUI.setVisible(true);
        }
    }
}
