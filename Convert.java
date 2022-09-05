import java.text.DecimalFormat;

public class Convert {

    public static void convert(double[] temp, UnityOptions input, UnityOptions output){
        double convertTemp;
        double sumTempConvert = 0;
        double avgTempConvert;
        double sumTemp = 0;
        double avgTemp;
        for (double temperature : temp) {
            switch (output) {
                case CELSIUS -> {
                    convertTemp = format(toCelsius.toCelsiusTransform(input, temperature));
                    sumTempConvert += convertTemp;
                    System.out.println("a temperature de " + temperature + " em " + input + " é igual a " + convertTemp + " " + output);
                }
                case FAHRENHEIT -> {
                    convertTemp = format(toFahrenheit.toFahrenheitTransform(input, temperature));
                    sumTempConvert += convertTemp;
                    System.out.println("a temperature de " + temperature + " em " + input + " é igual a " + convertTemp + " " + output);
                }
                case KELVIN -> {
                    convertTemp = format(toKelvin.toKelvinTransform(input, temperature));
                    sumTempConvert += convertTemp;
                    System.out.println("a temperature de " + temperature + " em " + input + " é igual a " + convertTemp + " " + output);
                }
            }
            sumTemp += temperature;
        }
        if(temp.length > 1){

            avgTemp = format(sumTemp / temp.length);
            avgTempConvert = format(sumTempConvert / temp.length);
            System.out.println("A média das temperaturas iniciais em " + input + " é: " + avgTemp);
            System.out.println("A média das temperaturas finais em " + output + " é: " + avgTempConvert);
        }

    }

    private static double format ( double i){
        DecimalFormat formato = new DecimalFormat("#.##");
            i = Double.parseDouble(formato.format(i));
        return i;
    }
}
