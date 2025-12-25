package net.hajar.pattern_decorator.decorateur;

import net.hajar.pattern_decorator.produits.Boisson;

public class Vanille extends DecorateurBoisson
{
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Vanille";
    }


    @Override
    public double cout() {
        return 3 +boisson.cout();
    }
}
