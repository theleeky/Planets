package com.sparta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static DecimalFormat formatter = new DecimalFormat("#0.0000");

    public static void main(String[] args) {
        Planet planet = Planet.MECURY;
        System.out.println(planet.getPlanetName() + " is " + planet.getPlanetMass() + "x10^24 kg");
        System.out.println(planet.getPlanetName() + " is " + planet.getPlanetDistance() + "x10^6 km  from the Sun");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight on Earth in Kg: ");
        double yourWeight = input.nextDouble();
        System.out.println("Your weight on " + planet.getPlanetName() + " is "
                + formatter.format(planet.getYourWeight(yourWeight)) + "kg" );
        if (planet.isAPlanet()){
            System.out.println(planet.getPlanetName() + " is a planet!");
        } else {
            System.out.println(planet.getPlanetName() + " is unfortunately not considered a planet.");
        }
    }
}