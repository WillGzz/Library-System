package LibrarySystem;
public abstract class LibraryItem {

    private String title;
    private String id;
    private boolean isAvailable;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract String getItemType();

    @Override
    public String toString() {
        return getItemType() + "{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}