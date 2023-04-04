package Controller;

import View.Manager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class UnderMaintaintenanceListener implements ActionListener{
    private Manager mng;

    public UnderMaintaintenanceListener(Manager mng) {
        this.mng = mng;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == mng.jButtonBackUnderMaintenance){
            Manager.jPanelUnderMaintenance.setVisible(false);
            Manager.jPanelMainView.setVisible(true);
            Manager.jFrameMain.setSize(885, 650);
            Manager.jFrameMain.getContentPane().setBackground(Color.WHITE);
        }
    }
    
}
