/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistamenu;

import controlador.ActorDAO;
import controlador.F_ADAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistamenu.FilmMenu.rs;
import static vistamenu.FilmsA_Menu.rs;

/**
 *
 * @author Miguel
 */
public class Film_Actor extends javax.swing.JFrame {
    int cont;
    Connection con;
    CallableStatement cs;
    static ResultSet rs;
    /**
     * Creates new form Film_Actor
     */
    public Film_Actor() {
        initComponents();
        cargarActor();
        cargarfil2();
        cargarAF();
        this.setLocationRelativeTo(null);
        txtNA.setEditable(false);
        txtNF.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdA = new javax.swing.JTextField();
        txtNA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdF = new javax.swing.JTextField();
        txtNF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblF = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtb2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblA = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtb1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAF = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID_ACTOR:");

        txtIdA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdAKeyTyped(evt);
            }
        });

        txtNA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNAActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE_ACTOR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtIdA, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(txtNA)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID_FILM:");

        txtIdF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdFKeyTyped(evt);
            }
        });

        txtNF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TÍTULO_FILM:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(txtIdF, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addComponent(txtNF)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, 160));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 410, 230));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS_FILMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setOpaque(false);

        tblF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_FILM", "TÍTULO_FILM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblF);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BUSCAR:");

        txtb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtb2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtb2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 350, 240));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS_ACTOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setOpaque(false);

        tblA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_ACTOR", "NOMBRE_ACTOR"
            }
        ));
        tblA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblA);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BUSCAR:");

        txtb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtb1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtb1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 370, 240));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILM_ACTOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        tblAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Actor_ID", "Film_ID"
            }
        ));
        tblAF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAFMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAF);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 310, 230));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setOpaque(false);

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
        jButton2.setText("ELIMINAR");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REGRESAR");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/actorefond.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNAActionPerformed

    private void tblAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAMouseClicked
        // TODO add your handling code here:
        int select = tblA.rowAtPoint(evt.getPoint());   
        txtIdA.setText(String.valueOf(tblA.getValueAt(select,0)));
        txtNA.setText(String.valueOf(tblA.getValueAt(select,1)));
    }//GEN-LAST:event_tblAMouseClicked

    private void tblFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFMouseClicked
        // TODO add your handling code here:
        int select = tblF.rowAtPoint(evt.getPoint());   
        txtIdF.setText(String.valueOf(tblF.getValueAt(select,0)));
        txtNF.setText(String.valueOf(tblF.getValueAt(select,1)));
    }//GEN-LAST:event_tblFMouseClicked

    private void tblAFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAFMouseClicked
        // TODO add your handling code here:
        int select = tblAF.rowAtPoint(evt.getPoint());   
        txtIdA.setText(String.valueOf(tblAF.getValueAt(select,0)));
        txtIdF.setText(String.valueOf(tblAF.getValueAt(select,1)));
    }//GEN-LAST:event_tblAFMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       if(txtIdA.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese ID_Actor", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (txtIdF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese ID_Film", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtIdA.getText().equals("") || txtIdF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese los datos Cprrectamente", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
           try {
            rs =conexion.ConexionBD.Consulta("SELECT COUNT(*) FROM f_a WHERE actor_id= '"+ txtIdA.getText()+ "' AND film_id= '"+ txtIdF.getText()+ "'");
            try {
                while(rs.next()){
                    cont = rs.getInt(1);
                }
                    
            } catch (SQLException e) {
            }
            if(cont >= 1){
                JOptionPane.showMessageDialog(this, "Relacion ACTOR_FILM YA REGISTRADA, INTENTE DE NUEVO","Informacion",JOptionPane.INFORMATION_MESSAGE);
            } else{
              F_ADAO.EntradaAF(Integer.parseInt(txtIdA.getText()),Integer.parseInt(txtIdF.getText()));
                
                JOptionPane.showMessageDialog(this, "LOS DATOS SE REGISTRARON CORRECTAMENTE");
                txtIdA.setText("");
                txtIdF.setText("");
                txtNA.setText("");
                txtNF.setText("");
                txtNA.setEditable(false);
                txtNF.setEditable(false);
               
            }
        } catch (SQLException e) {
        }
       }
          
       cargarAF();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(txtIdA.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese ID_Actor", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (txtIdF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese ID_Film", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtIdA.getText().equals("") || txtIdF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Seleccione Registro de la tabla FILM_ACTOR PARA ELIMINAR", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
            rs =conexion.ConexionBD.Consulta("SELECT COUNT(*) FROM f_a WHERE actor_id= '"+ txtIdA.getText()+ "' AND film_id= '"+ txtIdF.getText()+ "'");
            try {
                while(rs.next()){
                    cont = rs.getInt(1);
                }
                    
            } catch (SQLException e) {
            }
            if(cont == 0){
                JOptionPane.showMessageDialog(this, "Relacion ACTOR_FILM NO EXISTENTE, INTENTE DE NUEVO","Informacion",JOptionPane.INFORMATION_MESSAGE);
            } else{
              F_ADAO.EliminarAF(Integer.parseInt(txtIdA.getText()),Integer.parseInt(txtIdF.getText()));
                
                JOptionPane.showMessageDialog(this, "LOS DATOS SE ELIMINARON CORRECTAMENTE");
                txtIdA.setText("");
                txtIdF.setText("");
                txtNA.setText("");
                txtNF.setText("");
                txtNA.setEditable(false);
                txtNF.setEditable(false);
               
            }
        } catch (SQLException e) {
        }
        }
       cargarAF();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal lo = new MenuPrincipal(); 
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtb1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb1KeyReleased
cargarActor();        // TODO add your handling code here:
    }//GEN-LAST:event_txtb1KeyReleased

    private void txtb2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtb2KeyReleased
