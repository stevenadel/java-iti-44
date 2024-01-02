package com.jets.day3;

import java.util.function.Function;

public class Temperature {
    public static void main(String[] args) {
        Function<Double, Double> convertFahrenheit = (tempCelsius) -> 1.8 * tempCelsius + 32;

        double tempFahrenheit = changeTemperature(30.0f, convertFahrenheit);
        System.out.println(tempFahrenheit);
    }

    static double changeTemperature(double temperature, Function<Double, Double> convertFahrenheit) {
        return convertFahrenheit.apply(temperature);
    }
}