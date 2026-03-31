package solidPrinciples.OPrinciple;

public class OPrincipleViolation {

    public Invoice invoice;

    public OPrincipleViolation(Invoice invoice){
        this.invoice = invoice;
    }

    //Here we can see we are working on same invoice to save in db and to save as pdf
    // this is not correct
    public void save(Invoice invoice){
        // save to DB
    }

    public void savePdfInDb(){
        //save pdf in db
    }
}
