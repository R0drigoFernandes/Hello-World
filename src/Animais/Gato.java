package Animais;

public class Gato extends Animais {
    private double tamDoRabo;

    public Gato(String raca, String nome, String cor, double altura, double peso, double tamDoRabo) {
        super(raca, nome, cor, altura, peso);
        this.tamDoRabo = tamDoRabo;
    }

    @Override
    public void somDeAnimal() {
        System.out.println("Miau Miau");
    }
}

