package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {
    public static void main(String[] args) {
        
        WeatherDBI b = new WeatherDBI();
        GeoLocation a = new GeoLocation();
        String c;
        c = a.search(21.543333, 39.172778);
        System.out.println(b.getWeatherInfo(c));



    }
}
