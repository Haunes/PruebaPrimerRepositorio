package model.heroes.dc;

//Juan Andres Serrano Mesa

import model.heroes.HeroesFactory;
import model.heroes.Superheroes;
import model.heroes.Villanos;

public class DCHeroFactory implements HeroesFactory {
    @Override
    public Superheroes createSuperheroes() {
        return new DCSuperheroes();
    }

    @Override
    public Villanos createVillanos() {
        return new DCVillano();
    }
}
