package ca.bcit.comp2522.bookstore;

import java.util.*;


/**
 * Represents a bookstore with a bookstore name and
 * list of books owned.
 * @author Clinton Nguyen
 * @author Kyle Cheon
 * @author Kaid Krawchuck
 * @version 1.0
 */
class BookStore<T extends Literature>
{
    private static final int ZERO = 0;
    private static final int DECADE = 10;
    private static final int DECADE_RANGE = 9;
    private static final int PERCENTAGE_DENOMINATOR = 100;

    private final String bookStoreName;
    private final List<T> items;

    BookStore(final String bookStoreName)
    {
        this.bookStoreName = validateBookStoreName(bookStoreName);
        items = new ArrayList<>();
    }

    /**
     * This method returns the number of books with titles containing the given word.
     * @param word the word to search in title of books
     * @return the number of books with title containing the given word.
     */
    public int howManyBooksContain(final String word)
    {
        if(word == null || word.isEmpty())
        {
            throw new IllegalArgumentException("Cannot determine book titles containing blanks.");
        }

        int countOfBooksContainingThisWord;
        countOfBooksContainingThisWord = ZERO;

        for(final T item: items)
        {
            if(item != null && item.getTitle() != null)
            {
                if(item.getTitle().toLowerCase().contains(word.toLowerCase()))
                {
                    countOfBooksContainingThisWord++;
                }
            }
        }
        return countOfBooksContainingThisWord;
    }

    /**
     * Prints all titles in uppercase.
     */
    public void printAllTitles()
    {
        for(T item : items)
        {
            if(item != null)
            {
                final String titleToUppercase;
                titleToUppercase = item.getTitle().toUpperCase();
                System.out.println(titleToUppercase);
            }
        }
    }

    /**
     * Prints all titles that contain the specified parameter.
     * @param title is the matching phrase to search for.
     */
    public void printBookTitle(final String title)
    {
        items.forEach(item -> {
            if(item.getTitle().contains(title)){
                System.out.println(item.getTitle());
            }
        });

    }

    /**
     * Prints all titles in alphabetical order, A-Z.
     */
    public void printTitlesInAlphaOrder()
    {
        items.sort(Comparator.comparing(Literature::getTitle, String::compareToIgnoreCase));
        items.forEach(item -> System.out.println(item.getTitle()));
    }

    /**
     * Returns the list of books with given length of title.
     * @return the list of books that has given title length.
     */
    public List<T> getBooksThisLength(final int titleLength)
    {
        final List<T> booksThisLength;
        booksThisLength = new ArrayList<>();

        for(final T item: items)
        {
            boolean novelTitleLengthMatches;
            novelTitleLengthMatches = item.getTitle().length() == titleLength;

            if(item != null && novelTitleLengthMatches)
            {
                booksThisLength.add(item);
            }
        }

        return booksThisLength;
    }

    /**
     * Adds an item to the generic list T.
     * @param item an item instance to be added to the bookstore.
     */
    public void addItem(final T item)
    {
        items.add(item);
    }

    /**
     * Prints the items in the generic list.
     */
    public void printItems()
    {
        for(T item : items)
        {
            System.out.println(item.getTitle());
        }
    }

    /**
     * Adds all items of type Novel from the items list to the specified collections
     * @param novelCollection the collection to which novels should be added.
     */
    public void addNovelsToCollection(final List<? super Novel> novelCollection)
    {
        for(final T item : items)
        {
            if(item instanceof Novel)
            {
                novelCollection.add((Novel) item);
            }
        }
    }

    // Static nested Class

    /**
     * A static nested class that provides information about the bookstore.
     */
    static class BookStoreInfo{
        /**
         * Displays the bookstore's name and the number of items available.
         * @param storeName the name of the bookstore.
         * @param itemCount the number of items available in the bookstore.
         */
        public void displayInfo(final String storeName,
                                final int itemCount)
        {
            System.out.println("BookStore: " + storeName + ", Items: " + itemCount);

        }
    }

    /**
     * An inner class that provides statistical calculations related to novels.
     */
    class NovelStatistics{
        /**
         * Finds the average title length of all items in
         * the generic list.
         * @return the average title length as a double
         */
        public double averageTitleLength()
        {
            int totalLength;
            totalLength = 0;
            for(final T item: items)
            {
                totalLength += item.getTitle().length();
            }
            final int totalListSize = items.size();
            final double titleLenghtAverage;
            titleLenghtAverage = (double) totalLength / totalListSize;
            return titleLenghtAverage;
        }
    }


    /**
     * Drives the bookstore and novel methods and test them.
     * @param args
     */
    public static void main(final String[] args)
    {
        // Part 1
        System.out.println("Lab 06");

        final BookStore<Literature> store;
        store = new BookStore<>("Kyle and Kaid's Wonderful BookStore");
        store.addItem(new Novel("War and Peace", "Leo Tolstoy", 1869));
        store.addItem(new ComicBook("Spider-Man"));
        store.addItem(new Magazine("National Geographic"));

        store.printItems();

        // Part 2 Demonstrating Nested Classes
        BookStore.BookStoreInfo info;
        info = new BookStore.BookStoreInfo();
        info.displayInfo(store.bookStoreName, store.items.size());

        BookStore<Literature>.NovelStatistics novelStats;
        novelStats = store.new NovelStatistics();
        System.out.println("Average Novel Title Length: " + novelStats.averageTitleLength());

        //Part 3
        store.printBookTitle("War");
        System.out.println("\nPrint titles in alphabetical order: ");
        store.printTitlesInAlphaOrder();

        // Part 4
        final List<Novel> novelCollection;
        novelCollection = new ArrayList<>();
        store.addNovelsToCollection(novelCollection);
        System.out.println("\nNovels in Store");
        for(Novel novel : novelCollection)
        {
            System.out.println(novel.getTitle());
        }

        // Bonus Part
        System.out.println("\nItems before sorting by title length: ");
        store.printItems();
        store.items.sort(new Comparator<Literature>(){
            @Override
            public int compare(final Literature o1,
                               final Literature o2)
            {
                return Integer.compare(o1.getTitle().length(),
                        o2.getTitle().length());
            }
        });
        System.out.println("\nItems after sorting by title length: ");
        store.printItems();
    }

    /*
     * validates book store names to make sure they are not empty.
     * @param bookStoreName is the string for book store's name.
     * @return validated book store name.
     */
    private static String validateBookStoreName(final String bookStoreName)
    {
        if(bookStoreName == null || bookStoreName.trim().isEmpty())
        {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        return bookStoreName;
    }
}
