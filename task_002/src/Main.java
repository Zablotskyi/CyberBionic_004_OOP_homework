import java.util.Scanner;

//Завдання 2
//Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас AbstractHandler. У тілі класу створити методи
//void open(), void create(), void change(), void save(). Створити похідні класи XMLHandler, TXTHandler, DOCHandler
//від базового класу AbstractHandler. Написати програму, яка виконуватиме визначення документа і для кожного формату
//мають бути методи відкриття, створення, редагування, збереження певного формату документа.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть формат документа (xml, txt, doc):");
        String format = scanner.nextLine();
        AbstractHandler abstractHandler = null;

        switch (format) {
            case "xml": {
                abstractHandler = new XMLHandler();
                break;
            }
            case "txt": {
                abstractHandler = new TXTHandler();
                break;
            }
            case "doc": {
                abstractHandler = new DOCHandler();
                break;
            }
            default: {
                System.out.println("Невідомий формат документа");
                return;
            }
        }

        abstractHandler.open();
        abstractHandler.create();
        abstractHandler.change();
        abstractHandler.save();
    }
}
