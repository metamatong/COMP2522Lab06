package ca.bcit.comp2522.bookstore;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/**
 * Represents a bookstore with a bookstore name and
 * list of books owned.
 * @author Clinton Nguyen
 * @author Kyle Cheon
 * @version 1.0
 */
class BookStore
{
    private static final int ZERO = 0;
    private static final int DECADE = 10;
    private static final int DECADE_RANGE = 9;
    private static final int PERCENTAGE_DENOMINATOR = 100;

    private final String bookStoreName;
    private final List<Novel> novels;

    BookStore(final String bookStoreName)
    {
        this.bookStoreName = validateBookStoreName(bookStoreName);
        novels = new ArrayList<>();

        novels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novels.add(new Novel("Deliverance", "James Dickey", 1970));
        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novels.add(new Novel("Falconer", "John Cheever", 1977));
        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novels.add(new Novel("Light in August", "William Faulkner", 1932));
        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novels.add(new Novel("Loving", "Henry Green", 1945));
        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novels.add(new Novel("Money", "Martin Amis", 1984));
        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novels.add(new Novel("Native Son", "Richard Wright", 1940));
        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novels.add(new Novel("1984", "George Orwell", 1948));
        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novels.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));

        final List<Novel> copyOfNovels;
        copyOfNovels = copyNovels(novels);

        final Map<String, Novel> bookstoreMap;
        bookstoreMap = new HashMap<>();

        for(Novel novel : copyOfNovels)
        {
            bookstoreMap.put(novel.getTitle(), novel);
        }

        final Iterator<String> it;
        final Set<String> keySet;
        keySet = bookstoreMap.keySet();
        it = keySet.iterator();

        while(it.hasNext())
        {
            if(it.next().toLowerCase().contains("the"))
            {
                it.remove();
            }
        }

        final List<String> keyList;
        keyList = new ArrayList<>(keySet);

        Collections.sort(keyList);

        for(String key : keyList)
        {
            System.out.println(bookstoreMap.get(key).toString());
        }
    }

    /**
     * Print the longest title novel from the novels list
     */
    public void getLongest()
    {
        Novel longestTitleNovel;
        longestTitleNovel = novels.getFirst();

        if(!novels.isEmpty())
        {
            for(final Novel novel : novels)
            {
                if(novel.getTitle().length() > longestTitleNovel.getTitle().length())
                {
                    longestTitleNovel = novel;
                }
            }
        }
        System.out.println(longestTitleNovel.getTitle());
    }

    /**
     * A method to find out whether there is at least one book written in given year.
     *
     * @param year the published year to search through.
     * @return whether there is any book published in given year.
     */
    public boolean isThereABookWrittenIn(final int year)
    {

        if(year < 0)
        {
            return false;
        }

        for(final Novel novel : novels)
        {
            if(novel != null)
            {
                if(novel.getYearPublished() == year)
                    return true;
            }
        }
        return false;
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

        for(final Novel novel: novels)
        {
            if(novel != null && novel.getTitle() != null)
            {
                if(novel.getTitle().toLowerCase().contains(word.toLowerCase()))
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
        for(Novel novel : novels)
        {
            if(novel != null)
            {
                final String titleToUppercase;
                titleToUppercase = novel.getTitle().toUpperCase();
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
        for(Novel novel : novels)
        {
            if(novel != null)
            {
                if(novel.getTitle().contains(title))
                {
                    System.out.println(novel.getTitle());
                }
            }
        }
    }

    /**
     * Prints all titles in alphabetical order, A-Z.
     */
    public void printTitlesInAlphaOrder()
    {
        final List<Novel> sortedNovels;
        sortedNovels = copyNovels(novels);
        Collections.sort(sortedNovels);
        for(Novel novel : sortedNovels)
        {
            System.out.println(novel.getTitle());
        }
    }

    /**
     * Prints all books for the inputted decade.
     * IE 2000s -> print all book titles from 2000 - 2009.
     * @param decade is the decade bound to check.
     */
    public void printGroupByDecade(final int decade)
    {
        if(decade < 0 || (decade % DECADE != 0))
        {
            throw new IllegalArgumentException("The decade must be a positive multiple of a decade.");
        }

        for(Novel novel : novels)
        {
            if(novel != null)
            {
                final int novelPublishedYear;
                novelPublishedYear = novel.getYearPublished();

                if(novelPublishedYear >= decade &&
                        novelPublishedYear <= (decade + DECADE_RANGE))
                {
                    System.out.println(novel.getTitle() + ", " + novel.getYearPublished());
                }
            }
        }
    }

    /**
     * Runs the main program.
     * @param args (unused).
     */
    /**
     * Calculates and returns percentage of books written in the given period.
     * @param first is the starting year of the given period.
     * @param last is the ending year of the given period.
     * @return the percentage of the books in between the given period.
     */
    public int whichPercentWrittenBetween(final int first,
                                          final int last)
    {
        if(first < 0 || last < 0 || last < first)
        {
            throw new IllegalArgumentException("Wrong year. Please enter correct years.");
        }

        int novelsPublishedInBetween;
        boolean novelIsPublishedInBetween;
        int resultInPercentage;

        novelsPublishedInBetween = ZERO;

        for(final Novel novel: novels)
        {
            novelIsPublishedInBetween = novel != null &&
                                        novel.getYearPublished() >= first &&
                                        novel.getYearPublished() <= last;
            if(novelIsPublishedInBetween)
            {
                novelsPublishedInBetween++;
            }
        }
        resultInPercentage = novelsPublishedInBetween * PERCENTAGE_DENOMINATOR / novels.size();

        return resultInPercentage;
    }

    /**
     * Fetches oldest novel in the novels list.
     * @return the oldest novel object.
     */
    public Novel getOldestBook()
    {
        Novel oldestNovel;
        oldestNovel = novels.getFirst();

        for(final Novel novel: novels)
        {
            boolean novelIsOlder;
            novelIsOlder = novel.getYearPublished() < oldestNovel.getYearPublished();

            if(novel != null && novelIsOlder)
            {
                oldestNovel = novel;
            }
        }

        return oldestNovel;
    }

    /**
     * Returns the list of books with given length of title.
     * @return the list of books that has given title length.
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        final List<Novel> booksThisLength;
        booksThisLength = new ArrayList<>();

        for(final Novel novel: novels)
        {
            boolean novelTitleLengthMatches;
            novelTitleLengthMatches = novel.getTitle().length() == titleLength;

            if(novel != null && novelTitleLengthMatches)
            {
                booksThisLength.add(novel);
            }
        }

        return booksThisLength;
    }

    /**
     * Drives the bookstore and novel methods and test them.
     * @param args
     */
    public static void main(final String[] args)
    {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookstore = new BookStore("Classic Novels Collection");
        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();
        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");
        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();
        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);
        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();
        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));
        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));
        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");
        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " + oldest.getYearPublished());
        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
        System.out.println("Books by decade: 2000s");
        bookstore.printGroupByDecade(2000);
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

    /*
     * Makes a copy of novels.
     * @param novels is the list of novels to copy.
     * @return the copied list of novels.
     */
    private static List<Novel> copyNovels(final List<Novel> novels)
    {
        final List<Novel> copyOfNovels;
        copyOfNovels= new ArrayList<>(novels);
        return copyOfNovels;
    }

}
