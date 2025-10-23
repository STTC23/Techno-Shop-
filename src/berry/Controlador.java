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
    
    //Compras
    public void agregarCompra (compra compra_parameter){
        compras.add(compra_parameter);
    }

    public ArrayList<compra> getCompras() {
        return compras;
    }
    
    

}
