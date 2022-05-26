package PApps;


import PApps.App;



/**
 * Class StreamingApp
 */
public class AppStreaming extends App implements Acciones {
    
  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement public StreamingApp () { };
  
  //
  // Methods
  //
    @Override
    public void abrir() {
        System.out.println("Iniciando la intefaz de la APP Streaming");
        JFrame sot = new JFrame();
        JButton cambio = new JButton("Fin");
        
        sot.setSize(1920,1080);
        sot.setVisible(true);
        sot.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sot.setLayout(null);
        sot.setTitle("Streaming");
       
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrado de Aplicacion");
        
        
    }


  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
