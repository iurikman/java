package org.example;

public class Books {
    public String bookName;
    public String writer;
    public Integer cost;
    public Integer year;
    public Integer pagesNumber;

    public Books(String bookName, String writer, Integer cost, Integer year, Integer pagesNumber) {
        this.bookName = bookName;
        this.writer = writer;
        this.cost = cost;
        this.year = year;
        this.pagesNumber = pagesNumber;
    }
}
