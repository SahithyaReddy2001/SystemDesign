package solidPrinciples.IPrinciple;

public interface IPrinciple {
    /*
    * I stands for Interface Segmented Principle
    * which means interface should be in such a way that users should not implement all
    * unwanted methods
    * */

    void cookFood();
    void washDishes();
    void serveFood();

    // so if a waiter class wants to implement this interface he need to implement all the
    // methods which is not correct
    // so we can divide the interface into 3 sub interfaces
    // waiter, cook, and cleaning interfaces
}
