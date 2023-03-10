package human;

public class Skate implements Transport{

    @Override
    public void start() {
        System.out.println("Едем на скейте");
    }

    public void stop() {
        System.out.println("скейт остановился");
    }
}
