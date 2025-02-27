package LibrarySystem;

public interface Loanable {
    void loanItem(Member member);
    void returnItem(Member member);
}