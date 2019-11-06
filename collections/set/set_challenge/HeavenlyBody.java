package com.collections.set.set_challenge;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    //Note:
    // ENUM is used when we are working with the constants
    //The constants defined below are of the type BodyTypes
    public enum BodyTypes{ //Working with CONSTANTs so used enum
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    /*
    * How enum works?
    * The compiler creates the class
    * Lets take an example of the enum we have created
        class BodyTypes{
          static final BodyType STAR = new BodyType();
          static final BodyType PLANET = new BodyType();
          static final BodyType DWARF_PLANET = new BodyType();
          static final BodyType MOON = new BodyType();
          static final BodyType COMET = new BodyType();
          static final BodyType ASTEROID = new BodyType();
        }
    * Methods, constructors, variables can also be created in the  enum
    * Also an enum implements interface
    */

    //Constructor for the Heavenly bodies
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    //Adding moon to the satellites
    public boolean addSatellite (HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    //Writing equals() method
    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    //When the equals method is overridden, it is necessary to overridden the hashcode
    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    //Overriding toString() method
    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ": " + this.orbitalPeriod;
    }

    //Creating a class Key to assign a unique key to the heavenly bodies
    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())) {
                return this.bodyType == key.getBodyType();
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}

//by Ankush Chavan