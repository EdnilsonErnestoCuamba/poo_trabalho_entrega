package nr2;

import java.io.Serializable;

public class Animal implements Serializable {
    protected String nome;
    protected int nrPatas;
    protected String cor;
    protected String ambiente;

    public Animal(String nome, int nrPatas, String cor, String ambiente) {
        this.nome = nome;
        this.nrPatas = nrPatas;
        this.cor = cor;
        this.ambiente = ambiente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrPatas() {
        return nrPatas;
    }

    public void setNrPatas(int nrPatas) {
        this.nrPatas = nrPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    
    @Override
    public String toString () {
        return "Nome: " + this.nome + "\nNr de patas: " + this.nrPatas + "\nCor: " + this.cor + "\nAmbiente: " + this.ambiente;
    }
}
