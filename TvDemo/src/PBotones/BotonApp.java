package PBotones;


import PApps.SubInterfaz;
import PMain.Tv;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLayeredPane;

/**
 * Class BotonBajarVolumen
 * Paez Moedano Alan Eduardo
 */
public class BotonApp extends Boton {

  //
  // Fields
  //
    private JLayeredPane capa1 = new JLayeredPane();
    private JFrame base = new JFrame();
    private SubInterfaz start;
    
  //
  // Constructors
  //
  //Paez Moedano Alan Eduardo
    public BotonApp () {
        super();
    };
    public BotonApp (Tv tv) { 
        
        super(tv);
        this.addActionListener(e->execute());
    };

  
  //
  // Methods
  //Paez Moedano Alan Eduardo
    public void specsVentana(){

        this.base.setSize(800,600);
        this.base.setVisible(true);
        this.base.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.base.setLayout(null);
        this.base.setTitle("Aplicaciones");
    }
    

     

  //
  // Accessor methods
  //
    

  //
  // Other methods
  //Paez Moedano Alan Eduardo

    @Override
    public void execute() {
        mostrarMenuApp();
    }

    private void mostrarMenuApp() {
        start = new SubInterfaz();
        specsVentana(); 

        start.setCapa1(capa1);
        start.setPanel(base);
        
        System.out.println("Esta en boton");
        start.InitInterfaz();
        
        

    }

}
