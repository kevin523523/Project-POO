
package PResoluciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ResolucionDatos {
    
    public static String direcFile = "src\\PResoluciones\\ResolucionSoportadas.txt";
    
    
    public static ArrayList leerArchivo(){ 
        File archivo = new File(direcFile);
        ArrayList<String> resoluciones = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                resoluciones.add(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println(resoluciones);
        return resoluciones;
    }
    
    
}
