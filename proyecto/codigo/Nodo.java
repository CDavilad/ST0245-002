
package ProyectoF;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Nodo {
    public void leerCSV(){
      ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("D:\\0_test_balanced_5000.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while((linea = br.readLine())!=null){
               String[] datosDeLinea = linea.split(";");
               ArrayList<String> datosTemporal = new ArrayList<String>();
               for(String dato : datosDeLinea){
                   datosTemporal.add(dato);
               }
               datos.add(datosTemporal);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}