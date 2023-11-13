import Animais.Animais;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import PetShop.petShop;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int op;

    Cachorro cachorro = new Cachorro("Salsicha", "Belinha", "Marron", 20, 5, 3);
    Gato gato = new Gato("Siames", "Esmeralda", "Preto, Branco, Laranja", 15, 7, 4);
    Passaro passaro = new Passaro("Calopsita", "Yelow", "Amarelo", 5, 0.3, 4);
    petShop petShop = new petShop();

    cachorro.somDeAnimal();
    gato.somDeAnimal();
    passaro.somDeAnimal();

    petShop.darBanho(cachorro);
    System.out.println(cachorro.getEstadoDeEspirito());
    petShop.tosar(cachorro);
    System.out.println(cachorro.getEstadoDeEspirito());
    petShop.deixarNoHotel(cachorro);
    System.out.println(cachorro.getEstadoDeEspirito());
   

  }

}