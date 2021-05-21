/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistamenu;

import controlador.ActorDAO;
import controlador.FilmDAO;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Actor;
import modelo.Film;
import static vistamenu.FilmMenu.rs;

/**
 *
 * @author Miguel
 */
public class ActorMenu extends javax.swing.JFrame {
  int cont;
    /**
     * Creates new form ActorMenu
     */
    public ActorMenu() {
        initComponents();
        cargarActor();
        this.setLocationRelativeTo(null);
        txtID.setEditable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtAp = new javax.swing.JTextField();
        bnt1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Actor:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 53, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 91, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 129, -1, -1));

        txtNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, -1));

        txtID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, -1));

        txtAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApActionPerformed(evt);
            }
        });
        jPanel1.add(txtAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, -1));

        bnt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt1.setForeground(new java.awt.Color(255, 255, 255));
        bnt1.setText("GUARDAR");
        bnt1.setOpaque(false);
        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 183, -1, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ELIMINAR");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MODIFICAR");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 280, 310));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REGRESAR");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 120, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTORES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblActor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido"
            }
        ));
        tblActor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActorMouseClicked(evt);
            }
        });
        tblActor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblActorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblActor);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 155));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBKeyReleased(evt);
            }
        });
        jPanel2.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 176, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 520, 280));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/actorefond.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        if(txtNom.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESA CAMPO NOMBRE", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtAp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESA CAMPO APELLIDO", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtNom.getText().equals("") ||txtAp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese los datos Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
   
        } else {
        try {
            rs =conexion.ConexionBD.Consulta("SELECT COUNT(actor_name) FROM actor WHERE actor_name= '"+ txtNom.getText()+ "'");
            try {
                while(rs.next()){
                    cont = rs.getInt(1);
                }
                    
            } catch (SQLException e) {
            }
            if(cont >= 1){
                JOptionPane.showMessageDialog(this, "Actor YA REGISTRADO EN LA BD","Informacion",JOptionPane.INFORMATION_MESSAGE);
            } else{
               ActorDAO.EntradaActor(txtNom.getText(),txtAp.getText());
                
                JOptionPane.showMessageDialog(this, "LOS DATOS SE REGISTRARON CORRECTAMENTE");
               
            }
        } catch (SQLException e) {
        }
       }
            
            
        
        
        cargarActor();
    }//GEN-LAST:event_bnt1ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "SELECCIONE REGISTRO DE LA TABLA PARA ELIMINAR", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        int row = Integer.parseInt(txtID.getText());
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea Eliminar De forma Permanente Este Registro?","Pregunta",JOptionPane.YES_NO_CANCEL_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            try {
            // TODO add your handling code here:
            ActorDAO.EliminarActor(Integer.parseInt(txtID.getText()));
            JOptionPane.showMessageDialog(this, "Regiatro eliminado Correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
             txtID.setText("");
             txtNom.setText("");
             txtAp.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(ActorMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
       
        
        cargarActor();
                         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(txtNom.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESA CAMPO NOMBRE", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtAp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "INGRESA CAMPO APELLIDO", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtID.getText().isEmpty() ||txtNom.getText().equals("") ||txtAp.getText().equals("")){
            JOptionPane.showMessageDialog(getParent(), " SELECCIONE REGISTRO DE LA TABLA PARA MODIFICAR", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }else {
                int opcion = JOptionPane.showConfirmDialog(null, "¿DESEA MODIFICAR EL REGISTRO?", "AVISO", JOptionPane.WARNING_MESSAGE);
		if(opcion == JOptionPane.YES_OPTION){
                    try {
                        boolean res = new ActorDAO().modificarActor(new  Actor(Integer.parseInt(txtID.getText()), 
                                txtNom.getText(), txtAp.getText()));
                        JOptionPane.showMessageDialog(getParent(), "SE modifico  CORRECTAMENTE", "¡ÉXITO!", JOptionPane.INFORMATION_MESSAGE);
         
                txtID.setText("");
                txtNom.setText("");
                txtAp.setText("");
               
        } catch (Exception e) {
                    }
                }
        }
       
        cargarActor();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblActorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblActorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActorKeyPressed

    private void tblActorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActorMouseClicked
        // TODO add your handling code here:
        int select = tblActor.rowAtPoint(evt.getPoint());   
        txtID.setText(String.valueOf(tblActor.getValueAt(select,0)));
        txtNom.setText(String.valueOf(tblActor.getValueAt(select,1)));
        txtAp.setText(String.valueOf(tblActor.getValueAt(select, 2)));
    }//GEN-LAST:event_tblActorMouseClicked

    private void txtBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyReleased
        // TODO add your handling code here:
        cargarActor();
    }//GEN-LAST:event_txtBKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal lo = new MenuPrincipal(); 
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActorMenu().setVisible(true);
            }
        });
    }
public void cargarActor(){
        DefaultTableModel modelo = (DefaultTableModel) tblActor.getModel();
        modelo.setRowCount(0);
        rs = conexion.ConexionBD.Consulta("SELECT * FROM actor WHERE actor_name LIKE '"+txtB.getText()+"%' "
                + "OR  actor_last_name LIKE '"+txtB.getText()+"%'");
        try {
            while (rs.next()){
                Vector v= new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                modelo.addRow(v);
                tblActor.setModel(modelo); 
            }
        } catch (SQLException e) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblActor;
    private javax.swing.JTextField txtAp;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
