package PetShop;

import Animais.Animais;
import Animais.Cachorro;

public class petShop {
    
    public void darBanho(Animais animais) {
        animais.setEstadoDeEspirito("Limpo");
    
    }
    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("Tossado");
    }

    public void deixarNoHotel(Animais animais) {
        animais.setEstadoDeEspirito("Saudade");
    }
}
