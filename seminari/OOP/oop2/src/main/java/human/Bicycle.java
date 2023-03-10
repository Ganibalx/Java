package human;

public class Bicycle implements Transport{

    @Override
    public void start() {
        System.out.println("Едем на мотоцикле");
    }

    public void stop() {
        System.out.println("мотоцикл остановился");
    }
}
