package com.sparta;
// mass x10^24kg
// distance from sun x10^6 km
public enum Planet {

    MECURY("Mercury", 0.330, 57.9, 0.0553),
    VENUS("Venus", 4.87, 108.2, 0.815),
    EARTH("Earth", 5.97, 149.6, 1),
    MARS("Mars", 0.642, 228.0, 0.107),
    JUPITER("Jupiter", 1898, 778.5, 317.8),
    SATURN("Saturn", 568, 1432.0, 95.2),
    URANUS("Uranus", 86.8, 2867.0, 14.5),
    NEPTUNE("Neptune", 102, 4515.0, 17.1),
    PLUTO("Pluto", 0.0130, 5906.4, 0.0022);
    private final String planetName;
    private final double planetMass;
    private final double planetDistance;
    private final double planetWeightIndex;

    private Planet(String planetNme, double planetM, double planetD, double planetWI){
        this.planetName = planetNme;
        this.planetMass = planetM;
        this.planetDistance = planetD;
        this.planetWeightIndex = planetWI;
    }
    public String getPlanetName() {
        return planetName;
    }
    public double getPlanetMass(){
        return planetMass;
    }

    public double getPlanetDistance() {
        return planetDistance;
    }

    public double getYourWeight(double weightOnEarth) {
        return weightOnEarth * planetWeightIndex;
    }

    public double getPlanetDistanceFrom(Planet otherPlanet){
        return Math.abs(planetDistance - otherPlanet.planetDistance);
    }

    public boolean isAPlanet(){
        if (this.getPlanetName().equals("Pluto")){
            return false;
        } else {
            return true;
        }
    }
}

