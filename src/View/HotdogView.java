/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author min
 */
public class HotdogView extends javax.swing.JFrame {

    /**
     * Creates new form a
     */
    public HotdogView() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jButtonAddHotdogView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddHotdogViewActionPerformed(evt);
            }
        });

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

        jLabelImageHotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Downloads\\HotdogView.png")); // NOI18N
        jLabelImageHotdogView.setText("jLabel1");

        jPanelContainerHotdogView.setBackground(new java.awt.Color(255, 153, 51));

        jButtonFavoriteHotdogView.setBackground(new java.awt.Color(255, 0, 51));
        jButtonFavoriteHotdogView.setIcon(new javax.swing.ImageIcon("C:\\Users\\min\\Documents\\NetBeansProjects\\tester\\src\\Image\\Favorite.png")); // NOI18N
        jButtonFavoriteHotdogView.setBorder(null);
        jButtonFavoriteHotdogView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFavoriteHotdogViewActionPerformed(evt);
            }
        });

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

        jButtonPayWithQRCodeHotdogView.setBackground(new java.awt.Color(51, 255, 0));
        jButtonPayWithQRCodeHotdogView.setText("Quét mã QR");
        jButtonPayWithQRCodeHotdogView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayWithQRCodeHotdogViewActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHotdogView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddHotdogViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddHotdogViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddHotdogViewActionPerformed

    private void jButtonFavoriteHotdogViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFavoriteHotdogViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFavoriteHotdogViewActionPerformed

    private void jButtonPayWithQRCodeHotdogViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayWithQRCodeHotdogViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPayWithQRCodeHotdogViewActionPerformed

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
            java.util.logging.Logger.getLogger(HotdogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotdogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotdogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotdogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotdogView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddHotdogView;
    private javax.swing.JButton jButtonBackHotdogView;
    private javax.swing.JButton jButtonFavoriteHotdogView;
    private javax.swing.JButton jButtonPayInCashHotdogView;
    private javax.swing.JButton jButtonPayWithQRCodeHotdogView;
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
    private javax.swing.JPanel jPanelHotdogView;
    private javax.swing.JPanel jPanelHourOpenHotdogView;
    private javax.swing.JPanel jPanelListHotdogView;
    private javax.swing.JPanel jPanelPaymentMethodsHotdogView;
    private javax.swing.JScrollPane jScrollPaneException1HotdogView;
    private javax.swing.JTable jTableMenuOfHotdog;
    private javax.swing.JTextField jTextFieldNameHotdogView;
    // End of variables declaration//GEN-END:variables
}