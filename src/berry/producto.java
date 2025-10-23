package berry;
import java.util.ArrayList;

public class producto {
    private String codigo, marca, referencia, color, resolucion;
    private double precio;
    private int unidades;

    public producto(String codigo, String marca, String referencia, String color, String resolucion, double precio, int unidades) {
        this.codigo = codigo;
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        this.resolucion = resolucion;
        this.precio = precio;
        this.unidades = unidades;
    }


    public String getCodigo() {
        return codigo;
    }
    public String getMarca() {
        return marca;
    }
    public String getReferencia() {
        return referencia;
    }
    public String getColor() {
        return color;
    }
    public String getResolucion() {
        return resolucion;
    }
    public double getPrecio() {
        return precio;
    }
    public int getUnidades() {
        return unidades;
    }

    public void diminucion_u(int dis_unidades){
        unidades-=dis_unidades;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    

    @Override
    public String toString() {
        return "Tienda_de_tecnologia{" + "codigo=" + codigo + ", marca=" + marca + ", referencia=" + referencia + ", color=" + color + ", resolucion=" + resolucion + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
    
    

       
}
