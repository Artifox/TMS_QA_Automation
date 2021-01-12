package lesson9;

public class BoxRunner {
    public static void main(String[] args) {
        Box<String, String> box = new Box<String, String>("hello", "world");
        //Вопрос. Что будет, если не указывать параметризированный тип
        Box random = new Box(1,1);

        int i = 9;
        //Воспрос. Почему нет оператора new
        Integer intObject = i;
    }
}
