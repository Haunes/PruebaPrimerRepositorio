package model;

//Juan Andres Serrano Mesa

import java.util.Random;
import model.heroes.*;
import model.heroes.dc.DCHeroFactory;
import model.heroes.marvel.MarvelHeroesFactory;

public class Launcher {

    public static void main(String[] args) {
        HeroesFactory factory = null;

        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);

        if (i < 5) {
            factory = new DCHeroFactory();
        } else {
            factory = new MarvelHeroesFactory();
        }

        Superheroes superhero = factory.createSuperheroes();
        Villanos villain = factory.createVillanos();

        System.out.println(superhero.getHeroesMensaje());
        System.out.println(villain.getVillanoMensaje());
    }
}