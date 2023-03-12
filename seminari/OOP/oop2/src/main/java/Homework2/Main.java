package Homework2;

public class Main {
    public static void main(String[] args) {
        Sportsmen[] sportsmen = {
                new Cat("Мурзик"),
                new Human("Иван Сидоров"),
                new Robot("Электроник")
        };
        Let[] let = {
                new Treadmill(500),
                new Treadmill(100),
                new Wall(20),
                new Treadmill(2500),
                new Wall(160)
        };
        for(Let l: let){
            for(Sportsmen s: sportsmen){
                if(l instanceof Wall){
                    s.jump((Wall) l);
                }else{
                    s.run((Treadmill) l);
                }
            }
        }
        for(Sportsmen s: sportsmen){
            if (s.getState()!=State.lose){
                System.out.println("Спортсмен "+s.name+" дошел до финиша");
            }
        }
    }
}
