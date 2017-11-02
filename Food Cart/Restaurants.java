
package Restaurants_s;

import java.awt.Color;
import java.awt.event.KeyEvent;
/**
 *
 * @author Sandeep Naik
 */
public class Restaurants extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double thirdnum;
    String operation;
    double result;
    
    double[] i= new double[5];
    double[] j= new double[5];
    double[] m= new double[7];
    double[] k= new double[7];
    
    
   
    public Restaurants() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jBtnClear = new javax.swing.JButton();
        jBtnC = new javax.swing.JButton();
        jBtnPm = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnSub = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnMul = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnDev = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnEqual = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jcDelivery = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        txtTea = new javax.swing.JTextField();
        txtCoffee = new javax.swing.JTextField();
        lemonTea = new javax.swing.JTextField();
        txtGinger = new javax.swing.JTextField();
        txtApple = new javax.swing.JTextField();
        txtOrange = new javax.swing.JTextField();
        txtMango = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jlblCostofDrinks = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jlblCostofDelivery = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jBtnTotal = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jBtnReceipt = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Receipt", jPanel8);

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtnClear.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jBtnClear.setText("←");
        jBtnClear.setToolTipText("");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnC.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jBtnC.setText("C");
        jBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCActionPerformed(evt);
            }
        });

        jBtnPm.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jBtnPm.setText("+/-");
        jBtnPm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPmActionPerformed(evt);
            }
        });

        jBtnAdd.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jBtnAdd.setText("+");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnSub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnSub.setText("-");
        jBtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnMul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnMul.setText("*");
        jBtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMulActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnDev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnDev.setText("/");
        jBtnDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDevActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnDot.setText(".");

        jBtnEqual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnEqual.setText("=");
        jBtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnDev, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtDisplay))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnPm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDev, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculator", jPanel6);

        jTextField13.setText("Mobile Restaurant is Developed by Mr Sandeep naik and Charan tej");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About Us", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setText("Samosa");
        jCheckBox1.setToolTipText("");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox2.setText("Puri Bhaji");
        jCheckBox2.setToolTipText("");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox3.setText("Idli vada");
        jCheckBox3.setToolTipText("");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox4.setText("Veg Fried Rice");
        jCheckBox4.setToolTipText("");
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox5.setText("Gobi");
        jCheckBox5.setToolTipText("");
        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox5MouseClicked(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setText("0");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setText("0");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setText("0");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setText("0");
        jTextField6.setOpaque(false);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.setText("0");
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(240, 240, 240));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setText("Drinks");

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox6.setText("Tax");
        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseClicked(evt);
            }
        });

        jcDelivery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcDelivery.setText("Home Delivery");
        jcDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcDeliveryMouseClicked(evt);
            }
        });
        jcDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDeliveryActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox7.setText("Tea");
        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseClicked(evt);
            }
        });

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox8.setText("Coffee");
        jCheckBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox8MouseClicked(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox9.setText("Lemon Tea");
        jCheckBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox9MouseClicked(evt);
            }
        });
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox10.setText("Ginger Tea");
        jCheckBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox10MouseClicked(evt);
            }
        });

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox11.setText("Apple juice");
        jCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox11MouseClicked(evt);
            }
        });

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox12.setText("Orange juice");
        jCheckBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox12MouseClicked(evt);
            }
        });

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox13.setText("Mango juice");
        jCheckBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox13MouseClicked(evt);
            }
        });

        txtTea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTea.setText("0");
        txtTea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTeaKeyPressed(evt);
            }
        });

        txtCoffee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCoffee.setText("0");
        txtCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoffeeActionPerformed(evt);
            }
        });
        txtCoffee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCoffeeKeyPressed(evt);
            }
        });

        lemonTea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lemonTea.setText("0");
        lemonTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonTeaActionPerformed(evt);
            }
        });
        lemonTea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lemonTeaKeyPressed(evt);
            }
        });

        txtGinger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtGinger.setText("0");
        txtGinger.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGingerKeyPressed(evt);
            }
        });

        txtApple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApple.setText("0");
        txtApple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAppleKeyPressed(evt);
            }
        });

        txtOrange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtOrange.setText("0");
        txtOrange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrangeKeyPressed(evt);
            }
        });

        txtMango.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMango.setText("0");
        txtMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMangoActionPerformed(evt);
            }
        });
        txtMango.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMangoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTea, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(txtCoffee)
                    .addComponent(lemonTea)
                    .addComponent(txtGinger)
                    .addComponent(txtApple)
                    .addComponent(txtOrange)
                    .addComponent(txtMango, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jcDelivery))
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7)
                    .addComponent(txtTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox8)
                            .addComponent(txtCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox9)
                            .addComponent(lemonTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcDelivery))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox10)
                            .addComponent(txtGinger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox11)
                            .addComponent(txtApple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox12)
                            .addComponent(txtOrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox13)
                            .addComponent(txtMango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.setText("Cost of Drinks");

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.setText("Cost of Meal");

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField10.setText("Cost of Delivery");

        jlblCostofDrinks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCostofDrinks.setText("0");
        jlblCostofDrinks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jlblCostofDrinksKeyPressed(evt);
            }
        });

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField12.setText("0");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });

        jlblCostofDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCostofDelivery.setText("0");
        jlblCostofDelivery.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jlblCostofDeliveryKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCostofDrinks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCostofDelivery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCostofDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCostofDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.setText("Sub Total:");
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField15.setText("Total:");

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField16.setText("Tax:");

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField17.setText("0");
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
        });

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField18.setText("0");
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField18KeyPressed(evt);
            }
        });

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField19.setText("0");
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField19KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField17)
                    .addComponent(jTextField18)
                    .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField15)
                    .addComponent(jTextField19))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnTotal.setText("Total");
        jBtnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnTotalMouseClicked(evt);
            }
        });
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnResetMouseClicked(evt);
            }
        });
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        jBtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnReceipt.setText("Receipt");
        jBtnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReceiptMouseClicked(evt);
            }
        });
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jBtnTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnReset)
                    .addComponent(jBtnTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnExit)
                    .addComponent(jBtnReceipt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Wide Latin", 1, 48)); // NOI18N
        jTextField1.setText("Food Cart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(489, 489, 489)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(484, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed
    
         
      double cTotal1=Double.parseDouble(jlblCostofDrinks.getText());
      double cTotal2=Double.parseDouble(jTextField12.getText());
      double cTotal3=Double.parseDouble(jlblCostofDelivery.getText());
      double cTotal4=Double.parseDouble(jTextField18.getText());

    
    
    
    double subTotal = (cTotal1 + cTotal2 + cTotal3);
    String isubTotal = String.format("%.2f", subTotal);
    jTextField17.setText(isubTotal);
    
     String iTaxTotal = String.format("%.2f", cTotal4);
    jTextField18.setText(iTaxTotal);
    
    double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
    String iTotal = String.format("%.2f", allTotal);
    jTextField19.setText(iTotal);
    }//GEN-LAST:event_jBtnTotalActionPerformed

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed
        



    }//GEN-LAST:event_jBtnReceiptActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
           System.exit((0));
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReceiptMouseClicked
        
        if(jTextField2.getText().equals(""))
        {
            jTextField2.setText("0");
        }
        if(jTextField3.getText().equals(""))
        {
            jTextField3.setText("0");
        }
        if(jTextField4.getText().equals(""))
        {
            jTextField4.setText("0");
        }
        if(jTextField6.getText().equals(""))
        {
            jTextField6.setText("0");
        }
        if(jTextField7.getText().equals(""))
        {
            jTextField7.setText("0");
        }
        double Qty1 = Double.parseDouble(jTextField2.getText());
        double Qty2 = Double.parseDouble(jTextField3.getText());
        double Qty3 = Double.parseDouble(jTextField4.getText());
        double Qty4 = Double.parseDouble(jTextField7.getText());
        double Qty5 = Double.parseDouble(jTextField6.getText());
        double subtot= Double.parseDouble(jTextField17.getText());
        double tax= Double.parseDouble(jTextField18.getText());
        double total= Double.parseDouble(jTextField19.getText());
        
       double Qtya = Double.parseDouble(txtTea.getText());
        double Qtyb = Double.parseDouble(txtCoffee.getText());
        double Qtyc = Double.parseDouble(lemonTea.getText());
        double Qtyd = Double.parseDouble(txtGinger.getText());
        double Qtye = Double.parseDouble(txtApple.getText());
        double Qtyf = Double.parseDouble(txtOrange.getText());
        double Qtyg = Double.parseDouble(txtMango.getText());
        
        
        
      
            
       jTextArea1.setText( "\tFood Cart:\n\n"+"Items\t\t Quantity\n"+"samosa:\t\t"+Qty1+"\npuri bhaji:\t\t"+Qty2+"\nIdli\t\t"+Qty3+"\nGobi\t\t"
                       +Qty4+"\nFriedrice\t\t"+Qty5 +"\nTea\t\t"+Qtya+"\nCoffee\t\t"+Qtyb+"\nLemon Tea\t\t"+Qtyc+"\nGinger Tea\t\t"+Qtyd+
               "\nApple Juice\t\t"+Qtye+"\nOrange Juice\t\t"+Qtyf+"\nMango juiice\t\t"+Qtyg+"\n\nSub total\t\t" +subtot+ "\nTax\t\t"+tax+"\nTotal\t\t"+total+
                        "\n\n\tThank you! visit again\t\t");
                
                
                
        
    }//GEN-LAST:event_jBtnReceiptMouseClicked

    private void jBtnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnResetMouseClicked
              
                jTextField2.setText("0");
                jTextField3.setText("0");
                jTextField4.setText("0");
                jTextField6.setText("0");
                jTextField7.setText("0");
                
                jlblCostofDrinks.setText("0");
                jTextField12.setText("0");
                jlblCostofDelivery.setText("0");
                jTextField17.setText("0");
                jTextField18.setText("0");
                jTextField19.setText("0");
                jTextArea1.setText(null);
               
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
               jCheckBox6.setSelected(false);
               jcDelivery.setSelected(false);
               
               jTextField2.setBackground(Color.white);
                jTextField3.setBackground(Color.white);
                jTextField4.setBackground(Color.white);
                jTextField7.setBackground(Color.white);
                jTextField6.setBackground(Color.white);
                jlblCostofDrinks.setBackground(Color.white);
                jTextField12.setBackground(Color.white);
                jlblCostofDelivery.setBackground(Color.white);
                jTextField17.setBackground(Color.white);
                jTextField18.setBackground(Color.white);
                jTextField19.setBackground(Color.white);
                
                txtTea.setBackground(Color.white);
                txtCoffee.setBackground(Color.white);
                txtOrange.setBackground(Color.white);
                txtMango.setBackground(Color.white);
                lemonTea.setBackground(Color.white);
                txtApple.setBackground(Color.white);
                txtGinger.setBackground(Color.white);
                
                txtTea.setText("0");
                txtCoffee.setText("0");
                lemonTea.setText("0");
                txtGinger.setText("0");
                txtApple.setText("0");
                txtOrange.setText("0");
                txtMango.setText("0");
                
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                jCheckBox10.setSelected(false);
                jCheckBox11.setSelected(false);
                jCheckBox12.setSelected(false);
                jCheckBox13.setSelected(false);
                

    }//GEN-LAST:event_jBtnResetMouseClicked

    private void jBtnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnTotalMouseClicked
 
    
   
    
    }//GEN-LAST:event_jBtnTotalMouseClicked

    private void jBtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if(operation == "+")
        {
            result = firstnum+secondnum;
            answer= String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operation == "-")
        {
            result = firstnum-secondnum;
            answer= String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }

        else if(operation == "*")
        {
            result = firstnum*secondnum;
            answer= String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operation == "/")
        {
            result = firstnum/secondnum;
            answer= String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jBtnEqualActionPerformed

    private void jBtnDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDevActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="/";
    }//GEN-LAST:event_jBtnDevActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(Enternumber); // TODO add your handling code here:
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn5.getText();
        jtxtDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMulActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="*";
    }//GEN-LAST:event_jBtnMulActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn0.getText();
        jtxtDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="-";
    }//GEN-LAST:event_jBtnSubActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn9.getText();
        jtxtDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(Enternumber); // TODO add your handling code here:
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(Enternumber);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="+";
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnPmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPmActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));// TODO add your handling code here:
    }//GEN-LAST:event_jBtnPmActionPerformed

    private void jBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCActionPerformed
        jtxtDisplay.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        String backspace=null;

        if(jtxtDisplay.getText().length()>0){
            StringBuilder strB= new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() -1);
            backspace = strB.toString();
            jtxtDisplay.setText(backspace);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jlblCostofDrinksKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlblCostofDrinksKeyPressed
