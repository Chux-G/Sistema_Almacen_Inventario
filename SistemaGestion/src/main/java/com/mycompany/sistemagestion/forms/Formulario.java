/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemagestion.forms;

import java.sql.*;
import com.mycompany.sistemagestion.models.Cliente;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_clientes = new javax.swing.JList<>();
        btn_eliminar = new javax.swing.JButton();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nombre.setText("NOMBRE:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(list_clientes);

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        lbl_apellido.setText("APELLIDO:");

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        lbl_email.setText("TELEFONO:");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        lbl_telefono.setText("EMAIL:");

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_codigo.setText("CODIGO:");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("SOLICITUD DE DATOS DEL SISTEMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar)
                        .addGap(12, 12, 12)
                        .addComponent(btn_modificar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_codigo)
                        .addGap(18, 18, 18)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_telefono)
                                    .addComponent(lbl_apellido)
                                    .addComponent(lbl_nombre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_apellido))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_email)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_registrar)
                            .addComponent(btn_eliminar)
                            .addComponent(btn_modificar))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar)
                            .addComponent(lbl_codigo)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private List<Cliente> lista = new ArrayList<Cliente>();
    
    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

       
        Cliente cliente = new Cliente(); //INSTANCIAR CLASE CLIENTE EN VARIABLE
        cliente.setNombre(this.txt_nombre.getText());
        cliente.setApellido(this.txt_apellido.getText());
        cliente.setEmail(this.txt_email.getText());
        cliente.setTelefono(this.txt_telefono.getText());
        /*
        String strAltura = this.txt_altura.getText();
        String strPeso = this.txt_peso.getText();
        
        Double altura = Double.parseDouble(strAltura);
        Double peso = Double.parseDouble(strPeso);
        Double indice = peso / (altura * altura);*/
        lista.add(cliente); //AGREGAR NOMBRE INGRESADO
        actualizarLista(); //ACTUALIZAR LISTA
        
        //Conexion a la Base de Datos
        try{
            //Declaracion de Conexion Java a MySQL
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemagestion", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?,?,?,?)");
            
            //Datos insertados para registrarlos en la base de datos
            pst.setString(1, "0");
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_apellido.getText().trim());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(5, txt_email.getText().trim());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "EL CLIENTE SE HA GUARDADO CORRECTAMENTE");//MENSAJE DE BOTON
            limpiarCajasDeTexto();
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void limpiarCajasDeTexto(){
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_email.setText("");
        this.txt_telefono.setText("");
    }
    
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        /*int indice = this.list_clientes.getSelectedIndex();//DECLARAR EL INDICE
        lista.remove(indice);
        actualizarLista();*/
        
        //Conexion a la Base de Datos
        try{
            //Declaracion de Conexion Java a MySQL
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemagestion", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from clientes where ID = ?");
            
            //Datos insertados para registrarlos en la base de datos
            pst.setString(1, txt_codigo.getText().trim());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(rootPane, "EL INDICE ES: "+indice);//MENSAJE DE BOTON
            JOptionPane.showMessageDialog(rootPane, "EL CLIENTE SE HA ELIMINADO CORRECTAMENTE");//MENSAJE DE BOTON
            limpiarCajasDeTexto();
    
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        try{
            String ID = txt_codigo.getText().trim();
            
            //Declaracion de Conexion Java a MySQL
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemagestion", "root", "");
            PreparedStatement pst = cn.prepareStatement("update clientes set nombre = ?, apellido = ?, telefono = ?, email = ? where ID = "+ID);
            
            pst.setString(1, txt_nombre.getText().trim());
            pst.setString(2, txt_apellido.getText().trim());
            pst.setString(3, txt_telefono.getText().trim());
            pst.setString(4, txt_email.getText().trim());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "EL CLIENTE SE HA MODIFICADO CORRECTAMENTE");//MENSAJE DE BOTON
            
            
        }catch(Exception e){
            
        }
       
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        //Conexion a la Base de Datos
        try{
            //Declaracion de Conexion Java a MySQL
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemagestion", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from clientes where ID = ?");
            
            //Busqueda del ID en la base de datos para consultar datos de clientes
            pst.setString(1, txt_codigo.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_email.setText(rs.getString("email"));
            }else{
                JOptionPane.showMessageDialog(rootPane, "NO SE HA ENCONTRADO NINGUN REGISTRO DEL CLIENTE");//MENSAJE DE BOTON
            }
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void actualizarLista(){
        DefaultListModel datos = new DefaultListModel();
        for(int i = 0; i < lista.size(); i++){
            Cliente cliente = lista.get(i);
            datos.addElement(cliente.getNombreCompleto());
        }
        this.list_clientes.setModel(datos);
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JList<String> list_clientes;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
