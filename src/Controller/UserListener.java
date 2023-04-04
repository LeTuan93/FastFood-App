
package Controller;

import View.Manager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class UserListener implements ActionListener{

    private Manager mng;
    public UserListener(Manager mng) {
        this.mng = mng;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == mng.jButtonBackUserView){
            mng.jPanelUserView.setVisible(false);
            mng.jPanelMainView.setVisible(true);
            mng.jFrameMain.setSize(885, 650);
            mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
        }
    }
    
}
