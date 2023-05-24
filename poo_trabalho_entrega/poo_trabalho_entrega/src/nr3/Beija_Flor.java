package nr3;

public class Beija_Flor extends Ave{
    private String florFavorita;

    public Beija_Flor(String nome, String cor, char sexo, String florFavorita) {
        super(nome, cor, sexo);
        this.florFavorita = florFavorita;
    }

    @Override
    public String toString() {
        return super.toString() + ", Flor Favorita: " + florFavorita;
    }
    
    
    
    
}
