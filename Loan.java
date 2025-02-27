package LibrarySystem;

import java.time.LocalDate;

public class Loan {
    private LibraryItem item;
    private Member member;
    private LocalDate loanDate;

    public Loan(LibraryItem item, Member member) {
        this.item = item;
        this.member = member;
        this.loanDate = LocalDate.now();
    }

    public LibraryItem getItem() {
        return item;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "item=" + item +
                ", member=" + member +
                ", loanDate=" + loanDate +
                '}';
    }
}