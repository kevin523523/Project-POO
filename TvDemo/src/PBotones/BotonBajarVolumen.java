package PBotones;

import PMain.Tv;
import PSonido.Volumen;



/**
 * Class BotonBajarVolumen
 */
public class BotonBajarVolumen implements Boton {
  //
  // Constructors
    private Tv tv;
    private Volumen volumen;
    public BotonBajarVolumen(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void presionar() {
        volumen = new Volumen(10);
        volumen.bajar();
    }

}
