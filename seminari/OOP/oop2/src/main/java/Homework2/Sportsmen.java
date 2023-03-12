package Homework2;

public abstract class Sportsmen {
    protected String name;
    protected int maxRunDist;
    protected int maxJump;
    protected String type;
    protected State state;

    public Sportsmen(String name, int maxRunDist, int maxJump, String type){
        this.name=name;
        this.maxRunDist=maxRunDist;
        this.maxJump=maxJump;
        this.type=type;
        this.state=State.start;
    }

    public void run(Treadmill treadmill){
        if (this.state!=State.lose) {
            if (treadmill.getDist() > this.maxRunDist) {
                System.out.println("Спортсмен " + this.name + " не смог пробежать " + treadmill.getDist() + "м.");
                this.state = State.lose;
            } else System.out.println("Спортсмен " + this.name + " пробежал " + treadmill.getDist() + "м.");
        }
    }

    public void jump(Wall wall){
        if (this.state!=State.lose) {
            if (wall.getHeight() > this.maxJump) {
                System.out.println("Спортсмен " + this.name + " не смог перепрыгнуть " + wall.getHeight() + "см.");
                this.state = State.lose;
            } else System.out.println("Спортсмен " + this.name + " перепрыгнул " + wall.getHeight() + "см.");
        }
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }
}
