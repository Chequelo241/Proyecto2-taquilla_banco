
package taquilla_banco;

import java.io.IOException;

public class Pila {
        
    nodoP top;
    
    public boolean isEmpty(){   
      return top==null;  
        
    }
    void push (nodoP in){
        if (isEmpty()){
            top = in;      
        }else{
            nodoP topAux = top;
            top = in;
            top.Down = topAux;
        }
    }

    nodoP pop(){
        if(!isEmpty()){
             nodoP aux = top;
             top = top.Down;
             aux.Down = null;
             return aux;   
        }else{
            return null;      
            
        }
        
    }
    
    void peek(){
         System.out.println(top.cliente.getName());
    }
    
    void popPrint(String direccion) throws IOException{//se hace un llamado al pop y se imprime en un docuento.
        if (!isEmpty()){
        String dop = pop().cliente.getDat();
        
        while (!isEmpty()){
            dop += "\n" + pop().cliente.getDat();
        }
         
        System.out.println(dop);
        Documento.escribir(dop, direccion);
        }
       
    }
}
    

