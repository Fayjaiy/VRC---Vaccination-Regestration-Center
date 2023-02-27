/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Vaccine extends javax.swing.JFrame {
    Connection con;
    int SNI = (int)(Math.random()*(999999-100000+1)+100000); 
    Date date = new Date(); 
     DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
      SignIn acc= new SignIn();
      String commonSNI= String.valueOf(SNI) ;
    /**
     * Creates new form Vaccine
     */
    public Vaccine() {
        initComponents();
        dateField.setDate(date);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        profileIcon = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        appointment = new javax.swing.JButton();
        booking = new javax.swing.JButton();
        contacts = new javax.swing.JButton();
        FAQ = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        vrcIcon = new javax.swing.JLabel();
        unVaccinatedButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        amountLabel = new javax.swing.JLabel();
        dose1RadioButton = new javax.swing.JRadioButton();
        dose2RadioButton = new javax.swing.JRadioButton();
        dose3RadioButton = new javax.swing.JRadioButton();
        doseTypeLabel = new javax.swing.JLabel();
        dose1ComboBox = new javax.swing.JComboBox<>();
        dose2ComboBox = new javax.swing.JComboBox<>();
        dose3ComboBox = new javax.swing.JComboBox<>();
        dose1Label = new javax.swing.JLabel();
        dose2Label = new javax.swing.JLabel();
        dose4Label = new javax.swing.JLabel();
        latestDoseLabel = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 245, 239));

        panel1.setBackground(new java.awt.Color(193, 244, 197));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setName(""); // NOI18N
        panel1.setPreferredSize(new java.awt.Dimension(133, 364));

        profileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/profile.png"))); // NOI18N

        home.setBackground(new java.awt.Color(244, 245, 239));
        home.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        appointment.setBackground(new java.awt.Color(244, 245, 239));
        appointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 10)); // NOI18N
        appointment.setForeground(new java.awt.Color(51, 51, 51));
        appointment.setText("<html>\nMy \nAppointments");
        appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentActionPerformed(evt);
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

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profileIcon)
                    .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(profileIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vrcIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/vrc.png"))); // NOI18N

        unVaccinatedButton.setBackground(new java.awt.Color(244, 245, 239));
        unVaccinatedButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        unVaccinatedButton.setText("I'm unvaccinated");
        unVaccinatedButton.setActionCommand("notVac");
        unVaccinatedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unVaccinatedButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(101, 135, 115));
        title.setText("Have you been vaccinated before?\n");

        nextButton.setBackground(new java.awt.Color(244, 245, 239));
        nextButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        nextButton.setText("next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        amountLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        amountLabel.setText("How many doses have you taken?\n");

        buttonGroup1.add(dose1RadioButton);
        dose1RadioButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        dose1RadioButton.setText("1 dose");
        dose1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(dose2RadioButton);
        dose2RadioButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        dose2RadioButton.setText("2 doses");
        dose2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(dose3RadioButton);
        dose3RadioButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        dose3RadioButton.setText("3 doses");
        dose3RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose3RadioButtonActionPerformed(evt);
            }
        });

        doseTypeLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        doseTypeLabel.setText("Please specify dose type:");

        dose1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer", "Astrazenica", "moderna", " " }));
        dose1ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dose1ComboBoxItemStateChanged(evt);
            }
        });
        dose1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose1ComboBoxActionPerformed(evt);
            }
        });

        dose2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Pfizer", "Astrazenica", "moderna", " " }));

        dose3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Pfizer", "Astrazenica", "moderna", " " }));
        dose3ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dose3ComboBoxActionPerformed(evt);
            }
        });

        dose1Label.setText("dose 1:\n");

        dose2Label.setText("dose 2:");

        dose4Label.setText("dose 3:");

        latestDoseLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        latestDoseLabel.setText("when have you taken your latest dose?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(unVaccinatedButton)
                        .addGap(26, 26, 26)
                        .addComponent(nextButton)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(dose1RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dose2RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dose3RadioButton)
                                .addGap(377, 377, 377))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(title)
                                    .addComponent(amountLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(131, 131, 131)
                        .addComponent(vrcIcon))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doseTypeLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dose1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(dose1Label)))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dose2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dose2Label))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dose4Label)
                                    .addComponent(dose3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(latestDoseLabel)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vrcIcon)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amountLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dose1RadioButton)
                    .addComponent(dose2RadioButton)
                    .addComponent(dose3RadioButton))
                .addGap(18, 18, 18)
                .addComponent(doseTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dose1Label)
                    .addComponent(dose2Label)
                    .addComponent(dose4Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dose1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dose2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dose3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(latestDoseLabel)
                .addGap(18, 18, 18)
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unVaccinatedButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
           
        try{
               if(!inRange(formatDate.format(dateField.getDate()))){
            JOptionPane.showMessageDialog(null, "you cannot sign up for a vaccine as its been less than 3 weeks since your last shot!",
               "error", JOptionPane.ERROR_MESSAGE);
             }
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/VRC", "root","Sh$123456");
            String Query="INSERT INTO Vaccine VALUES (?,?,?,?,?,?)";
            PreparedStatement st= con.prepareStatement(Query);
            st.setString(1, commonSNI);
            st.setString(2, vac_type());
            st.setString(3, formatDate.format(dateField.getDate()));
            st.setString(4, dose1ComboBox.getSelectedItem().toString());
            st.setString(5, dose2());
            st.setString(6,dose3());
            if( st.executeUpdate() ==1 && inRange(formatDate.format(dateField.getDate())) ){
                JOptionPane.showMessageDialog(this, "You can move to the symptom analyzer", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(dateField.getDate() == null) {
                 JOptionPane.showMessageDialog(this, "Fill vaccination date ", "Error", JOptionPane.ERROR);
            }
            else if(dose1ComboBox.getSelectedItem()== null && dose2()==null && dose3()==null){
                 JOptionPane.showMessageDialog(this, "Choose dose/s taken or if unvaccinated click on the unvaccinated button ", "Error", JOptionPane.ERROR);
            }
         

            
            
        }catch (SQLException ex) {
            Logger.getLogger(Vaccine.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vaccine.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(inRange(formatDate.format(dateField.getDate()))){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/VRC", "root","Sh$123456");
            String Query="INSERT INTO Vaccinated VALUES (?,?,?)";
            PreparedStatement st= con.prepareStatement(Query);
            st.setString(1, SignIn.acc.getUserName());
            st.setString(2,commonSNI );
            st.setString(3, Status());
           if(st.executeUpdate()==1) {
                 this.setVisible(false);
                 SymptomAnalyzer b=new SymptomAnalyzer();
                 b.setVisible(true);
           }
        }catch (SQLException ex) {
            Logger.getLogger(Vaccine.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vaccine.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void dose1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose1RadioButtonActionPerformed
        dose2ComboBox.setEnabled(false);
        dose3ComboBox.setEnabled(false);
        dose1ComboBox.setEnabled(true);
    }//GEN-LAST:event_dose1RadioButtonActionPerformed

    private void dose2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose2RadioButtonActionPerformed
        dose3ComboBox.setEnabled(false);
        dose1ComboBox.setEnabled(true);
        dose2ComboBox.setEnabled(true);
        
    }//GEN-LAST:event_dose2RadioButtonActionPerformed

    private void dose1ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dose1ComboBoxItemStateChanged
        
    }//GEN-LAST:event_dose1ComboBoxItemStateChanged

    private void dose1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose1ComboBoxActionPerformed
     
      
    }//GEN-LAST:event_dose1ComboBoxActionPerformed

    private void unVaccinatedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unVaccinatedButtonActionPerformed
        this.setVisible(false);
        Appointment b=new Appointment();
        b.setVisible(true);
    }//GEN-LAST:event_unVaccinatedButtonActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.setVisible(false);
        HomePage h=new HomePage();
        h.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentActionPerformed
        this.setVisible(false);
        AppFrame a= new AppFrame();
        a.setVisible(true);
    }//GEN-LAST:event_appointmentActionPerformed

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

    private void dose3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose3RadioButtonActionPerformed
        dose1ComboBox.setEnabled(true);
        dose2ComboBox.setEnabled(true);
        dose3ComboBox.setEnabled(true);
    }//GEN-LAST:event_dose3RadioButtonActionPerformed

    private void dose3ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dose3ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dose3ComboBoxActionPerformed
        public String vac_type(){
            if(dose1RadioButton.isSelected()){
                return dose1ComboBox.getSelectedItem().toString();
            }else if(dose2RadioButton.isSelected()){
                return dose2ComboBox.getSelectedItem().toString();
            }else return dose3ComboBox.getSelectedItem().toString();
        }
        public String dose2(){
            String selected= dose2ComboBox.getSelectedItem().toString();
            if(selected=="none"){
                return null;
            }else return selected;
        }
        public String dose3(){
            String selected= dose3ComboBox.getSelectedItem().toString();
            if(selected=="none"){
                return null;
            }else return selected;
        }
        public String Status(){
            if(dose1RadioButton.isSelected()){
                return "once Vaccinated";
            }else if(dose2RadioButton.isSelected()){
                return "twice Vaccinated";
            }else return "fully Vaccinated";
        }
        
        public boolean inRange(String date){

      LocalDate currentDate = LocalDate.now();
      LocalDate currentDateMinus3Weeks = currentDate.minusWeeks(3);
      DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US);

      LocalDate vaccDate = LocalDate.parse(date,dateFormat);
      
        return !vaccDate.isAfter(currentDateMinus3Weeks);
        }
        
           
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FAQ;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton appointment;
    private javax.swing.JButton booking;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton contacts;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JComboBox<String> dose1ComboBox;
    private javax.swing.JLabel dose1Label;
    private javax.swing.JRadioButton dose1RadioButton;
    private javax.swing.JComboBox<String> dose2ComboBox;
    private javax.swing.JLabel dose2Label;
    private javax.swing.JRadioButton dose2RadioButton;
    private javax.swing.JComboBox<String> dose3ComboBox;
    private javax.swing.JRadioButton dose3RadioButton;
    private javax.swing.JLabel dose4Label;
    private javax.swing.JLabel doseTypeLabel;
    private javax.swing.JButton home;
    private javax.swing.JLabel latestDoseLabel;
    private javax.swing.JButton logout;
    private javax.swing.JButton nextButton;
    private java.awt.Panel panel1;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel title;
    private javax.swing.JButton unVaccinatedButton;
    private javax.swing.JLabel vrcIcon;
    // End of variables declaration//GEN-END:variables
}