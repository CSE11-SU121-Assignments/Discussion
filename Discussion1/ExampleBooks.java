class Author {
    // member variables
    String name;
    String fullName;
    //int followers

    /*
    // Java's Autogenerated constrctor
    Author(/*NO PARAMETERS HERE*?){

    }
    */

    // constructor
    Author(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    // toText is a method
    // returns: The authors's name
    // params: none
    // returns: an authors name
    String toText() {
        return this.fullName;
    }
    
}


class Book {
    String title;
    Author author;
    int price;

    Book(String title, Author author, int price) {
        this.title = title;

        this.author = author;
        this.price = price;
    }

    String truncateTitle(int length) {
        if (this.title.length() <= length) {
            return this.title;
        } else {
            return this.title.substring(0, length) + "...";
        }
    }

    String toText() {
        return this.author.toText() + ": " + this.truncateTitle(12);
    }
}


// purpose: test Author and Book classes
// in PA2, tester class wil be to test User and Tweet classes
class ExampleBooks {
    Author tolkien = new Author("JRR Tolkien", "John Ronald Reuel Tolkien");
    Book theTwoTowers = new Book("The Two Towers", tolkien, 8);
    String authorText = tolkien.toText();

}