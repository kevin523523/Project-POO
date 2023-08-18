package PBotones;

import PMain.Tv;
import PSonido.Volumen;



/**
 * Class BotonSubirVolumen
 */
public class BotonSubirVolumen implements Boton {

  //
  // Constructors
    private Tv tv;
    private Volumen volumen;
    public BotonSubirVolumen(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void presionar() {
        volumen = new Volumen(10);
        volumen.subir();
    }


}
