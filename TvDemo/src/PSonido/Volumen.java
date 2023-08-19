package PSonido;

/**
 *
 * @author kevin
 */
public class Volumen {

  private int valor;

  public Volumen(int valor) {
    setValor(valor); 
  }

  public void subir() {
    if(valor < 100) {
      valor++;  
    }
  }

  public void bajar() {
    if(valor > 0) {
      valor--; 
    }
  }

  private void setValor(int valor) {
    if(valor < 0) {
      throw new IllegalArgumentException("Volumen no puede ser negativo");
    }
    this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

}

