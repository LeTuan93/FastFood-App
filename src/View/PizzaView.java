/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author min
 */
public class PizzaView extends javax.swing.JFrame {

    /**
     * Creates new form a
     */
    public PizzaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPizzaView.setBackground(new java.awt.Color(255, 153, 51));

        jButtonBackPizza.setBackground(new java.awt.Color(255, 153, 51));
        jButtonBackPizza.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\icons8-back-64.png")); // NOI18N
        jButtonBackPizza.setBorder(null);

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
        jButtonAddPizzaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPizzaViewActionPerformed(evt);
            }
        });

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

        jButtonPayWithQRCodePizzaView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodePizzaView.setText("Quét mã QR");
        jButtonPayWithQRCodePizzaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayWithQRCodePizzaViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPaymentMethodsPizzaViewLayout = new javax.swing.GroupLayout(jPanelPaymentMethodsPizzaView);
        jPanelPaymentMethodsPizzaView.setLayout(jPanelPaymentMethodsPizzaViewLayout);
        jPanelPaymentMethodsPizzaViewLayout.setHorizontalGroup(
            jPanelPaymentMethodsPizzaViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaymentMethodsPizzaViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPaymentMethodsPizzaView, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabelPaymentMethodsPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
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
        jButtonFavoritePizzaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFavoritePizzaViewActionPerformed(evt);
            }
        });

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
        jTextFieldNamePizzaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamePizzaViewActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPizzaView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddPizzaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPizzaViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddPizzaViewActionPerformed

    private void jButtonPayWithQRCodePizzaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayWithQRCodePizzaViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPayWithQRCodePizzaViewActionPerformed

    private void jButtonFavoritePizzaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFavoritePizzaViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFavoritePizzaViewActionPerformed

    private void jTextFieldNamePizzaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamePizzaViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamePizzaViewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPizzaView;
    private javax.swing.JButton jButtonBackPizza;
    private javax.swing.JButton jButtonFavoritePizzaView;
    private javax.swing.JButton jButtonPayInCashPizzaView;
    private javax.swing.JButton jButtonPayWithQRCodePizzaView;
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
    private javax.swing.JPanel jPanelPizzaView;
    private javax.swing.JScrollPane jScrollPaneException1PizzaView;
    private javax.swing.JTable jTableMenuOfPizza;
    private javax.swing.JTextField jTextFieldNamePizzaView;
    // End of variables declaration//GEN-END:variables
}
