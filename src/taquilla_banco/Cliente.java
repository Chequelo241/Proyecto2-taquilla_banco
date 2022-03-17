
package taquilla_banco;

class Cliente {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String discapacidad;
    private String operacion;      
    
    public void Cliente(String nom,String ape,int edad,String disc,String operacion){
        
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.discapacidad = disc;
        this.operacion = operacion;
    }
    
    String getName(){
        return this.nombre+" "+this.apellido;
    }
    
    int getAge(){
        return this.edad;
    }
    
    String getDiscapacidad(){
        return this.discapacidad;
    }
    
    String getOperacion(){
        return this.operacion;
    }
}