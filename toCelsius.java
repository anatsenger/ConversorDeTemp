public class toCelsius {
    public static double toCelsiusTransform(UnityOptions type, double temp) {
        if(type == UnityOptions.FAHRENHEIT) {
            return (temp - 32) / 1.8;
        } else if (type == UnityOptions.KELVIN) {
            return temp - 273.15;
        } else {
            return temp;
        }
    }
}
