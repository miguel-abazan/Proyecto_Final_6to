/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistamenu;

import conexion.ConexionBD;
import controlador.Film2DAO;
import controlador.FilmDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Film;
import modelo.Film2;
import static vistamenu.FilmMenu.rs;

/**
 *
 * @author Miguel
 */
public class FilmsA_Menu extends javax.swing.JFrame {
    Connection con;
    CallableStatement cs;
    static ResultSet rs;
    int cont;

    /**
     * Creates new form FilmsA_Menu
     */
    public FilmsA_Menu() {
        initComponents();
        cargarFilms2();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        txtID1.setEditable(false);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFilms2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtBs = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        txtTit1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtD1 = new javax.swing.JTextArea();
        cal1 = new com.toedter.calendar.JDateChooser();
        cmbl = new javax.swing.JComboBox<>();
        cmblo = new javax.swing.JComboBox<>();
        txtDA = new javax.swing.JTextField();
        txtDu1 = new javax.swing.JTextField();
        txtCE = new javax.swing.JTextField();
        cmbCla = new javax.swing.JComboBox<>();
        cmbSF = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPA1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        tblFilms2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Descripción", "Fecha_Estreno", "Idioma", "Idioma_original", "Días_Aquiler", "Costp_Alquiler", "Duración", "Costo_Extravío", "Clasificación", "Contenido_Extra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFilms2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFilms2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFilms2);
        if (tblFilms2.getColumnModel().getColumnCount() > 0) {
            tblFilms2.getColumnModel().getColumn(1).setResizable(false);
            tblFilms2.getColumnModel().getColumn(2).setResizable(false);
            tblFilms2.getColumnModel().getColumn(3).setResizable(false);
            tblFilms2.getColumnModel().getColumn(4).setResizable(false);
            tblFilms2.getColumnModel().getColumn(5).setResizable(false);
            tblFilms2.getColumnModel().getColumn(6).setResizable(false);
            tblFilms2.getColumnModel().getColumn(7).setResizable(false);
            tblFilms2.getColumnModel().getColumn(8).setResizable(false);
            tblFilms2.getColumnModel().getColumn(9).setResizable(false);
            tblFilms2.getColumnModel().getColumn(10).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BUSCAR:");

        txtBs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBsKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtBs, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 690, 480));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID_FILM:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TÍTULO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESCRIPCIÓN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA_ESTRENO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IDIOMA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IDIOMA_ORIGINAL:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DURACIÓN:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRECIO_ALQUILER:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COSTO_EXTRAVÍO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CLASIFICACIÓN:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        txtID1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 74, -1));

        txtTit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTit1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 242, -1));

        txtD1.setColumns(20);
        txtD1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtD1.setRows(5);
        jScrollPane1.setViewportView(txtD1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 242, 110));

        cal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(cal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, -1));

        cmbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Idioma...", "English", "Italian", "Japanese", "Mandarin", "French", "German" }));
        jPanel1.add(cmbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 214, -1));

        cmblo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmblo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Idioma...", "English", "Italian", "Japanese", "Mandarin", "French", "German" }));
        jPanel1.add(cmblo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 210, -1));

        txtDA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDAKeyTyped(evt);
            }
        });
        jPanel1.add(txtDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 110, -1));

        txtDu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDu1ActionPerformed(evt);
            }
        });
        txtDu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDu1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 108, -1));

        txtCE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEKeyTyped(evt);
            }
        });
        jPanel1.add(txtCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 123, -1));

        cmbCla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbCla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "G", "PG", "PG-13", "R", "NC-17" }));
        cmbCla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCla, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 180, -1));

        cmbSF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbSF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Commentaries", "Trailers", "Behind the Scenes", "Deleted Scenes", "Commentaries,Trailers", "Commentaries,Behind the Scenes", "Commentaries,Deleted Scenes", "Commentaries,Trailers,Behind the Scenes", "Commentaries,Trailers,Deleted Scenes", "Commentaries,Trailers,Behind the Scenes,Deleted Scenes", "Trailers,Behind the Scenes", "Trailers,Deleted Scenes", "Trailers,Behind the Scenes,Deleted Scenes", "'Behind the Scenes,Deleted Scenes" }));
        jPanel1.add(cmbSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 180, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CONTENIDO_ESPECIAL:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DÍAS_AQUILER:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txtPA1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPA1ActionPerformed(evt);
            }
        });
        txtPA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPA1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPA1KeyTyped(evt);
            }
        });
        jPanel1.add(txtPA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 108, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 35, 430, 610));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("MODIFICAR");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ELIMINAR");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 440, 100));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REGRESAR");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 140, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fond2.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID1ActionPerformed

    private void txtTit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTit1ActionPerformed

    private void cmbClaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClaActionPerformed

    private void txtDu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDu1ActionPerformed

    private void txtPA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPA1ActionPerformed

    private void tblFilms2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilms2MouseClicked
        // TODO add your handling code here:
         int select = tblFilms2.rowAtPoint(evt.getPoint());   
        txtID1.setText(String.valueOf(tblFilms2.getValueAt(select,0)));
        txtTit1.setText(String.valueOf(tblFilms2.getValueAt(select,1)));
        txtD1.setText(String.valueOf(tblFilms2.getValueAt(select, 2)));
        cal1.setDate((java.util.Date) tblFilms2.getValueAt(select, 3));
        cmbl.setSelectedItem(tblFilms2.getValueAt(select, 4));
        cmblo.setSelectedItem(tblFilms2.getValueAt(select, 5));
        txtDA.setText(String.valueOf(tblFilms2.getValueAt(select,6)));
        txtPA1.setText(String.valueOf(tblFilms2.getValueAt(select,7)));
        txtDu1.setText(String.valueOf(tblFilms2.getValueAt(select,8)));
        txtCE.setText(String.valueOf(tblFilms2.getValueAt(select,9)));
        cmbCla.setSelectedItem(tblFilms2.getValueAt(select, 10));
        cmbSF.setSelectedItem(tblFilms2.getValueAt(select, 11));
        cal1.setEnabled(false);
        
    }//GEN-LAST:event_tblFilms2MouseClicked

    private void txtBsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBsKeyReleased
        // TODO add your handling code here:
        cargarFilms2();
    }//GEN-LAST:event_txtBsKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtTit1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO TÍTULO", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtD1.getText().equals("")){
             JOptionPane.showMessageDialog(this, "INGRESE CAMPO DESCRIPCIÓN", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(cmbl.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO IDIOMA", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(cal1.getDate()==null){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO FECHA", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(cmblo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO IDIOMA ORIGINAL", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtDA.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO DÍAS ALQUILER", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtPA1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO PRECIO ALQUILER", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtDu1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO DURACIÓN", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtCE.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO COSTO EXTRAVÍO", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(cmbCla.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO CLASIFICACIÓN", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(cmbSF.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "INGRESE CAMPO CONTENIDO ESPECIAL ", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtTit1.getText().isEmpty()||txtD1.getText().equals("") || cmbl.getSelectedIndex()==0 || cmblo.getSelectedIndex()==0 || txtDA.getText().equals("")
                || txtPA1.getText().equals("")|| txtDu1.getText().equals("")|| txtCE.getText().equals("")
                || cmbCla.getSelectedIndex()==0 || cmbSF.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Ingrese los datos Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
            rs =conexion.ConexionBD.Consulta("SELECT COUNT(title) FROM film2 WHERE title= '"+ txtTit1.getText()+ "'");
            try {
                while(rs.next()){
                    cont = rs.getInt(1);
                }
                    
            } catch (SQLException e) {
            }
            if(cont >= 1){
                JOptionPane.showMessageDialog(this, "Esta Pelicula Ya esta en La BASE DE DATOS","Informacion",JOptionPane.INFORMATION_MESSAGE);
            } else{
                ConexionBD cc= new ConexionBD();
                Connection cn = cc.getConnection();
                try {
                    PreparedStatement pst = cn.prepareStatement("INSERT INTO film2(title,description,release_year,language_name, "
                            + "original_language_name,rental_duration,rental_rate,length,"
                            + "remplacement_cost,rating,s_f) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
                    pst.setString(1, txtTit1.getText());
                    pst.setString(2, txtD1.getText());
                    pst.setDate(3, new java.sql.Date(cal1.getDate().getTime()));
                    pst.setString(4,String.valueOf(cmbl.getSelectedItem()));
                    pst.setString(5,String.valueOf(cmblo.getSelectedItem()));
                    pst.setInt(6, Integer.parseInt(txtDA.getText()));
                    pst.setDouble(7, Double.parseDouble(txtPA1.getText()));
                    pst.setInt(8, Integer.parseInt(txtDu1.getText()));
                    pst.setDouble(9, Double.parseDouble(txtCE.getText()));
                    pst.setString(10,String.valueOf(cmbCla.getSelectedItem()));
                    pst.setString(11,String.valueOf(cmbSF.getSelectedItem()));
                    
                    pst.executeUpdate();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(FilmMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "LOS DATOS SE REGISTRARON CORRECTAMENTE");
                txtID1.setText("");
                txtTit1.setText("");
                txtD1.setText("");
                cmbl.setSelectedIndex(0);
                cmblo.setSelectedIndex(0);
                txtDA.setText("");
                txtPA1.setText("");
                txtDu1.setText("");
                txtCE.setText("");
                cmbCla.setSelectedIndex(0);
                cmbSF.setSelectedIndex(0);
                
            }
       }
        cargarFilms2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(txtTit1.getText().isEmpty()||txtD1.getText().equals("") || cmbl.getSelectedIndex()==0 || cmblo.getSelectedIndex()==0 || txtDA.getText().equals("")
                || txtPA1.getText().equals("")|| txtDu1.getText().equals("")|| txtCE.getText().equals("")
                || cmbCla.getSelectedIndex()==0 || cmbSF.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(getParent(), " SELECCIONE REGISTRO DE LA TABLA PARA MODIFICAR", "AVISO", JOptionPane.INFORMATION_MESSAGE);				 
        }else {
           
                int opcion = JOptionPane.showConfirmDialog(null, "¿DESEA MODIFICAR EL REGISTRO?", "AVISO", JOptionPane.WARNING_MESSAGE);
		if(opcion == JOptionPane.YES_OPTION){
                    
                      try {
                        boolean res = new Film2DAO().modificarfilm(new  Film2(Integer.parseInt(txtID1.getText()), txtTit1.getText(), txtD1.getText(), new java.sql.Date(cal1.getDate().getTime()), 
                                String.valueOf(cmbl.getSelectedItem()), String.valueOf(cmblo.getSelectedItem()), Integer.parseInt(txtDA.getText()), 
                                Double.parseDouble(txtPA1.getText()), Integer.parseInt(txtDu1.getText()),Double.parseDouble(txtCE.getText()), String.valueOf(cmbCla.getSelectedItem()), 
                                String.valueOf(cmbSF.getSelectedItem())));
                        JOptionPane.showMessageDialog(getParent(), "SE modifico  CORRECTAMENTE", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);
                cal1.setEnabled(true);
                txtID1.setText("");
                txtTit1.setText("");
                txtD1.setText("");
                cmbl.setSelectedIndex(0);
                cmblo.setSelectedIndex(0);
                txtDA.setText("");
                txtPA1.setText("");
                txtDu1.setText("");
                txtCE.setText("");
                cmbCla.setSelectedIndex(0);
                cmbSF.setSelectedIndex(0);
        } catch (Exception e) {
                    }
        
                    }
      
                   
            }
        cargarFilms2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(txtID1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Seleccione Registro DE LA TABLA PARA eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        int row = Integer.parseInt(txtID1.getText());
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea Eliminar De forma Permanente Este Registro?","Pregunta",JOptionPane.YES_NO_CANCEL_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            try {
               Film2DAO.EliminarPelis(row);
               txtID1.setText("");
                txtTit1.setText("");
                txtD1.setText("");
                cmbl.setSelectedIndex(0);
                cmblo.setSelectedIndex(0);
                txtDA.setText("");
                txtPA1.setText("");
                txtDu1.setText("");
                txtCE.setText("");
                cmbCla.setSelectedIndex(0);
                cmbSF.setSelectedIndex(0);
                cal1.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Registro eliminado Correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
            }
        }
        }
        cargarFilms2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal lo = new MenuPrincipal(); 
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtPA1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPA1KeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtPA1KeyReleased

    private void txtPA1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPA1KeyTyped
        // TODO add your handling code here:
          
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            getToolkit().beep(); 
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros","Aviso",JOptionPane.INFORMATION_MESSAGE);
      
        }//letras
    }//GEN-LAST:event_txtPA1KeyTyped

    private void txtDAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDAKeyTyped
        // TODO add your handling code here:
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            getToolkit().beep(); 
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros","Aviso",JOptionPane.INFORMATION_MESSAGE);
      
        }//letras
    }//GEN-LAST:event_txtDAKeyTyped

    private void txtDu1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDu1KeyTyped
        // TODO add your handling code here:
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            getToolkit().beep(); 
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros","Aviso",JOptionPane.INFORMATION_MESSAGE);
      
        }//letras
    }//GEN-LAST:event_txtDu1KeyTyped

    private void txtCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEKeyTyped
        // TODO add your handling code here:
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            getToolkit().beep(); 
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros","Aviso",JOptionPane.INFORMATION_MESSAGE);
      
        }//letras
    }//GEN-LAST:event_txtCEKeyTyped
