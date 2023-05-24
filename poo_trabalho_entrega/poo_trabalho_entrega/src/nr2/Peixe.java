package nr2;

public class Peixe extends Animal {
    private String caract;
    
    public Peixe (String nome, String caract) {
        super(nome, 0, "-", "Mar");
        this.caract = caract;
    }

    public String getCaract() {
        return caract;
    }

    public void setCaract(String caract) {
        this.caract = caract;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCaracter: " + this.caract;
    }

    
    
}
