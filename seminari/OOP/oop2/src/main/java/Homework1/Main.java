package Homework1;

public class Main {
    public static void main(String[] args) {
        Product banan = new Product("banan", 10.5, 5);
        Product apelsin = new Product("apelsin", 15.4, 4);
        Category frukti = new Category("Фрукты", new Product[]{banan, apelsin});
        Product kartoha = new Product("Картошка", 7.5, 9);
        Product morkov = new Product("Морковка", 5.4, 6);
        Category ovoshi = new Category("Овощи", new Product[]{kartoha, morkov});
        User petya = new User("Petya", "123");
        User sergey = new User("Sergey", "321");

        System.out.println("Ассортимент");
        frukti.print();
        ovoshi.print();

        petya.buy(new Product[]{banan, kartoha});
        frukti.buy(new Product[]{banan, kartoha});
        ovoshi.buy(new Product[]{banan, kartoha});

        System.out.println("Ассортимент после покупки пети");
        frukti.print();
        ovoshi.print();

        System.out.println("Купили");
        petya.print();
    }
}
