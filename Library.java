/*7) implement classes for a Library
There are diffrent type of books are available in the
library like Printed books, E books, and Audio books

You must use inhertance, polymorphism, encapuslation...*/

public class Library {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 218);
        EBook ebook = new EBook("1984", "George Orwell",  "PDF");
        AudioBook audiobook = new AudioBook("To Kill a Mockingbird", "Harper Lee",  12.5);

        System.out.println(printedBook.getInfo());
        System.out.println(ebook.getInfo());
        System.out.println(audiobook.getInfo());
    }
}