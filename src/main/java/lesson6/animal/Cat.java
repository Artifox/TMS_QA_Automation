package lesson6.animal;

public class Cat extends Animal {
    private boolean isCatchMice;
    private String instagramPage;

    public Cat(String name, int age, boolean isCatchMice, String instagramPage) {
        super(name, age);
        this.isCatchMice = isCatchMice;
        this.instagramPage = instagramPage;
    }

    public String getInstagramPage() {
        return instagramPage;
    }

    public void sayHello(){
        System.out.println("Meow!");
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("isCatchMice: " + isCatchMice);
        System.out.println("Instagram: " + instagramPage);
    }
}
