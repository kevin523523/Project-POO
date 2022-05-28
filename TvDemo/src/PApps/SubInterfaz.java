
package PApps;
/*
MONTSERRAT ROJAS SANTILLAN
paquete de la aplicacion de transmision y musica
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
MONTSERRAT ROJAS SANTILLAN
los paquetes swing y awt nos ayudan a traves de eventos/metodos a crear interfaces en las clases ya sean botones de texto
pestañas con imagenes, mensajes en formato de imagenes etc
*/

/**
 * Class App
 */
public class SubInterfaz {
  /*
MONTSERRAT ROJAS SANTILLAN
la clase subinterfaz extiende el uso de ventanas para que el usuario pueda interactuar con las acciones del programa con la implementacion
de metodos y los eventos del programa y lo que la ventana pueda hacer
*/
  //
  // Fields
  //
    private JFrame panel;
    private ImageIcon todo; 
    private JLayeredPane capa1;   
    private int var=0;
    private String apps[] = {"Stream","Musica"};
    JButton[] app = new JButton[apps.length];
  /*
MONTSERRAT ROJAS SANTILLAN
los metodos privados aseguran que no puedan ser modificados, se crean paneles con especificaciones de las aplicaciones
los iconos demostraran que aplicacion se dedica a la transmision y cual a la musica, se asignan valores para diferenciar las 
posiciones de los botones de la aplicacion
*/

  
  //
  // Constructors
  //
  //Herrera improvement public App () { };
  
  //
  // Methods
  //
    public void InitInterfaz(){
            specsBoton();
            colocarBase();
            accion();
    }
/*
MONTSERRAT ROJAS SANTILLAN
se implementa un metodo que pueda ayudar a las clases abstractas a colocar las especificaciones de los botones en las pestañas
los colores que van a tener y su mision a cumplir
*/    
    private void specsBoton(){

        for(int i=0; i<apps.length; i++){
            
            this.app[i] = new JButton(apps[i]);          
            this.app[i].setOpaque(true);
            this.app[i].setBackground(Color.DARK_GRAY);
            this.app[i].setActionCommand(apps[i]);
            if(i == 0){
                
                this.app[i].setBounds(0,0,110,210);
                todo = new ImageIcon(getClass().getResource("Imagenes/video-stream.png"));
                
            }else{
                
                this.app[i].setBounds(var+110,0,110,210);
                todo = new ImageIcon(getClass().getResource("Imagenes/music.png"));
            
            }
            this.app[i].setIcon(new ImageIcon(todo.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH) ) );
            System.out.println("Boton asignado de: "+app[i].getActionCommand());
            
            this.app[i].setVisible(true);
        }
    }
  
/*
MONTSERRAT ROJAS SANTILLAN
el metodo dedicado a las especificaciones de los botones se encargaran de asignar contadores de valores dependiendo de la longitud de
valores hara una seleccion de aplicaciones para dar las especificaciones de los botones dentro de una pestaña
en dado caso que los valores comiencen desde 0 entonces se hace referencia a las aplicaciones e iniciando en la aplicacion de transmision
sino hara la misma accion pero con la app de musica
se hace referencia a los botones junto con las escalas que necesita para ejecutarse de manera que muestre un mensaje y sea visible
*/  
    
    private void colocarBase(){       
        
        this.capa1.setOpaque(true);
        this.capa1.setBackground(Color.CYAN);
        this.capa1.setBounds(0,360,400,200);
        
        for(int a=0; a< apps.length; a++ ){
            this.capa1.add(app[a],Integer.valueOf(2));
        }
        this.panel.add(capa1);
    }
/*
MONTSERRAT ROJAS SANTILLAN
se colocara la base en modo privado para asignar las especificaciones y niveles de los objetos que esten dentro de la 
capa 1 con el fin de integrar todas las instrucciones mediante un ciclo de valores
*/    
    
    private void accion(){
        App sut = new App();
        //App.Responder deton = new App.Responder();
        
        System.out.println("Esta en iniciar app");
        app[0].addActionListener(sut);
        app[1].addActionListener(sut);

    }
/*
MONTSERRAT ROJAS SANTILLAN
el metodo privado de accion se encarga de crear los objetos cque se utilizaran para poder interactuar con el comportamiento de
la aplicacion ya sea de transmision o musica, esto se realizara gracias a un contador que se encargara de medir cuando una variable
tome el valor apto para realizar una tarea de cualquier metodo
*/

  //
  // Accessor methods
  //
    
    public JLayeredPane getCapa1() {
        return capa1;
    }
  /*
MONTSERRAT ROJAS SANTILLAN
se contrendra el metodo get capa1 y se retornaran las acciones y funciones que este realizando o que se le asignaron
*/

    public void setCapa1(JLayeredPane capa1) {
        this.capa1 = capa1;
    }
/*
MONTSERRAT ROJAS SANTILLAN
se hace un contenedor de valores en el nuevo objeto de la capa 1
*/

    public JFrame getPanel() {
        return panel;
    }
  
/*
MONTSERRAT ROJAS SANTILLAN
se contrendra el metodo get panel y se retornaran las acciones y funciones que este realizando o que se le asignaron
*/
    public void setPanel(JFrame panel) {
        this.panel = panel;
    }
 /*
MONTSERRAT ROJAS SANTILLAN
se hace un contenedor de valores en el nuevo objeto del panel a utilizar por las aplicaciones
*/

  //
  // Other methods
    
}
