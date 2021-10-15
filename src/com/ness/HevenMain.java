package com.ness;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HevenMain {

    private static Map<String, HevenluBody> solarSystem = new HashMap<>();
    private static Set<HevenluBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HevenluBody temp = new HevenluBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HevenluBody("Venus", 20);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HevenluBody("Earth", 56);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HevenluBody tempMoon = new HevenluBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(temp);

        System.out.println("Planets");
        for(HevenluBody planet : planets) {
            System.out.println(planet.getName());
        }

        HevenluBody body = solarSystem.get("Jupiter");
        System.out.println(body.getName());
        for(HevenluBody jupiterMoon: body.getStellites()) {
            System.out.println(jupiterMoon.getName());
        }


    }

}
