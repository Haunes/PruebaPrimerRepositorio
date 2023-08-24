package model.heroes.dc;

//Juan Andres Serrano Mesa

import model.heroes.Villanos;

public class DCVillano implements Villanos {
    @Override
    public String getVillanoMensaje() {
        return "Traere caos al mundo, yo soy LEX LUTHOR!";
    }
}