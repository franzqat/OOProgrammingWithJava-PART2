
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Changer {
    
    private LinkedList<Change> mod;
    public Changer() {
        mod = new LinkedList<Change>();
    }
        
    public void addChange(Change change){
        mod.add(change);
     //   System.out.println("Elemento aggiunto");
    }
    
     public String change(String characterString){      
         for (Change c : mod)
             characterString= c.change(characterString);
    
        return characterString;
     }
    
}
