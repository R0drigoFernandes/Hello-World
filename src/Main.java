import Animais.Animais;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        Cachorro cachorro = new Cachorro("Salsicha", "Belinha", "Marron",20, 5, 3 );
        Gato gato = new Gato("Siames" , "Esmeralda", "Preto, Branco, Laranja", 15, 7, 4);
        Passaro passaro = new Passaro("Calopsita", "Yelow", "Amarelo", 5, 0.3, 4 );


      cachorro.somDeAnimal();
      gato.somDeAnimal();
      passaro.somDeAnimal();


        System.out.println("Coisas para fazer com seu cachorro");
        System.out.println("1 - Brincar");
        System.out.println("2 - elogiar");
        System.out.println("3 - repreender");
        op = scanner.nextInt();
        cachorro.reagir(op);



    }

}