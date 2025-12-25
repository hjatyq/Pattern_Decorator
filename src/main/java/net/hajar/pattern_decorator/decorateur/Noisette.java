package net.hajar.pattern_decorator.decorateur;

import net.hajar.pattern_decorator.produits.Boisson;

public class Noisette extends DecorateurBoisson
{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Noisette";
    }


    @Override
    public double cout() {
        return 5+boisson.cout();
    }
}
