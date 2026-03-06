import java.util.Scanner;

//Завдання 5
//Напишіть на ConverterTemperature клас для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти. У класу має бути
//метод convert, який робить конвертацію.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть температуру у градусах Цельсія: ");
        double temperature = scanner.nextDouble();

        ConverterTemperature converterTemperature = new ConverterTemperature();
        converterTemperature.convert(temperature);
    }
}
