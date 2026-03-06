public class Player implements Recodable, Playable {


    @Override
    public void play() {
        System.out.println("Програвання музики");
    }

    @Override
    public void record() {
        System.out.println("Запис музики");
    }

    @Override
    public void pause() {
        System.out.println("Пауза музики");
    }

    @Override
    public void stop() {
        System.out.println("Зупинка музики");
    }
}
