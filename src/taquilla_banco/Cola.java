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
    
    public void  enqueueClientes(String fuente) throws IOException{//lee un documento y encola lo quer  leyo.
        if (Documento.leer(fuente)!= null){
        String[] clientes = Documento.leer(fuente).split("\n");
        
        String[] clientesdatos;
        String[] operaciones;
        for (String i:clientes){
            clientesdatos = i.split(" ");
            operaciones = clientesdatos[3].split(",");
            enqueue(new nodo(new Cliente(clientesdatos[0],clientesdatos[1],clientesdatos[2].equalsIgnoreCase("si"),operaciones)));
        }
        }
    }
    
    public void dequeuePrint(String direccion) throws IOException{//desencolar e imprimir en un documento.
        String doc = dequeue().cliente.getInfo();
        while(!isEmpty()){
            doc +="\n"+dequeue().cliente.getInfo();}
        Documento.escribir(doc, direccion);
    }
    
    void dequeuePrioridad() {//Desencola un cliente cuando tiene piroridad para ser "atendido" primero.

        if (this.Front != null) {
            nodo aux = this.Front;
            
        while (aux.next != null) {
                if (aux.next.cliente.getPrioridad()) {
                    nodo aux2 = aux.next;
                    aux.next = aux.next.next;
                    aux2.next = this.Front;
                    this.Front = aux2;
                    break;
                }
                if (aux.next != null) {
                    aux = aux.next;
                }
            }
        }        
    }
}
