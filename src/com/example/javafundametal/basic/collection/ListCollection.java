package com.example.javafundametal.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {

        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List of planets: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("index [" + i + "] " + planets.get(i));
        }
    }
}
