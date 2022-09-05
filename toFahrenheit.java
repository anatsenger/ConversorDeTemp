public class toFahrenheit {
    public static double toFahrenheitTransform(OpcoesUnidade type, double temp) {
        if(type == OpcoesUnidade.CELSIUS) {
            return temp * 1.8 + 32;
        } else if (type == OpcoesUnidade.KELVIN) {
            return (temp - 273.15) * 1.8 + 32;
        } else {
            return temp;
        }
    }
}
