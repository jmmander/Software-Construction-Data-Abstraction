package model.library;

import model.book.Book;
import model.book.BookType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Library {

    private Librarian manager;
    private String name;
    private List<Library> branches;
    private List<Book> referenceBooks = new ArrayList<>();
    private List<Book> fictionBooks = new ArrayList<>();;
    private List<Book> nonfictionBooks = new ArrayList<>();;
    private List<Book> textBooks = new ArrayList<>();;
    private List<Book> cookBooks = new ArrayList<>();;


    public Library(String nm, Librarian manager) {
        this.manager = manager;
        this.name = nm;
    }

    // getters
    public String getName() {
        return name;
    }

    public Librarian getManager() {
        return manager;
    }

    // REQUIRES: bk != null
    // MODIFIES: this
    // EFFECTS: stores the given Book bk into the appropriate container within this class
    public List storeBook(Book bk) {
        if (bk != null){
            BookType type = bk.getType();
            String stringType = type.toString();

            if (stringType.equalsIgnoreCase("REFERENCE")){
                this.referenceBooks.add(bk);
                System.out.println("in ref list");}
            else if (stringType.equalsIgnoreCase("FICTION")){
                this.fictionBooks.add(bk);}
            else if (stringType.equalsIgnoreCase("NONFICTION")){
                this.nonfictionBooks.add(bk);}
            else if (stringType.equalsIgnoreCase("TEXTBOOK")){
                this.textBooks.add(bk);}
            else if (stringType.equalsIgnoreCase("COOKING")){
                this.cookBooks.add(bk);}
            return textBooks;
        }
        return Collections.emptyList();
    }

    // REQUIRES: bk != null
    // EFFECTS: return true if the given book is in the catalogue,
    //          regardless of its loan status, else return false
    public boolean inCatalogue(Book bk){
       if (bk != null){
           if (this.referenceBooks.contains(bk) || this.fictionBooks.contains(bk) || this.nonfictionBooks.contains(bk) || this.textBooks.contains(bk) || this.cookBooks.contains(bk)) {
               return true;
           }
       }

        return false;
    }

    // REQUIRES: bk != null
    // EFFECTS: return true if the given book is available to loan
    //          Note: What requirements should a book meet to be available?
    public boolean canLoan(Book bk) {
        if (inCatalogue(bk) == true){
            System.out.println("incat is true");
            boolean outonloan = bk.onLoan();
            if (outonloan == false){
                System.out.println("loanable is true");
                return true;}
            else{
                System.out.println("loanable is false");
                return false;
            }
            }
        else{
            System.out.println("not in cat");
            return false;
        }
        }



    // REQUIRES: bk != null
    // EFFECTS: return true if the given book is available in the catalogue of this library's
    //          other branches; else, return false
    public boolean isInDiffBranch(Book bk) {
        Library homeLib = bk.getHomeLibrary();
        String location = getName();
        if (homeLib.equals(location)){ ;
            return true;
        }

        return false;
    }

    // REQUIRES: bk != null
    // MODIFIES: this
    // EFFECTS: set bk as being checked out from this library if possible
    //          return true if successful, else false
    public boolean checkOutBook(Book bk) {
        if (bk != null) {
            if (canLoan(bk) == true) {
                System.out.println("canloan is true");
                bk.nowOnLoan();
                return true;

                }
                return false;
            }
            return false;
        }



    // REQUIRES: bk != null
    // MODIFIES: this
    // EFFECTS: set bk as being back in the library if it has been borrowed previously
    //          return true if successful, otherwise false
    public boolean returnBook(Book bk) {
        if (bk != null){
            bk.notOnLoan();
            return true;}
        return false;
    }

    // REQUIRES: manager != null
    // MODIFIES: this
    // EFFECTS: sets this library's librarian to manager; return true if successful, else false
    public boolean hireLibrarian(Librarian manager) {
        //TODO: complete the implementation of this method
        return false;
    }


    // Utility method, do not touch its implementation
    public void printCatalogue() {
        List<Book> totalCatalogue = new LinkedList<>();
        totalCatalogue.addAll(this.cookBooks);
        totalCatalogue.addAll(this.fictionBooks);
        totalCatalogue.addAll(this.nonfictionBooks);
        totalCatalogue.addAll(this.textBooks);
        totalCatalogue.addAll(this.referenceBooks);

        for (Book b : totalCatalogue) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }


}
