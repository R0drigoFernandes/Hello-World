package Animais;

import org.w3c.dom.ls.LSOutput;

public class Cachorro extends Animais{

    private double tamDoRabo;

    public Cachorro(String raca, String nome, String cor, double altura, double peso, double tamDoRabo) {
        super(raca, nome, cor, altura, peso);
        this.tamDoRabo = tamDoRabo;
    }


    public double getTamDoRabo() {
        return tamDoRabo;
    }

    public void setTamDoRabo(double tamDoRabo) {
        this.tamDoRabo = tamDoRabo;
    }

    public void comer(){

    }


    @Override
    public void somDeAnimal() {
        System.out.println("Au Au");
    }



  

}
