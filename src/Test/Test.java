package Test;

import View.MainView;
import View.Manager;
import static View.Manager.jFrameMain;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

public class Test {
    final static String LOOKANDFEEL = "Metal";
    final static String THEME = "DefaultMetal";
    private static void initLookAndFeel() {
        String lookAndFeel = null;
        
        if (LOOKANDFEEL != null) {
            if (LOOKANDFEEL.equals("Metal")) {
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();  
            }      
            else if (LOOKANDFEEL.equals("System")) {
                lookAndFeel = UIManager.getSystemLookAndFeelClassName();
            }    
            else if (LOOKANDFEEL.equals("Motif")) {
                lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            }  
            else if (LOOKANDFEEL.equals("GTK")) { 
                lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
            }
            else {
                System.err.println("Unexpected value of LOOKANDFEEL specified: "
                                   + LOOKANDFEEL);
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
            }
 
            try {                 
                UIManager.setLookAndFeel(lookAndFeel);
     
                if (LOOKANDFEEL.equals("Metal")) {
                  if (THEME.equals("DefaultMetal"))
                     MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
                  else if (THEME.equals("Ocean"))
                     MetalLookAndFeel.setCurrentTheme(new OceanTheme());
                      
                  UIManager.setLookAndFeel(new MetalLookAndFeel()); 
                }   
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            }
        }
    }
    public static void main(String[] args) {
        initLookAndFeel();
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Manager();     
    }
}
