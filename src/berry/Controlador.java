/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package berry;
import java.util.ArrayList;
public class Controlador {
    ArrayList<cliente>clientes;
    ArrayList<compra>compras;
    ArrayList<producto>productos;
    
    
    public Controlador(){
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        compras = new ArrayList<>();
    }
    
    //Clientes
    
    public void agregarCliente(cliente cliente_parameter){
        clientes.add(cliente_parameter);
        System.out.println("CLiente registrado" + cliente_parameter);
    }

    public ArrayList<cliente> getClientes() {
        return clientes;
    }

    //Productos
    public void agregarProducto (producto producto_parameter){
        productos.add(producto_parameter);
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }
    
    public int obtenerTotalUnidades() {
        int totalUnidades = 0;
        for (producto p : productos) {
        totalUnidades += p.getUnidades(); // usa el nombre real del atributo
        }
    return totalUnidades;
}
    
    //Compras
    public void agregarCompra (compra compra_parameter){
        compras.add(compra_parameter);
    }

    public ArrayList<compra> getCompras() {
        return compras;
    }
    
    public String cantidadUnidades(String codigo, int cant) {
        for (producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                int cantidad = p.getUnidades() - cant;
                p.setUnidades(cantidad);

                if (p.getUnidades() < 10) {
                    return "La cantidad es menor a 10 unidades, por favor recargar";
                }

                return "La cantidad del producto con código: " + codigo + " es de " + p.getUnidades();
            }
        }

        return "No se encontró ningún producto con el código: " + codigo;
    }
    

}
