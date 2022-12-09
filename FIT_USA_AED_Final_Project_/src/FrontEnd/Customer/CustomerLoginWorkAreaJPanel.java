/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FrontEnd.Customer;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.User.User;
import Backend.WorkQueue.NutritionistWorkRequest;
import Backend.WorkQueue.MeditationCoachWorkRequest;
import Backend.WorkQueue.BeauticianWorkRequest;
import Backend.WorkQueue.SpaTherapyWorkRequest;
import Backend.WorkQueue.GymTrainerWorkRequest;
import Backend.WorkQueue.DietitionWorkRequest;
import Backend.WorkQueue.PilatesInstructorWorkRequest;
import Backend.WorkQueue.CounselorWorkRequest;
import Backend.WorkQueue.CounselorWorkRequest;
import Backend.WorkQueue.WorkRequest;
import FrontEnd.NutritionistRole.NutritionistRequestJPanel;
import FrontEnd.MeditationCoachRole.RequestMeditationInstructorJPanel;
import FrontEnd.BeauticianRole.RequestSalonJPanel;
import FrontEnd.SpaTherapistRole.RequestSpaJPanel;
import FrontEnd.GymTrainerRole.RequestGymTrainerJPanel;
import FrontEnd.PilatesInstructorRole.RequestPilatesInstructorJPanel;
import FrontEnd.DietitionRole.DietitionRequestJPanel;
import FrontEnd.CounselorRole.RequestTherapistJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aashay
 */
public class CustomerLoginWorkAreaJPanel extends javax.swing.JPanel {


    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Network sourceNetwork;
    private Network targetNetwork;
    private User userAccount;
    
    public CustomerLoginWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system,User userAccount, Network sourceNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.sourceNetwork = sourceNetwork;
        populateNetworkComboBox();
        populateRequestTable(sourceNetwork);
    }
    
    private void populateNetworkComboBox() {
        networkComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            networkComboBox.addItem(network);
        }
    }
    
    public void populateRequestTable(Network sourceNetwork1){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof NutritionistWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((NutritionistWorkRequest) request).getDoctorAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof BeauticianWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((BeauticianWorkRequest) request).getSalonAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof SpaTherapyWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((SpaTherapyWorkRequest) request).getSpaAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof MeditationCoachWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((MedidationCoachWorkRequest) request).getHouseCleanAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof GymTrainerWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((GymTrainerWorkRequest) request).getApplianceRepairAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof PilatesInstructorWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((PilatesInstructorWorkRequest) request).getVehicleRepairAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof DietitionWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((DietitionWorkRequest) request).getDieticianAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof CounselorWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((CounselorWorkRequest) request).getVehicleCleaningAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        personal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status"
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
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 640, 130));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT NETWORK");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 30));

        networkComboBox.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Book Your Appointment");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 310, 60));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BEAUTY PARLOR SERVICE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 230, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HAIR SALON SERVICE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 40));

        personal.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        personal.setForeground(new java.awt.Color(51, 255, 153));
        personal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personal.setText("Grooming Enterprise");
        jPanel1.add(personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 210, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 280, 150));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MINDFULNESS SERVICE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, 40));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PSYCHOLOGIST SERVICE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, 40));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Spiritual Enterprise");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 210, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 290, 150));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("PHYSICIAN SERVICE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 40));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("NUTRITIONIST SERVICE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrontEnd/Customer/wp2131417-wellness-wallpapers.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 180, 1640, 590));

        jLabel2.setBackground(new java.awt.Color(51, 255, 153));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 153));
        jLabel2.setText("Medical Enterprise");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 30));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 280, 150));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CROSSFIT SERVICE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 220, 40));

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("ZUMBA SERVICE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 220, 40));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 153));
        jLabel3.setText("Physical Fitness Enterprise");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 240, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 290, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo-transparent-png (1).png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        if (sourceNetwork != null) {
            populateRequestTable(sourceNetwork);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestSalonJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestSpaJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestMeditationInstructorJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestTherapistJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new NutritionistRequestJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new DietitionRequestJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestGymTrainerJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestPilatesInstructorJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel personal;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
