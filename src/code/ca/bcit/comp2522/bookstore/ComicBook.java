package ca.bcit.comp2522.bookstore;

/**
 * A class representing a comic book, which is a type of literature.
 * @author Kaid Krawchuk
 * @author Kyle Cheon
 * @version 1.0
 */

public class ComicBook extends Literature {

    private final String title;

    /**
     * Constructs a ComicBook with the specified title.
     * @param title the title of the comic book.
     */
    public ComicBook(final String title)
    {
        this.title = title;
    }

    /**
     * Retrieves the title of the comic book.
     * @return the title of the comic book as a String.
     */
    @Override
    public String getTitle()
    {
        return title;
    }
}
