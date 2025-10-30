
package berry;
import java.util.ArrayList;
import java.util.List;

public class compra {
    private cliente cliente;
    private producto producto;
    private int cantidad;
    private double total;
    private double descuento;
    private double valorAPagar; 
    private String fecha;
    private ArrayList<producto>productosc;
    private ArrayList<Integer>unidadescompradas;//Integer se usa para guardar objetos no primitivos(numeros enteros) dentro de una lista 

    public compra(cliente cliente, producto producto, int cantidad, String fecha) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        productosc =new ArrayList<>();
        unidadescompradas =new ArrayList<>();
    }

     public double valorAPagar(cliente cliente) {

        String diaMesNacimiento = "";
        if (cliente.getfecha_n().length() >= 10) {
             diaMesNacimiento = cliente.getfecha_n().substring(5, 10);
        }
        // Se extrae el día y mes de la fecha de compra
        String diaMesCompra = "";
         if (fecha.length() >= 10) {
             diaMesCompra = fecha.substring(5, 10);
        }

        if (diaMesNacimiento.equals(diaMesCompra)&& !diaMesNacimiento.isEmpty()) 
            return this.descuento = this.total * 0.80; 
        else
        return this.total; 
    }

    
    public double aplicarDescuento(cliente cliente) {

        String diaMesNacimiento = "";
        if (cliente.getfecha_n().length() >= 10) {
             diaMesNacimiento = cliente.getfecha_n().substring(5, 10);
        }
        // Se extrae el día y mes de la fecha de compra
        String diaMesCompra = "";
         if (fecha.length() >= 10) {
             diaMesCompra = fecha.substring(5, 10);
        }

        if (diaMesNacimiento.equals(diaMesCompra)&& !diaMesNacimiento.isEmpty()) 
            return this.descuento = this.total * 0.20; 
        else
        return 0; 
    }
    
    public compra() {
        productosc =new ArrayList<>();
        unidadescompradas =new ArrayList<>();
    }
    
    
  
    public double calcularTotal() {
    double subtotal = 0.0; 
    
    for (int i = 0; i < productosc.size(); i++) {
        subtotal += productosc.get(i).getPrecio() * unidadescompradas.get(i);
    }

    this.total = subtotal;
    return total;
}
    

    public void agregarProductoACompra(producto p, int a){
        productosc.add(p);
        unidadescompradas.add(a);
    }
    
    public String mostrarProductosDeCompra(){
        String texto = "";
        for (int i = 0; i<productosc.size();i++)
            texto += "codigo: "+productosc.get(i).getCodigo() + "Marca: " + productosc.get(i).getMarca() + "Precio: " + String.valueOf(productosc.get(i).getPrecio()) + "Unidades: " + String.valueOf(unidadescompradas.get(i));
        return texto;
    }
    
    
    public double gettotal(){
        return getTotal();
    }

    public producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public cliente getCliente() {
        return cliente;
    }


    public void setCliente(cliente Cliente) {
        this.cliente = Cliente;
    }

    public ArrayList<producto> getProductosc() {
        return productosc;
    }

    public void setProductosc(ArrayList<producto> productosc) {
        this.productosc = productosc;
    }

    public ArrayList<Integer> getUnidadescompradas() {
        return unidadescompradas;
    }


    public void setUnidadescompradas(ArrayList<Integer> unidadescompradas) {
        this.unidadescompradas = unidadescompradas;
    }

    
    public double getTotal() {
        return total;
    }

  
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "info_R{" + "fecha:  " + fecha + ", Cliente" + cliente + ", productos:  " + productosc + ", unidades compradas:  " + unidadescompradas + ", total:  " + total + '}';
    }
    
    
    
}
