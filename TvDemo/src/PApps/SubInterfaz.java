
package PApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class App
 */
public class SubInterfaz {
  //
  // Fields
  //
    private JFrame panel;
    private ImageIcon todo; 
    private JLayeredPane capa1;   
    private int var=0;
    private String apps[] = {"Stream","Musica"};
    JButton[] app = new JButton[apps.length];

  
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
    
    private void colocarBase(){       
        
        this.capa1.setOpaque(true);
        this.capa1.setBackground(Color.CYAN);
        this.capa1.setBounds(0,840,400,200);
        
        for(int a=0; a< apps.length; a++ ){
            this.capa1.add(app[a],Integer.valueOf(2));
        }
        this.panel.add(capa1);
    }
    
    
    private void accion(){
        App sut = new App();
        //App.Responder deton = new App.Responder();
        
        System.out.println("Esta en iniciar app");
        app[0].addActionListener(sut);
        app[1].addActionListener(sut);

    }


  //
  // Accessor methods
  //
    
    public JLayeredPane getCapa1() {
        return capa1;
    }

    public void setCapa1(JLayeredPane capa1) {
        this.capa1 = capa1;
    }

    public JFrame getPanel() {
        return panel;
    }

    public void setPanel(JFrame panel) {
        this.panel = panel;
    }

  //
  // Other methods
    
}
