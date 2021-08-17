package com.example.javafundametal.basic.collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("venus");
        planets.add("mars");
        planets.add("earth");
        planets.add("mars");

        System.out.println("set of planets: ");
        for (String planet: planets) {
            System.out.println(planet);
        }
    }
}
