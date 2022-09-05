public class toFahrenheit {
    public static double toFahrenheitTransform(UnityOptions type, double temp) {
        if(type == UnityOptions.CELSIUS) {
            return temp * 1.8 + 32;
        } else if (type == UnityOptions.KELVIN) {
            return (temp - 273.15) * 1.8 + 32;
        } else {
            return temp;
        }
    }
}
