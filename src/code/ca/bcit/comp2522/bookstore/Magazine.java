package ca.bcit.comp2522.bookstore;

/**
 * A class representing a magazine, which is a type of literature.
 * @author Kaid Krawchuk
 * @author Kyle Cheon
 * @version 1.0
 */
public class Magazine extends Literature{

    private final String title;

    /**
     * Constructs a Magazine with the specified title.
     * @param title title of the magazine
     */
    public Magazine(final String title)
    {
        this.title = title;
    }

    /**
     * Retrieves teh title of the magazine.
     * @return the title of the magazine as a String.
     */
    @Override
    public String getTitle()
    {
        return title;
    }
}
