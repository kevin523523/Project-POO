package PConexiones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoInternetDatos {
    
    String nombreArchivo="src\\PConexiones\\internet.txt";
    public AccesoInternetDatos(){
    }

    public boolean existe() {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    public ArrayList listar() {
        ArrayList<Conexion> conexiones = new ArrayList<>();
        File archivo = new File(nombreArchivo);
        Conexion conexion;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                conexion = tokenizar(lectura);
                conexiones.add(conexion);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoInternetDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoInternetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexiones;
    }

    public void escribir(Conexion conexion, boolean anexar) {
        File archivo = new File(nombreArchivo);
        PrintWriter salida;
        try {
            salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(conexion.getSSID() + " " + conexion.getClave() );
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch (IOException ex) {
            Logger.getLogger(AccesoInternetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Conexion buscar(String buscar) {
        File archivo = new File(nombreArchivo);
        Conexion conexion = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            int indice = 1;
            while (lectura != null) {
                if (buscar != null && buscar.equalsIgnoreCase(lectura)) {
                   conexion = tokenizar(lectura);
                   break;
                }
                lectura = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoInternetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    public boolean buscar(Conexion conexion) {
        File archivo = new File(nombreArchivo);
        Conexion busqueda;
        boolean encontrado = false;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            int indice = 1;
            while (lectura != null) {
                busqueda=tokenizar(lectura);
                if (busqueda.getSSID().equalsIgnoreCase(conexion.getSSID())) {
                   encontrado = true;
                   break;
                }
                lectura = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoInternetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encontrado;
    }

    public void crear() {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            Logger.getLogger(AccesoInternetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Conexion tokenizar(String lectura) {
        StringTokenizer tokens = new StringTokenizer(lectura);
        String ssid, clave;
        Conexion conexion= null;
        while (tokens.hasMoreTokens()) {
            conexion = new Conexion();
            ssid = tokens.nextToken();
            clave = tokens.nextToken();
            conexion.setSSID(ssid);
            conexion.setClave(clave);
        }
        return conexion;
    }

}
