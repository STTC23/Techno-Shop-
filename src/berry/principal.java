
package berry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class principal extends javax.swing.JFrame {
    
    public static Controlador control = new Controlador();
    
    private Clip clip;
    private boolean pausado = false;
    private long posicionPausa = 0;

    public principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        registro_cliente = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        registro_producto = new javax.swing.JMenuItem();
        registro_compra = new javax.swing.JMenuItem();
        Listado = new javax.swing.JMenu();
        MostrarUnidades = new javax.swing.JMenuItem();
        MayorPrecio = new javax.swing.JMenuItem();
        PorcentajeMenu = new javax.swing.JMenuItem();
        PromedioSamsung = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/berry/Materiales proyecto de Lógica/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        registro_cliente.setText("Registro");

        cliente.setText("Registro Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        registro_cliente.add(cliente);

        registro_producto.setText("Registro Producto");
        registro_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_productoActionPerformed(evt);
            }
        });
        registro_cliente.add(registro_producto);

        registro_compra.setText("Registro Compra");
        registro_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_compraActionPerformed(evt);
            }
        });
        registro_cliente.add(registro_compra);

        jMenuBar1.add(registro_cliente);

        Listado.setText("Listado");

        MostrarUnidades.setText("Mostrar Unidades Totales");
        MostrarUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUnidadesActionPerformed(evt);
            }
        });
        Listado.add(MostrarUnidades);

        MayorPrecio.setText("Productos de Mayor Precio");
        MayorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MayorPrecioActionPerformed(evt);
            }
        });
        Listado.add(MayorPrecio);

        PorcentajeMenu.setText("Porcentaje Televisores");
        PorcentajeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcentajeMenuActionPerformed(evt);
            }
        });
        Listado.add(PorcentajeMenu);

        PromedioSamsung.setText("Precio Promedio Samsung");
        PromedioSamsung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromedioSamsungActionPerformed(evt);
            }
        });
        Listado.add(PromedioSamsung);

        jMenuBar1.add(Listado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registro_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_productoActionPerformed
        new registro_producto().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_registro_productoActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        new registro_clientes().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void registro_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_compraActionPerformed
        new registro_compra().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_registro_compraActionPerformed

    private void MostrarUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUnidadesActionPerformed
    java.util.List<producto> productos = control.getProductos();

    if (productos == null || productos.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "No hay productos registrados.",
            "Unidades de productos",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    int totalTelevisores = 0;
    int totalProyectores = 0;

    for (producto p : productos) {
        if (p instanceof televisores) {
            totalTelevisores++;
        } else if (p instanceof proyectores) {
            totalProyectores++;
        }
    }

    int totalGeneral = totalTelevisores + totalProyectores;

    String mensaje = "Total de unidades registradas:\n" + "• Televisores: " + totalTelevisores + "\n" + "• Proyectores: " + totalProyectores + "\n" + "• Total general: " + totalGeneral;

    javax.swing.JOptionPane.showMessageDialog(this,mensaje, "Unidades de productos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 // TODO add your handling code here:
    }//GEN-LAST:event_MostrarUnidadesActionPerformed

    private void MayorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MayorPrecioActionPerformed
        java.util.List<producto> productos=control.getProductos();
        if (productos==null|| productos.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"no hay productos registrados","Reporte de productos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }// TODO add your handling code here:
        double maxprecio=-1;
        for(producto p: productos){
            if (p.getPrecio()>maxprecio){
                maxprecio=p.getPrecio();
                }
            }
        java.util.List<producto>productosMascaros=new java.util.ArrayList<>();
        for(producto p:productos){
            if(p.getPrecio()==maxprecio){
            productosMascaros.add(p);
            }
        }   
        StringBuilder sb=new StringBuilder();
        sb.append("productos con precio mas alto son: ").append(String.format(" ", maxprecio));
        if (productosMascaros.isEmpty()){
            sb.append("error, no se encontro el producto");
    
        }else{
        
            for(producto p:productosMascaros){
                String tipo;
                
                if (p instanceof televisores){
                    tipo = "Televisor";
                } else {
                    tipo = "Proyector";
                }
                
                sb.append("\n").append("codigo: ").append(p.getCodigo()).append("\n").append("marca: ").append(p.getMarca()).append("\n").append("Tipo:  ").append(tipo).append("\n").append("Precio:  ").append(p.getPrecio());
            }
                }
        javax.swing.JOptionPane.showMessageDialog(this,sb.toString(),"productos mas caros",javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_MayorPrecioActionPerformed

    private void PorcentajeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcentajeMenuActionPerformed
        java.util.List<producto> productos = control.getProductos();
        if (productos == null || productos.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,  "No hay productos registrados.", "Porcentaje de Televisores", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int totalProductos = productos.size();
        int cantidadTelevisores = 0;

        for (producto p : productos) {
            if (p instanceof televisores) {  // verifica si es un objeto de tipo televisor
                cantidadTelevisores++;
            }
        }

        double porcentaje = (cantidadTelevisores * 100.0) / totalProductos; //Definición de porcentaje 

        javax.swing.JOptionPane.showMessageDialog(this, 
            "El " + String.format("%.2f", porcentaje) + "% de los productos son televisores.\n" + //&.2f es el formato se refiere a que solo mostrará dos decimales
            "Total productos: " + totalProductos + "\n" +
            "Televisores: " + cantidadTelevisores,
            "Porcentaje de Televisores", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);    
    }//GEN-LAST:event_PorcentajeMenuActionPerformed

    private void PromedioSamsungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromedioSamsungActionPerformed
        java.util.List<producto> productos = control.getProductos();

        if (productos == null || productos.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay productos registrados.", "Promedio Samsung", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double suma = 0;
        int contador = 0;

        for (producto p : productos) {
            if (p.getMarca().equalsIgnoreCase("Samsung")) { // compara sin importar mayúsculas de la palabra Samsung
                suma += p.getPrecio();
                contador++;
            }
        }

        if (contador == 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "No hay productos de la marca Samsung registrados.",
                "Promedio Samsung",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        double promedio = suma / contador; //Definición de promedio

        javax.swing.JOptionPane.showMessageDialog(this,
            "El precio promedio de los productos Samsung es: $" + String.format("%,.2f", promedio) +
            "\nCantidad de productos Samsung: " + contador,
            "Promedio Samsung",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);       
    }//GEN-LAST:event_PromedioSamsungActionPerformed

    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Listado;
    private javax.swing.JMenuItem MayorPrecio;
    private javax.swing.JMenuItem MostrarUnidades;
    private javax.swing.JMenuItem PorcentajeMenu;
    private javax.swing.JMenuItem PromedioSamsung;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu registro_cliente;
    private javax.swing.JMenuItem registro_compra;
    private javax.swing.JMenuItem registro_producto;
    // End of variables declaration//GEN-END:variables
}
