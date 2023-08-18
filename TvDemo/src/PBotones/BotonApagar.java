package PBotones;

import PMain.Tv;


public class BotonApagar implements Boton {
    private Tv tv;
    public BotonApagar(Tv tv) {
    this.tv = tv;
  }

  public void presionar() {
    tv.apagarTV();
  }

}
