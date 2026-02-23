package cz.uhk.merapp;

import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.Zlomek;

public class MereniApp {
    static void main() {
        var mereni = new Mereni();


        mereni.addNumber(1);
        mereni.addNumber(1.5);
        mereni.addNumber(1);
        mereni.addNumber(0);
        mereni.addNumber(21);


        mereni.addNumber(new Zlomek(5,10));
        mereni.addNumber(new Zlomek(5,6));
        mereni.addNumber(new Zlomek(7,8));
        mereni.addNumber(new Zlomek(50,5));
        mereni.addNumber(new Zlomek(1,5));

        IO.println("soucet = %g ".formatted(mereni.addTogether()));
        IO.println("average is %g ".formatted(mereni.average()));
        IO.println("Max is %s ".formatted(mereni.maximum()));
        IO.println("Min is %s ".formatted(mereni.minimum()));

        for (int i = 0; i < mereni.getSize() ; i++){
            IO.println(mereni.getNumber(i));
        }
    }
}
