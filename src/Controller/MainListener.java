/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Manager;
import static View.Manager.checkBeer;
import static View.Manager.checkBread;
import static View.Manager.checkBubbleTea;
import static View.Manager.checkCoffee;
import static View.Manager.checkDealHotToday;
import static View.Manager.checkHamburger;
import static View.Manager.checkHotdog;
import static View.Manager.checkKFC;
import static View.Manager.checkPizza;
import static View.Manager.jButtonBeer;
import static View.Manager.jButtonBread;
import static View.Manager.jButtonBubbleTea;
import static View.Manager.jButtonCoffee;
import static View.Manager.jButtonDealHotToday;
import static View.Manager.jButtonHamburger;
import static View.Manager.jButtonHotdog;
import static View.Manager.jButtonKFC;
import static View.Manager.jButtonPizza;
import static View.Manager.jFrameMain;
import static View.Manager.jPanelBeerView;
import static View.Manager.jPanelBreadView;
import static View.Manager.jPanelBubbleTeaView;
import static View.Manager.jPanelCoffeeView;
import static View.Manager.jPanelDealHotTodayView;
import static View.Manager.jPanelHamburgerView;
import static View.Manager.jPanelHotdogView;
import static View.Manager.jPanelKFCView;
import static View.Manager.jPanelMainView;
import static View.Manager.jPanelPizzaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author min
 */
public class MainListener implements ActionListener{
    public MainListener(){
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (clicked == jButtonBeer){
            jPanelMainView.setVisible(false);
            if (checkBeer == 1){
                jFrameMain.add(jPanelBeerView);
                checkBeer=2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelBeerView.setVisible(true);
        }
        else if (clicked == jButtonBread){
            jPanelMainView.setVisible(false);
            if (checkBread == 1){
                jFrameMain.add(jPanelBreadView);
                checkBread = 2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelBreadView.setVisible(true);
        } else if (clicked == jButtonBubbleTea){
            jPanelMainView.setVisible(false);
            if (checkBubbleTea == 1){
                jFrameMain.add(jPanelBubbleTeaView);
                checkBubbleTea = 2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelBubbleTeaView.setVisible(true);
        }else if (clicked == jButtonCoffee){
            jPanelMainView.setVisible(false);
            if (checkCoffee == 1){
                jFrameMain.add(jPanelCoffeeView);
                checkCoffee = 2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelCoffeeView.setVisible(true);
        } else if (clicked == jButtonDealHotToday){
            jPanelMainView.setVisible(false);
            if (checkDealHotToday == 1){
                jFrameMain.add(jPanelDealHotTodayView);
                checkDealHotToday=2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelDealHotTodayView.setVisible(true);
        }else if (clicked == jButtonHamburger){
            jPanelMainView.setVisible(false);
            if (checkHamburger == 1){
                jFrameMain.add(jPanelHamburgerView);
                checkHamburger=2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelHamburgerView.setVisible(true);
        }else if (clicked == jButtonHotdog){
            jPanelMainView.setVisible(false);
            if (checkHotdog == 1){
                jFrameMain.add(jPanelHotdogView);
                checkHotdog=2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelHotdogView.setVisible(true);
        }else if (clicked == jButtonKFC){
            jPanelMainView.setVisible(false);
            if (checkKFC == 1){
                jFrameMain.add(jPanelKFCView);
                checkKFC=2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelKFCView.setVisible(true);
        }else if (clicked == jButtonPizza){
            jPanelMainView.setVisible(false);
            if (checkPizza == 1){
                jFrameMain.add(jPanelPizzaView);
                checkPizza=2;
            }
            jFrameMain.setSize(885, 650);
            jFrameMain.getContentPane().setBackground(new java.awt.Color(255, 153, 51));
            jPanelPizzaView.setVisible(true);
        }   
    }
    
}
