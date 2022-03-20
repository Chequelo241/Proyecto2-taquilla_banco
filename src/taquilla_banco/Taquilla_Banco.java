/* 
    Ezequiel Rodiguez C.I 30.008.226
    Albert 
    luis 
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
        
        c.enqueueClientes("Clientes.in");
        
        c.dequeuePrint("ClientesAtendidos.in");

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
