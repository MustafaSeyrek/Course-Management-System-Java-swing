/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mustafa
 */
public class teacherStreamForm extends javax.swing.JFrame {

    /**
     * Creates new form teacherStreamForm
     */
    baglanti b = new baglanti();
    Queue q = new Queue(100);//abstract data type 
    int tid; //öğretmen id
    String ogretmenInfo;// ogretmen ad soyad
    int courseid; //ders id
    String courseName; //ders adı
    int postid;//post id

    public teacherStreamForm() {
        initComponents();
        addIcons();
        comboCourse.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnList = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboCourse = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaExp = new javax.swing.JTextArea();
        btnSeeComments = new javax.swing.JButton();
        lblIconList = new javax.swing.JLabel();
        lblIconAdd = new javax.swing.JLabel();
        lblIconUpdate = new javax.swing.JLabel();
        lblIconDelete = new javax.swing.JLabel();
        lblIconSee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher Stream");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btnList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnList.setForeground(new java.awt.Color(255, 0, 0));
        btnList.setText("List ");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Title", "Course id", "Course Name", "Explanation", "Teacher id", "Teacher ", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Course :");

        comboCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Title :");

        jLabel3.setText("Explanation :");

        txtAreaExp.setColumns(20);
        txtAreaExp.setRows(5);
        jScrollPane2.setViewportView(txtAreaExp);

        btnSeeComments.setForeground(new java.awt.Color(0, 51, 255));
        btnSeeComments.setText("See comments");
        btnSeeComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeCommentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblIconList, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTitle))
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(lblIconAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(lblIconUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addComponent(lblIconDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblIconSee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSeeComments, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconList, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblIconDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeeComments)
                    .addComponent(lblIconSee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addIcons() {
        lblIconList.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list.png")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        lblIconAdd.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        lblIconUpdate.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.jpg")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        lblIconDelete.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.jpg")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        lblIconSee.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/see.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));

    }
    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        comboCourse.removeAllItems();
        comboCourse.addItem("");
        fillComboCourse();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            String sorgu = "select * from post where ogretmenid = '" + tid + "'";
            DefaultTableModel tm = new DefaultTableModel();
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();

            String[] columns = {"id", "Title", "Course id", "Course Name", "Explanation", "Teacher id", "Teacher", "Date"};
            for (int i = 0; i < 8; i++) {
                tm.addColumn(columns[i]);
            }
            while (rs.next()) {
                Object[] row = new Object[8];
                for (int i = 1; i <= 8; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                tm.addRow(row);
            }
            jTable1.setModel(tm);
            con.close();
            txtTitle.setText("");
            txtAreaExp.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_btnListActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            String sorgu = "insert into post(baslik,dersId,dersAd,aciklama,ogretmenid,ogretmenAdSoyad,tarih) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sorgu);
            findCourseID(); //course id bulma           
            if (!(comboCourse.getSelectedItem().equals("")) && !(txtTitle.getText().equals("")) && !(txtAreaExp.getText().equals(""))) {
                pst.setString(1, txtTitle.getText());
                pst.setInt(2, courseid);
                pst.setString(3, courseName);
                pst.setString(4, txtAreaExp.getText());
                pst.setInt(5, tid);
                pst.setString(6, ogretmenInfo);
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date time = new Date();
                pst.setString(7, formatter.format(time));
                pst.execute();
            }
            con.close();
            btnListActionPerformed(evt);
            txtTitle.setText("");
            txtAreaExp.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            findCourseID();
            if (!(comboCourse.getSelectedItem().equals("")) && !(txtTitle.getText().equals("")) && !(txtAreaExp.getText().equals(""))) {
                String sorgu = "update post set baslik=?,dersId=?,dersAd=?,aciklama=? where idpost = ?";
                PreparedStatement pst = con.prepareStatement(sorgu);
                pst.setString(1, txtTitle.getText());
                pst.setInt(2, courseid);
                pst.setString(3, courseName);
                pst.setString(4, txtAreaExp.getText());
                pst.setInt(5, postid);
                pst.execute();
            }
            con.close();
            btnListActionPerformed(evt);
            txtTitle.setText("");
            txtAreaExp.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            String sorgu = "delete from post where idpost = ?";
            PreparedStatement pst = con.prepareStatement(sorgu);
            pst.setInt(1, postid);
            pst.execute();
            con.close();
            btnListActionPerformed(evt);
            txtTitle.setText("");
            txtAreaExp.setText("");
            postid = -1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    HashMap<Integer, String> idAndTitle = new HashMap<Integer, String>(); //hash map kullanımı

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        idAndTitle.put(Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0))), String.valueOf(jTable1.getValueAt(row, 1))); //hash elema ekleme
        txtAreaExp.setText(String.valueOf(jTable1.getValueAt(row, 4)));
        for (Integer i : idAndTitle.keySet()) { //hash içinden verileri çekme
            postid = i;
            txtTitle.setText(idAndTitle.get(i));
        }
        idAndTitle.clear();
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1KeyPressed

    private void btnSeeCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeCommentsActionPerformed
        // TODO add your handling code here:
        teachercommentsForm tcom = new teachercommentsForm();
        tcom.postid = postid;//post id 
        tcom.yorumcuBilgi = ogretmenInfo; //yorumu yapan bilgiler
        tcom.yorumcuid = tid; //yorumu yapan id
        tcom.setVisible(true);
    }//GEN-LAST:event_btnSeeCommentsActionPerformed

    //combodan seçilen dersin id bulma
    public void findCourseID() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            Object obj = comboCourse.getSelectedItem();
            courseName = String.valueOf(obj);
            String sorgu = "select idders from ders where ad='" + courseName + "'";
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                courseid = rs.getInt("idders");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //combobaxa eleman ekleme
    private void fillComboCourse() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            String sorgu = "select idders,ad from ders where idogretmen='" + tid + "'";
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                courseid = rs.getInt("idders");
                courseName = rs.getString("ad");
                q.enqueue(courseName); //queue içine eleman ekleme                
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        while (!q.isEmpty()) {
            comboCourse.addItem((String) q.dequeue()); //comboboxa elemanları queuedan alma
        }
    }

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
            java.util.logging.Logger.getLogger(teacherStreamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherStreamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherStreamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherStreamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherStreamForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnSeeComments;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIconAdd;
    private javax.swing.JLabel lblIconDelete;
    private javax.swing.JLabel lblIconList;
    private javax.swing.JLabel lblIconSee;
    private javax.swing.JLabel lblIconUpdate;
    private javax.swing.JTextArea txtAreaExp;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}