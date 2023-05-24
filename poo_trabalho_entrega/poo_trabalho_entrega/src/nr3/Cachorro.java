package nr3;

public class Cachorro extends Mamifero {
    private String raca;
    
    public Cachorro(String nome, String cor, char sexo, String raca) {
        super(nome, 4, cor, "Anda e Corre", sexo);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raca: " + raca;
    }
    
    
    
}
