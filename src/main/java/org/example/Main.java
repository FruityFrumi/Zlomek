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

        var C = A.plus(B);

        IO.println(C.toString());

        var d = C.Shorten();
        IO.println(d.toString());

    }
}
