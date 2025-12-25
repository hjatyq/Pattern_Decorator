package net.hajar.pattern_decorator.produits;

public class Expresso extends Boisson{

    public Expresso() {
        this.description = "Expresso";
    }

    @Override
    public double cout() {
        return 12;
    }
}
