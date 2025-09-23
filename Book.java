/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 * 
 * Is this immutable? no technically not, while nothing can really change the variables the fact some are public does mean that if a outside object is 
 * set it could change them like if I made a function calling for a newTitle() in another block, like lets call that new object "re-publish"
 * it could alter the assignments of fields even after a instance of a object is made. (I am trying to use the prober nomenclenture, its a bit over
 * -whelming but managing.
 *
 * @author James Patti
 * 9/22/25
 * 
 * let redo this.
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; //value set below in constructor
    private String refNumber; // will set it in constructor below to none aka ""
    private int borrowed = 0; //how many times it been burrowed, incremenr this!
    private final boolean  courseText; //work on this it binarary yes or niet

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseTextCheck)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = courseTextCheck;
        
    }

    //the last accessor, sorry if bit spaghetti but all works.
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    // Add the methods here ...
    //ok mutator for burrowed, (its late getting bit tired)
    public void incrementBurrow()
    {
        borrowed++;     //increments this up by one when called
        
    }
    
    //now acccessor
    
    public int getBorrowed()
    {
        
        return borrowed;
    }
    
    //ok here we make a muttator for the refNumber field
    //now we modify it so ref only set if more then 3 digits.
    
    public  void setRefNumbers(String ref)
    {
         if(ref.length() >= 3)  { 
              refNumber = ref;  
    }
        else{
            System.out.print("ERROR");
            refNumber = "";
        }
    
    }
    
    //and its accessor sibling
    
    
    public String getRefNumbers()
    {
        return refNumber;
    }
    //ok lets add two methods
    
    //gets the author
    public String getAuthor()
    {
        return author;
    }
    
    //gets the title 
    public String getTitle()
    {
        return title;
    }
    
    //here the accessor for pages.
     public int getPages()
    {
        return pages;
    }
    
    //ok two new methods for print
    
    public void printAuthor()
    {
        System.out.print(author);
    }
    
    
    
     public void printTitle()
    {
        System.out.print(title);
    }
    
    //here we get a spread od details, formating little wonky by been hot minute since used prints
    public void printDetails()
    {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Pages:" + pages);
        System.out.println("This book has been burrowed" + borrowed + "times");
        //now we need one for ref with a if condition
        if(refNumber.length() == 0) {
            refNumber = "zzz";
            System.out.println("RefNumber is" + refNumber);
        }
        else {
            System.out.println("RefNumber is" + refNumber);
        }
    }
}
