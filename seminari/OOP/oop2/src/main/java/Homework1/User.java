package Homework1;

public class User {
    String login;
    String password;
    Basket basket;

    public User(String login, String password){
        this.login=login;
        this.password=password;
    }

    public void buy(Product[] product){
        this.basket = new Basket(product);
        for (Product o: product){
            System.out.println("Вы купили: " + o.name);
        }

    }

    public void print(){
        for (Product a: this.basket.array){
            System.out.println(a.name);
        }
    }
}
