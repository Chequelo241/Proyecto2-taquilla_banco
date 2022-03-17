/* 
    Ezequiel Rodiguez C.I 30.008.226
    Albert 
    luis 
*/

package taquilla_banco;

import java.util.Scanner;


public class Taquilla_Banco {
    static  Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        Cola c = new Cola();
        String Opc;
        Opc="";
        
        do{
            System.out.println(" ");
            System.out.println("\t\t---BIENVENIDO---");
            System.out.println(" ");
            System.out.println("1. Mostrar clientes en la cola");
            System.out.println("2. Agregar clientes a la cola");
            System.out.println("0. Salir.");
            System.out.println(" ");
            System.out.print("Indique una opcion: ");
            Opc= sc.nextLine();
            
            switch(Opc){
                
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                default:
                    System.out.println("");
                    System.out.println(" Opcion invalida");
            }
            
            
        }while(!Opc.equals("0"));
        
    }
    
}
