package taquilla_banco;

public class Cola {
    
    class nodo {
    
    Cliente cliente;
    nodo next;
    
    public void nodo(Cliente in){
        this.cliente = in;
    }
    
    }
    private nodo Front;
    private nodo Rear;
    
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
            this.Rear = in;
            this.Rear = this.Rear.next;
        }
        
    }
    
    nodo dequeue(){
        if (!this.isEmpty()){
            nodo aux = this.Front;
            this.Front = this.Front.next;
            aux.next = null;
            return aux;
        }else{
            return null;
        }
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