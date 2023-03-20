package View;

import Controller.BeerListener;
import Controller.BreadListener;
import Controller.BubbleTeaListener;
import Controller.CoffeeListener;
import Controller.DealHotTodayListener;
import Controller.HamburgerListener;
import Controller.HotdogListener;
import Controller.KFCListener;
import Controller.MainListener;
import Controller.PizzaListener;
import Controller.SignInGUIListener;
import Controller.SignUpGUIListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class Manager {
    
    //Variables JFrameMain
    public static JFrame jFrameMain;

    ///Variables check
    public static int checkSignInFromSignUp =0;
    public static int checkBeer = 0;
    public static int checkBread = 0;
    public static int checkBubbleTea = 0;
    public static int checkCoffee = 0;
    public static int checkDealHotToday = 0;
    public static int checkHamburger = 0;
    public static int checkHotdog = 0;
    public static int checkKFC = 0;
    public static int checkPizza = 0;
    
    //Variables lưu tk và mk
    //List<Manager> mng = ArrayList
    
    // Variables of SignInGUI               
    private JLabel fullNameLabel;
    private JButton jButtonForgotPassWord;
    private JButton jButtonLogin;
    private JButton jButtonSignUpHere;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    public static JPanel jPanelSignInGUI;
    private JPasswordField jPasswordField;
    private JSeparator jSeparator1;
    private JSeparator jSeparator6;
    private JLabel passWordLabel;
    private JTextField textFieldEmailLogin;
    private JPasswordField textFieldPassWord;
    // End of variables declaration  
    
    // Variables of SignUpGUI                
    private java.awt.Checkbox checkboxTermOfService;
    public static JButton jButtonBackSignUp;
    public static JButton jButtonSignUp;
    private javax.swing.JLabel jLabelAreadyAMember;
    private javax.swing.JLabel jLabelEmailOfSignUp;
    private javax.swing.JLabel jLabelFastFood;
    private javax.swing.JLabel jLabelFullNameOfSignUp;
    private javax.swing.JLabel jLabelPassWordOfSignUp;
    private javax.swing.JLabel jLabelPerson;
    public static JPanel jPanelSignUpGUI;
    private javax.swing.JSeparator jSeparatorAreadyAMember;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorFullName;
    private javax.swing.JSeparator jSeparatorPassWord;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldPassWord;
    // End of variables declaration

    // Variables of MainView                  
    public static JButton jButtonBeer;
    public static JButton jButtonBread;
    public static JButton jButtonBubbleTea;
    public static JButton jButtonCart;
    public static JButton jButtonCategory;
    public static JButton jButtonCoffee;
    public static JButton jButtonCollection;
    public static JButton jButtonDealHotToday;
    public static JButton jButtonDiscountCode;
    public static JButton jButtonFavorite;
    public static JButton jButtonFreeshipXtra;
    public static JButton jButtonHamburger;
    public static JButton jButtonHomePage;
    public static JButton jButtonHotdog;
    public static JButton jButtonKFC;
    public static JButton jButtonMe;
    public static JButton jButtonNotification;
    public static JButton jButtonOrder;
    public static JButton jButtonPizza;
    private javax.swing.JLabel jLabelBeer;
    private javax.swing.JLabel jLabelBubbleTea;
    private javax.swing.JLabel jLabelCart;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCoffee;
    private javax.swing.JLabel jLabelCollection;
    private javax.swing.JLabel jLabelDealHotToday;
    private javax.swing.JLabel jLabelDelivery;
    private javax.swing.JLabel jLabelDiscountCode;
    private javax.swing.JLabel jLabelException1MainView;
    private javax.swing.JLabel jLabelFavorite;
    private javax.swing.JLabel jLabelFreeshipXtra;
    private javax.swing.JLabel jLabelHamburger;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelHotdog;
    private javax.swing.JLabel jLabelKFC;
    private javax.swing.JLabel jLabelMe;
    private javax.swing.JLabel jLabelNotification;
    private javax.swing.JLabel jLabelOrder;
    private javax.swing.JLabel jLabelOut;
    private javax.swing.JLabel jLabelPizza;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelrBread;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelMainBody;
    public static JPanel jPanelMainView;
    private javax.swing.JTextField jTextFieldPosition;
    // End of variables declaration          
    
    
    // Variables of Hamburger                                      
    public static JButton jButtonAddHamburgerView;
    public static JButton jButtonBackHamburgerView;
    public static JButton jButtonFavoriteHamburgerView;
    public static JButton jButtonPayInCashHamburgerView;
    public static JButton jButtonPayWithQRCodeHamburgerView;
    private javax.swing.JDialog jDialogExcepton1HamburgerView;
    private javax.swing.JLabel jLabelExcepton1HamburgerView;
    private javax.swing.JLabel jLabelGreenDotHamburger;
    private javax.swing.JLabel jLabelHourOpenHamburger;
    private javax.swing.JLabel jLabelImageHamburgerView;
    private javax.swing.JLabel jLabelMoneyHamburgerView;
    private javax.swing.JLabel jLabelPaymentMethodsHamburgerView;
    private javax.swing.JLabel jLabelPositionHamburgerView;
    private javax.swing.JLabel jLabelStar1HamburgerView;
    private javax.swing.JLabel jLabelStar2HamburgerView;
    private javax.swing.JLabel jLabelStar3HamburgerView;
    private javax.swing.JLabel jLabelStar4HamburgerView;
    private javax.swing.JLabel jLabelSumHamburgerView;
    private javax.swing.JLabel jLabelTimeOpenHamburgerView;
    private javax.swing.JLabel jLabelUpToHamburgerView;
    private javax.swing.JLabel jLabelVNDHamburgerView;
    private javax.swing.JPanel jPaneContainStarHamburgerView;
    private javax.swing.JPanel jPanelContainerHamburgerView;
    private javax.swing.JPanel jPanelExcepton1HamburgerView;
    public static JPanel jPanelHamburgerView;
    private javax.swing.JPanel jPanelHourOpenHamburgerView;
    private javax.swing.JPanel jPanelListHamburgerView;
    private javax.swing.JPanel jPanelPaymentMethodsHamburgerView;
    private javax.swing.JScrollPane jScrollPaneExcepton1HamburgerView;
    private javax.swing.JTable jTableMenuOfHamburger;
    private javax.swing.JTextField jTextFieldNameHamburgerView; 
    // End of variables declaration 
    
    // Variables of PizzaView                     
    public static JButton jButtonAddPizzaView;
    public static JButton jButtonBackPizza;
    public static JButton jButtonFavoritePizzaView;
    public static JButton jButtonPayInCashPizzaView;
    public static JButton jButtonPayWithQRCodePizzaView;
    private javax.swing.JLabel jLabelException1PizzaView;
    private javax.swing.JPanel jLabelException2PizzaView;
    private javax.swing.JLabel jLabelGreenDotPizza;
    private javax.swing.JLabel jLabelHourOpenPizza;
    private javax.swing.JLabel jLabelImagePizzaView;
    private javax.swing.JLabel jLabelMoneyPizzaView;
    private javax.swing.JLabel jLabelPaymentMethodsPizzaView;
    private javax.swing.JLabel jLabelPositionPizzaView;
    private javax.swing.JLabel jLabelStar1PizzaView;
    private javax.swing.JLabel jLabelStar2PizzaView;
    private javax.swing.JLabel jLabelStar3PizzaView;
    private javax.swing.JLabel jLabelStar4PizzaView;
    private javax.swing.JLabel jLabelSumPizzaView;
    private javax.swing.JLabel jLabelTimeOpenPizzaView;
    private javax.swing.JLabel jLabelUpToPizzaView;
    private javax.swing.JLabel jLabelVNDPizzaView;
    private javax.swing.JPanel jPaneContainStarPizzaView;
    private javax.swing.JPanel jPanelHourOpenPizzaView;
    private javax.swing.JPanel jPanelListPizzaView;
    private javax.swing.JPanel jPanelPaymentMethodsPizzaView;
    public static JPanel jPanelPizzaView;
    private javax.swing.JScrollPane jScrollPaneException1PizzaView;
    private javax.swing.JTable jTableMenuOfPizza;
    private javax.swing.JTextField jTextFieldNamePizzaView;
    // End of variables declaration
    
    // Variables of KFCView                    
    public static JButton jButtonAddKFCView;
    public static JButton jButtonBackKFC;
    public static JButton jButtonFavoriteKFCView;
    public static JButton jButtonPayInCashKFCView;
    public static JButton jButtonPayWithQRCodeKFCView;
    private javax.swing.JLabel jLabelException1KFCView;
    private javax.swing.JLabel jLabelGreenDotKFC;
    private javax.swing.JLabel jLabelHourOpenKFC;
    private javax.swing.JLabel jLabelImageKFCView;
    private javax.swing.JLabel jLabelMoneyKFCView;
    private javax.swing.JLabel jLabelPaymentMethodsKFCView;
    private javax.swing.JLabel jLabelPositionKFCView;
    private javax.swing.JLabel jLabelStar1KFCView;
    private javax.swing.JLabel jLabelStar2KFCView;
    private javax.swing.JLabel jLabelStar3KFCView;
    private javax.swing.JLabel jLabelStar4KFCView;
    private javax.swing.JLabel jLabelStar5KFCView;
    private javax.swing.JLabel jLabelSumKFCView;
    private javax.swing.JLabel jLabelTimeOpenKFCView;
    private javax.swing.JLabel jLabelUpToKFCView;
    private javax.swing.JLabel jLabelVNDKFCView;
    private javax.swing.JPanel jPaneContainStarKFCView;
    private javax.swing.JPanel jPanelException1KFCView;
    private javax.swing.JPanel jPanelHourOpenKFCView;
    public static JPanel jPanelKFCView;
    private javax.swing.JPanel jPanelListKFCView;
    private javax.swing.JPanel jPanelPaymentMethodsKFCView;
    private javax.swing.JScrollPane jScrollPaneException1KFCView;
    private javax.swing.JTable jTableMenuOfKFC;
    private javax.swing.JTextField jTextFieldNameKFCView;
    // End of variables declaration  
    
    // Variables of HotdogView                   
    public static JButton jButtonAddHotdogView;
    public static JButton jButtonBackHotdogView;
    public static JButton jButtonFavoriteHotdogView;
    public static JButton jButtonPayInCashHotdogView;
    public static JButton jButtonPayWithQRCodeHotdogView;
    private javax.swing.JLabel jLabelException1HotdogView;
    private javax.swing.JLabel jLabelGreenDotHotdog;
    private javax.swing.JLabel jLabelHourOpenHotdog;
    private javax.swing.JLabel jLabelImageHotdogView;
    private javax.swing.JLabel jLabelMoneyHotdogView;
    private javax.swing.JLabel jLabelPaymentMethodsHotdogView;
    private javax.swing.JLabel jLabelPositionHotdogView;
    private javax.swing.JLabel jLabelStar1HotdogView;
    private javax.swing.JLabel jLabelStar2HotdogView;
    private javax.swing.JLabel jLabelStar3HotdogView;
    private javax.swing.JLabel jLabelStar4HotdogView;
    private javax.swing.JLabel jLabelStar5HotdogView;
    private javax.swing.JLabel jLabelSumHotdogView;
    private javax.swing.JLabel jLabelTimeOpenHotdogView;
    private javax.swing.JLabel jLabelUpToHotdogView;
    private javax.swing.JLabel jLabelVNDHotdogView;
    private javax.swing.JPanel jPaneContainStarHotdogView;
    private javax.swing.JPanel jPanelContainerHotdogView;
    private javax.swing.JPanel jPanelException1HotdogView;
    public static JPanel jPanelHotdogView;
    private javax.swing.JPanel jPanelHourOpenHotdogView;
    private javax.swing.JPanel jPanelListHotdogView;
    private javax.swing.JPanel jPanelPaymentMethodsHotdogView;
    private javax.swing.JScrollPane jScrollPaneException1HotdogView;
    private javax.swing.JTable jTableMenuOfHotdog;
    private javax.swing.JTextField jTextFieldNameHotdogView;
    // End of variables declaration 
    
                       
    // Variables of DealHotTodayView                   
    public static JButton jButtonBackDealHotTodayView;
    public static JButton jButtonBackDealHotTodayView1;
    public static JButton jButtonBackDealHotTodayView3;
    private javax.swing.JLabel jLabelException1DealHotTodayView;
    private javax.swing.JLabel jLabelException2DealHotTodayView;
    private javax.swing.JLabel jLabelException3DealHotTodayView;
    private javax.swing.JLabel jLabelException4DealHotTodayView;
    private javax.swing.JLabel jLabelException5DealHotTodayView;
    public static JPanel jPanelDealHotTodayView;
    private javax.swing.JPanel jPanelException1DealHotTodayView;
    private javax.swing.JPanel jPanelException2DealHotTodayView;
    private javax.swing.JPanel jPanelException3DealHotTodayView;
    // End of variables declaration 
    
    // Variables of CoffeeView                    
    public static JButton jButtonAddCoffeeView;
    public static JButton jButtonBackCoffee;
    public static JButton jButtonFavoriteCoffeeView;
    public static JButton jButtonPayInCashCoffeeView;
    public static JButton jButtonPayWithQRCodeCoffeeView;
    private javax.swing.JLabel jLabelException1CoffeeView;
    private javax.swing.JLabel jLabelGreenDotCoffee;
    private javax.swing.JLabel jLabelHourOpenCoffee;
    private javax.swing.JLabel jLabelImageCoffeeView;
    private javax.swing.JLabel jLabelMoneyCoffeeView;
    private javax.swing.JLabel jLabelPaymentMethodsCoffeeView;
    private javax.swing.JLabel jLabelPositionCoffeeView;
    private javax.swing.JLabel jLabelStar1CoffeeView;
    private javax.swing.JLabel jLabelStar2CoffeeView;
    private javax.swing.JLabel jLabelStar3CoffeeView;
    private javax.swing.JLabel jLabelStar4CoffeeView;
    private javax.swing.JLabel jLabelStar5CoffeeView;
    private javax.swing.JLabel jLabelSumCoffeeView;
    private javax.swing.JLabel jLabelTimeOpenCoffeeView;
    private javax.swing.JLabel jLabelUpToCoffeeView;
    private javax.swing.JLabel jLabelVNDCoffeeView;
    private javax.swing.JPanel jPaneContainStarCoffeeView;
    public static JPanel jPanelCoffeeView;
    private javax.swing.JPanel jPanelException1CoffeeView;
    private javax.swing.JPanel jPanelHourOpenCoffeeView;
    private javax.swing.JPanel jPanelListCoffeeView;
    private javax.swing.JPanel jPanelPaymentMethodsCoffeeView;
    private javax.swing.JScrollPane jScrollPaneException1CoffeeView;
    private javax.swing.JTable jTableMenuOfCoffee;
    private javax.swing.JTextField jTextFieldNameCoffeeView;
    // End of variables declaration  
    
    
        // Variables of BubbleTea View                 
    public static JButton jButtonAddBubbleTeaView;
    public static JButton jButtonBackBubbleTea;
    public static JButton jButtonBackBubbleTeaException1;
    public static JButton jButtonFavoriteBubbleTeaView;
    public static JButton jButtonPayInCashBubbleTeaView;
    public static JButton jButtonPayWithQRCodeBubbleTeaView;
    private javax.swing.JLabel jLabelExcepiton1BubbleTeaView;
    private javax.swing.JLabel jLabelGreenDotBubbleTeaView;
    private javax.swing.JLabel jLabelHourOpenBubbleTea;
    private javax.swing.JLabel jLabelImageBubbleTeaView;
    private javax.swing.JLabel jLabelMoneyBubbleTeaView;
    private javax.swing.JLabel jLabelPaymentMethodsBubbleTeaView;
    private javax.swing.JLabel jLabelPositionBubbleTeaView;
    private javax.swing.JLabel jLabelStar1BubbleTeaView;
    private javax.swing.JLabel jLabelStar2BubbleTeaView;
    private javax.swing.JLabel jLabelStar3BubbleTeaView;
    private javax.swing.JLabel jLabelStar4BubbleTeaView;
    private javax.swing.JLabel jLabelStar5BubbleTeaView;
    private javax.swing.JLabel jLabelSumBubbleTeaView;
    private javax.swing.JLabel jLabelTimeOpenBubbleTeaView;
    private javax.swing.JLabel jLabelUpToBubbleTeaView;
    private javax.swing.JLabel jLabelVNDBubbleTeaView;
    private javax.swing.JPanel jPaneContainStarBubbleTeaView;
    public static JPanel jPanelBubbleTeaView;
    private javax.swing.JPanel jPanelContainerBubbleTeaView;
    private javax.swing.JPanel jPanelExcepiton1BubbleTeaView;
    private javax.swing.JPanel jPanelHourOpenBubbleTeaView;
    private javax.swing.JPanel jPanelListBubbleTeaView;
    private javax.swing.JPanel jPanelPaymentMethodsBubbleTea;
    private javax.swing.JScrollPane jScrollPaneExcepiton1BubbleTeaView;
    private javax.swing.JTable jTableMenuOfBubbleTea;
    private javax.swing.JTextField jTextFieldNameBubbleTeaView;
    // End of variables declaration  
    
        // Variables of BreadView                    
    public static JButton jButtonAddBreadView;
    public static JButton jButtonBackBreadView;
    private javax.swing.JButton jButtonBackBreadViewException1;
    public static JButton jButtonFavoriteBreadView;
    public static JButton jButtonPayInCashBreadView;
    public static JButton jButtonPayWithQRCodeBreadView;
    private javax.swing.JLabel jLabelException1BreadView;
    private javax.swing.JLabel jLabelGreenDotBread;
    private javax.swing.JLabel jLabelHourOpenBread;
    private javax.swing.JLabel jLabelImageBreadView;
    private javax.swing.JLabel jLabelMoneyBreadView;
    private javax.swing.JLabel jLabelPaymentMethodsBreadView;
    private javax.swing.JLabel jLabelPositionBreadView;
    private javax.swing.JLabel jLabelStar1BreadView;
    private javax.swing.JLabel jLabelStar2BreadView;
    private javax.swing.JLabel jLabelStar3BreadView;
    private javax.swing.JLabel jLabelStar4BreadView;
    private javax.swing.JLabel jLabelSumBreadView;
    private javax.swing.JLabel jLabelTimeOpenBreadView;
    private javax.swing.JLabel jLabelUpToBreadView;
    private javax.swing.JLabel jLabelVNDBreadView;
    private javax.swing.JPanel jPaneContainStarBreadView;
    public static JPanel jPanelBreadView;
    private javax.swing.JPanel jPanelContainerBreadView;
    private javax.swing.JPanel jPanelException1BreadView;
    private javax.swing.JPanel jPanelHourOpenBread;
    private javax.swing.JPanel jPanelListBreadView;
    private javax.swing.JPanel jPanelPaymentMethodsBreadView;
    private javax.swing.JScrollPane jScrollPaneException1BreadView;
    private javax.swing.JTable jTableMenuOfBread;
    private javax.swing.JTextField jTextFieldNameBreadView;
    // End of variables declaration 
    
        // Variables of BeerView                    
    public static JButton jButtonAddBeerView;
    public static JButton jButtonBackBeer;
    private javax.swing.JButton jButtonBackBeerException1;
    public static JButton jButtonFavoriteBeerView;
    public static JButton jButtonPayInCashBeerView;
    public static JButton jButtonPayWithQRCodeBeerView;
    private javax.swing.JLabel jLabelException1BeerView;
    private javax.swing.JLabel jLabelGreenDotBeer;
    private javax.swing.JLabel jLabelHourOpenBeer;
    private javax.swing.JLabel jLabelImageBeerView;
    private javax.swing.JLabel jLabelMoneyBeerView;
    private javax.swing.JLabel jLabelPaymentMethodsBeerView;
    private javax.swing.JLabel jLabelPositionBeerView;
    private javax.swing.JLabel jLabelStar1BeerView;
    private javax.swing.JLabel jLabelStar2BeerView;
    private javax.swing.JLabel jLabelStar3BeerView;
    private javax.swing.JLabel jLabelStar4BeerView;
    private javax.swing.JLabel jLabelSumBeerView;
    private javax.swing.JLabel jLabelTimeOpenBeerView;
    private javax.swing.JLabel jLabelUpToBeerView;
    private javax.swing.JLabel jLabelVNDBeerView;
    private javax.swing.JPanel jPaneContainStarBeerView;
    public static JPanel jPanelBeerView;
    private javax.swing.JPanel jPanelContainerBeerView;
    private javax.swing.JPanel jPanelException1BeerView;
    private javax.swing.JPanel jPanelHourOpenBeer;
    private javax.swing.JPanel jPanelListBeerView;
    private javax.swing.JPanel jPanelPaymentMethodsBeerView;
    private javax.swing.JScrollPane jScrollPaneException1BeerView;
    private javax.swing.JTable jTableMenuOfBeer;
    private javax.swing.JTextField jTextFieldNameBeerView;
    // End of variables declaration  
    
    public Manager(){
        init();
    }
    
    private void init(){
         jFrameMain = new JFrame("Trang chủ");
        
        jFrameMain.setLayout(new  FlowLayout());
        jFrameMain.setLocationRelativeTo(null);
        jFrameMain.setSize(861, 488);
        jFrameMain.getContentPane().setBackground(Color.WHITE);
        jFrameMain.setResizable(false);
        jFrameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set giữa màn hình
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int x = (int) (center.getX() - jFrameMain.getWidth() / 2);
        int y = (int) (center.getY() - jFrameMain.getHeight() / 2-50);
        jFrameMain.setLocation(x, y);
        
        BubbleTeaView();
        DealHotTodayView();
        BeerView();
        BreadView();
        CoffeeView();
        HotdogView();
        KFCView();
        PizzaView();
        HamburgerView();
        MainView();
        SignUpGUI();
        SignInGUI();
        jFrameMain.add(jPanelSignInGUI);
        checkSignInFromSignUp = 1;
        checkBeer= 1;
        checkBread = 1;
        checkBubbleTea=1;
        checkCoffee=1;
        checkDealHotToday=1;
        checkHamburger=1;
        checkHotdog=1;
        checkKFC=1;
        checkPizza=1;
       
        jFrameMain.setVisible(true);
    }  
     private void SignInGUI() {

      
        jPanelSignInGUI = new javax.swing.JPanel();
        jButtonSignUpHere = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        textFieldEmailLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        passWordLabel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        jButtonForgotPassWord = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSignInGUI.setBackground(new java.awt.Color(255, 255, 255));

        jButtonSignUpHere.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonSignUpHere.setForeground(new java.awt.Color(0, 255, 255));
        jButtonSignUpHere.setText("Sign up here");
        jButtonSignUpHere.setBorder(null);
        jButtonSignUpHere.addActionListener(new SignInGUIListener());

        jButtonLogin.setBackground(new java.awt.Color(153, 51, 255));
        jButtonLogin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new SignInGUIListener());

        textFieldEmailLogin.setBorder(null);
        textFieldEmailLogin.setCaretColor(new java.awt.Color(140, 140, 140));
        textFieldEmailLogin.addActionListener(new SignInGUIListener());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-delivery-man-64.png")); // NOI18N

        passWordLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passWordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passWordLabel.setText("PASSWORD");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Login");

        fullNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(102, 102, 102));
        fullNameLabel.setText("EMAIL");

        jButtonForgotPassWord.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonForgotPassWord.setForeground(new java.awt.Color(51, 51, 51));
        jButtonForgotPassWord.setText("Forgot your password?");
        jButtonForgotPassWord.setBorder(null);
        jButtonForgotPassWord.addActionListener(new SignInGUIListener());

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Don't have an account?");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Enter your details below to continue");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-password-50.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-email-64.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("                 FAST FOOD");

        jPasswordField.setBorder(null);

        javax.swing.GroupLayout jPanelSignInGUILayout = new javax.swing.GroupLayout(jPanelSignInGUI);
        jPanelSignInGUI.setLayout(jPanelSignInGUILayout);
        jPanelSignInGUILayout.setHorizontalGroup(
            jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSignInGUILayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSignUpHere, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                        .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonForgotPassWord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(passWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38))
                                .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                                    .addComponent(jPasswordField)
                                    .addGap(20, 20, 20)))
                            .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSignInGUILayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textFieldEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelSignInGUILayout.setVerticalGroup(
            jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignInGUILayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonForgotPassWord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSignInGUILayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanelSignInGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSignUpHere, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(64, 64, 64))
        );

    }  
     protected void SignUpGUI() {
        jPanelSignUpGUI = new javax.swing.JPanel();
        jSeparatorEmail = new javax.swing.JSeparator();
        jTextFieldEmail = new javax.swing.JTextField();
        checkboxTermOfService = new java.awt.Checkbox();
        jButtonSignUp = new javax.swing.JButton();
        jLabelAreadyAMember = new javax.swing.JLabel();
        jSeparatorAreadyAMember = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabelFullNameOfSignUp = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jSeparatorFullName = new javax.swing.JSeparator();
        jLabelPassWordOfSignUp = new javax.swing.JLabel();
        jSeparatorPassWord = new javax.swing.JSeparator();
        jLabelEmailOfSignUp = new javax.swing.JLabel();
        jButtonBackSignUp = new javax.swing.JButton();
        jLabelFastFood = new javax.swing.JLabel();
        jLabelPerson = new javax.swing.JLabel();
        jTextFieldPassWord = new javax.swing.JTextField();
            
        jPanelSignUpGUI.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldEmail.setToolTipText("");
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.setCaretColor(new java.awt.Color(140, 140, 140));

        checkboxTermOfService.setForeground(new java.awt.Color(0, 0, 0));
        checkboxTermOfService.setLabel("I agree all the terms of service");

        jButtonSignUp.setBackground(new java.awt.Color(0, 102, 255));
        jButtonSignUp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUp.setText("Sign Up");
        jButtonSignUp.addActionListener(new SignUpGUIListener());

        jLabelAreadyAMember.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelAreadyAMember.setText("Already a member");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Sign up for Fast Food");

        jLabelFullNameOfSignUp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelFullNameOfSignUp.setForeground(new java.awt.Color(102, 102, 102));
        jLabelFullNameOfSignUp.setText("FULL NAME");

        jTextFieldFullName.setBorder(null);
        jTextFieldFullName.setCaretColor(new java.awt.Color(140, 140, 140));

        jLabelPassWordOfSignUp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelPassWordOfSignUp.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPassWordOfSignUp.setText("PASSWORD");

        jLabelEmailOfSignUp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelEmailOfSignUp.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmailOfSignUp.setText("EMAIL");

        jButtonBackSignUp.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-back-64.png")); // NOI18N
        jButtonBackSignUp.setBorder(null);
        jButtonBackSignUp.addActionListener(new SignUpGUIListener());

        jLabelFastFood.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelFastFood.setForeground(new java.awt.Color(255, 51, 0));
        jLabelFastFood.setText("                 FAST FOOD");

        jLabelPerson.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-delivery-man-64.png")); // NOI18N

        jTextFieldPassWord.setBorder(null);

        javax.swing.GroupLayout jPanelSignUpGUILayout = new javax.swing.GroupLayout(jPanelSignUpGUI);
        jPanelSignUpGUI.setLayout(jPanelSignUpGUILayout);
        jPanelSignUpGUILayout.setHorizontalGroup(
            jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignUpGUILayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFastFood, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSignUpGUILayout.createSequentialGroup()
                        .addComponent(jLabelPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)))
                .addGroup(jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(checkboxTermOfService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEmailOfSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparatorPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPassWordOfSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparatorFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFullNameOfSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelSignUpGUILayout.createSequentialGroup()
                            .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelAreadyAMember, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparatorAreadyAMember, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSignUpGUILayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonBackSignUp))
        );
        jPanelSignUpGUILayout.setVerticalGroup(
            jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignUpGUILayout.createSequentialGroup()
                .addGroup(jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignUpGUILayout.createSequentialGroup()
                        .addComponent(jButtonBackSignUp)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabelFullNameOfSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparatorFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPassWordOfSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparatorPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmailOfSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanelSignUpGUILayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabelPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFastFood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(checkboxTermOfService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSignUpGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSignUpGUILayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jSeparatorAreadyAMember, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelAreadyAMember, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSignUpGUILayout.createSequentialGroup()
                        .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

    }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void MainView() {

        jPanelMainView = new javax.swing.JPanel();
        jLabelDelivery = new javax.swing.JLabel();
        jLabelException1MainView = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jTextFieldPosition = new javax.swing.JTextField();
        jLabelHeader = new javax.swing.JLabel();
        jPanelMainBody = new javax.swing.JPanel();
        jButtonHamburger = new javax.swing.JButton();
        jButtonDealHotToday = new javax.swing.JButton();
        jButtonCart = new javax.swing.JButton();
        jButtonDiscountCode = new javax.swing.JButton();
        jButtonHotdog = new javax.swing.JButton();
        jButtonCollection = new javax.swing.JButton();
        jButtonFreeshipXtra = new javax.swing.JButton();
        jButtonCoffee = new javax.swing.JButton();
        jButtonBubbleTea = new javax.swing.JButton();
        jButtonCategory = new javax.swing.JButton();
        jButtonBeer = new javax.swing.JButton();
        jButtonPizza = new javax.swing.JButton();
        jButtonKFC = new javax.swing.JButton();
        jButtonBread = new javax.swing.JButton();
        jLabelHamburger = new javax.swing.JLabel();
        jLabelDealHotToday = new javax.swing.JLabel();
        jLabelCart = new javax.swing.JLabel();
        jLabelDiscountCode = new javax.swing.JLabel();
        jLabelHotdog = new javax.swing.JLabel();
        jLabelCollection = new javax.swing.JLabel();
        jLabelFreeshipXtra = new javax.swing.JLabel();
        jLabelCoffee = new javax.swing.JLabel();
        jLabelBubbleTea = new javax.swing.JLabel();
        jLabelrBread = new javax.swing.JLabel();
        jLabelKFC = new javax.swing.JLabel();
        jLabelPizza = new javax.swing.JLabel();
        jLabelBeer = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jButtonHomePage = new javax.swing.JButton();
        jButtonOrder = new javax.swing.JButton();
        jButtonFavorite = new javax.swing.JButton();
        jButtonNotification = new javax.swing.JButton();
        jButtonMe = new javax.swing.JButton();
        jLabelOut = new javax.swing.JLabel();
        jLabelOrder = new javax.swing.JLabel();
        jLabelFavorite = new javax.swing.JLabel();
        jLabelNotification = new javax.swing.JLabel();
        jLabelMe = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //setBackground(new java.awt.Color(255, 255, 255));

        jPanelMainView.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDelivery.setText("Giao tới:");

        jLabelPosition.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-location-48.png")); // NOI18N

        jLabelHeader.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\R.png")); // NOI18N

        jPanelMainBody.setBackground(new java.awt.Color(255, 255, 255));

        jButtonHamburger.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-hamburger-48.png")); // NOI18N
        jButtonHamburger.setName("HamburgerButton");
        jButtonHamburger.setBorder(null);
        jButtonHamburger.addActionListener(new MainListener());

        jButtonDealHotToday.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-hot-sale-64.png")); // NOI18N
        jButtonDealHotToday.setName("DealHotTodayButton");
        jButtonDealHotToday.setBorder(null);
        jButtonDealHotToday.addActionListener(new MainListener());
        
        jButtonCart.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-shopping-cart-64.png")); // NOI18N
        jButtonCart.setName("CartButton");
        jButtonCart.setBorder(null);
        jButtonCart.addActionListener(new MainListener());

        jButtonDiscountCode.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-discount-48.png")); // NOI18N
        jButtonDiscountCode.setName("DiscountCodeButton");
        jButtonDiscountCode.setBorder(null);
        jButtonDiscountCode.addActionListener(new MainListener());

        jButtonHotdog.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-hot-dog-48.png")); // NOI18N
        jButtonHotdog.setName("HotdogButton");
        jButtonHotdog.setBorder(null);
        jButtonHotdog.addActionListener(new MainListener());

        jButtonCollection.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-food-bar-48.png")); // NOI18N
        jButtonCollection.setName("CollectionButton");
        jButtonCollection.setBorder(null);
        jButtonCollection.addActionListener(new MainListener());

        jButtonFreeshipXtra.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-ecommerce-64.png")); // NOI18N
        jButtonFreeshipXtra.setName("FreeshipXtraButton");
        jButtonFreeshipXtra.setBorder(null);
        jButtonFreeshipXtra.addActionListener(new MainListener());

        jButtonCoffee.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-iced-coffee-40.png")); // NOI18N
        jButtonCoffee.setName("CoffeeButton");
        jButtonCoffee.setBorder(null);
        jButtonCoffee.addActionListener(new MainListener());
        
        jButtonBubbleTea.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-bubble-tea-40.png")); // NOI18N
        jButtonBubbleTea.setName("BubbleTeaButton");
        jButtonBubbleTea.setBorder(null);
        jButtonBubbleTea.addActionListener(new MainListener());

        jButtonCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-category-64.png")); // NOI18N
        jButtonCategory.setName("CategoryButton");
        jButtonCategory.setBorder(null);
        jButtonCategory.addActionListener(new MainListener());

        jButtonBeer.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-pint-48.png")); // NOI18N
        jButtonBeer.setName("BeerButton");
        jButtonBeer.setBorder(null);
        jButtonBeer.addActionListener(new MainListener());

        jButtonPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-pizza-48.png")); // NOI18N
        jButtonPizza.setName("PizzaButton");
        jButtonPizza.setBorder(null);
        jButtonPizza.addActionListener(new MainListener());

        jButtonKFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-kfc-chicken-48.png")); // NOI18N
        jButtonKFC.setName("KFCButton");
        jButtonKFC.setBorder(null);
        jButtonKFC.addActionListener(new MainListener());

        jButtonBread.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-bread-64.png")); // NOI18N
        jButtonBread.setName("BreadButton");
        jButtonBread.setBorder(null);
        jButtonBread.addActionListener(new MainListener());

        jLabelHamburger.setText("    Hamburger");

        jLabelDealHotToday.setText("Deal hot hôm nay");

        jLabelCart.setText("Giỏ hàng");

        jLabelDiscountCode.setText("Mã giảm giá");

        jLabelHotdog.setText("   Hot dog");

        jLabelCollection.setText(" Bộ sưu tập");

        jLabelFreeshipXtra.setText("Freeship Xtra");

        jLabelCoffee.setText("  Coffee");

        jLabelBubbleTea.setText("   Trà sữa");

        jLabelrBread.setText("Bánh mì");

        jLabelKFC.setText("Gà rán KFC");

        jLabelPizza.setText("Pizza");

        jLabelBeer.setText("  Bia hơi");

        jLabelCategory.setText("Danh mục");

        javax.swing.GroupLayout jPanelMainBodyLayout = new javax.swing.GroupLayout(jPanelMainBody);
        jPanelMainBody.setLayout(jPanelMainBodyLayout);
        jPanelMainBodyLayout.setHorizontalGroup(
            jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonHamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHamburger)
                            .addComponent(jButtonCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabelCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainBodyLayout.createSequentialGroup()
                                .addComponent(jButtonDealHotToday, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainBodyLayout.createSequentialGroup()
                                .addComponent(jLabelDealHotToday)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCart, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelCart))))
                    .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBubbleTea, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBubbleTea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelrBread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonBread, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDiscountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDiscountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelHotdog, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jButtonHotdog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonKFC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKFC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPizza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainBodyLayout.createSequentialGroup()
                                .addComponent(jLabelPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCollection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCollection, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabelBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFreeshipXtra, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFreeshipXtra)
                    .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelMainBodyLayout.setVerticalGroup(
            jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFreeshipXtra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDiscountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonDealHotToday, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCart, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonHotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonHamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelFreeshipXtra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelHotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelCart, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                    .addComponent(jLabelDiscountCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDealHotToday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelHamburger, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonKFC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelMainBodyLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBubbleTea, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBread, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCoffee, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabelBubbleTea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelrBread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelKFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelFooter.setForeground(new java.awt.Color(255, 102, 0));

        jButtonHomePage.setForeground(new java.awt.Color(255, 102, 0));
        jButtonHomePage.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-home-page-60.png")); // NOI18N
        jButtonHomePage.setBorder(null);
        jButtonHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jButtonHomePageActionPerformed(evt);
            }
        });

        jButtonOrder.setForeground(new java.awt.Color(255, 102, 0));
        jButtonOrder.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-purchase-order-60.png")); // NOI18N
        jButtonOrder.setBorder(null);
        jButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jButtonOrderActionPerformed(evt);
            }
        });

        jButtonFavorite.setForeground(new java.awt.Color(255, 102, 0));
        jButtonFavorite.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-favorite-48.png")); // NOI18N
        jButtonFavorite.setBorder(null);
        jButtonFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jButtonFavoriteActionPerformed(evt);
            }
        });

        jButtonNotification.setForeground(new java.awt.Color(255, 102, 0));
        jButtonNotification.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-alarm-50.png")); // NOI18N
        jButtonNotification.setBorder(null);
        jButtonNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jButtonNotificationActionPerformed(evt);
            }
        });

        jButtonMe.setForeground(new java.awt.Color(255, 102, 0));
        jButtonMe.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-me-58.png")); // NOI18N
        jButtonMe.setBorder(null);

        jLabelOut.setText("Đăng xuất");

        jLabelOrder.setText("Đơn hàng");

        jLabelFavorite.setText(" Đã thích");

        jLabelNotification.setText("Thông báo");

        jLabelMe.setText("   Tôi");

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jButtonHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelOut)
                        .addGap(60, 60, 60)
                        .addComponent(jLabelOrder)))
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonFavorite, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFavorite, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButtonMe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabelMe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonFavorite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNotification, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOut)
                    .addComponent(jLabelOrder)
                    .addComponent(jLabelFavorite)
                    .addComponent(jLabelNotification)
                    .addComponent(jLabelMe))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainViewLayout = new javax.swing.GroupLayout(jPanelMainView);
        jPanelMainView.setLayout(jPanelMainViewLayout);
        jPanelMainViewLayout.setHorizontalGroup(
            jPanelMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainViewLayout.createSequentialGroup()
                .addComponent(jLabelDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelException1MainView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMainViewLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldPosition)
                        .addContainerGap())))
            .addGroup(jPanelMainViewLayout.createSequentialGroup()
                .addGroup(jPanelMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelFooter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainViewLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jPanelMainBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMainViewLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelHeader))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMainViewLayout.setVerticalGroup(
            jPanelMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainViewLayout.createSequentialGroup()
                .addComponent(jLabelException1MainView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPosition)
                    .addComponent(jTextFieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMainBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold> 
                         
    private void HamburgerView() {

        jDialogExcepton1HamburgerView = new javax.swing.JDialog();
        jPanelHamburgerView = new javax.swing.JPanel();
        jLabelImageHamburgerView = new javax.swing.JLabel();
        jPanelContainerHamburgerView = new javax.swing.JPanel();
        jTextFieldNameHamburgerView = new javax.swing.JTextField();
        jLabelPositionHamburgerView = new javax.swing.JLabel();
        jPaneContainStarHamburgerView = new javax.swing.JPanel();
        jLabelStar1HamburgerView = new javax.swing.JLabel();
        jLabelStar2HamburgerView = new javax.swing.JLabel();
        jLabelStar3HamburgerView = new javax.swing.JLabel();
        jLabelStar4HamburgerView = new javax.swing.JLabel();
        jPanelExcepton1HamburgerView = new javax.swing.JPanel();
        jLabelGreenDotHamburger = new javax.swing.JLabel();
        jLabelTimeOpenHamburgerView = new javax.swing.JLabel();
        jPanelHourOpenHamburgerView = new javax.swing.JPanel();
        jLabelHourOpenHamburger = new javax.swing.JLabel();
        jLabelUpToHamburgerView = new javax.swing.JLabel();
        jButtonFavoriteHamburgerView = new javax.swing.JButton();
        jPanelListHamburgerView = new javax.swing.JPanel();
        jScrollPaneExcepton1HamburgerView = new javax.swing.JScrollPane();
        jTableMenuOfHamburger = new javax.swing.JTable();
        jLabelExcepton1HamburgerView = new javax.swing.JLabel();
        jLabelSumHamburgerView = new javax.swing.JLabel();
        jLabelMoneyHamburgerView = new javax.swing.JLabel();
        jLabelVNDHamburgerView = new javax.swing.JLabel();
        jButtonAddHamburgerView = new javax.swing.JButton();
        jPanelPaymentMethodsHamburgerView = new javax.swing.JPanel();
        jButtonPayInCashHamburgerView = new javax.swing.JButton();
        jButtonPayWithQRCodeHamburgerView = new javax.swing.JButton();
        jLabelPaymentMethodsHamburgerView = new javax.swing.JLabel();
        jButtonBackHamburgerView = new javax.swing.JButton();

        javax.swing.GroupLayout jDialogExcepton1HamburgerViewLayout = new javax.swing.GroupLayout(jDialogExcepton1HamburgerView.getContentPane());
        jDialogExcepton1HamburgerView.getContentPane().setLayout(jDialogExcepton1HamburgerViewLayout);
        jDialogExcepton1HamburgerViewLayout.setHorizontalGroup(
            jDialogExcepton1HamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogExcepton1HamburgerViewLayout.setVerticalGroup(
            jDialogExcepton1HamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanelHamburgerView.setBackground(new java.awt.Color(255, 153, 51));
        jPanelHamburgerView.setMaximumSize(new java.awt.Dimension(862, 593));
        jPanelHamburgerView.setMinimumSize(new java.awt.Dimension(862, 593));

        jLabelImageHamburgerView.setBackground(new java.awt.Color(255, 153, 51));
        jLabelImageHamburgerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\HamburgerView.png")); // NOI18N
        jLabelImageHamburgerView.setText("jLabel1");

        jPanelContainerHamburgerView.setBackground(new java.awt.Color(255, 153, 51));

        jTextFieldNameHamburgerView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNameHamburgerView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextFieldNameHamburgerView.setText("Hello Burger - Hamburger & Chicken");
        jTextFieldNameHamburgerView.setBorder(null);

        jLabelPositionHamburgerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionHamburgerView.setText("Địa điểm: ao sen ngõ số 2");

        jPaneContainStarHamburgerView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1HamburgerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1HamburgerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2HamburgerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2HamburgerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3HamburgerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3HamburgerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4HamburgerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4HamburgerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarHamburgerViewLayout = new javax.swing.GroupLayout(jPaneContainStarHamburgerView);
        jPaneContainStarHamburgerView.setLayout(jPaneContainStarHamburgerViewLayout);
        jPaneContainStarHamburgerViewLayout.setHorizontalGroup(
            jPaneContainStarHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarHamburgerViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPaneContainStarHamburgerViewLayout.setVerticalGroup(
            jPaneContainStarHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarHamburgerViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStar1HamburgerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar2HamburgerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar3HamburgerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar4HamburgerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelExcepton1HamburgerView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelGreenDotHamburger.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotHamburger.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        jLabelTimeOpenHamburgerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenHamburgerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenHamburgerView.setText("Mở cửa 10a.m - 8p.m ");

        javax.swing.GroupLayout jPanelExcepton1HamburgerViewLayout = new javax.swing.GroupLayout(jPanelExcepton1HamburgerView);
        jPanelExcepton1HamburgerView.setLayout(jPanelExcepton1HamburgerViewLayout);
        jPanelExcepton1HamburgerViewLayout.setHorizontalGroup(
            jPanelExcepton1HamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExcepton1HamburgerViewLayout.createSequentialGroup()
                .addComponent(jLabelGreenDotHamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTimeOpenHamburgerView)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanelExcepton1HamburgerViewLayout.setVerticalGroup(
            jPanelExcepton1HamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGreenDotHamburger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTimeOpenHamburgerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHourOpenHamburgerView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenHamburger.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToHamburgerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToHamburgerView.setText("20,000 - 80,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenHamburgerViewLayout = new javax.swing.GroupLayout(jPanelHourOpenHamburgerView);
        jPanelHourOpenHamburgerView.setLayout(jPanelHourOpenHamburgerViewLayout);
        jPanelHourOpenHamburgerViewLayout.setHorizontalGroup(
            jPanelHourOpenHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenHamburgerViewLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenHamburger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelHourOpenHamburgerViewLayout.setVerticalGroup(
            jPanelHourOpenHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenHamburger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToHamburgerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonFavoriteHamburgerView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteHamburgerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteHamburgerView.setBorder(null);
        jButtonFavoriteHamburgerView.addActionListener(new HamburgerListener());

        javax.swing.GroupLayout jPanelContainerHamburgerViewLayout = new javax.swing.GroupLayout(jPanelContainerHamburgerView);
        jPanelContainerHamburgerView.setLayout(jPanelContainerHamburgerViewLayout);
        jPanelContainerHamburgerViewLayout.setHorizontalGroup(
            jPanelContainerHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerHamburgerViewLayout.createSequentialGroup()
                .addGroup(jPanelContainerHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExcepton1HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneContainStarHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHourOpenHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelContainerHamburgerViewLayout.createSequentialGroup()
                .addGroup(jPanelContainerHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPositionHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFavoriteHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 74, Short.MAX_VALUE))
        );
        jPanelContainerHamburgerViewLayout.setVerticalGroup(
            jPanelContainerHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerHamburgerViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFavoriteHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNameHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPositionHamburgerView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneContainStarHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelExcepton1HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHourOpenHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanelListHamburgerView.setBackground(new java.awt.Color(255, 153, 51));

        jTableMenuOfHamburger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Hamburger Bò + Phô mai", "39,900",  new Integer(0)},
                {"2", "Khoai lang Nhật size lớn", "20,900",  new Integer(0)},
                {"3", "Hamburger Bò 2 tầng + Phô mai", "52,250",  new Integer(0)},
                {"4", "Hamburger Bò + Trứng", "38,000",  new Integer(0)},
                {"5", "Hamburger Gà + Phô mai", "36,100",  new Integer(0)},
                {"6", "Hamburger Bò + Tôm + Phô mai", "60,800",  new Integer(0)},
                {"7", "Hamburger Tôm + Phô mai", "47,500",  new Integer(0)},
                {"8", "Hamburger Gà + Trứng", "36,100",  new Integer(0)},
                {"9", "Hamburger Bò + Gà + Phô mai", "49,400",  new Integer(0)},
                {"10", "Combo Hamburger Bò + Coca", "38,000",  new Integer(0)},
                {"11", "Hamburger Bò + Xúc xích + Phô mai", "47,500",  new Integer(0)},
                {"12", "Combo Hamburger Bò + Gà + Coca", "50,350",  new Integer(0)},
                {"13", "Bánh Mì BÒ NGON + Coca", "36,100",  new Integer(0)},
                {"14", "Hamburger Bò + Xúc xích", "41,800",  new Integer(0)},
                {"15", "Combo Hamburger Bò + Tôm + Coca", "58,900",  new Integer(0)},
                {"16", "Hamburger Bò 2 tầng + 1 trứng", "52,250",  new Integer(0)},
                {"17", "Combo Hello Burger 1 (2 burger bò + 2 ly coca)", "70,300",  new Integer(0)},
                {"18", "Combo Hello Burger 3 (1 burger bò + 1 burger gà + 2 ly coca)", "66,500",  new Integer(0)},
                {"19", "Combo Hello Burger 2 (1 burger bò + 1 burger tôm + 2 ly coca)", "79,800",  new Integer(0)},
                {"20", "Hamburger Xúc xích", "28,500",  new Integer(0)},
                {"21", "Hamburger Tôm + Xúc xích", "49,400",  new Integer(0)},
                {"22", "Hamburger Tôm + Xúc xích + Phô mai", "55,100",  new Integer(0)},
                {"23", "Combo Hamburger Tôm + Trứng + 1 Coca", "50,350",  new Integer(0)},
                {"24", "Combo Hamburger Tôm + 1 Coca", "45,600",  new Integer(0)},
                {"25", "Combo Hamburger Tôm + Phô mai + 1 Coca", "53,200",  new Integer(0)},
                {"26", "Combo Hamburger Tôm + Gà + 1 Coca", "56,050",  new Integer(0)},
                {"27", "Combo Hamburger Tôm + Gà + Phô mai + 1 Coca", "63,650",  new Integer(0)},
                {"28", "Combo Hamburger Tôm + Xúc xích + 1 Coca", "54,150",  new Integer(0)},
                {"29", "Combo Hamburger Xúc xích + Trứng + 1 Coca", "39,900",  new Integer(0)},
                {"30", "Combo Hamburger Xúc xích + Phô mai + 1 Coca", "41,800",  new Integer(0)},
                {"31", "Combo Hamburger Gà + Xúc Xích + Phô mai + 1 Coca", "48,450",  new Integer(0)},
                {"32", "Combo Hamburger Gà + Xúc Xích + 1 Coca", "43,700",  new Integer(0)},
                {"33", "Hamburger Xúc xích + Phô mai", "36,100",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneExcepton1HamburgerView.setViewportView(jTableMenuOfHamburger);
        if (jTableMenuOfHamburger.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfHamburger.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfHamburger.getColumnModel().getColumn(1).setResizable(false);
            jTableMenuOfHamburger.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTableMenuOfHamburger.getColumnModel().getColumn(2).setResizable(false);
            jTableMenuOfHamburger.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableMenuOfHamburger.getColumnModel().getColumn(3).setResizable(false);
            jTableMenuOfHamburger.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jLabelSumHamburgerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumHamburgerView.setText("Tổng:");

        jLabelMoneyHamburgerView.setText("0");
        jLabelMoneyHamburgerView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDHamburgerView.setText("VNĐ");

        jButtonAddHamburgerView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddHamburgerView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddHamburgerView.setText("Thêm");
        jButtonAddHamburgerView.addActionListener(new HamburgerListener());

        javax.swing.GroupLayout jPanelListHamburgerViewLayout = new javax.swing.GroupLayout(jPanelListHamburgerView);
        jPanelListHamburgerView.setLayout(jPanelListHamburgerViewLayout);
        jPanelListHamburgerViewLayout.setHorizontalGroup(
            jPanelListHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListHamburgerViewLayout.createSequentialGroup()
                .addGroup(jPanelListHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelListHamburgerViewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelExcepton1HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanelListHamburgerViewLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButtonAddHamburgerView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSumHamburgerView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMoneyHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabelVNDHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanelListHamburgerViewLayout.createSequentialGroup()
                .addComponent(jScrollPaneExcepton1HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelListHamburgerViewLayout.setVerticalGroup(
            jPanelListHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListHamburgerViewLayout.createSequentialGroup()
                .addComponent(jScrollPaneExcepton1HamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExcepton1HamburgerView)
                .addGap(18, 18, 18)
                .addGroup(jPanelListHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelMoneyHamburgerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSumHamburgerView, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabelVNDHamburgerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonAddHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jButtonPayInCashHamburgerView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashHamburgerView.setText("Sử dụng tiền mặt");
        jButtonPayInCashHamburgerView.addActionListener(new HamburgerListener());

        jButtonPayWithQRCodeHamburgerView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodeHamburgerView.setText("Quét mã QR");
        jButtonPayWithQRCodeHamburgerView.addActionListener(new HamburgerListener());
        
        jLabelPaymentMethodsHamburgerView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsHamburgerView.setText("      Phương thức thanh toán");

        javax.swing.GroupLayout jPanelPaymentMethodsHamburgerViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsHamburgerView);
        jPanelPaymentMethodsHamburgerView.setLayout(jPanelPaymentMethodsHamburgerViewLayout);
        jPanelPaymentMethodsHamburgerViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsHamburgerViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsHamburgerViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPayInCashHamburgerView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayWithQRCodeHamburgerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanelPaymentMethodsHamburgerViewLayout.setVerticalGroup(
            jPanelPaymentMethodsHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsHamburgerViewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelPaymentMethodsHamburgerView, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayInCashHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodeHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jButtonBackHamburgerView.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackHamburgerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackHamburgerView.setBorder(null);
        jButtonBackHamburgerView.addActionListener(new HamburgerListener());

        javax.swing.GroupLayout jPanelHamburgerViewLayout = new javax.swing.GroupLayout(jPanelHamburgerView);
        jPanelHamburgerView.setLayout(jPanelHamburgerViewLayout);
        jPanelHamburgerViewLayout.setHorizontalGroup(
            jPanelHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHamburgerViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHamburgerViewLayout.createSequentialGroup()
                        .addComponent(jPanelListHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelPaymentMethodsHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHamburgerViewLayout.createSequentialGroup()
                        .addComponent(jLabelImageHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelContainerHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jButtonBackHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanelHamburgerViewLayout.setVerticalGroup(
            jPanelHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHamburgerViewLayout.createSequentialGroup()
                .addGroup(jPanelHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImageHamburgerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelHamburgerViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBackHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelContainerHamburgerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHamburgerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelListHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPaymentMethodsHamburgerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );


    }
    private void PizzaView() {

        jPanelPizzaView = new javax.swing.JPanel();
        jButtonBackPizza = new javax.swing.JButton();
        jPanelListPizzaView = new javax.swing.JPanel();
        jLabelException1PizzaView = new javax.swing.JLabel();
        jLabelSumPizzaView = new javax.swing.JLabel();
        jLabelMoneyPizzaView = new javax.swing.JLabel();
        jLabelVNDPizzaView = new javax.swing.JLabel();
        jButtonAddPizzaView = new javax.swing.JButton();
        jScrollPaneException1PizzaView = new javax.swing.JScrollPane();
        jTableMenuOfPizza = new javax.swing.JTable();
        jLabelImagePizzaView = new javax.swing.JLabel();
        jPanelPaymentMethodsPizzaView = new javax.swing.JPanel();
        jLabelPaymentMethodsPizzaView = new javax.swing.JLabel();
        jButtonPayInCashPizzaView = new javax.swing.JButton();
        jButtonPayWithQRCodePizzaView = new javax.swing.JButton();
        jLabelPositionPizzaView = new javax.swing.JLabel();
        jPaneContainStarPizzaView = new javax.swing.JPanel();
        jLabelStar1PizzaView = new javax.swing.JLabel();
        jLabelStar2PizzaView = new javax.swing.JLabel();
        jLabelStar3PizzaView = new javax.swing.JLabel();
        jLabelStar4PizzaView = new javax.swing.JLabel();
        jButtonFavoritePizzaView = new javax.swing.JButton();
        jLabelException2PizzaView = new javax.swing.JPanel();
        jLabelGreenDotPizza = new javax.swing.JLabel();
        jLabelTimeOpenPizzaView = new javax.swing.JLabel();
        jPanelHourOpenPizzaView = new javax.swing.JPanel();
        jLabelHourOpenPizza = new javax.swing.JLabel();
        jLabelUpToPizzaView = new javax.swing.JLabel();
        jTextFieldNamePizzaView = new javax.swing.JTextField();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPizzaView.setBackground(new java.awt.Color(255, 153, 51));

        jButtonBackPizza.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackPizza.setBorder(null);
        jButtonBackPizza.addActionListener(new PizzaListener());

        jPanelListPizzaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelSumPizzaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumPizzaView.setText("Tổng:");

        jLabelMoneyPizzaView.setBackground(new java.awt.Color(255, 153, 51));
        jLabelMoneyPizzaView.setText("0");
        jLabelMoneyPizzaView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDPizzaView.setText("VNĐ");

        jButtonAddPizzaView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddPizzaView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddPizzaView.setText("Thêm");
        jButtonAddPizzaView.addActionListener(new PizzaListener());

        jTableMenuOfPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "COMBO ĐỘC QUYỀN:1 Pizza size M + 1 Nước + 1 Mực Chiên Giòn", "283,000",  new Integer(0)},
                {"2", "Salad Ngũ Quả Xốt Đào", "165,000",  new Integer(0)},
                {"3", "Pizza Tứ Vị Du Xuân", "345,000",  new Integer(0)},
                {"4", "NEW YORK PIZZA HALF-HALF", "235,000",  new Integer(0)},
                {"5", "COMBO NUI BỎ LÒ 69K", "69,000",  new Integer(0)},
                {"6", "Pizza Hải Sản Pesto Xanh / Secret Recipe Seafood Pesto", "185,000",  new Integer(0)},
                {"7", "Pizza Hải Sản Đào - Seafood & Peach", "185,000",  new Integer(0)},
                {"8", "Pizza Hải Sản Nhiệt Đới / Tropical Seafood", "165,000",  new Integer(0)},
                {"9", "Pizza Hải Sản Cao Cấp / Seafood Deluxe", "165,000",  new Integer(0)},
                {"10", "Pizza Hải Sản Cocktail / Seafood Cocktail", "165,000",  new Integer(0)},
                {"11", "Pizza Tôm Cocktail / Shrimp Cocktail", "165,000",  new Integer(0)},
                {"12", "Pizza 5 Loại Thịt Đặc Biệt / Meat Deluxe", "155,000",  new Integer(0)},
                {"13", "Pizza Gà Nướng 3 Vị / Chicken Trio", "155,000",  new Integer(0)},
                {"14", "Pizza Aloha / Aloha", "155,000",  new Integer(0)},
                {"15", "Pizza Thịt Nguội Kiểu Canada / Canadian Bacon", "155,000",  new Integer(0)},
                {"16", "Pizza Thịt Xông Khói / Bacon Super Delight", "155,000",  new Integer(0)},
                {"17", "Pizza Phô Mai / Double Cheese", "135,000",  new Integer(0)},
                {"18", "Pizza Xúc Xích Ý / Double Pepperoni", "135,000",  new Integer(0)},
                {"19", "Pizza Hawaii / Hawaiian", "135,000",  new Integer(0)},
                {"20", "Pizza Rau Củ / Veggie", "135,000",  new Integer(0)},
                {"21", "Pizza Gà Nướng Dứa / Chicken Caldo", "135,000",  new Integer(0)},
                {"22", "Pizza Thịt Nguội & Nấm / Ham & Mushroom", "135,000",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneException1PizzaView.setViewportView(jTableMenuOfPizza);
        if (jTableMenuOfPizza.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfPizza.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfPizza.getColumnModel().getColumn(1).setPreferredWidth(350);
        }

        javax.swing.GroupLayout jPanelListPizzaViewLayout = new javax.swing.GroupLayout(jPanelListPizzaView);
        jPanelListPizzaView.setLayout(jPanelListPizzaViewLayout);
        jPanelListPizzaViewLayout.setHorizontalGroup(
            jPanelListPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListPizzaViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelListPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListPizzaViewLayout.createSequentialGroup()
                        .addComponent(jLabelException1PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListPizzaViewLayout.createSequentialGroup()
                        .addComponent(jButtonAddPizzaView)
                        .addGap(82, 82, 82)
                        .addComponent(jLabelSumPizzaView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMoneyPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelVNDPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addComponent(jScrollPaneException1PizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelListPizzaViewLayout.setVerticalGroup(
            jPanelListPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListPizzaViewLayout.createSequentialGroup()
                .addComponent(jLabelException1PizzaView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneException1PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelListPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMoneyPizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddPizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVNDPizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSumPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jLabelImagePizzaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\PizzaView.png")); // NOI18N
        jLabelImagePizzaView.setText("jLabel1");

        jLabelPaymentMethodsPizzaView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsPizzaView.setText("      Phương thức thanh toán");

        jButtonPayInCashPizzaView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashPizzaView.setText("Sử dụng tiền mặt");
        jButtonPayInCashPizzaView.addActionListener(new PizzaListener());

        jButtonPayWithQRCodePizzaView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodePizzaView.setText("Quét mã QR");
        jButtonPayWithQRCodePizzaView.addActionListener(new PizzaListener());

        javax.swing.GroupLayout jPanelPaymentMethodsPizzaViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsPizzaView);
        jPanelPaymentMethodsPizzaView.setLayout(jPanelPaymentMethodsPizzaViewLayout);
        jPanelPaymentMethodsPizzaViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsPizzaViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsPizzaViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPayInCashPizzaView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayWithQRCodePizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanelPaymentMethodsPizzaViewLayout.setVerticalGroup(
            jPanelPaymentMethodsPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsPizzaViewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelPaymentMethodsPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayInCashPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodePizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabelPositionPizzaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionPizzaView.setText("Địa điểm: ao sen ngõ số 4");

        jPaneContainStarPizzaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1PizzaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1PizzaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2PizzaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2PizzaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3PizzaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3PizzaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4PizzaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4PizzaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarPizzaViewLayout = new javax.swing.GroupLayout(jPaneContainStarPizzaView);
        jPaneContainStarPizzaView.setLayout(jPaneContainStarPizzaViewLayout);
        jPaneContainStarPizzaViewLayout.setHorizontalGroup(
            jPaneContainStarPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarPizzaViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPaneContainStarPizzaViewLayout.setVerticalGroup(
            jPaneContainStarPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarPizzaViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStar1PizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar2PizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar3PizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar4PizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonFavoritePizzaView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoritePizzaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoritePizzaView.setBorder(null);
        jButtonFavoritePizzaView.addActionListener(new PizzaListener());

        jLabelException2PizzaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelGreenDotPizza.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        jLabelTimeOpenPizzaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenPizzaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenPizzaView.setText("Mở cửa 8a.m - 11p.m ");

        javax.swing.GroupLayout jLabelException2PizzaViewLayout = new javax.swing.GroupLayout(jLabelException2PizzaView);
        jLabelException2PizzaView.setLayout(jLabelException2PizzaViewLayout);
        jLabelException2PizzaViewLayout.setHorizontalGroup(
            jLabelException2PizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelException2PizzaViewLayout.createSequentialGroup()
                .addComponent(jLabelGreenDotPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTimeOpenPizzaView)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jLabelException2PizzaViewLayout.setVerticalGroup(
            jLabelException2PizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGreenDotPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTimeOpenPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHourOpenPizzaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToPizzaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToPizzaView.setText("70,000 - 350,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenPizzaViewLayout = new javax.swing.GroupLayout(jPanelHourOpenPizzaView);
        jPanelHourOpenPizzaView.setLayout(jPanelHourOpenPizzaViewLayout);
        jPanelHourOpenPizzaViewLayout.setHorizontalGroup(
            jPanelHourOpenPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenPizzaViewLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenPizza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelHourOpenPizzaViewLayout.setVerticalGroup(
            jPanelHourOpenPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToPizzaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextFieldNamePizzaView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNamePizzaView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldNamePizzaView.setText("Domino’s Pizza - Nguyễn Tri Phương");
        jTextFieldNamePizzaView.setBorder(null);

        javax.swing.GroupLayout jPanelPizzaViewLayout = new javax.swing.GroupLayout(jPanelPizzaView);
        jPanelPizzaView.setLayout(jPanelPizzaViewLayout);
        jPanelPizzaViewLayout.setHorizontalGroup(
            jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                        .addComponent(jLabelImagePizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                                .addGroup(jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelException2PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPaneContainStarPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelHourOpenPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                                .addGroup(jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPositionPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonFavoritePizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNamePizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBackPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                        .addComponent(jPanelListPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelPaymentMethodsPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelPizzaViewLayout.setVerticalGroup(
            jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                .addGroup(jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                        .addGroup(jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonFavoritePizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNamePizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonBackPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPositionPizzaView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPaneContainStarPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelException2PizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelHourOpenPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                        .addComponent(jLabelImagePizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelListPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPizzaViewLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanelPaymentMethodsPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }
    private void KFCView() {

        jPanelKFCView = new javax.swing.JPanel();
        jPanelListKFCView = new javax.swing.JPanel();
        jScrollPaneException1KFCView = new javax.swing.JScrollPane();
        jTableMenuOfKFC = new javax.swing.JTable();
        jLabelException1KFCView = new javax.swing.JLabel();
        jLabelSumKFCView = new javax.swing.JLabel();
        jLabelMoneyKFCView = new javax.swing.JLabel();
        jLabelVNDKFCView = new javax.swing.JLabel();
        jButtonAddKFCView = new javax.swing.JButton();
        jButtonBackKFC = new javax.swing.JButton();
        jLabelImageKFCView = new javax.swing.JLabel();
        jPanelPaymentMethodsKFCView = new javax.swing.JPanel();
        jLabelPaymentMethodsKFCView = new javax.swing.JLabel();
        jButtonPayInCashKFCView = new javax.swing.JButton();
        jButtonPayWithQRCodeKFCView = new javax.swing.JButton();
        jPanelException1KFCView = new javax.swing.JPanel();
        jLabelPositionKFCView = new javax.swing.JLabel();
        jTextFieldNameKFCView = new javax.swing.JTextField();
        jPanelHourOpenKFCView = new javax.swing.JPanel();
        jLabelHourOpenKFC = new javax.swing.JLabel();
        jLabelUpToKFCView = new javax.swing.JLabel();
        jLabelTimeOpenKFCView = new javax.swing.JLabel();
        jPaneContainStarKFCView = new javax.swing.JPanel();
        jLabelStar1KFCView = new javax.swing.JLabel();
        jLabelStar2KFCView = new javax.swing.JLabel();
        jLabelStar3KFCView = new javax.swing.JLabel();
        jLabelStar4KFCView = new javax.swing.JLabel();
        jLabelStar5KFCView = new javax.swing.JLabel();
        jButtonFavoriteKFCView = new javax.swing.JButton();
        jLabelGreenDotKFC = new javax.swing.JLabel();


        jPanelKFCView.setBackground(new java.awt.Color(255, 153, 51));

        jPanelListKFCView.setBackground(new java.awt.Color(255, 153, 51));

        jTableMenuOfKFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1 Cơm Phi-lê Gà Quay/Cơm Phi-lê Gà Quay Tiêu + 1 Lon Pepsi", "45,000",  new Integer(0)},
                {"2", "Combo Cơm Trưa Gà Rán", "45,000",  new Integer(0)},
                {"3", "Combo Cơm Gà Xốt Teriyaki", "45,000",  new Integer(0)},
                {"4", "Gà rán (3 miếng)", "105,000",  new Integer(0)},
                {"5", "Gà rán (2 miếng)", "71,000",  new Integer(0)},
                {"6", "Gà rán (1 miếng)", "36,000",  new Integer(0)},
                {"7", "Gà Quay (1 Miếng)", "75,000",  new Integer(0)},
                {"8", "Gà Hot Wings (5 miếng)", "85,000",  new Integer(0)},
                {"9", "Gà Hot Wings (3 miếng)", "55,000",  new Integer(0)},
                {"10", "Combo Cơm Trưa Phi-lê Gà Quay", "45,000",  new Integer(0)},
                {"11", "Combo Cơm Trưa Gà Rán", "45,000",  new Integer(0)},
                {"12", "Combo Cơm Gà Xốt Teriyaki", "45,000",  new Integer(0)},
                {"13", "Combo Trưa Burger Tôm", "45,000",  new Integer(0)},
                {"14", "Combo Trưa Mì Ý Gà Viên", "45,000",  new Integer(0)},
                {"15", "Combo Cơm Trưa Gà Bít-Tết", "45,000",  new Integer(0)},
                {"16", "Combo Cơm Trưa Gà Xiên Que", "45,000",  new Integer(0)},
                {"17", "Cơm Gà Rán", "46,000",  new Integer(0)},
                {"18", "Gà Miếng Nuggets", "27,000",  new Integer(0)},
                {"19", "2 Miếng Gà + 1 Bánh Trứng + 1 Lon Pepsi", "99,000",  new Integer(0)},
                {"20", "1 Miếng Gà + 1 Hộp Gà Viên (Vừa) + 1 Lon Pepsi ", "89,000",  new Integer(0)},
                {"21", "1 Burger Tôm + 1 Miếng Gà + 1 Lon Pepsi", "91,000",  new Integer(0)},
                {"22", "5 Miếng Gà + 1 Hộp Gà Viên (Vừa) + 3 Lon Pepsi", "259,000",  new Integer(0)},
                {"23", "4 Miếng Gà + 3 Nuggets + 2 Lon Pepsi", "189,000",  new Integer(0)},
                {"24", "1 Miếng Gà Quay Giấy Bạc + 1 Salad Hạt", "109,000",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneException1KFCView.setViewportView(jTableMenuOfKFC);
        if (jTableMenuOfKFC.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfKFC.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfKFC.getColumnModel().getColumn(1).setPreferredWidth(350);
        }

        jLabelSumKFCView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumKFCView.setText("Tổng:");

        jLabelMoneyKFCView.setText("0");
        jLabelMoneyKFCView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDKFCView.setText("VNĐ");

        jButtonAddKFCView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddKFCView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddKFCView.setText("Thêm");
        jButtonAddKFCView.addActionListener(new KFCListener());

        javax.swing.GroupLayout jPanelListKFCViewLayout = new javax.swing.GroupLayout(jPanelListKFCView);
        jPanelListKFCView.setLayout(jPanelListKFCViewLayout);
        jPanelListKFCViewLayout.setHorizontalGroup(
            jPanelListKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListKFCViewLayout.createSequentialGroup()
                .addGroup(jPanelListKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelListKFCViewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelException1KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanelListKFCViewLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButtonAddKFCView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSumKFCView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMoneyKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabelVNDKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanelListKFCViewLayout.createSequentialGroup()
                .addComponent(jScrollPaneException1KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelListKFCViewLayout.setVerticalGroup(
            jPanelListKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListKFCViewLayout.createSequentialGroup()
                .addComponent(jScrollPaneException1KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelException1KFCView)
                .addGap(18, 18, 18)
                .addGroup(jPanelListKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelMoneyKFCView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSumKFCView, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabelVNDKFCView, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(jButtonAddKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jButtonBackKFC.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackKFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackKFC.setBorder(null);
        jButtonBackKFC.addActionListener(new KFCListener());

        jLabelImageKFCView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\KFCView.png")); // NOI18N
        jLabelImageKFCView.setText("jLabel1");

        jLabelPaymentMethodsKFCView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsKFCView.setText("      Phương thức thanh toán");

        jButtonPayInCashKFCView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashKFCView.setText("Sử dụng tiền mặt");
        jButtonPayInCashKFCView.addActionListener(new KFCListener());

        jButtonPayWithQRCodeKFCView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodeKFCView.setText("Quét mã QR");
        jButtonPayWithQRCodeKFCView.addActionListener(new KFCListener());

        javax.swing.GroupLayout jPanelPaymentMethodsKFCViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsKFCView);
        jPanelPaymentMethodsKFCView.setLayout(jPanelPaymentMethodsKFCViewLayout);
        jPanelPaymentMethodsKFCViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsKFCViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsKFCViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPayInCashKFCView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayWithQRCodeKFCView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanelPaymentMethodsKFCViewLayout.setVerticalGroup(
            jPanelPaymentMethodsKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsKFCViewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelPaymentMethodsKFCView, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayInCashKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodeKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanelException1KFCView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelPositionKFCView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionKFCView.setText("Địa điểm: ao sen ngõ số 0");

        jTextFieldNameKFCView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNameKFCView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldNameKFCView.setText("Gà Rán KFC - Âu Cơ");
        jTextFieldNameKFCView.setBorder(null);

        jPanelHourOpenKFCView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenKFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToKFCView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToKFCView.setText("35,000 - 260,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenKFCViewLayout = new javax.swing.GroupLayout(jPanelHourOpenKFCView);
        jPanelHourOpenKFCView.setLayout(jPanelHourOpenKFCViewLayout);
        jPanelHourOpenKFCViewLayout.setHorizontalGroup(
            jPanelHourOpenKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenKFCViewLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenKFC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelHourOpenKFCViewLayout.setVerticalGroup(
            jPanelHourOpenKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenKFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToKFCView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelTimeOpenKFCView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenKFCView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenKFCView.setText("Mở cửa 10a.m - 11p.m ");

        jPaneContainStarKFCView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1KFCView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1KFCView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2KFCView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2KFCView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3KFCView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3KFCView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4KFCView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4KFCView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar5KFCView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar5KFCView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarKFCViewLayout = new javax.swing.GroupLayout(jPaneContainStarKFCView);
        jPaneContainStarKFCView.setLayout(jPaneContainStarKFCViewLayout);
        jPaneContainStarKFCViewLayout.setHorizontalGroup(
            jPaneContainStarKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarKFCViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar5KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPaneContainStarKFCViewLayout.setVerticalGroup(
            jPaneContainStarKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarKFCViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneContainStarKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelStar1KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar2KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar3KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar4KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelStar5KFCView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonFavoriteKFCView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteKFCView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteKFCView.setBorder(null);
        jButtonFavoriteKFCView.addActionListener(new KFCListener());

        jLabelGreenDotKFC.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotKFC.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        javax.swing.GroupLayout jPanelException1KFCViewLayout = new javax.swing.GroupLayout(jPanelException1KFCView);
        jPanelException1KFCView.setLayout(jPanelException1KFCViewLayout);
        jPanelException1KFCViewLayout.setHorizontalGroup(
            jPanelException1KFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1KFCViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelException1KFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPositionKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFavoriteKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHourOpenKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelException1KFCViewLayout.createSequentialGroup()
                        .addComponent(jLabelGreenDotKFC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTimeOpenKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPaneContainStarKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanelException1KFCViewLayout.setVerticalGroup(
            jPanelException1KFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1KFCViewLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jButtonFavoriteKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNameKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabelPositionKFCView)
                .addGap(4, 4, 4)
                .addComponent(jPaneContainStarKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelException1KFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTimeOpenKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGreenDotKFC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHourOpenKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelKFCViewLayout = new javax.swing.GroupLayout(jPanelKFCView);
        jPanelKFCView.setLayout(jPanelKFCViewLayout);
        jPanelKFCViewLayout.setHorizontalGroup(
            jPanelKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKFCViewLayout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addGroup(jPanelKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKFCViewLayout.createSequentialGroup()
                        .addComponent(jPanelPaymentMethodsKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKFCViewLayout.createSequentialGroup()
                        .addComponent(jPanelException1KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(jPanelKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelKFCViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelKFCViewLayout.createSequentialGroup()
                            .addComponent(jPanelListKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(255, Short.MAX_VALUE))
                        .addGroup(jPanelKFCViewLayout.createSequentialGroup()
                            .addComponent(jLabelImageKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                            .addComponent(jButtonBackKFC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanelKFCViewLayout.setVerticalGroup(
            jPanelKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKFCViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelException1KFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelPaymentMethodsKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(jPanelKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelKFCViewLayout.createSequentialGroup()
                    .addGroup(jPanelKFCViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelKFCViewLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelImageKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonBackKFC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelListKFCView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

    }
    private void HotdogView() {

        jPanelHotdogView = new javax.swing.JPanel();
        jPanelListHotdogView = new javax.swing.JPanel();
        jLabelException1HotdogView = new javax.swing.JLabel();
        jLabelSumHotdogView = new javax.swing.JLabel();
        jLabelMoneyHotdogView = new javax.swing.JLabel();
        jLabelVNDHotdogView = new javax.swing.JLabel();
        jButtonAddHotdogView = new javax.swing.JButton();
        jScrollPaneException1HotdogView = new javax.swing.JScrollPane();
        jTableMenuOfHotdog = new javax.swing.JTable();
        jButtonBackHotdogView = new javax.swing.JButton();
        jLabelImageHotdogView = new javax.swing.JLabel();
        jPanelContainerHotdogView = new javax.swing.JPanel();
        jButtonFavoriteHotdogView = new javax.swing.JButton();
        jLabelPositionHotdogView = new javax.swing.JLabel();
        jTextFieldNameHotdogView = new javax.swing.JTextField();
        jPaneContainStarHotdogView = new javax.swing.JPanel();
        jLabelStar1HotdogView = new javax.swing.JLabel();
        jLabelStar2HotdogView = new javax.swing.JLabel();
        jLabelStar3HotdogView = new javax.swing.JLabel();
        jLabelStar4HotdogView = new javax.swing.JLabel();
        jLabelStar5HotdogView = new javax.swing.JLabel();
        jPanelException1HotdogView = new javax.swing.JPanel();
        jLabelGreenDotHotdog = new javax.swing.JLabel();
        jLabelTimeOpenHotdogView = new javax.swing.JLabel();
        jPanelHourOpenHotdogView = new javax.swing.JPanel();
        jLabelHourOpenHotdog = new javax.swing.JLabel();
        jLabelUpToHotdogView = new javax.swing.JLabel();
        jPanelPaymentMethodsHotdogView = new javax.swing.JPanel();
        jLabelPaymentMethodsHotdogView = new javax.swing.JLabel();
        jButtonPayInCashHotdogView = new javax.swing.JButton();
        jButtonPayWithQRCodeHotdogView = new javax.swing.JButton();


        jPanelHotdogView.setBackground(new java.awt.Color(255, 153, 51));

        jPanelListHotdogView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelSumHotdogView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumHotdogView.setText("Tổng:");

        jLabelMoneyHotdogView.setBackground(new java.awt.Color(255, 153, 0));
        jLabelMoneyHotdogView.setText("0                                                      0");
        jLabelMoneyHotdogView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDHotdogView.setText("VNĐ");

        jButtonAddHotdogView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddHotdogView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddHotdogView.setText("Thêm");
        jButtonAddHotdogView.addActionListener(new HotdogListener());

        jScrollPaneException1HotdogView.setBackground(new java.awt.Color(255, 255, 255));

        jTableMenuOfHotdog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Hotdog Egg Roll Double Cheese", "33,000",  new Integer(0)},
                {"2", "Hotdog Hamada Cheese", "35,000",  new Integer(0)},
                {"3", "Hotdog Berlin + Phô Mai Trứng Cuộn", "45,000",  new Integer(0)},
                {"4", "Hotdog Xông Khói + Phô Mai Trứng Cuộn", "40,000",  new Integer(0)},
                {"5", "Hotdog Berlin Trứng Cuộn", "40,000",  new Integer(0)},
                {"6", "Cheese Stuffed Hot Dog Roll", "35,000",  new Integer(0)},
                {"7", "Triple Cheesehotdog", "45,000",  new Integer(0)},
                {"8", "Jumbo Frankfurt Hotdog", "43,000",  new Integer(0)},
                {"9", "Bacon Wrapped Cheese Dog", "45,000",  new Integer(0)},
                {"10", "Hotdog Mozzarella Cheese", "35,000",  new Integer(0)},
                {"11", "Hotdog Ốp Trứng Lòng Đào", "38,000",  new Integer(0)},
                {"12", "Bacon Wrapped Hotdog", "40,000",  new Integer(0)},
                {"13", "Black Hotdog", "43,000",  new Integer(0)},
                {"14", "Hotdog than tre trứng cuộn", "28,000",  new Integer(0)},
                {"15", "Hamada Deluxe W.Egg", "40,000",  new Integer(0)},
                {"16", "Hotdog Than Tre Dát Vàng", "88,888",  new Integer(0)},
                {"17", "Hotdog truyền thống Mỹ", "25,000",  new Integer(0)},
                {"18", "Hotdog xông khói", "30,000",  new Integer(0)},
                {"19", "Hotdog truyền thống nhỏ", "17,000",  new Integer(0)},
                {"20", "Hotdog Bò", "35,000",  new Integer(0)},
                {"21", "Hotdog phô mai", "23,000",  new Integer(0)},
                {"22", "Hotdog Mỹ + Phô Mai Trứng", "35,000",  new Integer(0)},
                {"23", "Hotdog Mỹ Trứng Cuộn", "30,000",  new Integer(0)},
                {"24", "Hotdog Barbecue", "33,000",  new Integer(0)},
                {"25", "Hotdog Gà Hong Khói", "23,000",  new Integer(0)},
                {"26", "Hotdog Frankfurt", "28,000",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneException1HotdogView.setViewportView(jTableMenuOfHotdog);
        if (jTableMenuOfHotdog.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfHotdog.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfHotdog.getColumnModel().getColumn(1).setPreferredWidth(350);
        }

        javax.swing.GroupLayout jPanelListHotdogViewLayout = new javax.swing.GroupLayout(jPanelListHotdogView);
        jPanelListHotdogView.setLayout(jPanelListHotdogViewLayout);
        jPanelListHotdogViewLayout.setHorizontalGroup(
            jPanelListHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListHotdogViewLayout.createSequentialGroup()
                .addGroup(jPanelListHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelListHotdogViewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelException1HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanelListHotdogViewLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButtonAddHotdogView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(jLabelSumHotdogView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMoneyHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabelVNDHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanelListHotdogViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneException1HotdogView))
        );
        jPanelListHotdogViewLayout.setVerticalGroup(
            jPanelListHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListHotdogViewLayout.createSequentialGroup()
                .addComponent(jScrollPaneException1HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelException1HotdogView)
                .addGap(18, 18, 18)
                .addGroup(jPanelListHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelMoneyHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSumHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabelVNDHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonAddHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonBackHotdogView.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackHotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackHotdogView.setBorder(null);
        jButtonBackHotdogView.addActionListener(new HotdogListener());

        jLabelImageHotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\HotdogView.png")); // NOI18N
        jLabelImageHotdogView.setText("jLabel1");

        jPanelContainerHotdogView.setBackground(new java.awt.Color(255, 153, 51));

        jButtonFavoriteHotdogView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteHotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteHotdogView.setBorder(null);
        jButtonFavoriteHotdogView.addActionListener(new HotdogListener());

        jLabelPositionHotdogView.setBackground(new java.awt.Color(255, 153, 51));
        jLabelPositionHotdogView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionHotdogView.setText("Địa điểm: ao sen ngõ số 2");

        jTextFieldNameHotdogView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNameHotdogView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldNameHotdogView.setText("Hamada Hotdog - Lý Nam Đế");
        jTextFieldNameHotdogView.setBorder(null);

        jPaneContainStarHotdogView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1HotdogView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1HotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2HotdogView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2HotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3HotdogView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3HotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4HotdogView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4HotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar5HotdogView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar5HotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarHotdogViewLayout = new javax.swing.GroupLayout(jPaneContainStarHotdogView);
        jPaneContainStarHotdogView.setLayout(jPaneContainStarHotdogViewLayout);
        jPaneContainStarHotdogViewLayout.setHorizontalGroup(
            jPaneContainStarHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarHotdogViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar5HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneContainStarHotdogViewLayout.setVerticalGroup(
            jPaneContainStarHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarHotdogViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneContainStarHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelStar1HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar2HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar3HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar4HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelStar5HotdogView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelException1HotdogView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelGreenDotHotdog.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotHotdog.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        jLabelTimeOpenHotdogView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenHotdogView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenHotdogView.setText("Mở cửa 6a.m - 8p.m ");

        javax.swing.GroupLayout jPanelException1HotdogViewLayout = new javax.swing.GroupLayout(jPanelException1HotdogView);
        jPanelException1HotdogView.setLayout(jPanelException1HotdogViewLayout);
        jPanelException1HotdogViewLayout.setHorizontalGroup(
            jPanelException1HotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1HotdogViewLayout.createSequentialGroup()
                .addComponent(jLabelGreenDotHotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTimeOpenHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanelException1HotdogViewLayout.setVerticalGroup(
            jPanelException1HotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGreenDotHotdog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTimeOpenHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHourOpenHotdogView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenHotdog.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToHotdogView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToHotdogView.setText("20,000 - 50,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenHotdogViewLayout = new javax.swing.GroupLayout(jPanelHourOpenHotdogView);
        jPanelHourOpenHotdogView.setLayout(jPanelHourOpenHotdogViewLayout);
        jPanelHourOpenHotdogViewLayout.setHorizontalGroup(
            jPanelHourOpenHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenHotdogViewLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenHotdog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelHourOpenHotdogViewLayout.setVerticalGroup(
            jPanelHourOpenHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenHotdog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToHotdogView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelContainerHotdogViewLayout = new javax.swing.GroupLayout(jPanelContainerHotdogView);
        jPanelContainerHotdogView.setLayout(jPanelContainerHotdogViewLayout);
        jPanelContainerHotdogViewLayout.setHorizontalGroup(
            jPanelContainerHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerHotdogViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContainerHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaneContainStarHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelContainerHotdogViewLayout.createSequentialGroup()
                        .addGroup(jPanelContainerHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPositionHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNameHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFavoriteHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelHourOpenHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelException1HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContainerHotdogViewLayout.setVerticalGroup(
            jPanelContainerHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerHotdogViewLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jButtonFavoriteHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jTextFieldNameHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPositionHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPaneContainStarHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelException1HotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHourOpenHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelPaymentMethodsHotdogView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsHotdogView.setText("      Phương thức thanh toán");

        jButtonPayInCashHotdogView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashHotdogView.setText("Sử dụng tiền mặt");
        jButtonPayInCashHotdogView.addActionListener(new HotdogListener());

        jButtonPayWithQRCodeHotdogView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodeHotdogView.setText("Quét mã QR");
        jButtonPayWithQRCodeHotdogView.addActionListener(new HotdogListener());

        javax.swing.GroupLayout jPanelPaymentMethodsHotdogViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsHotdogView);
        jPanelPaymentMethodsHotdogView.setLayout(jPanelPaymentMethodsHotdogViewLayout);
        jPanelPaymentMethodsHotdogViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsHotdogViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsHotdogViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPayInCashHotdogView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayWithQRCodeHotdogView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanelPaymentMethodsHotdogViewLayout.setVerticalGroup(
            jPanelPaymentMethodsHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsHotdogViewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelPaymentMethodsHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayInCashHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodeHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanelHotdogViewLayout = new javax.swing.GroupLayout(jPanelHotdogView);
        jPanelHotdogView.setLayout(jPanelHotdogViewLayout);
        jPanelHotdogViewLayout.setHorizontalGroup(
            jPanelHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHotdogViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHotdogViewLayout.createSequentialGroup()
                        .addComponent(jPanelListHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPaymentMethodsHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelHotdogViewLayout.createSequentialGroup()
                        .addComponent(jLabelImageHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanelContainerHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBackHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanelHotdogViewLayout.setVerticalGroup(
            jPanelHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHotdogViewLayout.createSequentialGroup()
                .addGroup(jPanelHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBackHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelContainerHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelImageHotdogView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHotdogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelListHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPaymentMethodsHotdogView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }
    private void DealHotTodayView() {

        jPanelDealHotTodayView = new javax.swing.JPanel();
        jButtonBackDealHotTodayView = new javax.swing.JButton();
        jLabelException1DealHotTodayView = new javax.swing.JLabel();
        jPanelException1DealHotTodayView = new javax.swing.JPanel();
        jButtonBackDealHotTodayView1 = new javax.swing.JButton();
        jLabelException3DealHotTodayView = new javax.swing.JLabel();
        jPanelException2DealHotTodayView = new javax.swing.JPanel();
        jPanelException3DealHotTodayView = new javax.swing.JPanel();
        jButtonBackDealHotTodayView3 = new javax.swing.JButton();
        jLabelException4DealHotTodayView = new javax.swing.JLabel();
        jLabelException2DealHotTodayView = new javax.swing.JLabel();
        jLabelException5DealHotTodayView = new javax.swing.JLabel();


        jPanelDealHotTodayView.setBackground(new java.awt.Color(255, 153, 51));

        jButtonBackDealHotTodayView.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackDealHotTodayView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackDealHotTodayView.setBorder(null);
        jButtonBackDealHotTodayView.addActionListener(new DealHotTodayListener());

        jLabelException1DealHotTodayView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\DealHotTodayView.jpg")); // NOI18N

        javax.swing.GroupLayout jPanelDealHotTodayViewLayout = new javax.swing.GroupLayout(jPanelDealHotTodayView);
        jPanelDealHotTodayView.setLayout(jPanelDealHotTodayViewLayout);
        jPanelDealHotTodayViewLayout.setHorizontalGroup(
            jPanelDealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDealHotTodayViewLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jLabelException1DealHotTodayView)
                .addGap(47, 47, 47)
                .addComponent(jButtonBackDealHotTodayView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelDealHotTodayViewLayout.setVerticalGroup(
            jPanelDealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDealHotTodayViewLayout.createSequentialGroup()
                .addGroup(jPanelDealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBackDealHotTodayView)
                    .addComponent(jLabelException1DealHotTodayView))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelException1DealHotTodayView.setBackground(new java.awt.Color(255, 255, 255));

        jButtonBackDealHotTodayView1.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackDealHotTodayView1.setBorder(null);

        jLabelException3DealHotTodayView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\DealHotTodayView.jpg")); // NOI18N

        javax.swing.GroupLayout jPanelException1DealHotTodayViewLayout = new javax.swing.GroupLayout(jPanelException1DealHotTodayView);
        jPanelException1DealHotTodayView.setLayout(jPanelException1DealHotTodayViewLayout);
        jPanelException1DealHotTodayViewLayout.setHorizontalGroup(
            jPanelException1DealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelException1DealHotTodayViewLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabelException3DealHotTodayView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButtonBackDealHotTodayView1))
        );
        jPanelException1DealHotTodayViewLayout.setVerticalGroup(
            jPanelException1DealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1DealHotTodayViewLayout.createSequentialGroup()
                .addComponent(jButtonBackDealHotTodayView1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabelException3DealHotTodayView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        jPanelException3DealHotTodayView.setBackground(new java.awt.Color(255, 255, 255));

        jButtonBackDealHotTodayView3.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackDealHotTodayView3.setBorder(null);

        jLabelException4DealHotTodayView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\DealHotTodayView.jpg")); // NOI18N

        javax.swing.GroupLayout jPanelException3DealHotTodayViewLayout = new javax.swing.GroupLayout(jPanelException3DealHotTodayView);
        jPanelException3DealHotTodayView.setLayout(jPanelException3DealHotTodayViewLayout);
        jPanelException3DealHotTodayViewLayout.setHorizontalGroup(
            jPanelException3DealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelException3DealHotTodayViewLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabelException4DealHotTodayView)
                .addGap(77, 77, 77)
                .addComponent(jButtonBackDealHotTodayView3))
        );
        jPanelException3DealHotTodayViewLayout.setVerticalGroup(
            jPanelException3DealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException3DealHotTodayViewLayout.createSequentialGroup()
                .addComponent(jButtonBackDealHotTodayView3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabelException4DealHotTodayView, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelException2DealHotTodayViewLayout = new javax.swing.GroupLayout(jPanelException2DealHotTodayView);
        jPanelException2DealHotTodayView.setLayout(jPanelException2DealHotTodayViewLayout);
        jPanelException2DealHotTodayViewLayout.setHorizontalGroup(
            jPanelException2DealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelException3DealHotTodayView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelException2DealHotTodayViewLayout.setVerticalGroup(
            jPanelException2DealHotTodayViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelException3DealHotTodayView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

    }
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void CoffeeView() {

        jPanelCoffeeView = new javax.swing.JPanel();
        jButtonBackCoffee = new javax.swing.JButton();
        jPanelListCoffeeView = new javax.swing.JPanel();
        jLabelException1CoffeeView = new javax.swing.JLabel();
        jLabelSumCoffeeView = new javax.swing.JLabel();
        jLabelMoneyCoffeeView = new javax.swing.JLabel();
        jLabelVNDCoffeeView = new javax.swing.JLabel();
        jButtonAddCoffeeView = new javax.swing.JButton();
        jScrollPaneException1CoffeeView = new javax.swing.JScrollPane();
        jTableMenuOfCoffee = new javax.swing.JTable();
        jLabelImageCoffeeView = new javax.swing.JLabel();
        jPanelException1CoffeeView = new javax.swing.JPanel();
        jLabelPositionCoffeeView = new javax.swing.JLabel();
        jTextFieldNameCoffeeView = new javax.swing.JTextField();
        jPanelHourOpenCoffeeView = new javax.swing.JPanel();
        jLabelHourOpenCoffee = new javax.swing.JLabel();
        jLabelUpToCoffeeView = new javax.swing.JLabel();
        jLabelTimeOpenCoffeeView = new javax.swing.JLabel();
        jPaneContainStarCoffeeView = new javax.swing.JPanel();
        jLabelStar1CoffeeView = new javax.swing.JLabel();
        jLabelStar2CoffeeView = new javax.swing.JLabel();
        jLabelStar3CoffeeView = new javax.swing.JLabel();
        jLabelStar4CoffeeView = new javax.swing.JLabel();
        jLabelStar5CoffeeView = new javax.swing.JLabel();
        jButtonFavoriteCoffeeView = new javax.swing.JButton();
        jLabelGreenDotCoffee = new javax.swing.JLabel();
        jPanelPaymentMethodsCoffeeView = new javax.swing.JPanel();
        jLabelPaymentMethodsCoffeeView = new javax.swing.JLabel();
        jButtonPayInCashCoffeeView = new javax.swing.JButton();
        jButtonPayWithQRCodeCoffeeView = new javax.swing.JButton();


        jPanelCoffeeView.setBackground(new java.awt.Color(255, 153, 51));

        jButtonBackCoffee.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackCoffee.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-back-64.png")); // NOI18N
        jButtonBackCoffee.setBorder(null);
        jButtonBackCoffee.addActionListener(new CoffeeListener());

        jPanelListCoffeeView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelSumCoffeeView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumCoffeeView.setText("Tổng:");

        jLabelMoneyCoffeeView.setText("0");
        jLabelMoneyCoffeeView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDCoffeeView.setText("VNĐ");

        jButtonAddCoffeeView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddCoffeeView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddCoffeeView.setText("Thêm");
        jButtonAddCoffeeView.addActionListener(new CoffeeListener());

        jTableMenuOfCoffee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Oreo đá xay", "35,000",  new Integer(0)},
                {"2", "Oreo cafe đá xay", "40,000",  new Integer(0)},
                {"3", "Caocao đá xay", "35,000",  new Integer(0)},
                {"4", "Matcha nóng / lạnh", "37,000",  new Integer(0)},
                {"5", "Cà phê đá xay", "35,000",  new Integer(0)},
                {"6", "Chanh tuyết", "35,000",  new Integer(0)},
                {"7", "Caocao lạnh / nóng", "32,000",  new Integer(0)},
                {"8", "Oreo cacao đá xay", "40,000",  new Integer(0)},
                {"9", "Matcha đá xay", "40,000",  new Integer(0)},
                {"10", "Cà phê sữa đá / nóng", "25,000",  new Integer(0)},
                {"11", "Cà phê đen đá / nóng", "20,000",  new Integer(0)},
                {"12", "Bạc xỉu đá / nóng", "25,000",  new Integer(0)},
                {"13", "Sữa tươi cà phê", "25,000",  new Integer(0)},
                {"14", "Cà phê yaourt", "25,000",  new Integer(0)},
                {"15", "Cafe đá", "22,000",  new Integer(0)},
                {"16", "Cafe cốt dừa", "29,000",  new Integer(0)},
                {"17", "Cà phê đen", "18,000",  new Integer(0)},
                {"18", "Cappuccino", "28,000",  new Integer(0)},
                {"19", "Espresso", "20,000",  new Integer(0)},
                {"20", "Cafe latte", "28,000",  new Integer(0)},
                {"21", "Mocha", "29,000",  new Integer(0)},
                {"22", "Spring", "28,000",  new Integer(0)},
                {"23", "Mojito passion", "36,000",  new Integer(0)},
                {"24", "Mojito lemon", "36,000",  new Integer(0)},
                {"25", "Mojito blueberry", "37,000",  new Integer(0)},
                {"26", "Blue cocalight", "30,000",  new Integer(0)},
                {"27", "Blue sky", "28,000",  new Integer(0)},
                {"28", "Chocolate chip", "34,000",  new Integer(0)},
                {"29", "Cookies", "34,000",  new Integer(0)},
                {"30", "Hazelnut", "32,000",  new Integer(0)},
                {"31", "Vanilla", "32,000",  new Integer(0)},
                {"32", "Yogurt", "25,000",  new Integer(0)},
                {"33", "Blueberry yogurt", "30,000",  new Integer(0)},
                {"34", "Strawberry yogurt", "30,000",  new Integer(0)},
                {"35", "Lipton tea", "23,000",  new Integer(0)},
                {"36", "Milk tea", "28,000",  new Integer(0)},
                {"37", "Black tea macchiato", "32,000",  new Integer(0)},
                {"38", "Matcha macchiato", "32,000",  new Integer(0)},
                {"39", "Apple mint tea", "32,000",  new Integer(0)},
                {"40", "Lychee tea", "32,000",  new Integer(0)},
                {"41", "Peach tea", "32,000",  new Integer(0)},
                {"42", "Mix berry", "37,000",  new Integer(0)},
                {"43", " Blueberry", "35,000",  new Integer(0)},
                {"44", "Strawberry", "35,000",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMenuOfCoffee.setSelectionForeground(new java.awt.Color(153, 0, 153));
        jTableMenuOfCoffee.setShowGrid(true);
        jTableMenuOfCoffee.setShowHorizontalLines(true);
        jTableMenuOfCoffee.setShowVerticalLines(true);
        jScrollPaneException1CoffeeView.setViewportView(jTableMenuOfCoffee);
        if (jTableMenuOfCoffee.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfCoffee.getColumnModel().getColumn(0).setResizable(false);
            jTableMenuOfCoffee.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfCoffee.getColumnModel().getColumn(1).setResizable(false);
            jTableMenuOfCoffee.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTableMenuOfCoffee.getColumnModel().getColumn(2).setResizable(false);
            jTableMenuOfCoffee.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanelListCoffeeViewLayout = new javax.swing.GroupLayout(jPanelListCoffeeView);
        jPanelListCoffeeView.setLayout(jPanelListCoffeeViewLayout);
        jPanelListCoffeeViewLayout.setHorizontalGroup(
            jPanelListCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListCoffeeViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelListCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListCoffeeViewLayout.createSequentialGroup()
                        .addComponent(jButtonAddCoffeeView)
                        .addGap(87, 87, 87)
                        .addComponent(jLabelSumCoffeeView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMoneyCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelVNDCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListCoffeeViewLayout.createSequentialGroup()
                        .addComponent(jLabelException1CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
            .addGroup(jPanelListCoffeeViewLayout.createSequentialGroup()
                .addComponent(jScrollPaneException1CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelListCoffeeViewLayout.setVerticalGroup(
            jPanelListCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListCoffeeViewLayout.createSequentialGroup()
                .addComponent(jLabelException1CoffeeView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneException1CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelListCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMoneyCoffeeView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelListCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSumCoffeeView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelVNDCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jLabelImageCoffeeView.setBackground(new java.awt.Color(255, 153, 51));
        jLabelImageCoffeeView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\coffeeView1.png")); // NOI18N
        jLabelImageCoffeeView.setText("jLabel1");

        jPanelException1CoffeeView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelPositionCoffeeView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionCoffeeView.setText("Địa điểm: ao sen ngõ số 2");

        jTextFieldNameCoffeeView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNameCoffeeView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldNameCoffeeView.setText("Ghiền Coffee - Trà & Coffe - Thành Thái");
        jTextFieldNameCoffeeView.setBorder(null);
        jTextFieldNameCoffeeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jTextFieldNameCoffeeViewActionPerformed(evt);
            }
        });

        jPanelHourOpenCoffeeView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenCoffee.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToCoffeeView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToCoffeeView.setText("20,000 - 50,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenCoffeeViewLayout = new javax.swing.GroupLayout(jPanelHourOpenCoffeeView);
        jPanelHourOpenCoffeeView.setLayout(jPanelHourOpenCoffeeViewLayout);
        jPanelHourOpenCoffeeViewLayout.setHorizontalGroup(
            jPanelHourOpenCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenCoffeeViewLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenCoffee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelHourOpenCoffeeViewLayout.setVerticalGroup(
            jPanelHourOpenCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenCoffee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToCoffeeView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelTimeOpenCoffeeView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenCoffeeView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenCoffeeView.setText("Mở cửa 2p.m - 11p.m ");

        jPaneContainStarCoffeeView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1CoffeeView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1CoffeeView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2CoffeeView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2CoffeeView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3CoffeeView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3CoffeeView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4CoffeeView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4CoffeeView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar5CoffeeView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar5CoffeeView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarCoffeeViewLayout = new javax.swing.GroupLayout(jPaneContainStarCoffeeView);
        jPaneContainStarCoffeeView.setLayout(jPaneContainStarCoffeeViewLayout);
        jPaneContainStarCoffeeViewLayout.setHorizontalGroup(
            jPaneContainStarCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarCoffeeViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar5CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPaneContainStarCoffeeViewLayout.setVerticalGroup(
            jPaneContainStarCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarCoffeeViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneContainStarCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelStar1CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar2CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar3CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar4CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelStar5CoffeeView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonFavoriteCoffeeView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteCoffeeView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteCoffeeView.setBorder(null);
        jButtonFavoriteCoffeeView.addActionListener(new CoffeeListener());

        jLabelGreenDotCoffee.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotCoffee.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        javax.swing.GroupLayout jPanelException1CoffeeViewLayout = new javax.swing.GroupLayout(jPanelException1CoffeeView);
        jPanelException1CoffeeView.setLayout(jPanelException1CoffeeViewLayout);
        jPanelException1CoffeeViewLayout.setHorizontalGroup(
            jPanelException1CoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1CoffeeViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelException1CoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPositionCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFavoriteCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHourOpenCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelException1CoffeeViewLayout.createSequentialGroup()
                        .addComponent(jLabelGreenDotCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTimeOpenCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPaneContainStarCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanelException1CoffeeViewLayout.setVerticalGroup(
            jPanelException1CoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1CoffeeViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFavoriteCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNameCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabelPositionCoffeeView)
                .addGap(4, 4, 4)
                .addComponent(jPaneContainStarCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelException1CoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTimeOpenCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGreenDotCoffee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHourOpenCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelPaymentMethodsCoffeeView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsCoffeeView.setText("      Phương thức thanh toán");

        jButtonPayInCashCoffeeView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashCoffeeView.setText("Sử dụng tiền mặt");
        jButtonPayInCashCoffeeView.addActionListener(new CoffeeListener());

        jButtonPayWithQRCodeCoffeeView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodeCoffeeView.setText("Quét mã QR");
        jButtonPayWithQRCodeCoffeeView.addActionListener(new CoffeeListener());

        javax.swing.GroupLayout jPanelPaymentMethodsCoffeeViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsCoffeeView);
        jPanelPaymentMethodsCoffeeView.setLayout(jPanelPaymentMethodsCoffeeViewLayout);
        jPanelPaymentMethodsCoffeeViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsCoffeeViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsCoffeeViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPayInCashCoffeeView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayWithQRCodeCoffeeView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanelPaymentMethodsCoffeeViewLayout.setVerticalGroup(
            jPanelPaymentMethodsCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsCoffeeViewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelPaymentMethodsCoffeeView, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayInCashCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodeCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanelCoffeeViewLayout = new javax.swing.GroupLayout(jPanelCoffeeView);
        jPanelCoffeeView.setLayout(jPanelCoffeeViewLayout);
        jPanelCoffeeViewLayout.setHorizontalGroup(
            jPanelCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCoffeeViewLayout.createSequentialGroup()
                .addComponent(jPanelListCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanelPaymentMethodsCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCoffeeViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonBackCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCoffeeViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelImageCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(jPanelException1CoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );
        jPanelCoffeeViewLayout.setVerticalGroup(
            jPanelCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCoffeeViewLayout.createSequentialGroup()
                .addGroup(jPanelCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCoffeeViewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelListCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCoffeeViewLayout.createSequentialGroup()
                        .addComponent(jButtonBackCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jPanelPaymentMethodsCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 172, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCoffeeViewLayout.createSequentialGroup()
                    .addGroup(jPanelCoffeeViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelException1CoffeeView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCoffeeViewLayout.createSequentialGroup()
                            .addComponent(jLabelImageCoffeeView, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(408, 408, 408)))
        );
    }
    private void BubbleTeaView() {

        jPanelBubbleTeaView = new javax.swing.JPanel();
        jButtonBackBubbleTeaException1 = new javax.swing.JButton();
        jPanelListBubbleTeaView = new javax.swing.JPanel();
        jLabelExcepiton1BubbleTeaView = new javax.swing.JLabel();
        jLabelSumBubbleTeaView = new javax.swing.JLabel();
        jLabelMoneyBubbleTeaView = new javax.swing.JLabel();
        jLabelVNDBubbleTeaView = new javax.swing.JLabel();
        jButtonAddBubbleTeaView = new javax.swing.JButton();
        jScrollPaneExcepiton1BubbleTeaView = new javax.swing.JScrollPane();
        jTableMenuOfBubbleTea = new javax.swing.JTable();
        jLabelImageBubbleTeaView = new javax.swing.JLabel();
        jButtonBackBubbleTea = new javax.swing.JButton();
        jPanelPaymentMethodsBubbleTea = new javax.swing.JPanel();
        jButtonPayWithQRCodeBubbleTeaView = new javax.swing.JButton();
        jButtonPayInCashBubbleTeaView = new javax.swing.JButton();
        jLabelPaymentMethodsBubbleTeaView = new javax.swing.JLabel();
        jPanelContainerBubbleTeaView = new javax.swing.JPanel();
        jButtonFavoriteBubbleTeaView = new javax.swing.JButton();
        jLabelPositionBubbleTeaView = new javax.swing.JLabel();
        jTextFieldNameBubbleTeaView = new javax.swing.JTextField();
        jPaneContainStarBubbleTeaView = new javax.swing.JPanel();
        jLabelStar1BubbleTeaView = new javax.swing.JLabel();
        jLabelStar2BubbleTeaView = new javax.swing.JLabel();
        jLabelStar3BubbleTeaView = new javax.swing.JLabel();
        jLabelStar4BubbleTeaView = new javax.swing.JLabel();
        jLabelStar5BubbleTeaView = new javax.swing.JLabel();
        jPanelExcepiton1BubbleTeaView = new javax.swing.JPanel();
        jLabelGreenDotBubbleTeaView = new javax.swing.JLabel();
        jLabelTimeOpenBubbleTeaView = new javax.swing.JLabel();
        jPanelHourOpenBubbleTeaView = new javax.swing.JPanel();
        jLabelHourOpenBubbleTea = new javax.swing.JLabel();
        jLabelUpToBubbleTeaView = new javax.swing.JLabel();

        jPanelBubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));
        jPanelBubbleTeaView.setPreferredSize(new java.awt.Dimension(896, 678));

        jButtonBackBubbleTeaException1.setBorder(null);
        

        jPanelListBubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelSumBubbleTeaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumBubbleTeaView.setText("Tổng:");

        jLabelMoneyBubbleTeaView.setText("0");
        jLabelMoneyBubbleTeaView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDBubbleTeaView.setText("VNĐ");

        jButtonAddBubbleTeaView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddBubbleTeaView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddBubbleTeaView.setText("Thêm");
        jButtonAddBubbleTeaView.addActionListener(new BubbleTeaListener());

        jTableMenuOfBubbleTea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Super Sundae Trân Châu Đường Đen", "25,000",  new Integer(0)},
                {"2", "SUPER SUNDAE XOÀI", "25,000",  new Integer(0)},
                {"3", "SUPER SUNDAE SOCOLA", "25,000",  new Integer(0)},
                {"4", "SỮA KEM LẮC ĐÀO", "25,000",  new Integer(0)},
                {"5", "SUPER SUNDAE DÂU TÂY", "25,000",  new Integer(0)},
                {"6", "Hồng Trà Kem", "25,000",  new Integer(0)},
                {"7", "Sữa Kem Lắc Dâu Tây", "25,000",  new Integer(0)},
                {"8", "Super Sundae Lô Hội", "25,000",  new Integer(0)},
                {"9", "TRÀ KEM BỐN MÙA", "25,000",  new Integer(0)},
                {"10", "Dương Chi Cam Lộ", "35,000",  new Integer(0)},
                {"11", "Trà Đào Big Size", "25,000",  new Integer(0)},
                {"12", "TRÀ ĐÀO BỐN MÙA", "25,000",  new Integer(0)},
                {"13", "Nước Chanh Tươi Lạnh", "20,000",  new Integer(0)},
                {"14", "Trà Chanh Lô Hội", "20,000",  new Integer(0)},
                {"15", "Hồng Trà Mật Ong", "20,000",  new Integer(0)},
                {"16", "Hồng Trà Chanh", "22,000",  new Integer(0)},
                {"17", "Trà Đào Tứ Kỳ Xuân", "25,000",  new Integer(0)},
                {"18", "TRÀ Ô LONG BỐN MÙA", "20,000",  new Integer(0)},
                {"19", "Trà Sữa Nướng", "25,000",  new Integer(0)},
                {"20", "Trà Sữa Trân Châu Đường Đen", "25,000",  new Integer(0)},
                {"21", "Trà Sữa Trân Châu", "25,000",  new Integer(0)},
                {"22", "Trà sữa bá vương", "30,000",  new Integer(0)},
                {"23", "Trà Sữa 3Q", "25,000",  new Integer(0)},
                {"24", "Trà Sữa Thạch Dừa", "25,000",  new Integer(0)},
                {"25", "Trà Sữa 2J", "25,000",  new Integer(0)},
                {"26", "Trà Sữa Sầu Riêng", "25,000",  new Integer(0)},
                {"27", "Trà Sữa Bơ", "28,000",  new Integer(0)},
                {"28", "Trà sữa kem trứng đặc biệt", "24,000",  new Integer(0)},
                {"29", "Trà sữa phô mai tươi", "24,000",  new Integer(0)},
                {"30", "Trà sữa Hong Kong", "22,000",  new Integer(0)},
                {"31", "Trà sữa socola", "22,000",  new Integer(0)},
                {"32", "Trà sữa Lài Shan Tuyết", "22,000",  new Integer(0)},
                {"33", "Trà Sữa Kiều Mạch", "22,000",  new Integer(0)},
                {"34", "Trà sữa Cheese Ball", "24,000",  new Integer(0)},
                {"35", "Trà sữa kem trứng đặc biệt trân châu đường đen", "27,000",  new Integer(0)},
                {"36", "Trà Sữa Trân Châu Trắng", "24,000",  new Integer(0)},
                {"37", "Trà sữa khoai môn tươi", "24,000",  new Integer(0)},
                {"38", "Hồng Trà Nhật Nguyệt", "16,000",  new Integer(0)},
                {"39", "Trà Shan Tuyết Lài", "16,000",  new Integer(0)},
                {"40", "Trà Ổi Hồng", "27,000",  new Integer(0)},
                {"41", "Trà Vải Tươi", "27,000",  new Integer(0)},
                {"42", "Trà Đào Hồng", "27,000",  new Integer(0)},
                {"43", "Trà Oolong Tuyết Sơn", "16,000",  new Integer(0)},
                {"44", "Sữa tươi sương sáo thảo mộc đường đen", "27,000",  new Integer(0)},
                {"45", "Sữa tươi hoa hồng trân châu đường đen", "32,000",  new Integer(0)},
                {"46", "Sữa tươi trứng hoàng kim", "32,000",  new Integer(0)},
                {"47", "Sữa tươi cacao sữa trân châu đường đen", "32,000",  new Integer(0)},
                {"48", "Sữa tươi kem trứng đường đen", "27,000",  new Integer(0)},
                {"49", "Sữa tươi kem trứng trân châu đường đen", "32,000",  new Integer(0)},
                {"50", "Sữa tươi matcha sữa trân châu đường đen", "32,000",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneExcepiton1BubbleTeaView.setViewportView(jTableMenuOfBubbleTea);
        if (jTableMenuOfBubbleTea.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfBubbleTea.getColumnModel().getColumn(0).setResizable(false);
            jTableMenuOfBubbleTea.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfBubbleTea.getColumnModel().getColumn(1).setResizable(false);
            jTableMenuOfBubbleTea.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTableMenuOfBubbleTea.getColumnModel().getColumn(2).setResizable(false);
            jTableMenuOfBubbleTea.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanelListBubbleTeaViewLayout = new javax.swing.GroupLayout(jPanelListBubbleTeaView);
        jPanelListBubbleTeaView.setLayout(jPanelListBubbleTeaViewLayout);
        jPanelListBubbleTeaViewLayout.setHorizontalGroup(
            jPanelListBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListBubbleTeaViewLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanelListBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListBubbleTeaViewLayout.createSequentialGroup()
                        .addComponent(jLabelExcepiton1BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListBubbleTeaViewLayout.createSequentialGroup()
                        .addComponent(jButtonAddBubbleTeaView)
                        .addGap(77, 77, 77)
                        .addComponent(jLabelSumBubbleTeaView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMoneyBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelVNDBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(jPanelListBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelListBubbleTeaViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneExcepiton1BubbleTeaView, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)))
        );
        jPanelListBubbleTeaViewLayout.setVerticalGroup(
            jPanelListBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListBubbleTeaViewLayout.createSequentialGroup()
                .addComponent(jLabelExcepiton1BubbleTeaView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addGroup(jPanelListBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSumBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMoneyBubbleTeaView, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelVNDBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
            .addGroup(jPanelListBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelListBubbleTeaViewLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPaneExcepiton1BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        jLabelImageBubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\BubbleTeaView.png")); // NOI18N
        jLabelImageBubbleTeaView.setText("jLabel1");

        jButtonBackBubbleTea.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackBubbleTea.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-back-64.png")); // NOI18N
        jButtonBackBubbleTea.setBorder(null);
        jButtonBackBubbleTea.addActionListener(new BubbleTeaListener());

        jButtonPayWithQRCodeBubbleTeaView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodeBubbleTeaView.setText("Quét mã QR");
        jButtonPayWithQRCodeBubbleTeaView.addActionListener(new BubbleTeaListener());

        jButtonPayInCashBubbleTeaView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashBubbleTeaView.setText("Sử dụng tiền mặt");
        jButtonPayInCashBubbleTeaView.addActionListener(new BubbleTeaListener());

        jLabelPaymentMethodsBubbleTeaView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsBubbleTeaView.setText("      Phương thức thanh toán");

        javax.swing.GroupLayout jPanelPaymentMethodsBubbleTeaLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsBubbleTea);
        jPanelPaymentMethodsBubbleTea.setLayout(jPanelPaymentMethodsBubbleTeaLayout);
        jPanelPaymentMethodsBubbleTeaLayout.setHorizontalGroup(
            jPanelPaymentMethodsBubbleTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsBubbleTeaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsBubbleTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPayInCashBubbleTeaView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayWithQRCodeBubbleTeaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(jPanelPaymentMethodsBubbleTeaLayout.createSequentialGroup()
                .addComponent(jLabelPaymentMethodsBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanelPaymentMethodsBubbleTeaLayout.setVerticalGroup(
            jPanelPaymentMethodsBubbleTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsBubbleTeaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelPaymentMethodsBubbleTeaView, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayInCashBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodeBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanelContainerBubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));

        jButtonFavoriteBubbleTeaView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteBubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteBubbleTeaView.setBorder(null);
        jButtonFavoriteBubbleTeaView.addActionListener(new BubbleTeaListener());

        jLabelPositionBubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));
        jLabelPositionBubbleTeaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionBubbleTeaView.setText("Địa điểm: ao sen ngõ số 2");

        jTextFieldNameBubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNameBubbleTeaView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldNameBubbleTeaView.setText("Tocotoco Bubble Tea - Vườn Lài");
        jTextFieldNameBubbleTeaView.setBorder(null);

        jPaneContainStarBubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1BubbleTeaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1BubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2BubbleTeaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2BubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3BubbleTeaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3BubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4BubbleTeaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4BubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar5BubbleTeaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar5BubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarBubbleTeaViewLayout = new javax.swing.GroupLayout(jPaneContainStarBubbleTeaView);
        jPaneContainStarBubbleTeaView.setLayout(jPaneContainStarBubbleTeaViewLayout);
        jPaneContainStarBubbleTeaViewLayout.setHorizontalGroup(
            jPaneContainStarBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarBubbleTeaViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar5BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneContainStarBubbleTeaViewLayout.setVerticalGroup(
            jPaneContainStarBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarBubbleTeaViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneContainStarBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelStar1BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar2BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar3BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStar4BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelStar5BubbleTeaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelExcepiton1BubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelGreenDotBubbleTeaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotBubbleTeaView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        jLabelTimeOpenBubbleTeaView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenBubbleTeaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenBubbleTeaView.setText("Mở cửa 9a.m - 8p.m ");

        javax.swing.GroupLayout jPanelExcepiton1BubbleTeaViewLayout = new javax.swing.GroupLayout(jPanelExcepiton1BubbleTeaView);
        jPanelExcepiton1BubbleTeaView.setLayout(jPanelExcepiton1BubbleTeaViewLayout);
        jPanelExcepiton1BubbleTeaViewLayout.setHorizontalGroup(
            jPanelExcepiton1BubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExcepiton1BubbleTeaViewLayout.createSequentialGroup()
                .addComponent(jLabelGreenDotBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTimeOpenBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanelExcepiton1BubbleTeaViewLayout.setVerticalGroup(
            jPanelExcepiton1BubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGreenDotBubbleTeaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTimeOpenBubbleTeaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHourOpenBubbleTeaView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenBubbleTea.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToBubbleTeaView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToBubbleTeaView.setText("15,000 - 35,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenBubbleTeaViewLayout = new javax.swing.GroupLayout(jPanelHourOpenBubbleTeaView);
        jPanelHourOpenBubbleTeaView.setLayout(jPanelHourOpenBubbleTeaViewLayout);
        jPanelHourOpenBubbleTeaViewLayout.setHorizontalGroup(
            jPanelHourOpenBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenBubbleTeaViewLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenBubbleTea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelHourOpenBubbleTeaViewLayout.setVerticalGroup(
            jPanelHourOpenBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenBubbleTea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToBubbleTeaView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelContainerBubbleTeaViewLayout = new javax.swing.GroupLayout(jPanelContainerBubbleTeaView);
        jPanelContainerBubbleTeaView.setLayout(jPanelContainerBubbleTeaViewLayout);
        jPanelContainerBubbleTeaViewLayout.setHorizontalGroup(
            jPanelContainerBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerBubbleTeaViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContainerBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaneContainStarBubbleTeaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelContainerBubbleTeaViewLayout.createSequentialGroup()
                        .addGroup(jPanelContainerBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPositionBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFavoriteBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelHourOpenBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelExcepiton1BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNameBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContainerBubbleTeaViewLayout.setVerticalGroup(
            jPanelContainerBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerBubbleTeaViewLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButtonFavoriteBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jTextFieldNameBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPositionBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPaneContainStarBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelExcepiton1BubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHourOpenBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBubbleTeaViewLayout = new javax.swing.GroupLayout(jPanelBubbleTeaView);
        jPanelBubbleTeaView.setLayout(jPanelBubbleTeaViewLayout);
        jPanelBubbleTeaViewLayout.setHorizontalGroup(
            jPanelBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBubbleTeaViewLayout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addGroup(jPanelBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBubbleTeaViewLayout.createSequentialGroup()
                        .addComponent(jPanelContainerBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jButtonBackBubbleTeaException1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBackBubbleTea, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBubbleTeaViewLayout.createSequentialGroup()
                        .addComponent(jPanelPaymentMethodsBubbleTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(jPanelBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBubbleTeaViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImageBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelListBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(243, Short.MAX_VALUE)))
        );
        jPanelBubbleTeaViewLayout.setVerticalGroup(
            jPanelBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBubbleTeaViewLayout.createSequentialGroup()
                .addGroup(jPanelBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBubbleTeaViewLayout.createSequentialGroup()
                        .addComponent(jButtonBackBubbleTea, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBackBubbleTeaException1))
                    .addComponent(jPanelContainerBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPaymentMethodsBubbleTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanelBubbleTeaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBubbleTeaViewLayout.createSequentialGroup()
                    .addComponent(jLabelImageBubbleTeaView, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanelListBubbleTeaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }
    
    private void BreadView() {

        jPanelBreadView = new javax.swing.JPanel();
        jPanelListBreadView = new javax.swing.JPanel();
        jLabelException1BreadView = new javax.swing.JLabel();
        jLabelSumBreadView = new javax.swing.JLabel();
        jLabelMoneyBreadView = new javax.swing.JLabel();
        jLabelVNDBreadView = new javax.swing.JLabel();
        jButtonAddBreadView = new javax.swing.JButton();
        jScrollPaneException1BreadView = new javax.swing.JScrollPane();
        jTableMenuOfBread = new javax.swing.JTable();
        jButtonBackBreadViewException1 = new javax.swing.JButton();
        jLabelImageBreadView = new javax.swing.JLabel();
        jButtonBackBreadView = new javax.swing.JButton();
        jPanelPaymentMethodsBreadView = new javax.swing.JPanel();
        jButtonPayWithQRCodeBreadView = new javax.swing.JButton();
        jButtonPayInCashBreadView = new javax.swing.JButton();
        jLabelPaymentMethodsBreadView = new javax.swing.JLabel();
        jPanelContainerBreadView = new javax.swing.JPanel();
        jTextFieldNameBreadView = new javax.swing.JTextField();
        jLabelPositionBreadView = new javax.swing.JLabel();
        jPaneContainStarBreadView = new javax.swing.JPanel();
        jLabelStar1BreadView = new javax.swing.JLabel();
        jLabelStar2BreadView = new javax.swing.JLabel();
        jLabelStar3BreadView = new javax.swing.JLabel();
        jLabelStar4BreadView = new javax.swing.JLabel();
        jPanelException1BreadView = new javax.swing.JPanel();
        jLabelGreenDotBread = new javax.swing.JLabel();
        jLabelTimeOpenBreadView = new javax.swing.JLabel();
        jPanelHourOpenBread = new javax.swing.JPanel();
        jLabelHourOpenBread = new javax.swing.JLabel();
        jLabelUpToBreadView = new javax.swing.JLabel();
        jButtonFavoriteBreadView = new javax.swing.JButton();


        jPanelBreadView.setBackground(new java.awt.Color(255, 153, 51));

        jPanelListBreadView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelSumBreadView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumBreadView.setText("Tổng:");

        jLabelMoneyBreadView.setText("                                                   0 ");
        jLabelMoneyBreadView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDBreadView.setText("VNĐ");

        jButtonAddBreadView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddBreadView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddBreadView.setText("Thêm");
        jButtonAddBreadView.addActionListener(new BreadListener());

        jTableMenuOfBread.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Combo giảm giá 9K: Bánh mì đặc biệt + CoCa", "68,000",  new Integer(0)},
                {"2", "Combo giảm giá 20K: Bánh Mì Đặc Biệt + Bánh Bao +Cơm Cháy", "125,000",  new Integer(0)},
                {"3", "Combo ưu đãi 20%: 286k còn 228k", "228,000",  new Integer(0)},
                {"4", "Combo ưu đãi 20%: 400k còn 320k", "320,000",  new Integer(0)},
                {"5", "Bánh Mì Huynh Hoa đặc biệt", "65,000",  new Integer(0)},
                {"6", "Bánh Mì Đặc Biệt", "65,000",  new Integer(0)},
                {"7", "Bánh Mì không", "7,000",  new Integer(0)},
                {"8", "COMBO GIẢM GIÁ 20K: BÁNH MÌ ĐẶC BIỆT + BÁNH BAO + CƠM CHÁY", "125,000",  new Integer(0)},
                {"9", "Bánh mì cóc", "24,000",  new Integer(0)},
                {"10", "Bánh Mì Que Truyền Thống", "15,000",  new Integer(0)},
                {"11", "Bánh Mì Que Pate Bơ", "17,000",  new Integer(0)},
                {"12", "Bánh Mì Chấm Cà Phê Sữa", "30,000",  new Integer(0)},
                {"13", "Bánh Mì Que Cá Ngừ Sốt Cay", "19,000",  new Integer(0)},
                {"14", "Bánh Mì Bò Tiêu Đen", "39,000",  new Integer(0)},
                {"15", "Bánh Mì Thập Cẩm", "39,000",  new Integer(0)},
                {"16", "Bánh Mì Gà Nướng Mật Ong", "39,000",  new Integer(0)},
                {"17", "Bánh Mì Truyền thống", "29,000",  new Integer(0)},
                {"18", "Bánh Mì Heo Quay", "39,000",  new Integer(0)},
                {"19", "Bánh Mì Trứng", "29,000",  new Integer(0)},
                {"20", "Bánh Mì Gà Sốt Nhật", "39,000",  new Integer(0)},
                {"21", "Bánh Mì Xá Xíu", "39,000",  new Integer(0)},
                {"22", "Bánh Mì Chả Cá", "39,000",  new Integer(0)},
                {"23", "Bánh Mì Bò Sốt Nấm", "45,000",  new Integer(0)},
                {"24", "Bánh Mì Nem Nướng", "39,000",  new Integer(0)},
                {"25", "Bánh Mì Bà Nội", "39,000",  new Integer(0)},
                {"26", "Bánh Mì Bò Thưng", "37,000",  new Integer(0)},
                {"27", "Bánh Mì Thịt Nướng", "27,000",  new Integer(0)},
                {"28", "Bánh Mì Thịt Nướng Ốp La", "33,000",  new Integer(0)},
                {"29", "Bánh Mì Thịt Nướng Phô Mai", "33,000",  new Integer(0)},
                {"30", "Bánh Mì Ốp La 1 Trứng", "18,000",  new Integer(0)},
                {"31", "Trứng ốp la", "7,000",  new Integer(0)},
                {"32", "Bịch Phô Mai (12 Miếng)", "74,000",  new Integer(0)},
                {"33", "Phô Mai Pháp Cao Cấp", "10,000",  new Integer(0)},
                {"34", "Thịt Nướng Thêm", "18,000",  new Integer(0)},
                {"35", "Bánh mì chả + trứng luộc", "20,000",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneException1BreadView.setViewportView(jTableMenuOfBread);
        if (jTableMenuOfBread.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfBread.getColumnModel().getColumn(0).setResizable(false);
            jTableMenuOfBread.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfBread.getColumnModel().getColumn(0).setHeaderValue("Số thứ tự");
            jTableMenuOfBread.getColumnModel().getColumn(1).setResizable(false);
            jTableMenuOfBread.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTableMenuOfBread.getColumnModel().getColumn(1).setHeaderValue("Tên");
            jTableMenuOfBread.getColumnModel().getColumn(2).setResizable(false);
            jTableMenuOfBread.getColumnModel().getColumn(2).setHeaderValue("Giá (VNĐ)");
            jTableMenuOfBread.getColumnModel().getColumn(3).setResizable(false);
            jTableMenuOfBread.getColumnModel().getColumn(3).setHeaderValue("Số lượng");
        }

        javax.swing.GroupLayout jPanelListBreadViewLayout = new javax.swing.GroupLayout(jPanelListBreadView);
        jPanelListBreadView.setLayout(jPanelListBreadViewLayout);
        jPanelListBreadViewLayout.setHorizontalGroup(
            jPanelListBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListBreadViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelException1BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanelListBreadViewLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButtonAddBreadView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabelSumBreadView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMoneyBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVNDBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanelListBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelListBreadViewLayout.createSequentialGroup()
                    .addComponent(jScrollPaneException1BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelListBreadViewLayout.setVerticalGroup(
            jPanelListBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListBreadViewLayout.createSequentialGroup()
                .addComponent(jLabelException1BreadView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addGroup(jPanelListBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMoneyBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSumBreadView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVNDBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelListBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelListBreadViewLayout.createSequentialGroup()
                    .addComponent(jScrollPaneException1BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 61, Short.MAX_VALUE)))
        );

        jButtonBackBreadViewException1.setBorder(null);

        jLabelImageBreadView.setBackground(new java.awt.Color(255, 153, 51));
        jLabelImageBreadView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\BreadView.png")); // NOI18N
        jLabelImageBreadView.setText("jLabel1");

        jButtonBackBreadView.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackBreadView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackBreadView.setBorder(null);
        jButtonBackBreadView.addActionListener(new BreadListener());

        jButtonPayWithQRCodeBreadView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodeBreadView.setText("Quét mã QR");
        jButtonPayWithQRCodeBreadView.addActionListener(new BreadListener());

        jButtonPayInCashBreadView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashBreadView.setText("Sử dụng tiền mặt");
        jButtonPayInCashBreadView.addActionListener(new BreadListener());

        jLabelPaymentMethodsBreadView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsBreadView.setText("      Phương thức thanh toán");

        javax.swing.GroupLayout jPanelPaymentMethodsBreadViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsBreadView);
        jPanelPaymentMethodsBreadView.setLayout(jPanelPaymentMethodsBreadViewLayout);
        jPanelPaymentMethodsBreadViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsBreadViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsBreadViewLayout.createSequentialGroup()
                        .addGroup(jPanelPaymentMethodsBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPayInCashBreadView, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonPayWithQRCodeBreadView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsBreadViewLayout.createSequentialGroup()
                        .addComponent(jLabelPaymentMethodsBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelPaymentMethodsBreadViewLayout.setVerticalGroup(
            jPanelPaymentMethodsBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsBreadViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsBreadView, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jButtonPayInCashBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodeBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanelContainerBreadView.setBackground(new java.awt.Color(255, 153, 51));

        jTextFieldNameBreadView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNameBreadView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextFieldNameBreadView.setText("Conservo – Japanese Bread and Café");
        jTextFieldNameBreadView.setBorder(null);

        jLabelPositionBreadView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionBreadView.setText("Địa điểm: ao sen ngõ số 2");

        jPaneContainStarBreadView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1BreadView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1BreadView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2BreadView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2BreadView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3BreadView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3BreadView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4BreadView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4BreadView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarBreadViewLayout = new javax.swing.GroupLayout(jPaneContainStarBreadView);
        jPaneContainStarBreadView.setLayout(jPaneContainStarBreadViewLayout);
        jPaneContainStarBreadViewLayout.setHorizontalGroup(
            jPaneContainStarBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarBreadViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPaneContainStarBreadViewLayout.setVerticalGroup(
            jPaneContainStarBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarBreadViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStar1BreadView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar2BreadView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar3BreadView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar4BreadView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelException1BreadView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelGreenDotBread.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotBread.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        jLabelTimeOpenBreadView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenBreadView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenBreadView.setText("Mở cửa 8a.m - 6p.m ");

        javax.swing.GroupLayout jPanelException1BreadViewLayout = new javax.swing.GroupLayout(jPanelException1BreadView);
        jPanelException1BreadView.setLayout(jPanelException1BreadViewLayout);
        jPanelException1BreadViewLayout.setHorizontalGroup(
            jPanelException1BreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1BreadViewLayout.createSequentialGroup()
                .addComponent(jLabelGreenDotBread, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTimeOpenBreadView)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanelException1BreadViewLayout.setVerticalGroup(
            jPanelException1BreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGreenDotBread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTimeOpenBreadView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHourOpenBread.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenBread.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToBreadView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToBreadView.setText("15,000 - 250,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenBreadLayout = new javax.swing.GroupLayout(jPanelHourOpenBread);
        jPanelHourOpenBread.setLayout(jPanelHourOpenBreadLayout);
        jPanelHourOpenBreadLayout.setHorizontalGroup(
            jPanelHourOpenBreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenBreadLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenBread)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelHourOpenBreadLayout.setVerticalGroup(
            jPanelHourOpenBreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenBread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToBreadView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonFavoriteBreadView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteBreadView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteBreadView.setBorder(null);
        jButtonFavoriteBreadView.addActionListener(new BreadListener());

        javax.swing.GroupLayout jPanelContainerBreadViewLayout = new javax.swing.GroupLayout(jPanelContainerBreadView);
        jPanelContainerBreadView.setLayout(jPanelContainerBreadViewLayout);
        jPanelContainerBreadViewLayout.setHorizontalGroup(
            jPanelContainerBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerBreadViewLayout.createSequentialGroup()
                .addGroup(jPanelContainerBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelException1BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneContainStarBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHourOpenBread, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelContainerBreadViewLayout.createSequentialGroup()
                .addGroup(jPanelContainerBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPositionBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFavoriteBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 77, Short.MAX_VALUE))
        );
        jPanelContainerBreadViewLayout.setVerticalGroup(
            jPanelContainerBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerBreadViewLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jButtonFavoriteBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNameBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPositionBreadView)
                .addGap(10, 10, 10)
                .addComponent(jPaneContainStarBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelException1BreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHourOpenBread, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelBreadViewLayout = new javax.swing.GroupLayout(jPanelBreadView);
        jPanelBreadView.setLayout(jPanelBreadViewLayout);
        jPanelBreadViewLayout.setHorizontalGroup(
            jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBreadViewLayout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBreadViewLayout.createSequentialGroup()
                        .addGroup(jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBreadViewLayout.createSequentialGroup()
                                .addComponent(jButtonBackBreadViewException1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanelBreadViewLayout.createSequentialGroup()
                                .addComponent(jPanelContainerBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)))
                        .addComponent(jButtonBackBreadView))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBreadViewLayout.createSequentialGroup()
                        .addComponent(jPanelPaymentMethodsBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBreadViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImageBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelListBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(267, Short.MAX_VALUE)))
        );
        jPanelBreadViewLayout.setVerticalGroup(
            jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBreadViewLayout.createSequentialGroup()
                .addGroup(jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBackBreadView)
                    .addGroup(jPanelBreadViewLayout.createSequentialGroup()
                        .addComponent(jButtonBackBreadViewException1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelContainerBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanelPaymentMethodsBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBreadViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBreadViewLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabelImageBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanelListBreadView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

    }
    private void BeerView() {

        jPanelBeerView = new javax.swing.JPanel();
        jPanelListBeerView = new javax.swing.JPanel();
        jLabelException1BeerView = new javax.swing.JLabel();
        jLabelSumBeerView = new javax.swing.JLabel();
        jLabelMoneyBeerView = new javax.swing.JLabel();
        jLabelVNDBeerView = new javax.swing.JLabel();
        jButtonAddBeerView = new javax.swing.JButton();
        jScrollPaneException1BeerView = new javax.swing.JScrollPane();
        jTableMenuOfBeer = new javax.swing.JTable();
        jButtonBackBeerException1 = new javax.swing.JButton();
        jLabelImageBeerView = new javax.swing.JLabel();
        jButtonBackBeer = new javax.swing.JButton();
        jPanelPaymentMethodsBeerView = new javax.swing.JPanel();
        jLabelPaymentMethodsBeerView = new javax.swing.JLabel();
        jButtonPayWithQRCodeBeerView = new javax.swing.JButton();
        jButtonPayInCashBeerView = new javax.swing.JButton();
        jPanelContainerBeerView = new javax.swing.JPanel();
        jTextFieldNameBeerView = new javax.swing.JTextField();
        jLabelPositionBeerView = new javax.swing.JLabel();
        jPaneContainStarBeerView = new javax.swing.JPanel();
        jLabelStar1BeerView = new javax.swing.JLabel();
        jLabelStar2BeerView = new javax.swing.JLabel();
        jLabelStar3BeerView = new javax.swing.JLabel();
        jLabelStar4BeerView = new javax.swing.JLabel();
        jPanelException1BeerView = new javax.swing.JPanel();
        jLabelGreenDotBeer = new javax.swing.JLabel();
        jLabelTimeOpenBeerView = new javax.swing.JLabel();
        jPanelHourOpenBeer = new javax.swing.JPanel();
        jLabelHourOpenBeer = new javax.swing.JLabel();
        jLabelUpToBeerView = new javax.swing.JLabel();
        jButtonFavoriteBeerView = new javax.swing.JButton();

        jPanelBeerView.setBackground(new java.awt.Color(255, 153, 51));
        jPanelBeerView.setPreferredSize(new java.awt.Dimension(873, 624));

        jPanelListBeerView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelSumBeerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSumBeerView.setText("Tổng:");

        jLabelMoneyBeerView.setText("                                                   0");
        jLabelMoneyBeerView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelVNDBeerView.setText("VNĐ");

        jButtonAddBeerView.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAddBeerView.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonAddBeerView.setText("Thêm");
        jButtonAddBeerView.addActionListener(new BeerListener());

        jTableMenuOfBeer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Bia tiger", "20,000",  new Integer(0)},
                {"2", "Bia Sài Gòn", "16,000",  new Integer(0)},
                {"3", "Tiger crystal", "22,000",  new Integer(0)},
                {"4", "Sài Gòn special", "18,000",  new Integer(0)},
                {"5", "Couple combo:2 beers + đậu nành Nhật + chân gà sả tắc/phô mai xông khói/jambon", "199,000",  new Integer(0)},
                {"6", "Smoke combo: 4 beers + khô gà/đậu nành Nhật/đậu phộng", "499,000",  new Integer(0)},
                {"7", "Chill combo: 4 beers + jambon + đậu phộng + bắp bò/cánh gà sốt Thái", "399,000",  new Integer(0)},
                {"8", "Party combo: 6 beers + đậu nành Nhật + đậu phộng + chân gà sả tắc + bắp bò Savoury + khô bò sả ớt + cánh gà sốt cay", "599,000",  new Integer(0)},
                {"9", "Budweiser (độ cồn: 5%)", "40,000",  new Integer(0)},
                {"10", "Singha (độ cồn: 5%)", "45,000",  new Integer(0)},
                {"11", "Leffe Brune Bruin (độ cồn: 6.5%)", "80,000",  new Integer(0)},
                {"12", "Leffe Blonde Blond(độ cồn: 6.6%)", "70,000",  new Integer(0)},
                {"13", "Stella Artois(độ cồn: 5%)", "70,000",  new Integer(0)},
                {"14", "Jopen Hoppen (độ cồn: 6.8%)", "80,000",  new Integer(0)},
                {"15", "Jopen Gerstebier (độ cồn: 4.9%)", "80,000",  new Integer(0)},
                {"16", "Jopen Jacobus RPA (độ cồn: 5.5%)", "80,000",  new Integer(0)},
                {"17", "Jopen Adriaan Wit (độ cồn: 5%)", "80,000",  new Integer(0)},
                {"18", "U Beer(độ cồn: 5%)", "45,000",  new Integer(0)},
                {"19", "Royal Dutch(độ cồn: 12%)", "85,000",  new Integer(0)},
                {"20", "Heineken(độ cồn: 5%)", "40,000",  new Integer(0)},
                {"21", "Corona(độ cồn: 4.6%)", "55,000",  new Integer(0)},
                {"22", "Coronita(độ cồn: 4.6%)", "40,000",  new Integer(0)},
                {"23", "Hoegaarden white(độ cồn: 4.9%)", "55,000",  new Integer(0)},
                {"24", "East West IPA(độ cồn: 6.7%)", "80,000",  new Integer(0)},
                {"25", "Estrella(độ cồn: 4.6%)", "70,000",  new Integer(0)},
                {"26", "Bear Beer(độ cồn: 12%)", "85,000",  new Integer(0)},
                {"27", "Bundaberg Fruit", "85,000",  new Integer(0)},
                {"28", "Hoegaarden Rosee(độ cồn: 3%)", "55,000",  new Integer(0)},
                {"29", "Oettinger(độ cồn: 0.5%)", "80,000",  new Integer(0)},
                {"30", "Magners Berry Cider(độ cồn: 4.5%)", "80,000",  new Integer(0)},
                {"31", "Magners Original Apple(độ cồn: 4.5%)", "80,000",  new Integer(0)},
                {"32", "Magners Pear(độ cồn: 4.5%)", "80,000",  new Integer(0)},
                {"33", "Chimay Red(độ cồn: 7%)", "220,000",  new Integer(0)},
                {"34", "Chimay Blue(độ cồn: 9%)", "220,000",  new Integer(0)},
                {"35", "Kasteel Triple(độ cồn: 11%)", "220,000",  new Integer(0)},
                {"36", "Kasteel Rouge(độ cồn: 8%)", "220,000",  new Integer(0)},
                {"37", "Kasteel Cuvee(độ cồn: 11%)", "230,000",  new Integer(0)},
                {"38", "Kasteel Donker(độ cồn: 11%)", "230,000",  new Integer(0)}
            },
            new String [] {
                "Số thứ tự", "Tên", "Giá (VNĐ)", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneException1BeerView.setViewportView(jTableMenuOfBeer);
        if (jTableMenuOfBeer.getColumnModel().getColumnCount() > 0) {
            jTableMenuOfBeer.getColumnModel().getColumn(0).setResizable(false);
            jTableMenuOfBeer.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableMenuOfBeer.getColumnModel().getColumn(1).setResizable(false);
            jTableMenuOfBeer.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTableMenuOfBeer.getColumnModel().getColumn(2).setResizable(false);
            jTableMenuOfBeer.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanelListBeerViewLayout = new javax.swing.GroupLayout(jPanelListBeerView);
        jPanelListBeerView.setLayout(jPanelListBeerViewLayout);
        jPanelListBeerViewLayout.setHorizontalGroup(
            jPanelListBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListBeerViewLayout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jLabelException1BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanelListBeerViewLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButtonAddBeerView)
                .addGap(103, 103, 103)
                .addComponent(jLabelSumBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMoneyBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVNDBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelListBeerViewLayout.createSequentialGroup()
                .addComponent(jScrollPaneException1BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanelListBeerViewLayout.setVerticalGroup(
            jPanelListBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListBeerViewLayout.createSequentialGroup()
                .addComponent(jLabelException1BeerView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneException1BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelListBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMoneyBeerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddBeerView, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabelSumBeerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVNDBeerView, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonBackBeerException1.setBorder(null);

        jLabelImageBeerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\BeerView.jpg")); // NOI18N
        jLabelImageBeerView.setText("jLabel1");

        jButtonBackBeer.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackBeer.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackBeer.setName("BackBeer");
        jButtonBackBeer.setBorder(null);
        jButtonBackBeer.addActionListener(new BeerListener());
                

        jLabelPaymentMethodsBeerView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPaymentMethodsBeerView.setText("      Phương thức thanh toán");

        jButtonPayWithQRCodeBeerView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayWithQRCodeBeerView.setText("Quét mã QR");
        jButtonPayWithQRCodeBeerView.addActionListener(new BeerListener());

        jButtonPayInCashBeerView.setBackground(new java.awt.Color(102, 255, 0));
        jButtonPayInCashBeerView.setText("Sử dụng tiền mặt");
        jButtonPayInCashBeerView.addActionListener(new BeerListener());

        javax.swing.GroupLayout jPanelPaymentMethodsBeerViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsBeerView);
        jPanelPaymentMethodsBeerView.setLayout(jPanelPaymentMethodsBeerViewLayout);
        jPanelPaymentMethodsBeerViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsBeerViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPaymentMethodsBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsBeerViewLayout.createSequentialGroup()
                        .addGroup(jPanelPaymentMethodsBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPayWithQRCodeBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPayInCashBeerView))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaymentMethodsBeerViewLayout.createSequentialGroup()
                        .addComponent(jLabelPaymentMethodsBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        //here 
        jPanelPaymentMethodsBeerViewLayout.setVerticalGroup(
            jPanelPaymentMethodsBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsBeerViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsBeerView, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jButtonPayInCashBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPayWithQRCodeBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanelContainerBeerView.setBackground(new java.awt.Color(255, 153, 51));
        jPanelContainerBeerView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextFieldNameBeerView.setBackground(new java.awt.Color(255, 153, 51));
        jTextFieldNameBeerView.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextFieldNameBeerView.setText("Lão Hạc Quán - Beer & Cafe");
        jTextFieldNameBeerView.setBorder(null);

        jLabelPositionBeerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPositionBeerView.setText("Địa điểm: ao sen ngõ số 2");

        jPaneContainStarBeerView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelStar1BeerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar1BeerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar2BeerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar2BeerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar3BeerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar3BeerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        jLabelStar4BeerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelStar4BeerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-star-48.png")); // NOI18N

        javax.swing.GroupLayout jPaneContainStarBeerViewLayout = new javax.swing.GroupLayout(jPaneContainStarBeerView);
        jPaneContainStarBeerView.setLayout(jPaneContainStarBeerViewLayout);
        jPaneContainStarBeerViewLayout.setHorizontalGroup(
            jPaneContainStarBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarBeerViewLayout.createSequentialGroup()
                .addComponent(jLabelStar1BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar2BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar3BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStar4BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPaneContainStarBeerViewLayout.setVerticalGroup(
            jPaneContainStarBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneContainStarBeerViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPaneContainStarBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStar1BeerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar2BeerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar3BeerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStar4BeerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelException1BeerView.setBackground(new java.awt.Color(255, 153, 51));

        jLabelGreenDotBeer.setBackground(new java.awt.Color(255, 102, 0));
        jLabelGreenDotBeer.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-green-circle-48.png")); // NOI18N

        jLabelTimeOpenBeerView.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTimeOpenBeerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTimeOpenBeerView.setText("Mở cửa 8a.m - 6p.m ");

        javax.swing.GroupLayout jPanelException1BeerViewLayout = new javax.swing.GroupLayout(jPanelException1BeerView);
        jPanelException1BeerView.setLayout(jPanelException1BeerViewLayout);
        jPanelException1BeerViewLayout.setHorizontalGroup(
            jPanelException1BeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelException1BeerViewLayout.createSequentialGroup()
                .addComponent(jLabelGreenDotBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTimeOpenBeerView)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanelException1BeerViewLayout.setVerticalGroup(
            jPanelException1BeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGreenDotBeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTimeOpenBeerView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelHourOpenBeer.setBackground(new java.awt.Color(255, 153, 51));

        jLabelHourOpenBeer.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\icons8-coins-64.png")); // NOI18N

        jLabelUpToBeerView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUpToBeerView.setText("15,000 - 250,000 VNĐ");

        javax.swing.GroupLayout jPanelHourOpenBeerLayout = new javax.swing.GroupLayout(jPanelHourOpenBeer);
        jPanelHourOpenBeer.setLayout(jPanelHourOpenBeerLayout);
        jPanelHourOpenBeerLayout.setHorizontalGroup(
            jPanelHourOpenBeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHourOpenBeerLayout.createSequentialGroup()
                .addComponent(jLabelHourOpenBeer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUpToBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelHourOpenBeerLayout.setVerticalGroup(
            jPanelHourOpenBeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHourOpenBeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUpToBeerView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonFavoriteBeerView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteBeerView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteBeerView.setBorder(null);
        jButtonFavoriteBeerView.addActionListener(new BeerListener());

        javax.swing.GroupLayout jPanelContainerBeerViewLayout = new javax.swing.GroupLayout(jPanelContainerBeerView);
        jPanelContainerBeerView.setLayout(jPanelContainerBeerViewLayout);
        jPanelContainerBeerViewLayout.setHorizontalGroup(
            jPanelContainerBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerBeerViewLayout.createSequentialGroup()
                .addGroup(jPanelContainerBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelException1BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneContainStarBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHourOpenBeer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelContainerBeerViewLayout.createSequentialGroup()
                .addGroup(jPanelContainerBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPositionBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFavoriteBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNameBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 148, Short.MAX_VALUE))
        );
        jPanelContainerBeerViewLayout.setVerticalGroup(
            jPanelContainerBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerBeerViewLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jButtonFavoriteBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNameBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPositionBeerView)
                .addGap(10, 10, 10)
                .addComponent(jPaneContainStarBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelException1BeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHourOpenBeer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelBeerViewLayout = new javax.swing.GroupLayout(jPanelBeerView);
        jPanelBeerView.setLayout(jPanelBeerViewLayout);
        jPanelBeerViewLayout.setHorizontalGroup(
            jPanelBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelBeerViewLayout.createSequentialGroup()
                .addGap(0, 318, Short.MAX_VALUE)
                .addComponent(jPanelContainerBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBackBeerException1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBackBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelBeerViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPaymentMethodsBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBeerViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelListBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelImageBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(223, Short.MAX_VALUE)))
        );
        jPanelBeerViewLayout.setVerticalGroup(
            jPanelBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBeerViewLayout.createSequentialGroup()
                .addGroup(jPanelBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBeerViewLayout.createSequentialGroup()
                        .addComponent(jButtonBackBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBackBeerException1)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBeerViewLayout.createSequentialGroup()
                        .addComponent(jPanelContainerBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanelPaymentMethodsBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBeerViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBeerViewLayout.createSequentialGroup()
                    .addComponent(jLabelImageBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelListBeerView, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)))
        );
    }
}
