package solidPrinciples.LPrinciple;

public interface LPrinciple {
    /*
    * L stands for Liskov's substitution principle
    * If Class B is subclass of Class A then we should be able to replace  the object of class A with class B
    * i.e A child class should extend the capability of parent and should not narrow it down
    *
    * The solution is we need create 3 interfaces
    *                           IVehicle(Only common methods here)
    *           IEngine vehicle            INormal vehicle
    *        Bike   Car                      BiCycle
    * */
    public void turnOnEngine();
    public void accelerate();
}
