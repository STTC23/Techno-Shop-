
package berry;
import java.util.ArrayList;
import java.util.List;

public class compra {
    private cliente cliente;
    private producto producto;
    private int cantidad;
    private double total;
    private double valorAPagar; 
    private String fecha;
    private ArrayList<producto>productosc;
    private ArrayList<Integer>unidadescompradas;//Integer se usa para guardar objetos no primitivos(numeros enteros) dentro de una lista 

    public compra(cliente cliente, producto producto, int cantidad, String fecha) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        calcularTotal();
        productosc =new ArrayList<>();
        unidadescompradas =new ArrayList<>();
    }

    public compra() {
        productosc =new ArrayList<>();
        unidadescompradas =new ArrayList<>();
    }
    
    
  
    public double calcularTotal() {
    double acomulador = 0;
    for (int i = 0; i<productosc.size();i++){
        acomulador+= productosc.get(i).getPrecio() * unidadescompradas.get(i);
    }
    return acomulador;
    
}
    public void agregarProductoACompra(producto p, int a){
        productosc.add(p);
        unidadescompradas.add(a);
    }
    
    public String mostrarProductosDeCompra(){
        String texto = "";
        for (int i = 0; i<productosc.size();i++)
            texto += productosc.get(i).getCodigo() + " " + productosc.get(i).getMarca() + " " + String.valueOf(productosc.get(i).getPrecio()) + " " + String.valueOf(unidadescompradas.get(i));
        return texto;
    }
    
    

    public void aplicardescuento(){
        setTotal(0);
        for(int i=0;i<getProductosc().size();i++){
            setTotal(getTotal() + getProductosc().get(i).getPrecio() * getUnidadescompradas().get(i));
            
        }
    }
    public void aplicarcumpleaños(){
        if (getCliente().cumpleaños(getFecha())){
            setTotal(getTotal() * 0.8);
        }
        
    }
    
    public double descuento(){
        
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
