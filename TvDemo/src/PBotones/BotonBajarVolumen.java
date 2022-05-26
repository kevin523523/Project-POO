package PBotones;

import PMain.Tv;



/**
 * Class BotonBajarVolumen
 */
public class BotonBajarVolumen extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonBajarVolumen () {
        super();
    };
    public BotonBajarVolumen (Tv tv) { 
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
        bajarVolumen();
    }
//@Daniel Suarez Nava
    private void bajarVolumen() {
               
      if (this.tv.getVolumen() > MIN_VOLUME) {
          this.tv.bajarVolumen();
          System.out.println("Bajar volumen = " + this.tv.getVolumen());
        }else{
             System.out.println("es lo maximo que se puede bajar");
             }
   }

}
