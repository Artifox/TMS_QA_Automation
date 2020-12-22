package lesson7;

public class Book implements BookPrintable, Searchable {
    private String name;
    private String author;
    String content;

    public Book(String name, String author, String content) {
        this.name = name;
        this.author = author;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("print book");
    }

    @Override
    public void printTitle() {
        System.out.println("print book title:");
    }

    @Override
    public boolean containsText(String text) {
        return content.contains(text);
    }

}