public void cargarFilms2(){
        DefaultTableModel modelo = (DefaultTableModel) tblFilms2.getModel();
        modelo.setRowCount(0);
        rs = conexion.ConexionBD.Consulta("SELECT * FROM film2 WHERE title LIKE '"+txtBs.getText()+"%' "
                + "OR language_name LIKE '"+txtBs.getText()+"%'"
                + "OR rating LIKE '"+txtBs.getText()+"%'");
        try {
            while (rs.next()){
                Vector v= new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getDate(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getInt(7));
                v.add(rs.getDouble(8));
                v.add(rs.getInt(9));
                v.add(rs.getDouble(10));
                v.add(rs.getString(11));
                v.add(rs.getString(12));
               
                modelo.addRow(v);
                tblFilms2.setModel(modelo);
                
            }
        } catch (SQLException e) {
            
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
            java.util.logging.Logger.getLogger(FilmsA_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmsA_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmsA_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmsA_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmsA_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser cal1;
    private javax.swing.JComboBox<String> cmbCla;
    private javax.swing.JComboBox<String> cmbSF;
    private javax.swing.JComboBox<String> cmbl;
    private javax.swing.JComboBox<String> cmblo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFilms2;
    private javax.swing.JTextField txtBs;
    private javax.swing.JTextField txtCE;
    private javax.swing.JTextArea txtD1;
    private javax.swing.JTextField txtDA;
    private javax.swing.JTextField txtDu1;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtPA1;
    private javax.swing.JTextField txtTit1;
    // End of variables declaration//GEN-END:variables
}
