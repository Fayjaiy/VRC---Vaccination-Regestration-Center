/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author fatim
 */
public class HCP extends javax.swing.JFrame {
Connection con;
 SignIn acc = new SignIn();
public  Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VRC", "root", "Sh$123456");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    /**
     * Creates new form HCP
     */
    public HCP() {
        initComponents();
        getConnection();
        Print();
    
    }
    
    ArrayList<Healthcare_Professionals> allItems;
    public void Print() {
        this.allItems = new ArrayList<>();
       
        if (con != null) {
            try {
                java.sql.Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT pfname, surname, location, phoneNumber FROM healthcare_professional, medical_center WHERE med_id=CenterID");
                while (rs.next()) {
                    this.allItems.add(new Healthcare_Professionals(rs.getString(1), rs.getString(2), rs.getString(3),rs.getInt(4)));
                
                }

             
              jTextArea1.setText(getAllItems());
               
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Connection with the database failed!");
        }
    }
    public String getAllItems() {

        String details = "";
        for (Healthcare_Professionals item : allItems) {
            details += String.format("%-20s", item.getPfname())  + "           " + String.format("%-20s", item.getSurname()) + "\t\t" + String.format("%-20s", item.getLocation()) + "\t    " + item.getPhoneNumber() + "\n";
        }
        return details;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProfHealthCareTable = new javax.swing.JTable();
        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        ProfileLabel = new javax.swing.JLabel();
        appointment = new javax.swing.JButton();
        home = new javax.swing.JButton();
        booking = new javax.swing.JButton();
        contacts = new javax.swing.JButton();
        FAQ = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        Email2Label = new javax.swing.JLabel();
        TwitterLabel = new javax.swing.JLabel();
        Twitter2Label = new javax.swing.JLabel();
        FaceBookLabel = new javax.swing.JLabel();
        FaceBook2Label = new javax.swing.JLabel();
        CSLabel = new javax.swing.JLabel();
        CS2Labe = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        VRCLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ProfHealthCareTable.setAutoCreateRowSorter(true);
        ProfHealthCareTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProfHealthCareTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ProfHealthCareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Khobar", "Noor Ali", "0561234321"},
                {"Dammam", "Jana Hussain", "0505873111"},
                {"Khobar", "Fatma Khalid", "0543658769"},
                {"Qatif", "Shahed Malik", "0554349091"},
                {"Dammam", "Sara Salman", "0598766752"},
                {"Qatif", "Ahmed Abduallah", "0569123454"},
                {"Jubail", "Fadi Hani", "0588784321"},
                {"Jubail", "Bader Albader", "0543455676"},
                {"Alhasa", "Mohammed Abdualal", "0554443221"},
                {"Alhasa", "Hashim Hassan", null},
                {"Alhasa", "Ali Khalid", null}
            },
            new String [] {
                "City", "Name", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProfHealthCareTable.setToolTipText("");
        ProfHealthCareTable.setAlignmentX(1.0F);
        ProfHealthCareTable.setAlignmentY(1.0F);
        ProfHealthCareTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ProfHealthCareTable.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ProfHealthCareTable.setDoubleBuffered(true);
        ProfHealthCareTable.setFocusable(false);
        ProfHealthCareTable.setGridColor(new java.awt.Color(51, 51, 51));
        ProfHealthCareTable.setName(""); // NOI18N
        ProfHealthCareTable.setOpaque(false);
        ProfHealthCareTable.setRowHeight(18);
        ProfHealthCareTable.setSelectionBackground(new java.awt.Color(255, 94, 94));
        ProfHealthCareTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ProfHealthCareTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ProfHealthCareTable.setShowGrid(true);
        jScrollPane2.setViewportView(ProfHealthCareTable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 246, 240));

        MainPanel.setBackground(new java.awt.Color(245, 246, 240));
        MainPanel.setToolTipText("");

        MenuPanel.setBackground(new java.awt.Color(193, 244, 197));

        ProfileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/profile.png"))); // NOI18N

        appointment.setBackground(new java.awt.Color(244, 245, 239));
        appointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 10)); // NOI18N
        appointment.setForeground(new java.awt.Color(51, 51, 51));
        appointment.setText("<html>\nMy \nAppointments");
        appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(244, 245, 239));
        home.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        booking.setBackground(new java.awt.Color(244, 245, 239));
        booking.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 10)); // NOI18N
        booking.setForeground(new java.awt.Color(51, 51, 51));
        booking.setText("<html>\nBook An  \nAppointment");
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });

        contacts.setBackground(new java.awt.Color(244, 245, 239));
        contacts.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        contacts.setForeground(new java.awt.Color(51, 51, 51));
        contacts.setText("<html>\nHealthcare\nContacts");
        contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactsActionPerformed(evt);
            }
        });

        FAQ.setBackground(new java.awt.Color(244, 245, 239));
        FAQ.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        FAQ.setForeground(new java.awt.Color(51, 51, 51));
        FAQ.setText("FAQ's");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(244, 245, 239));
        logout.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(51, 51, 51));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfileLabel))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ProfileLabel)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        TitleLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TitleLabel.setText("HealthCare Contacts");

        EmailLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        EmailLabel.setText("Email :");

        Email2Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Email2Label.setForeground(new java.awt.Color(153, 0, 51));
        Email2Label.setText("VRC@gmail.com");

        TwitterLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        TwitterLabel.setText("Twitter :");

        Twitter2Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Twitter2Label.setForeground(new java.awt.Color(153, 0, 0));
        Twitter2Label.setText("@VRC_SA");

        FaceBookLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        FaceBookLabel.setText("FaceBook :");

        FaceBook2Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        FaceBook2Label.setForeground(new java.awt.Color(153, 0, 0));
        FaceBook2Label.setText("@VRC_SA");

        CSLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        CSLabel.setText("Customer Service :");

        CS2Labe.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        CS2Labe.setForeground(new java.awt.Color(153, 0, 0));
        CS2Labe.setText("+966 560111000");

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/vrc.png"))); // NOI18N

        VRCLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        VRCLabel.setForeground(new java.awt.Color(102, 102, 102));
        VRCLabel.setText("VRC");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(228, 231, 231));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(LogoLabel)
                        .addContainerGap())
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VRCLabel)
                        .addGap(51, 51, 51))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TwitterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FaceBookLabel)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FaceBook2Label)
                                    .addComponent(Twitter2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(CS2Labe))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(CSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Email2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TitleLabel))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VRCLabel)
                    .addComponent(EmailLabel))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(Email2Label)
                        .addGap(23, 23, 23)
                        .addComponent(TwitterLabel)
                        .addGap(18, 18, 18)
                        .addComponent(Twitter2Label)
                        .addGap(22, 22, 22)
                        .addComponent(FaceBookLabel)
                        .addGap(27, 27, 27)
                        .addComponent(FaceBook2Label)
                        .addGap(30, 30, 30)
                        .addComponent(CSLabel)
                        .addGap(8, 8, 8)
                        .addComponent(CS2Labe))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentActionPerformed
        this.setVisible(false);
        AppFrame a= new AppFrame();
        a.setVisible(true);
    }//GEN-LAST:event_appointmentActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.setVisible(false);
        HomePage h=new HomePage();
        h.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
        if(acc.validUser()){
            this.setVisible(false);
            SymptomAnalyzer a=new SymptomAnalyzer();
            a.setVisible(true);
        }
        else{
            this.setVisible(false);
            Vaccine a=new Vaccine();
            a.setVisible(true);}
    }//GEN-LAST:event_bookingActionPerformed

    private void contactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactsActionPerformed
        this.setVisible(false);
        HCP c=new HCP();
        c.setVisible(true);
    }//GEN-LAST:event_contactsActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        this.setVisible(false);
        FAQFrame faq=new FAQFrame();
        faq.setVisible(true);
    }//GEN-LAST:event_FAQActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        SignIn l=new SignIn();
        l.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CS2Labe;
    private javax.swing.JLabel CSLabel;
    private javax.swing.JLabel Email2Label;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton FAQ;
    private javax.swing.JLabel FaceBook2Label;
    private javax.swing.JLabel FaceBookLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JTable ProfHealthCareTable;
    private javax.swing.JLabel ProfileLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel Twitter2Label;
    private javax.swing.JLabel TwitterLabel;
    private javax.swing.JLabel VRCLabel;
    private javax.swing.JButton appointment;
    private javax.swing.JButton booking;
    private javax.swing.JButton contacts;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}