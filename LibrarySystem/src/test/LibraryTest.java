package test;

import model.book.Book;
import model.library.Librarian;
import model.library.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static model.book.BookType.*;
import static org.junit.Assert.*;

public class LibraryTest {

    private Book refBook;
    private Book ficBook;
    private Book nonficBook;
    private Book textBook;
    private Book cookBook;
    private Library testLib;
    private Librarian testLibrarian;

    @Before
    public void setUp() {
        testLib = new Library("Vancouver Public model.library.Library", testLibrarian);
        testLibrarian = new Librarian("Alan Kay", 11, testLib, ficBook);

        refBook = new Book("Encyclopedia Britannica", "John Williams", REFERENCE, 1850, 1);
        refBook.setHomeLibrary(testLib);
        testLib.storeBook((refBook));
        refBook.notOnLoan();
        ficBook = new Book("Harry Potter and the Deathy Hallows", "J.K. Rowling", FICTION, 2007, 1);
        ficBook.setHomeLibrary(testLib);
        testLib.storeBook((ficBook));
        ficBook.notOnLoan();
        nonficBook = new Book("The Immmortal Life of Henrietta Lacks", "Rebecca Skloot", NONFICTION, 2008, 1);
        nonficBook.setHomeLibrary(testLib);
        testLib.storeBook((nonficBook));
        nonficBook.notOnLoan();
        textBook = new Book("Introduction to Algorithms", "Thomas H. Cormen", TEXTBOOK, 1992, 1);
        textBook.setHomeLibrary(testLib);
        testLib.storeBook((textBook));
        textBook.notOnLoan();
        cookBook = new Book("Mastering the Art of French Cooking", "Julia Child", COOKING, 1960, 1);
        cookBook.setHomeLibrary(testLib);
        testLib.storeBook((cookBook));
        cookBook.notOnLoan();
    }

    @Test
    public void testGetName() {
        assertEquals(testLib.getName(), "Vancouver Public model.library.Library");
    }

    @Test
    public void testinCatalogue() {
        testLib.storeBook((refBook));
        assertEquals(testLib.inCatalogue(refBook), true);
        testLib.storeBook((cookBook));
        assertEquals(testLib.inCatalogue(cookBook), true);
        testLib.storeBook((ficBook));
        assertEquals(testLib.inCatalogue(ficBook), true);
        testLib.storeBook((textBook));
        assertEquals(testLib.inCatalogue(textBook), true);
    }

    @Test
    public void testcanLoan() {
        System.out.println((testLib.canLoan(refBook)));
        assertTrue(testLib.canLoan(refBook));
        testLib.checkOutBook(refBook);
        System.out.println(testLib.checkOutBook(refBook));
        assertFalse(testLib.canLoan(refBook));
        System.out.println((testLib.canLoan(refBook)));
        /*
        assertEquals(testLib.canLoan(refBook), true);
        testLib.checkOutBook(refBook);
        assertEquals(testLib.canLoan(refBook), false);

        assertEquals(testLib.canLoan(cookBook), true);
        testLib.checkOutBook(cookBook);
        assertEquals(testLib.canLoan(cookBook), false);
    */}

    @Test
    public void testreturnBook() {
        assertEquals(testLib.canLoan(textBook), true);
        assertEquals(testLib.checkOutBook(textBook), true);
        assertEquals(testLib.canLoan(textBook), false);
        assertEquals(testLib.returnBook(textBook), true);
        assertEquals(testLib.canLoan(textBook), true);
    }

    @Test
    public void testStoreBook() {
        List textBooks = testLib.storeBook(textBook);
        assertEquals(true, textBooks.contains(textBook));
    }

}