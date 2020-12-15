package lesson6.animal;

public class Dog extends Animal {
    private int amountOfCommands;

    public Dog(String name, int age, int amountOfCommands){
        super(name,age);
        this.amountOfCommands = amountOfCommands;
    }

    @Override
    public void sayHello() {
        System.out.println("woof!");
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("AmountOfCommands: " + amountOfCommands);
    }
}
