package human;

public class Human {
    private Transport current;

    public void stop(){
        if(current!=null){
            current.stop();
            current=null;
        }
        else System.out.println("Не начали движение");
    }
    public void drive(Transport transport){
        if (current==null){
            transport.start();
            current=transport;
        }
        else{
            System.out.println("Уже едем!");
        }
    }
}