cargarfil2();        // TODO add your handling code here:
    }//GEN-LAST:event_txtb2KeyReleased

    private void txtIdAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAKeyTyped
        // TODO add your handling code here:
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            getToolkit().beep(); 
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros","Aviso",JOptionPane.INFORMATION_MESSAGE);
      
        }//letras
    }//GEN-LAST:event_txtIdAKeyTyped

    private void txtIdFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdFKeyTyped
        // TODO add your handling code here:
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            getToolkit().beep(); 
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros","Aviso",JOptionPane.INFORMATION_MESSAGE);
      
        }//letras
    }//GEN-LAST:event_txtIdFKeyTyped

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
            java.util.logging.Logger.getLogger(Film_Actor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Film_Actor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Film_Actor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Film_Actor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Film_Actor().setVisible(true);
            }
        });
    }
    public void cargarActor(){
        DefaultTableModel modelo = (DefaultTableModel) tblA.getModel();
        modelo.setRowCount(0);
        rs = conexion.ConexionBD.Consulta("SELECT actor_id, actor_name  FROM actor WHERE actor_name LIKE'"+txtb1.getText()+"%'");
        try {
            while (rs.next()){
                Vector v= new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
 
                modelo.addRow(v);
                tblA.setModel(modelo);
                
            }
        } catch (SQLException e) {
            
        }
    }
    public void cargarfil2(){
        DefaultTableModel modelo = (DefaultTableModel) tblF.getModel();
        modelo.setRowCount(0);
        rs = conexion.ConexionBD.Consulta("SELECT film_id, title  FROM film2 WHERE title LIKE'"+txtb2.getText()+"%'");
        try {
            while (rs.next()){
                Vector v= new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
 
                modelo.addRow(v);
                tblF.setModel(modelo);
                
            }
        } catch (SQLException e) {
            
        }
    }
    public void cargarAF(){
        DefaultTableModel modelo = (DefaultTableModel) tblAF.getModel();
        modelo.setRowCount(0);
        rs = conexion.ConexionBD.Consulta("SELECT *  FROM f_a");
        try {
            while (rs.next()){
                Vector v= new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getInt(2));
 
                modelo.addRow(v);
                tblAF.setModel(modelo);
                
            }
        } catch (SQLException e) {
            
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblA;
    private javax.swing.JTable tblAF;
    private javax.swing.JTable tblF;
    private javax.swing.JTextField txtIdA;
    private javax.swing.JTextField txtIdF;
    private javax.swing.JTextField txtNA;
    private javax.swing.JTextField txtNF;
    private javax.swing.JTextField txtb1;
    private javax.swing.JTextField txtb2;
    // End of variables declaration//GEN-END:variables
}
