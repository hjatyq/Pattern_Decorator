package net.hajar.pattern_decorator.produits;

public class Deca extends Boisson{

    public Deca() {
        this.description = "Deca";
    }

    @Override
    public double cout() {
        return 8;
    }
}
