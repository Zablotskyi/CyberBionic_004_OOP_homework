public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Відкриття документу .TXT");
    }

    @Override
    void create() {
        System.out.println("Створення документу .TXT");
    }

    @Override
    void change() {
        System.out.println("Змінено документ .TXT");
    }

    @Override
    void save() {
        System.out.println("Збереження документу .TXT");
    }
}
