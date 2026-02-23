package org.example;

import cz.uhk.zlomky.Zlomek;

public class Main {
    static void main() {
        IO.println("Project: Zlomek");
        IO.println("---------------");

        var A = new Zlomek(1,2); // default konstruktor
        var B = new Zlomek(3,4);

        IO.println(A.toString());
        IO.println("");
        IO.println(B.toString());
        IO.println("");

        var Plus = A.plus(B);
        var Minus = A.minus(B);
        var Multiply = A.multiply(B);
        var Divide = A.divide(B);

        IO.println("Plus : %s".formatted(Plus.Shorten()));
        IO.println("Minus : %s".formatted(Minus.Shorten()));
        IO.println("Multiply : %s".formatted(Multiply.Shorten()));
        IO.println("Divided : %s".formatted(Divide.Shorten()));

        IO.println("");

        Zlomek[] pole = new Zlomek[] {
                new Zlomek(1,3),
                new Zlomek(1,2),
                new Zlomek(6,5),
                new Zlomek(4,3),
                new Zlomek(7,8),
                new Zlomek(13,10)
        };

        Zlomek Avg = average(pole);
        IO.println("Divided : %s".formatted(Avg.Shorten()));

        int cele = Avg.intValue();
        IO.println("zlomek.cele : %s".formatted(cele));
    }

    private static Zlomek average(Zlomek[] pole) {
        var soucet = new Zlomek();
        for (var z : pole) {
            soucet = soucet.plus(z);
        }
        var div = new Zlomek(pole.length,1);
        soucet = soucet.divide(div);
        return new Zlomek(soucet.GetCitatel(),soucet.GetJmenovatel());
    }
}
