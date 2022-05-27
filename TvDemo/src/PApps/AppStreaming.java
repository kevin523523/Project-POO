package PApps;
/*
MONTSERRAT ROJAS SANTILLAN
paquete de la aplicacion de transmision y musica
*/

import PApps.App;
/*
MONTSERRAT ROJAS SANTILLAN
importacion del paquete apps en el codigo App
*/


/**
 * Class StreamingApp
 */
public class AppStreaming extends App implements Acciones {
    
  //
  // Fields
  //
/*
MONTSERRAT ROJAS SANTILLAN
se crea una clase para la aplicacion de la transmision con las extensiones de la aplicacion app y sus respectivas acciones
*/
  
  //
  // Constructors
  //
  //Herrera improvement public StreamingApp () { };
  
  //
  // Methods
  //
    @Override
    public void abrir() {
        System.out.println("Iniciando la intefaz de la APP Streaming");
        JFrame sot = new JFrame();
        JButton cambio = new JButton("Fin");
        
        sot.setSize(1920,1080);
        sot.setVisible(true);
        sot.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sot.setLayout(null);
        sot.setTitle("Streaming");
       
    }
    
/*
MONTSERRAT ROJAS SANTILLAN
se implementara el metodo para abrir las interfaces de las aplicaciones de transmision y musica para asignar cambios en 
los botones de las pestañas, que especificaciones tiene y los parametros que debera cubrir la pestaña
*/

    @Override
    public void cerrar() {
        System.out.println("Cerrado de Aplicacion");
/*
MONTSERRAT ROJAS SANTILLAN
cierra la aplicacion con un mensaje una vez que se haya terminado la ejecucion y las acciones que se desearon hacer
*/       
        
    }


  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
