
package taquilla_banco;

class Cliente {
    
    private String nombre;
    private String apellido;
    private String prioridad;
    private String operacion;      
    
    public Cliente(String nom,String ape,String pri,String operacion){
        
        this.nombre = nom;
        this.apellido = ape;
        this.prioridad = pri;
        this.operacion = operacion;
    }
    
    String getDat(){
        return this.nombre+" "+this.apellido;
    }
    
   String getName(){
        return this.nombre+" "+this.apellido;
    }
    
<<<<<<< HEAD
    String getPrioridad(){
 return this.prioridad;
=======
    Boolean getPrioridad(){
        return this.prioridad;
        
>>>>>>> origin/EZE
        
    }
    
    String getOperacion(){
        return this.operacion;
    }
}