int key = evt.getKeyCode();
       if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
       {
           jlblCostofDrinks.setEditable(true);
           jlblCostofDrinks.setBackground(Color.yellow);
       }
       else
       {
           jlblCostofDrinks.setEditable(false);
           jlblCostofDrinks.setBackground(Color.red);
       }    }//GEN-LAST:event_jlblCostofDrinksKeyPressed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
int key = evt.getKeyCode();
       if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
       {
           jTextField12.setEditable(true);
           jTextField12.setBackground(Color.yellow);
       }
       else
       {
           jTextField12.setEditable(false);
           jTextField12.setBackground(Color.red);
       }    }//GEN-LAST:event_jTextField12KeyPressed

    private void jlblCostofDeliveryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlblCostofDeliveryKeyPressed
int key = evt.getKeyCode();
       if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
       {
           jlblCostofDelivery.setEditable(true);
           jlblCostofDelivery.setBackground(Color.yellow);
       }
       else
       {
           jlblCostofDelivery.setEditable(false);
           jlblCostofDelivery.setBackground(Color.red);
       }    }//GEN-LAST:event_jlblCostofDeliveryKeyPressed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
int key = evt.getKeyCode();
       if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
       {
           jTextField17.setEditable(true);
           jTextField17.setBackground(Color.yellow);
       }
       else
       {
           jTextField17.setEditable(false);
           jTextField17.setBackground(Color.red);
       }    }//GEN-LAST:event_jTextField17KeyPressed

    private void jTextField18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyPressed
