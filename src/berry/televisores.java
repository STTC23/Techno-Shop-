package berry;
public class televisores extends producto {
    private String tamaño_pantalla;
    private String tipo_pantalla;
    private String Sistema_op;

    public televisores(String codigo, String marca, String referencia, String color, String resolucion, double precio, int unidades,String tamaño_pantalla, String tipo_pantalla, String Sistema_op) {
        super(codigo, marca, referencia, color, resolucion, precio, unidades);
        this.tamaño_pantalla = tamaño_pantalla;
        this.tipo_pantalla = tipo_pantalla;
        this.Sistema_op = Sistema_op;
    }
    
    
    

   
    
    public televisores(String codigo, String marca, String referencia, String color, String resolucion, double precio, int unidades) {
        super(codigo, marca, referencia, color, resolucion, precio, unidades);
    }

 
    public String getTamaño_pantalla() {
        return tamaño_pantalla;
    }

  
    public void setTamaño_pantalla(String tamaño_pantalla) {
        this.tamaño_pantalla = tamaño_pantalla;
    }


    public String getTipo_pantalla() {
        return tipo_pantalla;
    }


    public void setTipo_pantalla(String tipo_pantalla) {
        this.tipo_pantalla = tipo_pantalla;
    }


    public String getSistema_op() {
        return Sistema_op;
    }

  
    public void setSistema_op(String Sistema_op) {
        this.Sistema_op = Sistema_op;
    }

    @Override
    public String toString() {
        return "TELEVISOR - {" + super.toString() + "Tamaño:" + tamaño_pantalla + ", tipo de pantalla:  " + tipo_pantalla + ", Sistema Operativo" + Sistema_op + '}';
    }
    
}
