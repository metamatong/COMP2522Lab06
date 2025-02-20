package ca.bcit.comp2522.bookstore;

/**
 * An abstract clas representing a piece of literature.
 * This serves as a base class for different types of literature,
 * requiring subclasses to provide a title.
 * @author Kaid Krawchuk
 * @author Kyle Cheon
 * @version 1.0
 */
public abstract class Literature {

    /**
     * Retrieves teh title of the literature
     * @return the title of teh literature as a String.
     */
    public abstract String getTitle();
}
