package nr2;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarefa {
    
    public static boolean gravacao(Object obj, String fileName) {
        File ficheiro = new File(fileName);
        List<Object> objEx = new ArrayList<Object>();
        
        if(! ficheiro.exists()) {
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        } else {
            try {
                FileInputStream fs = new FileInputStream(ficheiro);
                ObjectInputStream obs = new ObjectInputStream(fs);
                objEx = (List<Object>) obs.readObject();
                obs.close();
            } catch (IOException | ClassNotFoundException io) {
                System.out.println("error: " + io.getMessage());
                return false;
            }
        }
        
        objEx.add(obj);
        
        try {
            FileOutputStream fops = new FileOutputStream(ficheiro);
            ObjectOutputStream obs = new ObjectOutputStream(fops);            
            obs.writeObject(obj);
            obs.flush();
            fops.flush();
            obs.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    
    public static Object leitura (String fileName) {
        File arquivo = new File(fileName);
        
        try {
            FileInputStream fips = new FileInputStream(arquivo);
            ObjectInputStream obis = new ObjectInputStream(fips);
            
            Object retorno = obis.readObject();
            
            obis.close();
            fips.close();
            return retorno;
        } catch (IOException ex) {
            System.out.println("error: " + ex.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
