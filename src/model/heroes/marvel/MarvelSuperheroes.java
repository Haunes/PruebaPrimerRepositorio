package model.heroes.marvel;

//Juan Andres Serrano Mesa

import model.heroes.Superheroes;

public class MarvelSuperheroes implements Superheroes {
    @Override
    public String getHeroesMensaje() {
        return "Jarvis anuncia mi presencia, Iron-Man ha llegado!";
    }
}