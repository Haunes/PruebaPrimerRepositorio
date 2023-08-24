package model.heroes.dc;

//Juan Andres Serrano Mesa

import model.heroes.Superheroes;

public class DCSuperheroes implements Superheroes {
    @Override
    public String getHeroesMensaje() {
        return "Soy el protector de Gotham, yo soy BATMAN!";
    }
}