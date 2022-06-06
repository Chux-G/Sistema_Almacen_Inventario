/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author jesus
 */
public class MDIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MDIPrincipal
     */
    public MDIPrincipal() {
        initComponents();
        
        ImageIcon icFacturas = new ImageIcon(getClass().getResource("/imagenes/factura.png"));
        Icon iconoFac = new ImageIcon(icFacturas.getImage().getScaledInstance(50, 60, Image.SCALE_DEFAULT));
        btn_facturas.setIcon(iconoFac);
        
        ImageIcon icRecibos = new ImageIcon(getClass().getResource("/imagenes/recibo.png"));
        Icon iconoRec = new ImageIcon(icRecibos.getImage().getScaledInstance(50, 60, Image.SCALE_DEFAULT));
        btn_recibos.setIcon(iconoRec);
        
        ImageIcon icAlmacen = new ImageIcon(getClass().getResource("/imagenes/almacen.png"));
        Icon iconoAl = new ImageIcon(icAlmacen.getImage().getScaledInstance(50, 60, Image.SCALE_DEFAULT));
        btn_almacen.setIcon(iconoAl);
        
        ImageIcon mConsultas = new ImageIcon(getClass().getResource("/imagenes/consultas.png"));
        Icon icConsultas = new ImageIcon(mConsultas.getImage().getScaledInstance(30, 40, Image.SCALE_DEFAULT));
        menuConsultas.setIcon(icConsultas);
        
        ImageIcon mBaseDatos = new ImageIcon(getClass().getResource("/imagenes/database.png"));
        Icon icBaseDatos = new ImageIcon(mBaseDatos.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        menuBaseDatos.setIcon(icBaseDatos);
        
        ImageIcon mHerramientas = new ImageIcon(getClass().getResource("/imagenes/herramienta.png"));
        Icon icHerramientas = new ImageIcon(mHerramientas.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        menuHerramientas.setIcon(icHerramientas);
        
        ImageIcon iUsuarios = new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
        Icon icUs = new ImageIcon(iUsuarios.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        item_usuarios.setIcon(icUs);
        
        ImageIcon iInformacion = new ImageIcon(getClass().getResource("/imagenes/informacion.png"));
        Icon icInfo = new ImageIcon(iInformacion.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        item_informacion.setIcon(icInfo);
        
        ImageIcon iBaseDatos = new ImageIcon(getClass().getResource("/imagenes/seguridad.png"));
        Icon icBD = new ImageIcon(iBaseDatos.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        item_db.setIcon(icBD);
        
        ImageIcon iReportes = new ImageIcon(getClass().getResource("/imagenes/reportes.png"));
        Icon icRe = new ImageIcon(iReportes.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        item_reportes.setIcon(icRe);
        
        ImageIcon iDetalleFacturas = new ImageIcon(getClass().getResource("/imagenes/detallefactura.png"));
        Icon icDF = new ImageIcon(iDetalleFacturas.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        item_detallefacturas.setIcon(icDF);
        
        ImageIcon iDetalleRecibos = new ImageIcon(getClass().getResource("/imagenes/detallerecibo.png"));
        Icon icDR = new ImageIcon(iDetalleRecibos.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        item_detallerecibos.setIcon(icDR);
        
        timer.start();
    }
    
    Timer timer = new Timer(1000, new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Calendar cal = new GregorianCalendar();
            int hh, mm, ss, dias, mes, aa;
            hh = cal.get(Calendar.HOUR_OF_DAY);
            mm = cal.get(Calendar.MINUTE);
            ss = cal.get(Calendar.SECOND);
            
            dias = cal.get(Calendar.DAY_OF_MONTH);
            mes = cal.get(Calendar.MONTH);
            aa = cal.get(Calendar.YEAR);
            
            lbl_hora.setText(hh+":"+mm+":"+ss);
            lbl_fecha.setText(dias+"/"+(mes+1)+"/"+aa);
            
            
            
        }
    });

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_facturas = new javax.swing.JButton();
        btn_recibos = new javax.swing.JButton();
        btn_almacen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        dpn_Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConsultas = new javax.swing.JMenu();
        item_reportes = new javax.swing.JMenuItem();
        item_detallefacturas = new javax.swing.JMenuItem();
        item_detallerecibos = new javax.swing.JMenuItem();
        menuBaseDatos = new javax.swing.JMenu();
        item_db = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        item_usuarios = new javax.swing.JMenuItem();
        item_informacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Almacén");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btn_facturas.setText("Facturas");

        btn_recibos.setText("Recibos");

        btn_almacen.setText("Almacén");

        jLabel1.setText("Usuario:");

        jLabel2.setText("Hora:");

        jLabel3.setText("Fecha:");

        lbl_usuario.setText("jLabel4");

        lbl_hora.setText("jLabel4");

        lbl_fecha.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_recibos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_facturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_almacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_hora)
                                    .addComponent(lbl_fecha))
                                .addGap(0, 32, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_usuario)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_recibos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hora)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_fecha))
                .addContainerGap())
        );

        javax.swing.GroupLayout dpn_EscritorioLayout = new javax.swing.GroupLayout(dpn_Escritorio);
        dpn_Escritorio.setLayout(dpn_EscritorioLayout);
        dpn_EscritorioLayout.setHorizontalGroup(
            dpn_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        dpn_EscritorioLayout.setVerticalGroup(
            dpn_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuConsultas.setText("Consultas");

        item_reportes.setText("Reportes");
        menuConsultas.add(item_reportes);

        item_detallefacturas.setText("Detalle de Facturas");
        menuConsultas.add(item_detallefacturas);

        item_detallerecibos.setText("Detalle de Recibos");
        menuConsultas.add(item_detallerecibos);

        jMenuBar1.add(menuConsultas);

        menuBaseDatos.setText("Base de Datos");

        item_db.setText("Respaldar / Restaurar");
        menuBaseDatos.add(item_db);

        jMenuBar1.add(menuBaseDatos);

        menuHerramientas.setText("Herramientas");

        item_usuarios.setText("Usuarios");
        item_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_usuariosActionPerformed(evt);
            }
        });
        menuHerramientas.add(item_usuarios);

        item_informacion.setText("Información");
        menuHerramientas.add(item_informacion);

        jMenuBar1.add(menuHerramientas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dpn_Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dpn_Escritorio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_usuariosActionPerformed
        
        FrmUsuarios misUsuarios = new FrmUsuarios();
        dpn_Escritorio.add(misUsuarios);
        misUsuarios.show();
    }//GEN-LAST:event_item_usuariosActionPerformed

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
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_almacen;
    private javax.swing.JButton btn_facturas;
    private javax.swing.JButton btn_recibos;
    private javax.swing.JDesktopPane dpn_Escritorio;
    private javax.swing.JMenuItem item_db;
    private javax.swing.JMenuItem item_detallefacturas;
    private javax.swing.JMenuItem item_detallerecibos;
    private javax.swing.JMenuItem item_informacion;
    private javax.swing.JMenuItem item_reportes;
    private javax.swing.JMenuItem item_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JMenu menuBaseDatos;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuHerramientas;
    // End of variables declaration//GEN-END:variables
}