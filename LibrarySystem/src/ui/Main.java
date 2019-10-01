package ui;

import model.book.Book;
import model.library.Librarian;
import model.library.Library;

import static model.book.BookType.*;

public class Main {
    public static void main(String[] args) {
         Book refBook;
         Book ficBook;
         Book nonficBook;
         Book textBook;
         Book cookBook;
         Library testLib;
         Librarian testLibrarian;
        testLib = new Library("Vancouver Public Library", null);
        refBook = new Book("Encyclopedia Britannica", "John Williams", REFERENCE, 1850, 1);
        refBook.setHomeLibrary(testLib);

        testLib.storeBook(refBook);
        refBook.notOnLoan();
        ficBook = new Book("Harry Potter and the Deathy Hallows", "J.K. Rowling", FICTION, 2007, 1);
        ficBook.setHomeLibrary(testLib);
        testLib.storeBook(ficBook);
        ficBook.notOnLoan();
        nonficBook = new Book("The Immmortal Life of Henrietta Lacks", "Rebecca Skloot", NONFICTION, 2008, 1);
        nonficBook.setHomeLibrary(testLib);
        textBook = new Book("Introduction to Algorithms", "Thomas H. Cormen", TEXTBOOK, 1992, 1);
        textBook.setHomeLibrary(testLib);
        cookBook = new Book("Mastering the Art of French Cooking", "Julia Child", COOKING, 1960, 1);
        cookBook.setHomeLibrary(testLib);



        System.out.println("onloan = " + refBook.onLoan());
        System.out.println("...........................");
        System.out.println("check if avail: " + testLib.canLoan(refBook));

        System.out.println("...........................");

        System.out.println("check out book " + testLib.checkOutBook(refBook));
        System.out.println("...........................");
        System.out.println("check if avail: " + testLib.canLoan(refBook));


    }
}