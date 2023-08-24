package model.heroes.marvel;

//Juan Andres Serrano Mesa

import model.heroes.Villanos;

public class MarvelVillanos implements Villanos {
    @Override
    public String getVillanoMensaje() {
        return "Destruire a los vengadores, thanos dominara el universo completo!";
    }
}