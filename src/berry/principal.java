
package berry;

import org.jfree.data.category.DefaultCategoryDataset; //Librería de gráficos para crear contenedor
import org.jfree.data.general.DefaultPieDataset; // Librería para las opciones de torta
import org.jfree.chart.plot.PlotOrientation; // Librería para establecer la orientación en las gráficas de lineas
import org.jfree.chart.JFreeChart; //Librería JFreeChart
import org.jfree.chart.ChartFactory; // Librería para el generador de gráficos
import org.jfree.chart.ChartPanel; // Librería para generar el panel del gráfico
import javax.swing.JFrame;


public class principal extends javax.swing.JFrame {
    
    public static Controlador control = new Controlador();
    
    public principal() {
        initComponents();  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
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
        Opcional = new javax.swing.JMenu();
        MarcaGrafico = new javax.swing.JMenuItem();
        ResolucionGrafico = new javax.swing.JMenuItem();
        TipoGrafico = new javax.swing.JMenuItem();
        Menucreditos = new javax.swing.JMenu();
        Creditos = new javax.swing.JMenuItem();

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

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/berry/Materiales proyecto de Lógica/logo.png"))); // NOI18N
        Logo.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
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

        Opcional.setText("Opcional");

        MarcaGrafico.setText("Marca");
        MarcaGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaGraficoActionPerformed(evt);
            }
        });
        Opcional.add(MarcaGrafico);

        ResolucionGrafico.setText("Por resolución");
        ResolucionGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolucionGraficoActionPerformed(evt);
            }
        });
        Opcional.add(ResolucionGrafico);

        TipoGrafico.setText("Cantidad Proyectores y Televisores");
        TipoGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoGraficoActionPerformed(evt);
            }
        });
        Opcional.add(TipoGrafico);

        jMenuBar1.add(Opcional);

        Menucreditos.setText("Créditos");

        Creditos.setText("Autores y Agradecimientos");
        Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditosActionPerformed(evt);
            }
        });
        Menucreditos.add(Creditos);

        jMenuBar1.add(Menucreditos);

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
        }
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

    private void MarcaGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaGraficoActionPerformed
        java.util.List<producto> productos=control.getProductos();
        if (productos==null|| productos.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"no hay productos registrados","Reporte de productos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int samsung = 0;
        int lg = 0;
        int kalley = 0;
        
        for (producto p: productos){
            if (p.getMarca().equalsIgnoreCase("Samsung"))
                samsung++;
            if (p.getMarca().equalsIgnoreCase("LG"))
                lg++;
            if (p.getMarca().equalsIgnoreCase("Kalley"))
                kalley++;
        }
        
        
        DefaultPieDataset contenedor = new DefaultPieDataset();
        contenedor.setValue("Samsung", //Primer argumento: Título
                samsung); // Segundo argumento: Valores
        contenedor.setValue("LG",lg);
        contenedor.setValue("Kelly",kalley);
        
        JFreeChart grafico = ChartFactory.createPieChart(
            "Distribución de productos por marca", // título
        contenedor, // datos
        true, // mostrar leyenda (división de categorías
        true, // usar tooltips
        false // sin URLs
        );
        
        ChartPanel panel = new ChartPanel(grafico);
        
        
        JFrame ventana = new JFrame("Gráfico de torta");
        ventana.setContentPane(panel);
        ventana.pack();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);

        



    }//GEN-LAST:event_MarcaGraficoActionPerformed

    private void TipoGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoGraficoActionPerformed
        java.util.List<producto> productos=control.getProductos();
        if (productos==null|| productos.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"no hay productos registrados","Reporte de productos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int contador_televisores = 0;
        int contador_proyectores = 0; 
        
        for (producto p: productos){
            if (p instanceof televisores)
                contador_televisores++;
         else if (p instanceof proyectores)
            contador_proyectores++;
        }
        
        DefaultCategoryDataset contenedor = new DefaultCategoryDataset(); //Contenedor de gráficos de torta
        contenedor.addValue(
                contador_televisores, //Primer argumento: Valor numérico
                "Cantidad", 
                "Televisores"); 
        contenedor.addValue(contador_proyectores, "Cantidad", "Proyectores");
        
        JFreeChart grafico = ChartFactory.createBarChart( //BarChart crea una gráfica de torta
        "Cantidad de productos por tipo", // //Título del gráfico
        "Tipo de producto", // Etiqueta para X 
        "Cantidad", // Etiqueta para Y
        contenedor // Datos de la gráfica
        );
        
        ChartPanel panel = new ChartPanel(grafico); //Mostrar el gráfico en un panel
        JFrame ventana = new JFrame("Gráfico por tipo");
        ventana.setContentPane(panel); //Mete el panel con el gráfico en el JFrame
        ventana.pack(); //Pack ajusta el tamaño al contenido
        ventana.setLocationRelativeTo(this); //Centra la ventana
        ventana.setVisible(true); //Muestra la ventana        
    }//GEN-LAST:event_TipoGraficoActionPerformed

    private void ResolucionGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolucionGraficoActionPerformed
        java.util.List<producto> productos=control.getProductos();
        if (productos==null|| productos.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"no hay productos registrados","Reporte de productos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        /*Para este caso tenemos 6 items HD
            Full HD
            4K
            5k
            8k
        */
        
        int HD = 0;
        int four_k = 0;
        int five_k = 0;
        int eight_k = 0;
        
        for (producto p: productos){
            if (p.getResolucion().equalsIgnoreCase("Full HD"))
                HD++;
            if (p.getResolucion().equalsIgnoreCase("4k"))
                four_k++;
            if (p.getResolucion().equalsIgnoreCase("5k"))
                five_k++;
            if (p.getResolucion().equalsIgnoreCase("8k"))
                eight_k++;
        }
        
        DefaultCategoryDataset contenedor = new DefaultCategoryDataset();
        contenedor.addValue(HD, "Cantidad", "Full HD");
        contenedor.addValue(four_k, "Cantidad", "4k");
        contenedor.addValue(five_k, "Cantidad", "5k");
        contenedor.addValue(eight_k, "División por resolución", "8k");
        
        JFreeChart grafico = ChartFactory.createLineChart("División por resolución", //título
                "Cantidad",  // Eje x
                "Resolución", // Eje y
                contenedor,  // Datos
                PlotOrientation.VERTICAL, //Orientación de las lineas
                true, //Leyendas
                true, // Tooltips 
                false // URLs
                );
        
        ChartPanel panel = new ChartPanel(grafico);
        JFrame ventana = new JFrame("Gráfico de líneas");
        ventana.setContentPane(panel);
        ventana.pack();
        ventana.setVisible(true);
    }//GEN-LAST:event_ResolucionGraficoActionPerformed

    private void CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditosActionPerformed
        String text = "Este proyecto fue hecho por: Juan Bedoya, Andrés Cuartas y Daniel Sabogal. Agradecemos a la profesora Betsy por permitirnos aprender este maravilloso lenguaje";
        javax.swing.JOptionPane.showMessageDialog(this,text,"Agradecimientos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CreditosActionPerformed

    
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
    private javax.swing.JMenuItem Creditos;
    private javax.swing.JMenu Listado;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuItem MarcaGrafico;
    private javax.swing.JMenuItem MayorPrecio;
    private javax.swing.JMenu Menucreditos;
    private javax.swing.JMenuItem MostrarUnidades;
    private javax.swing.JMenu Opcional;
    private javax.swing.JMenuItem PorcentajeMenu;
    private javax.swing.JMenuItem PromedioSamsung;
    private javax.swing.JMenuItem ResolucionGrafico;
    private javax.swing.JMenuItem TipoGrafico;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu registro_cliente;
    private javax.swing.JMenuItem registro_compra;
    private javax.swing.JMenuItem registro_producto;
    // End of variables declaration//GEN-END:variables
}

