
package taquilla_banco;

public class nodo {
         
    Cliente cliente;
    nodo next;
    
    public nodo(Cliente in){
        this.cliente = in;
    }    
}

class nodoP{
   Cliente cliente;
   nodoP Down;
   
   public nodoP(Cliente in){
       this.cliente = in;
   }
}

