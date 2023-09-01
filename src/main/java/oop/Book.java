package oop;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private double price;
    public Book() {
        if (title == null || author == null || isbn == null || pages <= 0 || price <= 0) {
            return;
        } else {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.pages = pages;
            this.price = price;
        }
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) { return;}
        this.title = title;
    }
    public Book withTitle(String title) {
        if (title == null || title.isEmpty()) { return this;}
        this.title = title;
        return this;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) { return;}
        this.author = author;
    }
    public Book withAuthor(String author) {
        if (author == null || author.isEmpty()) { return this;}
        this.author = author;
        return this;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.isEmpty()) { return;}
        this.isbn = isbn;

    } public Book withIsbn(String isbn) {
        if (isbn == null || isbn.isEmpty()) { return this;}
        this.isbn = isbn;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) { return;}
        this.pages = pages;
    }
    public Book withPages(int pages) {
        if (pages <= 0) { return this;}
        this.pages = pages;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) { return;}
        this.price = price;
    }
    public Book withPrice(double price) {
        if (price <= 0) { return this;}
        this.price = price;
        return this;
    }
    @Override
    public String toString() {
        return "oop.Book{" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", isbn = '" + isbn + '\'' +
                ", pages = " + pages +
                ", price = " + price + " NIS" +
                '}';
    }
}
