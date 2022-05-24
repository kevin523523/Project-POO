package PApps;


import PApps.App;



/**
 * Class MusicaApp
 */
public class AppMusica extends App implements Acciones{


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
        System.out.println("Ejecucion de la aplicacion");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrado de Aplicacion");
    }


  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
