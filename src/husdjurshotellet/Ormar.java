package husdjurshotellet;

import javax.swing.JOptionPane;

//The subclass "Ormar" that inherits superclass Djur
//Using interface Isvar and Isort 
public class Ormar extends Djur implements Isvar, Isort {

    //constructor
    public Ormar(String name, int vikt) {
        super(name, vikt);
    }

    /*Here I used polymorphism to access the same method sort() 
    in different subclasses */ 
    @Override //dynamisk bindning
    public String sort() {
        return "ormepellets";
    }

    /*Here I used polymorphism to access the same method svar() 
    in different subclasses */
    @Override //dynamisk bindning
    public void svar(String name, int vikt) {
        this.name = name;
        this.portionGram = 20;
        JOptionPane.showMessageDialog(null, this.name + " ska få "
                + this.portionGram + " gram mat from " + sort() + ".");
    }
}
