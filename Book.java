package LibrarySystem;

public class Book extends LibraryItem implements Loanable {
    private String author;

    public Book(String title, String author, String isbn) {
        super(title, isbn);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public void loanItem(Member member) {
        if (isAvailable()) {
            setAvailable(false);
            member.addLoan(new Loan(this, member));
            System.out.println("Book loaned successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public void returnItem(Member member) {
        setAvailable(true);
        member.removeLoan(this);
        System.out.println("Book returned successfully.");
    }
}