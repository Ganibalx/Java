package org.example;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Dog("Бобик"),
                new Dog("Рекс"),
                new HomeCat("Снежок"),
                new Tiger("Шархан", 50)
                };
        for(Animals o: animals){
            o.run(150);
            o.swim(10);
        }
        System.out.println(Cat.catCount +" " + Animals.count + " " + HomeCat.homeCat);

        /*
        Cat cat = new Cat();
        cat.setName("Буся");
        cat.setAge(5);
        cat.setColor("orange");
        cat.jump();
        cat.animalInfo();

        Dog dog = new Dog("Бобик", "Синий", 15);
        dog.voice();

        Animals dog2 = new Dog("Барон", "Черный", 10);

        Animals[] catdog = {
                new Cat("Рыжик", "Рыжий", 5),
                new Dog("Тузик", "белый", 7)
                };
        for (Animals o: catdog){
            o.voice();
        }
        ((Cat)catdog[0]).clubok(); //кастуем экземпляр анималс в Cat
        if (dog2 instanceof Dog){
            dog2.jump();
        }
        */
    }
}