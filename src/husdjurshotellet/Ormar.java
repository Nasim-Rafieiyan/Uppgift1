package husdjurshotellet;

import javax.swing.JOptionPane;

public class Ormar extends Djur implements Isvar, Isort {

    public Ormar(String name, int vikt) {
        super(name, vikt);
    }

    @Override
    public String sort() {
        return "ormepellets";
    }

    @Override
    public void svar(String name, int vikt) {
        this.name = name;
        this.portionGram = 20;
        JOptionPane.showMessageDialog(null, this.name + " ska få "
                + this.portionGram + " gram mat from " + sort() + ".");
    }
}
