
package berry;

public class cliente {
    private String nombre;
    private String numdocumento;
    private String fecha_n;
    


    public cliente(String nombre, String numdocumento, String fecha_n) {
        this.nombre = nombre;
        this.numdocumento = numdocumento;
        this.fecha_n=fecha_n;
        
       
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public String getNumdocumento() {
        return numdocumento;
    }

  
    public void setNumdocumento(String numdocumento) {
        this.numdocumento = numdocumento;
    }

   public String getfecha_n(){
       return fecha_n;
       
   }
   public void setfecha_n(String fecha_n){
       this.fecha_n=fecha_n;
   }
   public boolean cumpleaños(String cumpleaños){
       String[] f1=fecha_n.split("/");
       String[] f2=cumpleaños.split("/");
       return f1[0].equals(f2[0])&&f1[1].equals(f2[1]);
   }
   

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", numdocumento=" + numdocumento + ", fechanacimiento=" + "fecha n"+'}';
    }
    
}