int key = evt.getKeyCode();
       if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
       {
           jTextField18.setEditable(true);
           jTextField18.setBackground(Color.yellow);
       }
       else
       {
           jTextField18.setEditable(false);
           jTextField18.setBackground(Color.red);
       }    }//GEN-LAST:event_jTextField18KeyPressed

    private void jTextField19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyPressed
int key = evt.getKeyCode();
       if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
       {
           jTextField19.setEditable(true);
           jTextField19.setBackground(Color.yellow);
       }
       else
       {
           jTextField19.setEditable(false);
           jTextField19.setBackground(Color.red);
       }    }//GEN-LAST:event_jTextField19KeyPressed

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void txtMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMangoActionPerformed

    private void lemonTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonTeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonTeaActionPerformed

    private void txtCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoffeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoffeeActionPerformed

    private void jCheckBox13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox13MouseClicked
        double cDrink = Double.parseDouble(jlblCostofDrinks.getText());
        double mango = Double.parseDouble(txtTea.getText());
        double imango = 25;

        if(jCheckBox13.isSelected())
        {
            m[6] = ((mango * imango)+ cDrink);
            String pMeal = String.format("%.2f", m[6]);
            jlblCostofDrinks.setText(pMeal);
            k[6]=mango;

        }
        else if(mango>0)
        {
            m[6] = (cDrink-(k[6] * imango));
            String pMeal = String.format("%.2f", m[6]);
            jlblCostofDrinks.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox13MouseClicked

    private void jCheckBox8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox8MouseClicked
        double cDrink = Double.parseDouble(jlblCostofDrinks.getText());
        double coffee = Double.parseDouble(txtCoffee.getText());
        double icoffee = 10;

        if(jCheckBox8.isSelected())
        {
            m[1] = ((coffee * icoffee)+ cDrink);
            String pMeal = String.format("%.2f", m[1]);
            jlblCostofDrinks.setText(pMeal);
            k[1]=coffee;

        }
        else if(coffee>0)
        {
            m[1] = (cDrink-(k[1] * icoffee));
            String pMeal = String.format("%.2f", m[1]);
            jlblCostofDrinks.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox8MouseClicked

    private void jCheckBox9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox9MouseClicked
        double cDrink = Double.parseDouble(jlblCostofDrinks.getText());
        double lemon = Double.parseDouble(lemonTea.getText());
        double ilemon = 10;

        if(jCheckBox9.isSelected())
        {
            m[2] = ((lemon * ilemon)+ cDrink);
            String pMeal = String.format("%.2f", m[2]);
            jlblCostofDrinks.setText(pMeal);
            k[2]=lemon;

        }
        else if(lemon>0)
        {
            m[2] = (cDrink-(k[2] * ilemon));
            String pMeal = String.format("%.2f", m[2]);
            jlblCostofDrinks.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox9MouseClicked

    private void jCheckBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox7MouseClicked
       
        
        double cDrink = Double.parseDouble(jlblCostofDrinks.getText());
        double tea = Double.parseDouble(txtTea.getText());
        double itea = 8;

        if(jCheckBox7.isSelected())
        {
            m[0] = ((tea * itea)+ cDrink);
            String pMeal = String.format("%.2f", m[0]);
            jlblCostofDrinks.setText(pMeal);
            k[0]=tea;

        }
        else if(tea>0)
        {
            m[0] = (cDrink-(k[0] * itea));
            String pMeal = String.format("%.2f", m[0]);
            jlblCostofDrinks.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox7MouseClicked

    private void jcDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcDeliveryMouseClicked
        double iDelivery = 10;
        if(jcDelivery.isSelected())
        {
            String pDelivery = String.format("%.2f", iDelivery);
            jlblCostofDelivery.setText(pDelivery);
        }
        else
        {
            jlblCostofDelivery.setText("0");
        }
    }//GEN-LAST:event_jcDeliveryMouseClicked

    private void jcDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcDeliveryActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            jTextField7.setEditable(true);
            jTextField7.setBackground(Color.yellow);
        }
        else
        {
            jTextField7.setEditable(false);
            jTextField7.setBackground(Color.red);
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
         int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            jTextField6.setEditable(true);
            jTextField6.setBackground(Color.yellow);
        }
        else
        {
            jTextField6.setEditable(false);
            jTextField6.setBackground(Color.red);
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            jTextField4.setEditable(true);
            jTextField4.setBackground(Color.yellow);
        }
        else
        {
            jTextField4.setEditable(false);
            jTextField4.setBackground(Color.red);
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
          int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            jTextField3.setEditable(true);
            jTextField3.setBackground(Color.yellow);
        }
        else
        {
            jTextField3.setEditable(false);
            jTextField3.setBackground(Color.red);
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
          int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            jTextField2.setEditable(true);
            jTextField2.setBackground(Color.yellow);
        }
        else
        {
            jTextField2.setEditable(false);
            jTextField2.setBackground(Color.red);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jCheckBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox5MouseClicked
        double cMeal = Double.parseDouble(jTextField12.getText());
        double gobi = Double.parseDouble(jTextField7.getText());
        double igobi = 30.0;

        if(jCheckBox5.isSelected())
        {
            i[3] = ((gobi * igobi)+ cMeal);
            String pMeal = String.format("%.2f", i[3]);
            jTextField12.setText(pMeal);
            j[3]=gobi;

        }
        else if(gobi>0)
        {
            i[0] = (cMeal-(j[3] * igobi));
            String pMeal = String.format("%.2f", i[0]);
            jTextField12.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox5MouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked
       double cMeal = Double.parseDouble(jTextField12.getText());
        double friedrice = Double.parseDouble(jTextField6.getText());
        double ifriedrice = 45.0;

        if(jCheckBox4.isSelected())
        {
            i[4] = ((friedrice * ifriedrice)+ cMeal);
            String pMeal = String.format("%.2f", i[4]);
            jTextField12.setText(pMeal);
            j[4]=friedrice;

        }
        else if(friedrice>0)
        {
            i[0] = (cMeal-(j[4] * ifriedrice));
            String pMeal = String.format("%.2f", i[0]);
            jTextField12.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox4MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        double cMeal = Double.parseDouble(jTextField12.getText());
        double idli = Double.parseDouble(jTextField4.getText());
        double iidli = 18.0;

        if(jCheckBox3.isSelected())
        {
            i[2] = ((idli * iidli)+ cMeal);
            String pMeal = String.format("%.2f", i[2]);
            jTextField12.setText(pMeal);
            j[2]=idli;

        }
        else if(idli>0)
        {
            i[0] = (cMeal-(j[2] * iidli));
            String pMeal = String.format("%.2f", i[0]);
            jTextField12.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
         double cMeal = Double.parseDouble(jTextField12.getText());
        double puri = Double.parseDouble(jTextField3.getText());
        double ipuri = 20.0;

        if(jCheckBox2.isSelected())
        {
            i[1] = ((puri * ipuri)+ cMeal);
            String pMeal = String.format("%.2f", i[1]);
            jTextField12.setText(pMeal);
            j[1]=puri;

        }
        else if(puri>0)
        {
            i[0] = (cMeal-(j[1] * ipuri));
            String pMeal = String.format("%.2f", i[0]);
            jTextField12.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        double cMeal = Double.parseDouble(jTextField12.getText());
        double samosa = Double.parseDouble(jTextField2.getText());
        double iSamosa = 10.0;

        if(jCheckBox1.isSelected())
        {
            i[0] = ((samosa * iSamosa)+ cMeal);
            String pMeal = String.format("%.2f", i[0]);
            jTextField12.setText(pMeal);
            j[0]=samosa;

        }

        else if(samosa>0)
        {

            i[0] = (cMeal-(j[0] * iSamosa));
            String pMeal = String.format("%.2f", i[0]);
            jTextField12.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox12MouseClicked
        double cDrink = Double.parseDouble(jlblCostofDrinks.getText());
        double orange = Double.parseDouble(txtOrange.getText());
        double iorange = 25;

        if(jCheckBox12.isSelected())
        {
            m[5] = ((orange * iorange)+ cDrink);
            String pMeal = String.format("%.2f", m[5]);
            jlblCostofDrinks.setText(pMeal);
            k[5]=orange;

        }
        else if(orange>0)
        {
            m[5] = (cDrink-(k[5] * iorange));
            String pMeal = String.format("%.2f", m[5]);
            jlblCostofDrinks.setText(pMeal);
        }
    
    }//GEN-LAST:event_jCheckBox12MouseClicked

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox10MouseClicked
            double cDrink = Double.parseDouble(jlblCostofDrinks.getText());
        double ginger = Double.parseDouble(txtGinger.getText());
        double iginger = 10;

        if(jCheckBox10.isSelected())
        {
            m[3] = ((ginger * iginger)+ cDrink);
            String pMeal = String.format("%.2f", m[3]);
            jlblCostofDrinks.setText(pMeal);
            k[3]=ginger;

        }
        else if(ginger>0)
        {
            m[3] = (cDrink-(k[3] * iginger));
            String pMeal = String.format("%.2f", m[3]);
            jlblCostofDrinks.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox10MouseClicked

    private void jCheckBox11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox11MouseClicked
        double cDrink = Double.parseDouble(jlblCostofDrinks.getText());
        double apple = Double.parseDouble(txtApple.getText());
        double iapple = 25;

        if(jCheckBox11.isSelected())
        {
            m[4] = ((apple * iapple)+ cDrink);
            String pMeal = String.format("%.2f", m[4]);
            jlblCostofDrinks.setText(pMeal);
            k[4]=apple;

        }
        else if(apple>0)
        {
            m[4] = (cDrink-(k[4] * iapple));
            String pMeal = String.format("%.2f", m[4]);
            jlblCostofDrinks.setText(pMeal);
        }
    }//GEN-LAST:event_jCheckBox11MouseClicked

    private void jCheckBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseClicked
       double cTotal1 = Double.parseDouble(jlblCostofDrinks.getText());
       double cTotal2 = Double.parseDouble(jTextField12.getText());
       double cTotal3 = Double.parseDouble(jlblCostofDelivery.getText());
       
       double allTotal = (cTotal1+cTotal2+cTotal3)/100;
       
       String iTotal = String.format("%.2f", allTotal);
       jTextField18.setText(iTotal);
    }//GEN-LAST:event_jCheckBox6MouseClicked

    private void txtTeaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeaKeyPressed
          int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            txtTea.setEditable(true);
            txtTea.setBackground(Color.yellow);
        }
        else
        {
            txtTea.setEditable(false);
            txtTea.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtTeaKeyPressed

    private void txtCoffeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoffeeKeyPressed
         int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            txtCoffee.setEditable(true);
            txtCoffee.setBackground(Color.yellow);
        }
        else
        {
            txtCoffee.setEditable(false);
            txtCoffee.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtCoffeeKeyPressed

    private void lemonTeaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lemonTeaKeyPressed
         int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            lemonTea.setEditable(true);
            lemonTea.setBackground(Color.yellow);
        }
        else
        {
            lemonTea.setEditable(false);
            lemonTea.setBackground(Color.red);
        }
    }//GEN-LAST:event_lemonTeaKeyPressed

    private void txtGingerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGingerKeyPressed
          int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            txtGinger.setEditable(true);
            txtGinger.setBackground(Color.yellow);
        }
        else
        {
            txtGinger.setEditable(false);
            txtGinger.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtGingerKeyPressed

    private void txtAppleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAppleKeyPressed
           int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            txtApple.setEditable(true);
            txtApple.setBackground(Color.yellow);
        }
        else
        {
            txtApple.setEditable(false);
            txtApple.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtAppleKeyPressed

    private void txtOrangeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrangeKeyPressed
            int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            txtOrange.setEditable(true);
            txtOrange.setBackground(Color.yellow);
        }
        else
        {
            txtOrange.setEditable(false);
            txtOrange.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtOrangeKeyPressed

    private void txtMangoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMangoKeyPressed
          int key = evt.getKeyCode();
        if((key>= evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE)
        {
            txtMango.setEditable(true);
            txtMango.setBackground(Color.yellow);
        }
        else
        {
            txtMango.setEditable(false);
            txtMango.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtMangoKeyPressed

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
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnC;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDev;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEqual;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnMul;
    private javax.swing.JButton jBtnPm;
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnSub;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JCheckBox jcDelivery;
    private javax.swing.JTextField jlblCostofDelivery;
    private javax.swing.JTextField jlblCostofDrinks;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField lemonTea;
    private javax.swing.JTextField txtApple;
    private javax.swing.JTextField txtCoffee;
    private javax.swing.JTextField txtGinger;
    private javax.swing.JTextField txtMango;
    private javax.swing.JTextField txtOrange;
    private javax.swing.JTextField txtTea;
    // End of variables declaration//GEN-END:variables
}
