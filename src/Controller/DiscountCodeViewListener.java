package Controller;

import View.Manager;
import static View.Manager.jButtonBackDiscountCodeView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class DiscountCodeViewListener implements ActionListener{

    private Manager mng;
    public DiscountCodeViewListener(Manager mng) {
        this.mng = mng;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == jButtonBackDiscountCodeView){
            Manager.jPanelDiscountCodeView.setVisible(false);
            Manager.jPanelMainView.setVisible(true);
            Manager.jFrameMain.setSize(885, 650);
            Manager.jFrameMain.getContentPane().setBackground(Color.WHITE);
        }
    }
    
    
}
