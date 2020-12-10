package edu.ib;

public class TemperatureConverter {

    double celcjuszToKelvin(double tIn) {
        double tOut = tIn + 273.15;
        return tOut;
    }

    double celcjuszToFaren(double tIn) {
        double tOut = (tIn * 1.8) + 32;
        return tOut;
    }

    double kelvinToCelcjusz(double tIn) {
        double tOut = tIn - 273.15;
        return tOut;
    }

    double kelvinToFaren(double tIn) {
        double tOut = (tIn * 1.8) - 459.67;
        return tOut;
    }

    double farenToCelcjusz(double tIn) {
        double tOut = (tIn - 32) / 1.8;
        return tOut;
    }

    double farenToKelv(double tIn) {
        double tOut = (tIn + 459.67) * (5 / 9);
        return tOut;
    }


}
