package com.example.javafundametal.basic.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, Planet> planets = new HashMap<>();
        planets.put("key 1", new Planet("mercury", 0.06));
        planets.put("key 2", new Planet("venus", 0.82));
        planets.put("key 3", new Planet("earth", 1.00));
        planets.put("key 1", new Planet("mars", 0.06));
        planets.put("key 3", new Planet("earth v2", 1.06));

        System.out.println("Map of planets: ");
        for (String key: planets.keySet()) {
            System.out.println(key + ": " + planets.get(key));
        }
    }
}

class Planet {
    private String name;
    private double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}
