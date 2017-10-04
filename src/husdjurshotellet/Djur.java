package husdjurshotellet;

public class Djur {

    /*Here I used encapsulation of instance variables and thats why we 
    can access them in just subclasses Hundar,Katter, Ormar*/
    protected String name;
    protected int vikt;
    protected int portionGram;

    //constructor
    public Djur(String name, int vikt) {
        this.name = name;
        this.vikt = vikt;
    }

}
