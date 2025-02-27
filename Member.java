package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Loan> loans;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.loans = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void removeLoan(LibraryItem item) {
        loans.removeIf(loan -> loan.getItem().equals(item));
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", loans=" + loans +
                '}';
    }
}