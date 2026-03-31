package solidPrinciples.LPrinciple;

public class Bike implements LPrinciple{
    @Override
    /*
    * Here we are narrowing the parent class functionality because
    * if a user thinks bike can turn on the engine and tries it
    * he will get a runtime exception
    * */
    public void turnOnEngine() {
        throw new RuntimeException();
    }

    @Override
    public void accelerate() {

    }
}
