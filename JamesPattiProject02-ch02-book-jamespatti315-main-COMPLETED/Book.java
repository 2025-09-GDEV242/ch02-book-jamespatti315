/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (James Patti)
 * @version (9/18/25-9/21/25)
 * 
 * alright setting up, lets go through peice by peice.
 */

/**83 - create accessors for String fields (Think it good?)
 * 84 - create print utility methods for private fields(working)
 * 85 - modify object add a new private field with appropriate accessors (ok good I think)(9/20)
 * 
86 - not required (ok)

87 - add a printDetails method that displays formatted output for all private fields (done?)

88 - modify object add a new private field with appropriate accessors(date, added~)
89 - modify printDetails to add new content(done?)
90 - modify object add a new private field with appropriate accessors, mutators and reporting (uhhh
kinda the same, guess we do ..edition, signatur and another string for library,
91 - modify object add a new private field with appropriate accessors, mutators and reporting
92 - modify object add a new private field with appropriate accessors, mutators and reporting
 
*/
class Book
{
    // The fields.
    private String author;
    private String title;
    private String date;
    private int edition;
    private char signature; //either (y)yes or n(no)
    private String library;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,String bookDate,int editionType,char signatureSign,String librarySource)
    {
        author = bookAuthor;
        title = bookTitle;
        date = bookDate;
        edition = editionType;
        signature = signatureSign;
        library = librarySource;
        
    }

    // Add the methods here ...
    
    //let make that gogetter for the two strings!
    
    public String  getAuthor(){
        
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getDate(){
        return date;
    }
    
    public int editionGet(){
        return edition;
        
    }
    
    public char signatureGet(){
        return signature;
    }
    
    public String libraryGet(){
        
        return library;
    }
    //ok need now print utility method for private fields.(let me redo)
    
    public void printDetails(){
        
        System.out.println(author);
        System.out.println(title);
        System.out.println(date);
        System.out.println("New content?");
        System.out.println(edition);
        System.out.println(signature);
        System.out.println(library);
    }   
    
    //ok add print details method~
    
}
