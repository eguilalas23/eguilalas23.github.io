package edu.csueb.android.temperature;

public class ConverterUtil {
    public static float convFahrenheitToCelsius(float f){return ((f - 32) * 5 / 9);}
    public static float convCelsiusToFahrenheit(float c){return ((c * 9) / 5 + 32);}
}
