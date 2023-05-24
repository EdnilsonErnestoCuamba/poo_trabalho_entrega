package nr3;

import java.util.List;
import java.util.ArrayList;

public class numero_3 {

    public static void main(String[] args) {
        List<Cachorro> listC = new ArrayList<Cachorro>();
        List<Homem> listH = new ArrayList<Homem>();
        List<Beija_Flor> listBF = new ArrayList<Beija_Flor>();
        
        listC.add(new Cachorro("Keen", "castanho", 'M', "Malttez"));
        listC.add(new Cachorro("Link", "Branco", 'F', "Maltez"));
        listC.add(new Cachorro("lenny", "Preto e Castanho", 'F', "Pastor Alemao"));
        
        listH.add(new Homem("Ednilson Cuamba", "Castanho-escuro", 'M', "Estudante"));
        listH.add(new Homem("Travis Scott", "Light-brown", 'M', "ASTRO WORLD"));
        
        listBF.add(new Beija_Flor("Pantagona", "Cinza-esverdeada", 'F', "Cacto"));
        
        System.out.println("CACHORROS");
        for (Cachorro cachorro : listC) {
            System.out.println(cachorro);
        }
        
        System.out.println("\nHOMENS");
        for (Homem homem : listH) {
            System.out.println(homem);
        }
        
        System.out.println("\nBEIJA - FLORES");
        for(Beija_Flor bf : listBF) {
            System.out.println(bf);
        }
        
        Tarefa.gravacao(listC, "Cachorro.dat");
        Tarefa.gravacao(listH, "Homem.dat");
        Tarefa.gravacao(listBF, "Beija_Flor.dat");
        
        /*List<Cachorro> objCachorro = (List<Cachorro>) Tarefa.leitura("Cachorro.dat");
        List<Homem> objHomem = (List<Homem>) Tarefa.leitura("Homem.dat");
        List<Beija_Flor> objBflor = (List<Beija_Flor>) Tarefa.leitura("Beija_Flor.dat");
        
        System.out.println("CACHORROS");
        for (Cachorro cr : objCachorro) {
            System.out.println(cr);
        }
        
        System.out.println("\nHOMENS");
        for (Homem homem : objHomem) {
            System.out.println(homem);
        }
        
        System.out.println("\nBEIJA - FLORES");
        for(Beija_Flor bf : objBflor) {
            System.out.println(bf);
        }*/
    }
    
}
