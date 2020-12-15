package lesson6.person;

public class Accountant extends Employee {
    private boolean head;
    public Accountant(String name, int age, String phone, String company, boolean head) {
        super(name, age, phone, company);
        this.head = head;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }
}
