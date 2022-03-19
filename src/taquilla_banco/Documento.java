
package taquilla_banco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Documento {
        
     static String leer(String ruta) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(ruta)); 

        String linea;
        linea = br.readLine();
        String datos = linea;
        
        while ((linea = br.readLine()) != null) {
            datos += " " + linea;
        }
        return datos;
    }
    
}
