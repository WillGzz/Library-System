package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<LibraryItem> items;

    public Catalog() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> searchByTitle(String title) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }

    public List<LibraryItem> searchByAuthor(String author) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Book && ((Book) item).getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }
}
