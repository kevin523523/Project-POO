package PApps;

/*
MONTSERRAT ROJAS SANTILLAN
paquete de la aplicacion de transmision y musica
*/


import PApps.App;

/*
MONTSERRAT ROJAS SANTILLAN
se importa el paquete y codigo fuente de la aplicacion de transmision y musica
*/

/**
 * Class MusicaApp
 */
public class AppMusica extends App implements Acciones{

/*
MONTSERRAT ROJAS SANTILLAN
se crea la clase de app de musica con las extensiones de la aplicacion app y sus respectivas acciones
*/
  
  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement public MusicaApp () { };
  
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
        sot.setTitle("Musica");
       
    }
  
/*
MONTSERRAT ROJAS SANTILLAN
se implementara el metodo para abrir las interfaces de las aplicaciones de transmision y musica para asignar cambios en 
los botones de las pestañas, que especificaciones tiene y los parametros que debera cubrir la pestaña
*/

    @Override
    public void cerrar() {
        System.out.println("Cerrado de Aplicacion");
    }
    //Jose Luis Osnaya Rosas
    public void borrar(){
         if (App.delete())
   System.out.println("La app ha sido borrado satisfactoriamente");
else
   System.out.println("La app no puede ser borrado");  
    
    }

/*
MONTSERRAT ROJAS SANTILLAN
cierra la aplicacion con un mensaje una vez que se haya terminado la ejecucion y las acciones que se desearon hacer
*/
  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
