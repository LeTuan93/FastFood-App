/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Manager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author min
 */
public class DealHotTodayListener implements ActionListener{

    public DealHotTodayListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == Manager.jButtonBackDealHotTodayView){
            Manager.jPanelDealHotTodayView.setVisible(false);
            Manager.jPanelMainView.setVisible(true);
            Manager.jFrameMain.setSize(885, 650);
            Manager.jFrameMain.getContentPane().setBackground(Color.WHITE);
        }
    }
}
