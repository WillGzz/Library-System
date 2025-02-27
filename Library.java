package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;

    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public LibraryItem findItemById(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void loanItem(String itemId, String memberId) {
        LibraryItem item = findItemById(itemId);
        Member member = findMemberById(memberId);

        if (item != null && member != null && item instanceof Loanable) {
            ((Loanable) item).loanItem(member);
        } else {
            System.out.println("Loan failed.");
        }
    }

    public void returnItem(String itemId, String memberId) {
        LibraryItem item = findItemById(itemId);
        Member member = findMemberById(memberId);

        if (item != null && member != null && item instanceof Loanable) {
            ((Loanable) item).returnItem(member);
        } else {
            System.out.println("Return failed.");
        }
    }
}