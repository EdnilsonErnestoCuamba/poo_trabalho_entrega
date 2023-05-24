package nr3;

public class Homem extends Mamifero {
    private String nacionalidade;

    public Homem(String nome, String cor, char sexo, String nacionalidade) {
        super(nome, 2, cor, "Anda e Corre", sexo);
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nacionalidade: " + nacionalidade;
    }
    
    
}
