public class AfterClass14 {

    public static double CelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double KelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    public static double CelsiusToFahrenheit(double celsius) {
        return (celsius * (9.0 / 5.0)) + 32;
    }
    
    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
    
    public static double FahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * (5.0 / 9.0);
    }
    
    public static double KelvinToFahrenheit(double kelvin) {
        return (kelvin * 1.8) - 459.67;        
    }
    
    public static void main(String[] args){
        System.out.println(CelsiusToKelvin(25.0));
        System.out.println(CelsiusToFahrenheit(25.0)); //zle
        System.out.println(FahrenheitToCelsius(100.0));//zle
        System.out.println(FahrenheitToKelvin(100.0));//zle
        System.out.println(KelvinToCelsius(0));
        System.out.println(KelvinToFahrenheit(0));//zle
    }
}