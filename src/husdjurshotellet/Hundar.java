package husdjurshotellet;

import javax.swing.JOptionPane;

public class Hundar extends Djur implements Isvar, Isort {

    public Hundar(String name, int vikt) {
        super(name, vikt);
    }

    @Override
    public String sort() {
        return "hundfoder";
    }

    @Override
    public void svar(String name, int vikt) {
        this.name = name;
        this.vikt = vikt * 1000;
        this.portionGram = this.vikt / 100;
        JOptionPane.showMessageDialog(null, this.name + " ska få "
                + this.portionGram + " gram mat from " + sort() + ".");
    }

}
