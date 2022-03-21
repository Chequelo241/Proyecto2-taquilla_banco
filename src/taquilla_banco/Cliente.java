
package taquilla_banco;

class Cliente {
    
    private String nombre;
    private String apellido;
    private Boolean prioridad;
    private String operacion;      
    
    public Cliente(String nom,String ape,boolean pri,String operacion){
        
        this.nombre = nom;
        this.apellido = ape;
        this.prioridad = pri;
        this.operacion = operacion;
    }
    
    String getDat(){
        return this.nombre+" "+this.apellido+" "+this.operacion;
    }
    
   String getName(){
        return this.nombre+" "+this.apellido;
    }
    
    Boolean getPrioridad(){
        return this.prioridad;
        
        
    }
    
    String getOperacion(){
        return this.operacion;
    }
}