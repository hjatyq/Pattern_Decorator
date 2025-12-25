package net.hajar.pattern_decorator.decorateur;

import net.hajar.pattern_decorator.produits.Boisson;

public class Chocolat extends DecorateurBoisson
{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Chocolat";
    }


    @Override
    public double cout() {
        return 1.2 +boisson.cout();
    }
}
