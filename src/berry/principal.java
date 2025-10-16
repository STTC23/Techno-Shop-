
package berry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class principal extends javax.swing.JFrame {
    
    private Clip clip;
    private boolean pausado = false;
    private long posicionPausa = 0;

    public principal() {
        initComponents();
        agregarControlesMusica();
        reproducirMusica("src/berry/menu.wav");
        
    }
    
    private void agregarControlesMusica() {
        JButton btnReproducir = new JButton("▶ Reproducir");
        JButton btnPausar = new JButton("⏸ Pausar");
        JButton btnDetener = new JButton("⏹ Detener");

        // Ubicación y estilo
        btnReproducir.setBounds(200, 350, 120, 30);
        btnPausar.setBounds(330, 350, 120, 30);
        btnDetener.setBounds(460, 350, 120, 30);

        // Acción de reproducir
        btnReproducir.addActionListener(e -> reproducirMusica("src/berry/menu.wav"));

        // Acción de pausar
        btnPausar.addActionListener(e -> pausarMusica());

        // Acción de detener
        btnDetener.addActionListener(e -> detenerMusica());
    }

    private void reproducirMusica(String archivo) {
        try {
            if (clip == null) {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(archivo));
                clip = AudioSystem.getClip();
                clip.open(audioStream);
            }
            if (pausado) {
                clip.setMicrosecondPosition(posicionPausa);
                pausado = false;
            }
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            JOptionPane.showMessageDialog(this, "Error al reproducir el audio: " + ex.getMessage());
        }
    }

    private void pausarMusica() {
        if (clip != null && clip.isRunning()) {
            posicionPausa = clip.getMicrosecondPosition();
            clip.stop();
            pausado = true;
        }
    }

    private void detenerMusica() {
        if (clip != null) {
            clip.stop();
            clip.setMicrosecondPosition(0);
            pausado = false;
        }
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
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

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
                .addContainerGap(220, Short.MAX_VALUE)
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

        jMenu2.setText("Listado");

        jMenuItem4.setText("Listar Productos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
    private javax.swing.JMenuItem cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu registro_cliente;
    private javax.swing.JMenuItem registro_compra;
    private javax.swing.JMenuItem registro_producto;
    // End of variables declaration//GEN-END:variables
}
