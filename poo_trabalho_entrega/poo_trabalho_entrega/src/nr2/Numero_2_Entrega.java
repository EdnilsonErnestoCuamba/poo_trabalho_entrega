package nr2;

import java.util.List;
import java.util.ArrayList;

public class Numero_2_Entrega {

    public static void main(String[] args) {
        /*List<Mamifero> listM = new ArrayList<Mamifero>();
        List<Peixe> listP = new ArrayList<Peixe>();
        
        listM.add(new Mamifero("Hiena", 4, "Preto e Castanho"));
        listM.add(new Mamifero("Urso", 4, "Branco"));
        
        listP.add(new Peixe("Peixe Serra", "Pristic Pectinata"));
        
        System.out.println("MAMIFEROS");
        for(Mamifero m : listM) {
            System.out.println(m);
        }
        System.out.println("PEIXES"); 
        for (Peixe peixe : listP) {
            System.out.println(peixe);
        }
        
        Tarefa.gravacao(listM, "Mamiferoo.dat");
        Tarefa.gravacao(listP, "Peixee.dat");*/
        
       System.out.println("MAMIFEROS");
        List<Mamifero> objMamifero = (List<Mamifero>) Tarefa.leitura("Mamiferoo.dat");
        for (Mamifero mamifero : objMamifero) {
            System.out.println(mamifero);
        }
        
        System.out.println("PEIXES");
        List<Peixe> objPeixe = (List<Peixe>) Tarefa.leitura("Peixee.dat");
        for (Peixe peixe : objPeixe) {
            System.out.println(peixe);
        }
    }
    
}
