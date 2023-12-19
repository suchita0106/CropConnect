/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.localrestaurants;

import userinterface.FarmerRole.*;
import Business.EcoSystem;
import Business.Enterprise.BankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BankLoanWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sakshee
 */
public class LRRequestBankLoanJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public LRRequestBankLoanJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        nameJTextField.setText(userAccount.getUsername());
        valueLabel.setText(enterprise.getName());
        populateBankComboBox(); 
    }
    
     private void populateBankComboBox(){
        jComboBox1.removeAllItems();
         for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof BankEnterprise) {
                    jComboBox1.addItem(enterprise.getName());
                }
             }
        }
    }
     
     private boolean verifyEmailId(String email){
         Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        return b;
     }
     
      private boolean verifyPhoneNumber(String phone){
         Pattern p = Pattern.compile("[0-9]{10,10}");
        Matcher m = p.matcher(phone);
        boolean b = m.matches();
        return b;
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loanAmountJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agricultureLandAddJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        loanReasonJTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        emailIdJTextField = new javax.swing.JTextField();
        annualIncomeJTextField = new javax.swing.JTextField();
        panCardPathJTextField = new javax.swing.JTextField();
        valueOfAgricultureLandJTextField = new javax.swing.JTextField();
        landUploadjButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        phoneNoJTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        panUploadjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(245, 170, 122));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        requestTestJButton.setText("Request Loan");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, -1, -1));

        backJButton.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 0, 153));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 120, 30));

        jLabel2.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        nameJTextField.setEditable(false);
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 160, -1));

        jLabel3.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));
        add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 160, -1));

        jLabel4.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 160, -1));

        jLabel5.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Bank Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Loan Amount");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));
        add(loanAmountJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 160, -1));

        jLabel7.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Pan Card/ID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));
        add(agricultureLandAddJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 160, -1));

        jLabel8.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Reason for Loan");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));
        add(loanReasonJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 160, -1));

        jLabel9.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Annual Income");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Mortgage details:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("Proof of Assets");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("Email Id");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));
        add(emailIdJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 160, -1));
        add(annualIncomeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 160, -1));

        panCardPathJTextField.setEditable(false);
        add(panCardPathJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 160, -1));

        valueOfAgricultureLandJTextField.setEditable(false);
        add(valueOfAgricultureLandJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 160, -1));

        landUploadjButton.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        landUploadjButton.setText("Upload");
        landUploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landUploadjButtonActionPerformed(evt);
            }
        });
        add(landUploadjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, -1, -1));

        jLabel13.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText("Phone No.");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));
        add(phoneNoJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 160, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 160, -1));

        panUploadjButton1.setFont(new java.awt.Font("Heiti SC", 0, 14)); // NOI18N
        panUploadjButton1.setText("Upload");
        panUploadjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panUploadjButton1ActionPerformed(evt);
            }
        });
        add(panUploadjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, -1, -1));

        jLabel1.setFont(new java.awt.Font("Heiti SC", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Additional Comments");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, -1, -1));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        String address = addressJTextField.getText();
        String bankName = (String)jComboBox1.getSelectedItem();
        String loanResaon = loanReasonJTextField1.getText();
        String agricultureLandAdd = agricultureLandAddJTextField.getText();
        String emailId = emailIdJTextField.getText();
        String fn=panCardPathJTextField.getText();
        String agricultureLandValue = valueOfAgricultureLandJTextField.getText();
        String message = messageJTextField.getText();
        String name = nameJTextField.getText();
        if(loanResaon.equals("")||address.equals("")||bankName.equals("")||agricultureLandAdd.equals("")||emailId.equals(""))
        {
             JOptionPane.showMessageDialog(null, "EmailId, Address, agriculture Land Address, LoanReason  fields are mandatory");
            return;
        }
        int age=0;
        
        try{
               age = Integer.parseInt(ageJTextField.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for age");
                return;
            }
        
        int loanAmount = 0;
        try{
               loanAmount = Integer.parseInt(loanAmountJTextField.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for Loan Amount");
                return;
            }
        int annualIncome = 0;
        try{
               annualIncome = Integer.parseInt(annualIncomeJTextField.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for Annual Income");
                return;
            }
        if(!verifyEmailId(emailId)){
             JOptionPane.showMessageDialog(null,"Please enter proper email id","ERROR",JOptionPane.ERROR_MESSAGE);
             return;
        }
        long phoneNo=0;
        try{
               phoneNo = Long.parseLong(phoneNoJTextField1.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for Phone Number");
                return;
            }
        if(!verifyPhoneNumber(phoneNoJTextField1.getText())){
             JOptionPane.showMessageDialog(null,"Please enter proper phone number","ERROR",JOptionPane.ERROR_MESSAGE);
             return;
        } 
        
        BankLoanWorkRequest request = new BankLoanWorkRequest();
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setAge(age);
        request.setAddress(address);
        request.setBankName(bankName);
        request.setLoanAmount(loanAmount);
        request.setLoanResaon(loanResaon);
        request.setAnnualIncome(annualIncome);
        request.setAgricultureLandAdd(agricultureLandAdd);
        request.setEmailId(emailId);
        request.setPhoneNo(phoneNo);
        request.setMessage(message);
        request.setName(name);
        
        if(!fn.isEmpty())
        {
        if(fn.endsWith(".pdf")||fn.endsWith(".docx"))
        {
           request.setPancardPath(fn);
        }
         else
           JOptionPane.showMessageDialog(null,"Please upload the Id in PDF or docx format","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null,"Please upload the Id","ERROR",JOptionPane.ERROR_MESSAGE);
        
        if(!agricultureLandValue.isEmpty())
        {
        if(agricultureLandValue.endsWith(".pdf")||agricultureLandValue.endsWith(".docx"))
        {
           request.setAgricultureLandValue(agricultureLandValue);
        }
         else
           JOptionPane.showMessageDialog(null,"Please upload the proof in PDF or docx format","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog(null,"Please upload the Id","ERROR",JOptionPane.ERROR_MESSAGE);
        
        Organization org = null;
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise.getName().equalsIgnoreCase(bankName)){
                if (enterprise instanceof BankEnterprise) {
                            org = enterprise;
                            //                            System.out.println("orgname" + organization.getName());
                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            break;
                       
                }

            }}
        }
         JOptionPane.showMessageDialog(null,"Successfully applied for loan","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LRestaurantsWorkAreaJPanel dwjp = (LRestaurantsWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void landUploadjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landUploadjButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser jc=new JFileChooser();
        jc.showOpenDialog(null);
        File f=jc.getSelectedFile();
        String filename=f.getAbsolutePath();
        valueOfAgricultureLandJTextField.setText(filename);
    }//GEN-LAST:event_landUploadjButtonActionPerformed

    private void panUploadjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panUploadjButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jc=new JFileChooser();
        jc.showOpenDialog(null);
        File f=jc.getSelectedFile();
        String filename=f.getAbsolutePath();
        panCardPathJTextField.setText(filename);
    }//GEN-LAST:event_panUploadjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JTextField agricultureLandAddJTextField;
    private javax.swing.JTextField annualIncomeJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton landUploadjButton;
    private javax.swing.JTextField loanAmountJTextField;
    private javax.swing.JTextField loanReasonJTextField1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField panCardPathJTextField;
    private javax.swing.JButton panUploadjButton1;
    private javax.swing.JTextField phoneNoJTextField1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTextField valueOfAgricultureLandJTextField;
    // End of variables declaration//GEN-END:variables
}
