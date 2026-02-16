package cz.uhk.zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    /**
     * Default Constructor
     */
    public Zlomek() {
        citatel = 0;
        jmenovatel = 1;
    }

    /**
     * Constructor With 2 Parameters
     * @param citatel
     * @param jmenovatel
     */

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
     /*   try {
            if(jmenovatel == 0) {

            }
        }
        catch (Exception e) {}

      */
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

        return String.format ("%d/%d", citatel, jmenovatel);

    }

    /**
     * Metoda pro sčitaní dvou zlomku
     * @param b
     * @return
     */
    public Zlomek plus(Zlomek b) {
         int jmen = jmenovatel * b.jmenovatel;
         int cit = citatel * b.jmenovatel + b.citatel * jmenovatel;
         return new Zlomek(cit,jmen);

    }
    public Zlomek plus(int b) {
        int cit = citatel  + b * jmenovatel;
        return new Zlomek(cit,jmenovatel);

    }

    public Zlomek minus(Zlomek b) {
        int jmen = jmenovatel * b.jmenovatel;
        int cit = citatel * b.jmenovatel - b.citatel * jmenovatel;
        return new Zlomek(cit,jmen);

    }public Zlomek minus(int b) {
        int cit = citatel  - b * jmenovatel;
        return new Zlomek(cit,jmenovatel);

    }

    public Zlomek multiply(Zlomek b) {
        int jmen = jmenovatel * b.jmenovatel;
        int cit = citatel * b.citatel;
        return new Zlomek(cit,jmen);
    }
    public Zlomek multiply(int b) {
        int cit = citatel * b;
        return new Zlomek(cit,jmenovatel);
    }

    public Zlomek divide(Zlomek b) {
        int jmen = jmenovatel * b.citatel;
        int cit = citatel * b.jmenovatel;
        return new Zlomek(cit,jmen);
    }
    public Zlomek divide(int b) {
        int jmen = jmenovatel * b;
        return new Zlomek(citatel,jmen);
    }

    public Zlomek Shorten(){
        int divide = nsd(citatel,jmenovatel);

        return new Zlomek(citatel/divide,jmenovatel/divide);
    }

    // vypocet nejvetčiho společneho dělitele
    private int nsd(int a, int b) {
        int c ;
        if (a < b ) { c = b ; b = a; a = c; }
        int zbytek;
        do {
            zbytek = a % b;
            a = b;
            b = zbytek;
        }while (zbytek != 0);
        return a;
    }
}

