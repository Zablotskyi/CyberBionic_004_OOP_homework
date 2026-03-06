public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Відкриття документу .XML");
    }

    @Override
    void create() {
        System.out.println("Створення документу .XML");
    }

    @Override
    void change() {
        System.out.println("Змінено документ .XML");
    }

    @Override
    void save() {
        System.out.println("Збереження документу .XML");
    }
}
