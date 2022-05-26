package PApps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/*
MONTSERRAT ROJAS SANTILLAN
para poder realizar los metodos de la interfaz en las clases abstractas, se utilizaran los metodos swing y awt 
que nos ayudan a crear los botones que se vayan a utilizar ya sean de texto, imagen, iconos
etc; estos nos ayudaran a crear nuevas pestañas para mostrar las operaciones de la television.
para que el kit de herramientas awt tenga mas opciones, se pueden utilizar los eventos para facilitar los cambios 
que se hagan dentro de las clases abstractas, estos seran accionados por medio de los botones
*/

/**
 * Class App
 */
public class App implements ActionListener {
    AppStreaming stream;
    AppMusica music;
    Acciones hacer;
  //
  // Fields
  //


  
  //
  // Constructors
  //
  //
    public App(){
    }
    
    public App(AppStreaming a, Acciones b){
        this.stream = a;
        this.hacer = b;
    }
    
    public App(AppMusica c, Acciones b){
        this.music = c;
        this.hacer = b;
    }
    
    App(JFrame panel) {
        this.up = panel;
        
    }
  
  //
  // Methods
  //
    

  //
  // Accessor methods
  //


  //
  // Other methods
  //
    @Override
    public void actionPerformed(ActionEvent e) {
	stream = new AppStreaming();
        music = new AppMusica();
        System.out.println("Esta en la activacion de APPs");
        //System.out.println("El valor de APP en activacion: "+e.getActionCommand());
        if ("Stream".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Stream");
            stream.abrir();
            
        }else if ("Musica".equals(e.getActionCommand())) {
            music.abrir();
            System.out.println("Activo la App Musica");
	
        }
    }

}
