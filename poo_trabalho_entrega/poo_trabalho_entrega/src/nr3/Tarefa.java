package nr3;

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
        File arquivo = new File(fileName);
        List<Object> objEx = new ArrayList<Object>();
        
        if(! arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        } else {
            try {
                FileInputStream fis = new FileInputStream(arquivo);
                ObjectInputStream obis = new ObjectInputStream(fis);
                objEx = (List<Object>) obis.readObject();
                obis.close();
            } catch (IOException | ClassNotFoundException io) {
                System.out.println(io.getMessage());
                return false;
            }
        }
        
        objEx.add(obj);
        
        try {
            FileOutputStream fops = new FileOutputStream(arquivo);
            ObjectOutputStream obps = new ObjectOutputStream(fops);
            
            obps.writeObject(obj);
            obps.flush();
            fops.flush();
            obps.close();
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
            System.out.println(ex.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

