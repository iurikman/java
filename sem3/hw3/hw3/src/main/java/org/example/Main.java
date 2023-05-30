package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Books> books = GetBooks();
        List<Books> sortedBooks = new ArrayList<>();
        List<String> resultBooks = new ArrayList<String>();
        for (Books book: books) {
            if (book.writer.contains("A") && book.year > 2010) {
                sortedBooks.add(book);
            }
        }
        for (Books book: sortedBooks) {
            if (GetSimpleNumber(book.pagesNumber)) {
                resultBooks.add(book.bookName);
            }
        }
        System.out.println("resultBooks = " + resultBooks);
    }

    private static ArrayList<Books> GetBooks() {
        ArrayList<Books> books = new ArrayList<Books>();
        books.add(new Books("q", "A", 100, 2020, 7));
        books.add(new Books("w", "S", 100, 2000, 20));
        books.add(new Books("e", "D", 100, 2000, 3));
        books.add(new Books("r", "A", 100, 2023, 1));
        books.add(new Books("t", "G", 100, 2020, 29));
        books.add(new Books("y", "A", 100, 2000, 16));
        books.add(new Books("u", "A", 100, 2021, 17));
        books.add(new Books("i", "A", 100, 2000, 13));
        return books;
    }
    private static boolean GetSimpleNumber(Integer number){
        boolean result = true;
        if (number != 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }
}