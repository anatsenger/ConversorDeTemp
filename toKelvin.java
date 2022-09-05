public class toKelvin {
    public static double toKelvinTransform(UnityOptions type, double temp) {
        if(type == UnityOptions.CELSIUS) {
            return temp + 273.15;
        } else if (type == UnityOptions.FAHRENHEIT) {
            return (temp - 32) * 0.55 + 273.15;
        } else {
            return temp;
        }
    }
}
