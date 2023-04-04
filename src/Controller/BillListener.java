package Controller;

import View.Manager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class BillListener implements ActionListener{
    
    private Manager mng;

    public BillListener(Manager mng) {
       this.mng = mng; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == mng.jButtonBackBillView){
            mng.jPanelBillView.setVisible(false);
            if (mng.checkCartViewOrMainView == 1) mng.jPanelCartView.setVisible(true);
            else if (this.mng.checkCartViewOrMainView == 2) mng.jPanelMainView.setVisible(true);
            mng.jFrameMain.setSize(885, 650);
            mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
        }
    }
    
    
}
