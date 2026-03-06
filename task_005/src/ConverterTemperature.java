public class ConverterTemperature {
    void convert(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Температура у Цельсіях: " + celsius);
        System.out.println("Температура у Кельвінах: " + kelvin);
        System.out.println("Температура у Фаренгейтах: " + fahrenheit);
    }
}
