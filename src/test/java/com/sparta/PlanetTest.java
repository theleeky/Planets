package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {


    @Test
    @DisplayName("Test for planet name")
    void getPlanetName() {
        Assertions.assertEquals("Jupiter", Planet.JUPITER.getPlanetName());
        Assertions.assertTrue(Planet.MECURY.getPlanetName().equals("Mercury"));
    }

    @Test
    @DisplayName("Test for planet mass")
    void getPlanetMass(){
        Assertions.assertEquals(5.97, Planet.EARTH.getPlanetMass());
        Assertions.assertTrue(Planet.JUPITER.getPlanetMass() == 1898);
    }

    @Test
    @DisplayName("Test for planet distance from Sun")
    void getPlanetDistance(){
        Assertions.assertEquals(57.9, Planet.MECURY.getPlanetDistance());
        Assertions.assertTrue(Planet.NEPTUNE.getPlanetDistance() == 4515.0);
    }

    @Test
    @DisplayName("Test for weight on other planets")
    void getYourWeight(){
        Assertions.assertEquals(1, Planet.EARTH.getYourWeight(1));
        Assertions.assertTrue(Planet.MECURY.getYourWeight(1) == 0.0553);
    }

    @Test
    @DisplayName("Test distance between planet")
    void getPlanetDistanceFrom(){
        // test both ways to ensure reliability
        Assertions.assertEquals(50, (int) (Planet.MECURY.getPlanetDistanceFrom(Planet.VENUS)));
        Assertions.assertTrue((int) (Planet.VENUS.getPlanetDistanceFrom(Planet.MECURY)) == 50);
    }

    @Test
    @DisplayName("Test if planet is considered a planet")
    void isAPlanet(){
        Assertions.assertTrue(Planet.URANUS.isAPlanet());
        Assertions.assertFalse(Planet.PLUTO.isAPlanet());
    }

}