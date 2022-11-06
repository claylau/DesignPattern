package com.example.designpattern.observer;

/**
 * function desc
 *
 * @author lauz
 * @since 2022/11/5
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentDisplay(weatherData);
        weatherData.update("rain");
    }
}
