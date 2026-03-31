package solidPrinciples.OPrinciple;

public class OPrinciple implements invoiceInterface{
    /*
    * O Stands for Open for extension closed for modifications
    * that means if a class already has a functionality we should not modify it or its objects
    * but we should be able to extends it functionalities
    * */
    @Override
    public void save() {
        // save to db
    }
}
