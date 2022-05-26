package PBotones;

import PMain.Tv;

/**
 * Class Boton
 */
public abstract class Boton {
    //@daniel suarez nava
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 10;
    //public int volume = 6;
    public int total;
    protected Tv tv;

    //
    // Fields
    //
    //
    // Constructors
    //
    //Herrera improvement 
    public Boton() {
    }

    ;
    
    public Boton(Tv tv) {
        this.tv = tv;
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
    public abstract void execute();
}
