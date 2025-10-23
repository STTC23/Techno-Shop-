
package berry;
public class proyectores extends producto {
    private String tipo, tecnologia_visualizacion;
    
   

    public proyectores(String codigo, String marca, String referencia, String color, String resolucion, double precio, int unidades,String tipo, String tecnologia_visualizacion) {
        super(codigo, marca, referencia, color, resolucion, precio, unidades);
        this.tipo = tipo;
        this.tecnologia_visualizacion = tecnologia_visualizacion;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getTecnologia_visualizacion() {
        return tecnologia_visualizacion;
    }

    public void setTecnologia_visualizacion(String tecnologia_visualizacion) {
        this.tecnologia_visualizacion = tecnologia_visualizacion;
    }

    @Override
    public String toString() {
        return "proyectores{"+ super.toString() + "tipo:  " + tipo + ", tecnologia de visualización:  " + tecnologia_visualizacion + '}';
    }
    
    
}
