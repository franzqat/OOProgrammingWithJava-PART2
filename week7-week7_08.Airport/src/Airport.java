
import java.util.HashMap;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Airport {
   
    private HashMap<String, Airplane> aerei;
    
    public Airport(){
        aerei = new HashMap();
    }
    
    public void addPlane(String id, int c) {
        aerei.put(id, new Airplane(id, c));
    }

    public Airplane getPlane(String id) {
        if (aerei.containsKey(id)) {
            return aerei.get(id);
        }
        return null;
    }

    public void printPlanes() {
         //      System.out.println("");
        aerei.keySet().forEach((s) -> {
            System.out.println(aerei.get(s));
        });
        
    }

    void addFlight(String id, String dep, String dest) {
        getPlane(id).addFlight(dep, dest);
    }

    public void printFlights() {
          aerei.keySet().forEach((s) -> {
           aerei.get(s).printFlight();
        });
    }

}
