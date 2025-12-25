package net.hajar.pattern_decorator.decorateur;

import net.hajar.pattern_decorator.produits.Boisson;

public class Lait extends DecorateurBoisson
{
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Lait";
    }


    @Override
    public double cout() {
        return 2 +boisson.cout();
    }
}
