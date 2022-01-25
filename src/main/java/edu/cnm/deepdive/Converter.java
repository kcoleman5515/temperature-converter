package edu.cnm.deepdive;

/**
 * Implement a converter from the Celsius to Fahrenheit temperature scales. double-precision ca
 */

public class Converter {

  private static final double CELSIUS_TO_FAHRENHEIT_SCALE_FACTOR = 1.8;
  private static final int CELSUIS_TO_FAHRENHEIT_INTERCEPT = 32;
  private static final String CONVERSION_DISPLAY_FORMAT = "%.2f degrees Celsius = %.2f degrees Fahrenheit.%n";
  private static final String PARSE_ERROR_FORMAT = "%s not recognized as a number.%n";

  /**
   * Converts the specified temperature, expressed in degrees Celsius, to the <b>same temperature</b> expressed in degrees fahrenheit
   *
   * @param c Celsius temperature to be converted.
   * @return Computed Fahrenheit temperature.
   */

  public static double convertC2F(double c) {
    return CELSIUS_TO_FAHRENHEIT_SCALE_FACTOR * c + CELSUIS_TO_FAHRENHEIT_INTERCEPT;
  }


/*
* Iterates over command-line arguments and attempts to convert each to a double, convert that value (assumed to be in degrees Celsius) to a Fahrenheit degrees value
*
* @param args Command-line arguments containing zero or more Fahrenheit
* */
  public static void main(String[] args) {
    for (String arg : args) {
      try {
        double celsius = Double.parseDouble(arg);
        System.out.printf(CONVERSION_DISPLAY_FORMAT, celsius, convertC2F(celsius));
      } catch (NumberFormatException e) {
        System.out.printf(PARSE_ERROR_FORMAT, arg);
      }
    }
  }

}
