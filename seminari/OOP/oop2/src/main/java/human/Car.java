package human;

public class Car implements Transport{

    @Override
    public void start() {
        System.out.println("Едем на автомобиле");
    }

    public void stop() {
        System.out.println("машина остановилась");
    }
}
