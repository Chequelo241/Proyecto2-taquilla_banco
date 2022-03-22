
package taquilla_banco;

public class Pila {
        
    nodo top;
    
    public boolean isEmpty(){   
      return top==null;  
        
    }
    void push (nodo in){
        if (isEmpty()){
            this.top = in;      
        }else{
            nodo topAux = top;
            top = in;
            top.next = topAux;
        }
    }

    nodo pop(){
        if(isEmpty()){
             nodo aux = top;
             top = top.next;
             aux.next = null;
             return aux;   
        }else{
            System.out.println("Pila Vacía");
            return null;      
            
        }
        
    }
    
    void peek(){
         System.out.println(top.cliente.getName());
    }
    
}
    

