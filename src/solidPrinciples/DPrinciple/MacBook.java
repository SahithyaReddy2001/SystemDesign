package solidPrinciples.DPrinciple;

public class MacBook {
    public DPrinciple dPrinciple;

    //Now here I can pass either Bluetooth keyboard or wired keyboard
    public MacBook(DPrinciple dPrinciple) {
        this.dPrinciple = dPrinciple;
    }
}
