
package taquilla_banco;

public class nodo {
         
    Cliente cliente;
    nodo next;
    
    public nodo(Cliente in){
        this.cliente = in;
    } 
   
         
}

class nodoS{
    
    String dato;
    nodo next;
    
    public nodoS(String in){
        this.dato = in;
    }
}
