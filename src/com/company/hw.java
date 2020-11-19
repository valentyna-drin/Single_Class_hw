package com.company;
import ibcsutils.Book;

public class hw {
    public static void hw2(){
        Book[] books = new Book[2];
        String[] author1 = {"Fyodor Dostoevsky"};
        String[] author2 = {"Alexander Pushkin"};
        Book book1 = new Book("The Idiot", author1, 1869);
        Book book2 = new Book("The Bronze Horseman", author2, 1837);
        books[0] = book1;
        books[1] = book2;
        for(Book book : books)
            System.out.println(book.toString());
    }
    public static void hw3(){
        Newspaper newspaper = new Newspaper("Newest Paper", 2020, 11, 18, true);
        Newspaper newspaper1 = new Newspaper("Born to live", 2003, 6, 8, false);
        Newspaper[] newspapers = {newspaper, newspaper1};
        for(Newspaper np : newspapers){
            System.out.println(np.toString());
        }
    }

}
