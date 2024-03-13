/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WorkAreas.FacultyRole;

import UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp.*;
import javax.swing.JOptionPane;
import online.Business;
import online.UserAccounts.UserAccount;
import online.UserAccounts.UserAccountDirectory;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import online.CourseCatalog.CourseCatalog;
import online.CourseSchedule.CourseOffer;
import online.CourseSchedule.CourseSchedule;
import online.profiles.FacultyProfile;
import online.profiles.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class ViewEnrolledStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    FacultyProfile fp;
    StudentProfile selectedStudent;
    CourseOffer selectCourseOffer;

    public ViewEnrolledStudentJPanel(Business bz, FacultyProfile facultyProfile, JPanel jp) {
        CardSequencePanel = jp;
        fp = facultyProfile;
        this.business = bz;
        initComponents();
        refreshTable("Fall 2023");

    }

    public void refreshTable(String sem) {

        // clear supplier table
        int rc = UserAccountTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) UserAccountTable.getModel()).removeRow(i);
        }
        // dropSem.setSelectedItem("Fall 2023");
        CourseSchedule cs = business.getCourseSchedule(sem);
        if (cs == null) {
            JOptionPane.showMessageDialog(this, "No students found!");
            return;
        }
        for (CourseOffer co : cs.getCourseSchedule()) {
            if (fp.equals(co.getCourse().getFacultyProfile())) {
                for (StudentProfile sp : co.getStudents()) {
                    Object[] row = new Object[4];
                    row[0] = sp;
                    row[1] = sp.getPerson().getEmail();
                    row[2] = co;
                    row[3] = cs.getSemester();
                    ((DefaultTableModel) UserAccountTable.getModel()).addRow(row);
                }
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        btnGrade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserAccountTable = new javax.swing.JTable();
        dropSem = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        dropGrade = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(null);

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back);
        Back.setBounds(30, 300, 74, 23);

        btnGrade.setText("Grade student");
        btnGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeActionPerformed(evt);
            }
        });
        add(btnGrade);
        btnGrade.setBounds(440, 320, 110, 23);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Students");
        add(jLabel1);
        jLabel1.setBounds(30, 90, 190, 19);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("View Student Accounts");
        add(jLabel2);
        jLabel2.setBounds(21, 20, 550, 28);

        UserAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "StudentName", "Email", "Course", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        UserAccountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserAccountTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(UserAccountTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 550, 130);

        dropSem.setModel(new javax.swing.DefaultComboBoxModel<>(business.getSems()));
        add(dropSem);
        dropSem.setBounds(440, 50, 72, 22);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(250, 300, 72, 23);

        dropGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4","5" }));
        add(dropGrade);
        dropGrade.setBounds(440, 280, 110, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        // ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel,
        // "IdentifyEventTypes");

    }// GEN-LAST:event_BackActionPerformed

    private void btnGradeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGradeActionPerformed
        // TODO add your handling code here:
        if (selectedStudent == null || selectCourseOffer == null) {
            JOptionPane.showMessageDialog(this, "Please select a student!");
            return;
        }
        selectedStudent.getTranscript().gradeStudent(selectCourseOffer,
                Integer.valueOf(dropGrade.getSelectedItem().toString()));
        // AdminUserAccount mppd = new AdminUserAccount(selecteduseraccount,
        // CardSequencePanel);
        // CardSequencePanel.add(mppd);
        // ((java.awt.CardLayout)
        // CardSequencePanel.getLayout()).next(CardSequencePanel);

    }// GEN-LAST:event_btnGradeActionPerformed

    private void UserAccountTableMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_UserAccountTableMousePressed
        // Extracts the row (uaser account) in the table that is selected by the user
        int size = UserAccountTable.getRowCount();
        int selectedrow = UserAccountTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > size - 1) {
            return;
        }
        selectedStudent = (StudentProfile) UserAccountTable.getValueAt(selectedrow, 0);
        selectCourseOffer = (CourseOffer) UserAccountTable.getValueAt(selectedrow, 2);
        if (selectedStudent == null || selectCourseOffer == null) {
            return;
        }
        //
    }// GEN-LAST:event_UserAccountTableMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        refreshTable(dropSem.getSelectedItem().toString());
    }// GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable UserAccountTable;
    private javax.swing.JButton btnGrade;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> dropGrade;
    private javax.swing.JComboBox<String> dropSem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
