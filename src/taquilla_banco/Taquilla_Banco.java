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
        Pila a = new Pila();
        String Opc;
        Opc="";
        
        
       c.enqueueClientes("Clientes.in");
       if (!c.isEmpty()){
          while(!c.isEmpty()){
              
              a.push(new nodoP(c.dequeue().cliente));
          }              
           }
       if (!a.isEmpty()){
           a.popPrint("ClientesPendientes.in");
       }
       /*c.dequeuePrint("ClientesAtendidos.in");
       
       System.out.println(c.dequeuePrioridad().cliente.getName());
       System.out.println(c.getFront().cliente.getOperaciones());*/

               
               
   
      
       
        /*do{
            
            c.printf();
            System.out.println("");
            System.out.println("\tsiguiente cliente? S/N");
            Opc= sc.nextLine();
        }while(!Opc.equals("N"));*/
       
        

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
