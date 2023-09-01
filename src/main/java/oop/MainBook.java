package oop;

public class MainBook {
    public static void main(String[] args) {
        Book b1 = new Book()
                .withTitle("Cheburashka")
                .withAuthor("Uspenskiy")
                .withIsbn("7384635")
                .withPages(87)
                .withPrice(150);

        Book b2 = new Book()
                .withTitle("Harry Potter")
                .withAuthor("Joanne Rowling")
                .withIsbn("4873528940")
                .withPages(453)
                .withPrice(290.99);

        System.out.println(b1);
        System.out.println(b2);
    }
}
