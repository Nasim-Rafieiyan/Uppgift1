package husdjurshotellet;

import javax.swing.JOptionPane;

//The subclass "Katter" that inherits superclass Djur
//Using interface Isvar and Isort 
public class Katter extends Djur implements Isvar, Isort {

    //constructor
    public Katter(String name, int vikt) {
        super(name, vikt);
    }

    /*Here I used polymorphism to access the same method sort() 
    in different subclasses */
    @Override //dynamisk bindning
    public String sort() {
        return "kattfoder";
    }

    /*Here I used polymorphism to access the same method svar() 
    in different subclasses */
    @Override //dynamisk bindning
    public void svar(String name, int vikt) {
        this.name = name;
        this.vikt = vikt * 1000;
        portionGram = this.vikt / 150;
        JOptionPane.showMessageDialog(null, this.name + " ska få "
                + this.portionGram + " gram mat from " + sort() + ".");
    }

}
