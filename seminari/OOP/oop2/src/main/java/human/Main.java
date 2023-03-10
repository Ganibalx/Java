package human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        human.drive(bicycle);
        human.stop();
    }
}
