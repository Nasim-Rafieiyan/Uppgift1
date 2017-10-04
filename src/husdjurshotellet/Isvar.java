package husdjurshotellet;

//Interface "Isvar" 
//By using this interface, we can just access to the method svar() in subclasses
public interface Isvar {

    /**
     * returnerar en MessageDialog består av djurens namn, mat och sorts mat
     * @param name
     * @param vikt
     */
    public void svar(String name, int vikt);
}
