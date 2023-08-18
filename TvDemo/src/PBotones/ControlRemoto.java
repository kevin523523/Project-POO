package PBotones;

import PMain.Tv;

/**
 *
 * @author kevin
 */
public class ControlRemoto {
  private Tv tv;

  Boton botonApagar;
  Boton botonEncender;
  Boton botonSubirVolumen;
  Boton botonBajarVolumen;
  
  public ControlRemoto(Tv tv) {
      this.tv = tv;
      botonEncender = new BotonEncender(tv); 
      botonApagar = new BotonApagar(tv);
  }
  public void presionarEncender() {
    botonEncender.presionar();
  }

  public void presionarApagar() {  
    botonApagar.presionar();
  }
  
  public void presionarSubirVolumen() {
    botonSubirVolumen.presionar();
  }

  public void presionarBajarVolumen() {  
    botonBajarVolumen.presionar();
  }
}
