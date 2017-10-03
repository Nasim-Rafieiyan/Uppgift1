package husdjurshotellet;

import javax.swing.JOptionPane;

public class Katter extends Djur implements Isvar, Isort {

    public Katter(String name, int vikt) {
        super(name, vikt);
    }

    @Override
    public String sort() {
        return "kattfoder";
    }

    @Override
    public void svar(String name, int vikt) {
        this.name = name;
        this.vikt = vikt * 1000;
        portionGram = this.vikt / 150;
        JOptionPane.showMessageDialog(null, this.name + " ska få "
                + this.portionGram + " gram mat from " + sort() + ".");
    }

}
