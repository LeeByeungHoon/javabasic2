package org.example.basic;

import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;

public class Main {
    public static void main(String[] args) {

        //Dancer dancer = new Dancer("총알탄 소년단", "춤신춤왕");
        //dancer.dance();

        IdolDancer idolDancer = new IdolDancer("AB","Z");
        StreetDancer streetDancer = new StreetDancer("길거리 춤꾼", "as");

        idolDancer.dance();
        System.out.println();

        streetDancer.dance();

    }
}
