package PConexiones;



/**
 * Class Wifi
 */
public class Conexion {

    

  private String SSID;
  private String clave;
  private String usuario;
  
  //
  // Constructors
  public Conexion(){
  }
  public Conexion(String SSID, String clave, String usuario){
      this.SSID = SSID;
      this.clave = clave;
      this.usuario = usuario;
  }
    public Conexion(String SSID, String clave){
      this.SSID = SSID;
      this.clave = clave;
  }
  //Herrera improvement public Wifi () { };
  
  //
  // Methods
  //
    


  //
  // Accessor methods
  //

  /**
   * Fija el valor de SSID
   * @param newVar el nuevo valor de SSID
   */
  public void setSSID ( String newVar ) {
    SSID = newVar;
    System.out.println("La SSID");
  }

  /**
   * Devuelve el valor de SSID
   * @return el valor de SSID
   */
  public String getSSID ( ) {
    return SSID;
  }

  /**
   * Fija el valor de clave
   * @param newVar el nuevo valor de clave
   */
  public void setClave ( String newVar ) {
    clave = newVar;
      System.out.println("La clave es");
  }

  /**
   * Devuelve el valor de clave
   * @return el valor de clave
   */
  public String getClave ( ) {
    return clave;
  }

  /**
   * Fija el valor de usuario
   * @param newVar el nuevo valor de usuario
   */
  public void setUsuario ( String newVar ) {
    usuario = newVar;
      System.out.println("Es tu usuario ");
  }

  /**
   * Devuelve el valor de usuario
   * @return el valor de usuario
   */
  public String getUsuario ( ) {
    return usuario;
  }

  //
  // Other methods
  //
  

}
