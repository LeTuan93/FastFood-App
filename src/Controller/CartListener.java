package Controller;

import View.InCashCartView;
import View.Manager;
import static View.Manager.jFrameMain;
import View.QRCartView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CartListener implements ActionListener{

    private Manager mng;
    public CartListener(Manager mng){
        this.mng = mng;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == mng.jButtonBackCartView){
            mng.jPanelCartView.setVisible(false);
            mng.jPanelMainView.setVisible(true);
            mng.jFrameMain.setSize(885, 650);
            mng.jFrameMain.getContentPane().setBackground(Color.WHITE);
        } 
    }
    
}
