package PBotones;

import PMain.Tv;



/**
 * Class BotonSubirVolumen
 */
public class BotonSubirVolumen extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonSubirVolumen () {
        super();
    };
    public BotonSubirVolumen (Tv tv) {
        super(tv);
    };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

    @Override
    public void execute() {
        subirVolumen();
    }
//Manuel Melchor Gaspar 
    private void subirVolumen() {
        if (this.tv.getVolumen() >= MAX_VOLUME) {
            System.out.println("Es lo maximo que se puede subir ");
        } else {
            this.tv.subirVolumen();
            System.out.println("Subir volumen = " + this.tv.getVolumen());
            //this.tv.bajarVolumen(total); 

        }

    }

}
