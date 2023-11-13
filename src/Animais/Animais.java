package Animais;

public abstract class Animais {
    static int numeroDeAnimais;
    private String raca;
    private String nome;
    private String cor;
    private double altura;
    private double peso;
    private String estadoDeEspirito;




    public Animais(String raca, String nome, String cor, double altura, double peso) {
        this.raca = raca;
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;

        numeroDeAnimais++;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
    public abstract void somDeAnimal();

    


    public static int getNumeroDeAnimais() {
        return numeroDeAnimais;
    }

    public static void setNumeroDeAnimais(int numeroDeAnimais) {
        Animais.numeroDeAnimais = numeroDeAnimais;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
}
