package cz.uhk.zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    /**
     * Default Constructor
     */
    public Zlomek() {}

    /**
     * Constructor With 2 Parameters
     * @param citatel
     * @param jmenovatel
     */

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    // selector = Getter

    public int GetCitatel() {
        return citatel;
    }
    public int GetJmenovatel() {
        return jmenovatel;
    }

    // modifikatory = Setter

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }
    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    @Override
    public String toString() {

        return String.format ("%4d\n ----- \n%4d", citatel, jmenovatel);

    }
}
