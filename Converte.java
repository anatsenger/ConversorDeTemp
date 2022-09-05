import java.text.DecimalFormat;

public class Converte {

    public static void converte(double[] temp, OpcoesUnidade entrada, OpcoesUnidade saida){
        double tempConvertida = 0;
        double somaTempConvertida = 0;
        double mediaTempConvertida;
        double somaTemp = 0;
        double mediaTemp;
        for (double temperatura : temp) {
            switch (saida) {
                case CELSIUS -> {
                    tempConvertida = format(toCelsius.toCelsiusTransform(entrada, temperatura));
                    somaTempConvertida += tempConvertida;
                    System.out.println("a temperatura de " + temperatura + " em " + entrada + " é igual a " + tempConvertida + " " + saida);
                }
                case FAHRENHEIT -> {
                    tempConvertida = format(toFahrenheit.toFahrenheitTransform(entrada, temperatura));
                    somaTempConvertida += tempConvertida;
                    System.out.println("a temperatura de " + temperatura + " em " + entrada + " é igual a " + tempConvertida + " " + saida);
                }
                case KELVIN -> {
                    tempConvertida = format(toKelvin.toKelvinTransform(entrada, temperatura));
                    somaTempConvertida += tempConvertida;
                    System.out.println("a temperatura de " + temperatura + " em " + entrada + " é igual a " + tempConvertida + " " + saida);
                }
            }
        }
        if(temp.length > 1){
            for(int i = 0;  i < temp.length; i++){
                somaTemp += temp[i];
            }
            mediaTemp = format(somaTemp / temp.length);
            mediaTempConvertida = format(somaTempConvertida / temp.length);
            System.out.println("média das temperaturas iniciais em " + entrada + " é: " + mediaTemp);
            System.out.println("média das temperaturas finais em " + saida + " é: " + mediaTempConvertida);
        }

    }

    private static double format ( double i){
        DecimalFormat formato = new DecimalFormat("#.##");
        i = Double.parseDouble(formato.format(i));
        return i;
    }
}
