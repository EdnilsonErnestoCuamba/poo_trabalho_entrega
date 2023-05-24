package nr3;

import java.io.Serializable;

public class Animal implements Serializable {
    protected String nome;
    protected int nrPatas;
    protected  String ambiente;
    protected String cor;
    protected String tipoLocomocao;
    protected char sexo;

    public Animal(String nome, int nrPatas, String ambiente, String cor, String tipoLocomocao, char sexo) {
        this.nome = nome;
        this.nrPatas = nrPatas;
        this.ambiente = ambiente;
        this.cor = cor;
        this.tipoLocomocao = tipoLocomocao;
        this.sexo = sexo;
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

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLocomocao() {
        return tipoLocomocao;
    }

    public void setTipoLocomocao(String tipoLocomocao) {
        this.tipoLocomocao = tipoLocomocao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nr de Patas: " + nrPatas + ", Ambiente: " + ambiente + ", Cor: " + cor + ", Tipo de Locomocao: " + tipoLocomocao;
    }
    
    
}
