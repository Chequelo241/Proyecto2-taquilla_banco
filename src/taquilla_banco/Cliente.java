
package taquilla_banco;

class Cliente {
    
    private String nombre;
    private String apellido;
    private Boolean prioridad;
    private String[] operacion;      
    
    public Cliente(String nom,String ape,Boolean pri,String[] operacion){
        
        this.nombre = nom;
        this.apellido = ape;
        this.prioridad = pri;
        this.operacion = operacion;
    }
    String getInfo(){
        String a;
        if(prioridad){
            a = "Sí";
        }else{
         a = "No";
        }
        return this.nombre+" "+this.apellido+" "+a+" "+getOperaciones();
    }
    
    String getDat(){
        String a;
        if(prioridad){
            a = "Sí";
        }else{
         a = "No";
        }
        return this.nombre+" "+this.apellido+" Discapacidad/Adulto Mayor: "+a+" Operaciones: "+getOperaciones();
    }
    
   String getName(){
        return this.nombre+" "+this.apellido;
    }
   
    Boolean getPrioridad(){
        return this.prioridad;
          
    }
    
    String getOperaciones(){
        String c ="";
        for(String i:operacion){
           c += i+",";
            
        }
        return c;
    }
    
    String[] getOperacionesArray(){
        return operacion;
    }
}