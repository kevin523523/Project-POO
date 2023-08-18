package PBotones;

import PMain.Tv;

public class BotonEncender implements Boton {

  private Tv tv;
  
  public BotonEncender(Tv tv) {
    this.tv = tv;
  }

  public void presionar() {
    tv.encenderTV();
  }

}
