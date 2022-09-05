public class toCelsius {
    public static double toCelsiusTransform(OpcoesUnidade type, double temp) {
        if(type == OpcoesUnidade.FAHRENHEIT) {
            return (temp - 32) / 1.8;
        } else if (type == OpcoesUnidade.KELVIN) {
            return temp - 273.15;
        } else {
            return temp;
        }
    }
}
