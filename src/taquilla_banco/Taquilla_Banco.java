/* 
    EZEQUIEL RODRIGUEZ C.I 30.008.226
    ALBERT HENRIQUEZ C.I
    LUIS SUAREZ C.I 
*/
package taquilla_banco;
import java.io.IOException;
import java.util.Scanner;


public class Taquilla_Banco {
    static  Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) throws IOException {
        
        String lista;
        Cola c = new Cola();
        String Opc;
        Opc="";
<<<<<<< HEAD
        
        c.enqueueClientes("C:\\Users\\Usuario\\Documents\\Proyectos-Programas\\Clientes.txt");
        
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        
=======
       c.enqueueClientes("Clientes.in");
       System.out.println(c.Prioridad().cliente.getName());
       System.out.println(c.dequeue().cliente.getName());
       
               
               
   
      
       
        /*do{
            
            c.printf();
            System.out.println("");
            System.out.println("\tsiguiente cliente? S/N");
            Opc= sc.nextLine();
        }while(!Opc.equals("N"));*/
       
>>>>>>> origin/EZE
        

         /*   switch(Opc){
                
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                default:
                    System.out.println("");
                    System.out.println(" Opcion invalida");
            }
            
            
        }while(!Opc.equals("0"));*/
        
    }
    
}
