package PMain;

import PMedidas.Dimension;
import PSonido.Altavoz;
import PConexiones.ConexionWifi;
import PEntradas.Entrada;
import PApps.App;
import PResoluciones.Resolucion;
import PBotones.Boton;
import PBotones.BotonApagar;
import PBotones.BotonBajarVolumen;
import PBotones.BotonEncender;
import PBotones.BotonSubirVolumen;
import PSonido.Volumen;
import java.util.ArrayList;
import java.util.List;


/**
 * Class Tv
 */
public class Tv {
  private Dimension dimension;
  private List<Altavoz> altavoces;
  private Volumen volumen;
  private Resolucion resolucion;
  private List<Boton> botones;
  private List<Entrada> entradas;
  private List<App> apps;
  private ConexionWifi wifi;
  private boolean estadoWifi;
  private EstadoTv estado;
  
  public enum EstadoTv {
    ENCENDIDO,
    APAGADO  
  }

  public Tv () { 
      
      botones = new ArrayList<Boton>();
      Boton ba = new BotonApagar(this);
      Boton be = new BotonEncender(this);
      Boton bs = new BotonSubirVolumen(this);
      Boton bb = new BotonBajarVolumen(this);
      
      botones.add(ba);
      botones.add(be);
      botones.add(bs);
      botones.add(bb);
      
      
      be.presionar();
      this.print();
      ba.presionar();
      this.print();
      bs.presionar();
      this.print();
      bb.presionar();
      this.print();
      
      for(int i = 0; i < botones.size(); i++) {
          Boton bx = botones.get(i);
          bx.presionar();
          this.print();
      }
  };

  public void setDimension ( Dimension newVar ) {
    dimension = newVar;
  }

  public Dimension getDimension ( ) {
    return dimension;
  }

  public void setAltavoces ( List<Altavoz> newVar ) {
    altavoces = newVar;
  }

  public List<Altavoz> getAltavoces ( ) {
    return altavoces;
  }

  public void setResolucion ( Resolucion newVar ) {
    resolucion = newVar;
  }

  public Resolucion getResolucion ( ) {
    return resolucion;
  }
  public void setBotones ( List<Boton> newVar ) {
    botones = newVar;
  }
  public List<Boton> getBotones ( ) {
    return botones;
  }

  public EstadoTv getEstado ( ) {
    return estado;
  }

  public void setEntradas ( List<Entrada> newVar ) {
    entradas = newVar;
  }

  public List<Entrada> getEntradas ( ) {
    return entradas;
  }
  public void setApps ( List<App> newVar ) {
    apps = newVar;
  }

  public List<App> getApps ( ) {
    return apps;
  }
  public void setWifi ( ConexionWifi newVar ) {
    wifi = newVar;
  }

  public ConexionWifi getWifi ( ) {
    return wifi;
  }

  public void setEstadoWifi ( boolean newVar ) {
    estadoWifi = newVar;
  }

  public boolean getEstadoWifi ( ) {
    return estadoWifi;
  }


  public void encenderTV() {
    this.estado = EstadoTv.ENCENDIDO;
  }
  
  public void apagarTV() {
    this.estado = EstadoTv.APAGADO;
  }


  public void print() {
      System.out.println("" + this.toString());
  }
  
  public String toString() {
      String s = "";
      s += this.estado;
      s += this.volumen;
      return s;
  }
}
