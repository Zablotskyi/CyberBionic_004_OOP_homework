public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкриття документу .DOC");
    }

    @Override
    void create() {
        System.out.println("Створення документу .DOC");
    }

    @Override
    void change() {
        System.out.println("Змінено документ .DOC");
    }

    @Override
    void save() {
        System.out.println("Збереження документу .DOC");
    }
}
