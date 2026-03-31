package solidPrinciples.SPrinciple;

public class SPrinciple {
    //S in SOLID stands for Single Responsibility Principle
    /*
    * It means that a class Should have only one reason to Change
    * so the solution s we will be categorizing the classes based on the rquirement
    * */


    // so now this class functionality is to save the book
    // and the notification regarding the books  will be moved to different class
    public void saveBook(Book b){
        //save to DB
    }
}
