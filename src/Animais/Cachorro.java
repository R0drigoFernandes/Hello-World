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

    public String brincar(){
        return "pegou a bolinha \n" + "Entregou a Bolinha";
    }
    public void elogiar(){
        System.out.println("Seu cachorro balancou o rabo e está feliz!");
    }
    public void repreender(){
        System.out.println("Seu cachorro ficou triste!");
    }


    public  void reagir(int acao){
        switch(acao){
            case 1: System.out.println("Jogou a bolinha");
                System.out.println(brincar());
                break;
            case 2: System.out.println("Bom garoto!");
                elogiar();
                break;
            case 3: System.out.println("Menino mau!");
                repreender();
                break;
        }
        if(acao > 3){
            System.out.println("Comando invalido");
        }

    }

}
