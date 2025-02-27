
package LibrarySystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Catalog catalog = new Catalog();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");

        library.addItem(book1);
        library.addItem(book2);
        catalog.addItem(book1);
        catalog.addItem(book2);

        Member member1 = new Member("John Doe", "M001");
        library.addMember(member1);

        library.loanItem("1234567890", "M001");
        library.returnItem("1234567890", "M001");

        System.out.println("Search results for '1984': " + catalog.searchByTitle("1984"));
    }
}