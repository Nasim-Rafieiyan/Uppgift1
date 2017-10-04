package husdjurshotellet;

import javax.swing.JOptionPane;

//The subclass "Hundar" that inherits superclass Djur
//Using interface Isvar and Isort 
public class Hundar extends Djur implements Isvar, Isort {

    //constructor
    public Hundar(String name, int vikt) {
        super(name, vikt);
    }

    /*Here I used polymorphism to access the same method sort() 
    in different subclasses */
    @Override //dynamisk bindning
    public String sort() {
        return "hundfoder";
    }

    /*Here I used polymorphism to access the same method svar() 
    in different subclasses */
    @Override  //dynamisk bindning 
    public void svar(String name, int vikt) {
        this.name = name;
        this.vikt = vikt * 1000;
        this.portionGram = this.vikt / 100;
        JOptionPane.showMessageDialog(null, this.name + " ska få "
                + this.portionGram + " gram mat from " + sort() + ".");
    }

}
