package Model;

import java.util.Date;

public class Book extends Item {

    private String codeBook;
    private Date year;
    private int numberPage;
    private String sizeBook;
    private String typeBook;
    private String description;
    Publisher Publisher;
    Author Author;

    public Book() {
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getSizeBook() {
        return sizeBook;
    }

    public void setSizeBook(String sizeBook) {
        this.sizeBook = sizeBook;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Publisher getPublisher() {
        return Publisher;
    }

    public void setPublisher(Publisher Publisher) {
        this.Publisher = Publisher;
    }

    public Author getAuthor() {
        return Author;
    }

    public void setAuthor(Author Author) {
        this.Author = Author;
    }

}
