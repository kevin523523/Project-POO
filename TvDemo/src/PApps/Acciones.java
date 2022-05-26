
package PApps;

/**
 *
 * package Acciones
 */
public interface Acciones {
    
  //
  // Fields
  //
    

    
  //
  // Constructors
  //
  //Herrera improvement 

    
  
  //
  // Methods
  //

    

  //
  // Accessor methods
  //

  //
  // Other methods
  //
    public void abrir();
    public void cerrar();
     //Jose Luis Osnaya Rosas
    public void borrar(){
      if (App.delete())
   System.out.println("La app ha sido borrado satisfactoriamente");
else
   System.out.println("La app no puede ser borrado");  
    }
}
