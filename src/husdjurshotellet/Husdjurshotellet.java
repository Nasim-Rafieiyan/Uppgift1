package husdjurshotellet;

import javax.swing.JOptionPane;

public class Husdjurshotellet {

    public static void main(String[] args) {
        
        /*Here I created objects of the subclasses with type of Isvar
        By using these objects, I can access just the method "svar()"
        in subclasses*/
        Isvar s1 = new Hundar("sixten", 5);
        Isvar s2 = new Hundar("dogge", 10);
        Isvar s3 = new Katter("venus", 5);
        Isvar s4 = new Katter("ove", 3);
        Isvar s5 = new Ormar("hypo", 1);

        //To get inputs
        String s = JOptionPane.showInputDialog(null, "Vilken djur ska få mat?  ");
        s = s.toLowerCase();

        //To compare the input to name of animals to give us the right output.
        switch (s) {
            case "sixten":
                s1.svar("sixten", 5);
                System.exit(0);
            case "dogge":
                s2.svar("dogge", 10);
                System.exit(0);
            case "venus":
                s3.svar("venus", 5);
                System.exit(0);
            case "ove":
                s4.svar("ove", 3);
                System.exit(0);
            case "hypo":
                s5.svar("hypo", 1);
                System.exit(0);
        }

    }

}
