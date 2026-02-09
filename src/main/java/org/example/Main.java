package org.example;

import cz.uhk.zlomky.Zlomek;

public class Main {
    static void main() {
        IO.println("Project: Zlomek");
        IO.println("---------------");

        var A = new Zlomek(4,2); // default konstruktor

        IO.println(A.toString());
    }
}
