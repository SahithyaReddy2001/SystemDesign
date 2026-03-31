package solidPrinciples.SPrinciple;

public class SPrincipleViolation {
    /*
    * If we see here there are two different functionalities to change this class
    * 1) when there is change in save logic
    * 2) when there is change in notification logic
    * which is not correct as changing one method may impact the code of tested method*/

    public void saveBook(Book b){
        //save to DB
    }

    public void notifyUsers(){
        //Notify users regarding the book
    }
}
