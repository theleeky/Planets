# Planets

This project is to demonstrate and practice newly learned Java, utilising new an enum,
`Planet`, containing 9 instances (9 planets plus `PLUTO`), and methods utilising these instances.
Jupiter is utilised to test these methods.

---

The instances in the Enum look like:
 
`EARTH("Earth", 5.97, 149.6, 1)` 

Where:
- `EARTH()` represents the Object
- `"Earth"` represents the planets name is utilised with the `getPlanetName()` method
- `5.97` represents the planets Mass  x10<sup>24</sup> kg and is utilised by the `getPlanetMass()` method
- `149.6` represents the planets Distance from the sun x10<sup>6</sup> km and is utilised by the `getPlanetDisance()` method
- `1` represents the planets relative weight index and is utilised by the `getPlanetWeight()` method
\

Additional methods include:

- `getPlanetWeight() ` accepts a parameter that should represent weight on Earth and is successfully converted 
to the weight one would be on the given planet.\
- `getPlanetDistanceFrom()` accepts a parameter that should include another `Planet` object that will 
successfully output the distance the 2 planets. Example:
  - `Planet.VENUS.getPlanetDistanceFrom(Planet.MERCURY)` will output the distance between the 2 planets
- `isAPlanet` will output true or false based on if the object is considered a planet by NASA.

This an example test, testing the `getPlanetWeight` method.
```java

    @Test
    @DisplayName("Test for weight on other planets")
    void getYourWeight(){
        Assertions.assertEquals(1, Planet.EARTH.getYourWeight(1));
        Assertions.assertTrue(Planet.MECURY.getYourWeight(1) == 0.0553);
    }
```
