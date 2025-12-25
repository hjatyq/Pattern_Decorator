package net.hajar.pattern_decorator;

import net.hajar.pattern_decorator.decorateur.Chocolat;
import net.hajar.pattern_decorator.decorateur.Noisette;
import net.hajar.pattern_decorator.decorateur.Vanille;
import net.hajar.pattern_decorator.produits.Boisson;
import net.hajar.pattern_decorator.produits.Deca;
import net.hajar.pattern_decorator.produits.Expresso;
import net.hajar.pattern_decorator.produits.Sumatra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternDecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternDecoratorApplication.class, args);

        Boisson  boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        //------------------------------------------
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        //------------------------------------------

        boisson=new Deca();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson=new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());


        //------------------------------------------
        boisson=new Expresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson=new Vanille(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("***********************");
        Boisson b = new Vanille(new Chocolat(new Noisette(new Chocolat(new Sumatra()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());
    }



}
