public class toKelvin {
    public static double toKelvinTransform(OpcoesUnidade type, double temp) {
        if(type == OpcoesUnidade.CELSIUS) {
            return temp + 273.15;
        } else if (type == OpcoesUnidade.FAHRENHEIT) {
            return (temp - 32) * 0.55 + 273.15;
        } else {
            return temp;
        }
    }
}
