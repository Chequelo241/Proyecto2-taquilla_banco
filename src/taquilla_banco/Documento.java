package taquilla_banco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Documento {

    static String leer(String ruta) throws IOException {

        File x = new File(ruta);
        if (x.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            String linea;
            linea = br.readLine();
            String datos = linea;

            while ((linea = br.readLine()) != null) {
                datos += "\n" + linea;
            }
            return datos;
        }
        return null;
    }
    
    void Eliminar(String ruta){
        File x = new File(ruta);
        if(x.exists()){
            x.delete();
        }
    
    }

    static void escribir(String Dato, String direccion) throws IOException {

        FileWriter archivo = null;
        PrintWriter escritor = null;

        try {
            archivo = new FileWriter(direccion);
            escritor = new PrintWriter(archivo);

            escritor.println(Dato);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            archivo.close();

        }
    }

}
