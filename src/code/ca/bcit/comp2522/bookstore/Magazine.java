package ca.bcit.comp2522.bookstore;

public class Magazine extends Literature{

    private final String title;

    public Magazine(final String title)
    {
        this.title = title;
    }

    @Override
    public String getTitle()
    {
        return title;
    }
}
