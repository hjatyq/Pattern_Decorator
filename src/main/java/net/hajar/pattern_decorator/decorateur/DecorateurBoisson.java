package net.hajar.pattern_decorator.decorateur;

import net.hajar.pattern_decorator.produits.Boisson;

public abstract class DecorateurBoisson extends Boisson {

    protected Boisson boisson; // par composition

    // agregation

    public DecorateurBoisson(Boisson boisson) {
        this.boisson=boisson;
    }
}
