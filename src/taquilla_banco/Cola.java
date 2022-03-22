package taquilla_banco;

import java.io.IOException;

public class Cola {
    
    private nodo Front = null;
    private nodo Rear = null;
    
    boolean isEmpty(){
        return Front == null;
    }
    
    nodo getFront(){
        nodo aux = null;
        if (this.Front != null){
            return Front;
        }else{
            return null;
        }   
    }
    
    void enqueue(nodo in){
        if(this.isEmpty()){
            this.Front = in;
            this.Rear = in;
        }else{
            this.Rear.next = in;
            this.Rear = this.Rear.next;
        }
        
    }
    
    
    nodo dequeue(){
        if (isEmpty()){
            return null;
        }else{
            nodo aux = this.Front;
            this.Front = this.Front.next;
            aux.next = null;
            return aux;
        }
    }
    
    public void  enqueueClientes(String fuente) throws IOException{
        String[] clientes = Documento.leer(fuente).split("\n");
        
        String[] clientesdatos;
        String[] operaciones;
        for (String i:clientes){
            clientesdatos = i.split(" ");
            operaciones = clientesdatos[3].split(",");
            enqueue(new nodo(new Cliente(clientesdatos[0],clientesdatos[1],clientesdatos[2].equalsIgnoreCase("si"),operaciones)));
        }
    }
    
    public void dequeuePrint(String direccion) throws IOException{
        String doc = dequeue().cliente.getInfo();
        while(!isEmpty()){
            doc +="\n"+dequeue().cliente.getInfo();}
        System.out.println( doc);//esto imprime toda la lista que se desencolo.
        Documento.escribir(doc, direccion);
    }
    
     String dequeuePrioridad() {

            Cola Aux= new Cola();
            nodo aux = Front;
            
            while(!isEmpty()){
                if(aux.cliente.getPrioridad()){
                  return dequeue().cliente.getName(); 
               }else {
                   aux = aux.next;
               }
            }
            
            while(!Aux.isEmpty()){
              enqueue(Aux.dequeue());  
            }
                
        return null;    
    }
     
    nodo Prioridad() {

        if (this.Front != null) {
            nodo aux = this.Front;
            while (aux.next != null) {
                if (aux.cliente.getPrioridad()) {
                    nodo aux2 = aux.next;
                    aux.next = aux.next.next;
                    aux2 = this.Front;
                    this.Front = aux2;
                    return aux;
                }
                aux = aux.next;
            }
        } 
            return null;
    }
     
     
   /* void printf() { //arreglar esto
        if (this.Front == null) {
            System.out.println("");
            System.out.println("\t aqui pasa algo raro >:c");
        } else {
            nodo aux = this.Front;
            String doc = dequeue();
            int i = 0;

            System.out.println( doc);//arreglar esto
            while (aux.next != null) {
                aux = aux.next;
                System.out.println( doc);//arreglar esto
            }
        }
    }//arreglar esto*/
}



  /*class cola {

    class nodo {

        String Nom;
        String Oper;
        Boolean Prioridad;
        nodo nex;

        nodo(String nombre, String transaccion, Boolean Prioridad) {

            this.Nom = nombre;
            this.Oper = transaccion;
            this.Prioridad = Prioridad;
        }
    }

    nodo front = null;
    nodo rear = null;

    void enqueue(String Nom, String Oper, boolean Prioridad) {
        nodo nodo = new nodo(Nom, Oper, Prioridad);

        if (this.front == null) {
            this.front = nodo;
            this.rear = nodo;
        } else {
            this.rear.nex = nodo;
            this.rear = this.rear.nex;
        }
    }

    nodo dequeue() {
        if (this.front != null) {
            nodo aux = this.front;
            this.front = this.front.nex;
            aux.nex = null;
            return aux;
        } else {
            return null;
        }
    }

    
}
*/