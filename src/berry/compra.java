
package berry;
import java.util.ArrayList;
import java.util.List;

public class compra {
    private String fecha;
    private cliente Cliente;
    private ArrayList<producto>productosc=new ArrayList<>();
    private ArrayList<Integer>unidadescompradas=new ArrayList<>();//Integer se usa para guardar objetos no primitivos(numeros enteros) dentro de una lista 
    private double total;

    public compra(String fecha, cliente Cliente) {
        this.fecha = fecha;
        this.Cliente = Cliente;
    }
    
    public void agregarproducto(producto p, int unidades){
        getProductosc().add(p);
        getUnidadescompradas().add(unidades);
        p.diminucion_u(unidades);
        
                
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
    public double gettotal(){
        return getTotal();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public cliente getCliente() {
        return Cliente;
    }


    public void setCliente(cliente Cliente) {
        this.Cliente = Cliente;
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
        return "info_R{" + "fecha=" + fecha + ", Cliente=" + Cliente + ", productosc=" + productosc + ", unidadescompradas=" + unidadescompradas + ", total=" + total + '}';
    }
    
}
