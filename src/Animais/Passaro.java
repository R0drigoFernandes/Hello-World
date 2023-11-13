package Animais;

public class Passaro extends Animais{
    private double tamDaCauda;
    public Passaro(String raca, String nome, String cor, double altura, double peso, double tamDaCauda) {
        super(raca, nome, cor, altura, peso);
        this.tamDaCauda = tamDaCauda;
    }
    @Override
    public void somDeAnimal(){
        System.out.println("Piu Piu");
    }
}
