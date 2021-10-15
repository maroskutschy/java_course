package com.ness;

import java.util.HashSet;
import java.util.Set;

public final class HevenluBody {

    private final String name;
    private final double orbintalPeriod;
    private final Set<HevenluBody> stellites;

    public HevenluBody(String name, double orbintalPeriod) {
        this.name = name;
        this.orbintalPeriod = orbintalPeriod;
        this.stellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }

    public boolean addMoon(HevenluBody moon) {
        return this.stellites.add(moon);
    }

    public Set<HevenluBody> getStellites() {
        return stellites;
    }
}
