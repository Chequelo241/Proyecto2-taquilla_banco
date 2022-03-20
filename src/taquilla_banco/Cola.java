package taquilla_banco;

import java.io.IOException;

public class Cola {
    
    private nodo Front = null;
    private nodo Rear = null;
    
    boolean isEmpty(){
        return Front == null;
    }
    
    String getFront(){
        nodo aux = null;
        if (this.Front != null){
            return "El primero en la cola es: "+Front.cliente.getName();
        }else{
            return "La cola está vacía";
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
    
    String dequeue(){
        if (this.Front == null){
            return null;
        }else{
            nodo aux = this.Front;
            this.Front = this.Front.next;
            aux.next = null;
            return aux.cliente.getName();
        }
    }
    
    public void  enqueueClientes(String fuente) throws IOException{
        String[] clientes = Documento.leer(fuente).split("\n");
        String[] clientesdatos;
        for (String i:clientes){
            clientesdatos = i.split(" ");
            enqueue(new nodo(new Cliente(clientesdatos[0],clientesdatos[1],clientesdatos[2].equalsIgnoreCase("Si"),clientesdatos[3])));
        }
    }
    
    public void dequeuePrint(String direccion) throws IOException{
        String doc = dequeue();
        while(!isEmpty()){
            doc +="\n"+dequeue();}
        Documento.escribir(doc, direccion);
    }
    
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

    void printf() {
        if (this.front == null) {
            System.out.println("");
            System.out.println("\t aqui pasa algo raro >:c");
        } else {
            nodo aux = this.front;
            int i = 0;

            System.out.println("\tNro " + (i + 1) + "- " + aux.Nom + " " + aux.Oper + " " + aux.Prioridad);
            while (aux.nex != null) {
                i++;
                aux = aux.nex;
                System.out.println("\tNro " + (i + 1) + "- " + aux.Nom + " " + aux.Oper + " " + aux.Prioridad);
            }
        }

    }

    void Prioridad() {

        if (this.front != null) {
            nodo aux = this.front;
            while (aux.nex != null) {
                if (aux.nex.Prioridad) {
                    nodo aux2 = aux.nex;
                    aux.nex = aux.nex.nex;
                    aux2.nex = this.front;
                    this.front = aux2;
                }
                aux = aux.nex;
            }
        } else {
            System.out.println("");
            System.out.println("\t Alguien quito lo que se iba a encolar :/");
        }
    }
}
*/