package lesson6.animal;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract void sayHello();
}
