package model.heroes.marvel;

//Juan Andres Serrano Mesa

import model.heroes.HeroesFactory;
import model.heroes.Superheroes;
import model.heroes.Villanos;

public class MarvelHeroesFactory implements HeroesFactory {
    @Override
    public Superheroes createSuperheroes() {
        return new MarvelSuperheroes();
    }

    @Override
    public Villanos createVillanos() {
        return new MarvelVillanos();
    }
}