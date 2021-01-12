package lesson6.animal;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Markiz",3,true,"instagramUrl");
        cat.sayHello();
        cat.printInfo();
        cat.getInstagramPage();
        Animal dog = new Dog("Pit",2,20);

        dog.printInfo();
        dog.sayHello();
    }
}
