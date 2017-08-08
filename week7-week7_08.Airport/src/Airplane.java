
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Airplane {
    private ArrayList<Flight> flight;
    private final int capacity;
    private final String planeID;
    
    
    public Airplane(String id, int cap){
        capacity = cap;
        planeID = id;
        flight = new ArrayList<>();
        

    }
    
 
    public void addFlight(String dep, String dest){
        flight.add(new Flight(dep, dest));
    }
    
   public Airplane getAirplane(){
       return this;
   }
    
    @Override
   public String toString(){
       return planeID + " (" + capacity + " ppl)";
   } 
   
   public void printFlight(){
     //  System.out.println("");
           for (Flight f : flight)
               System.out.println(planeID + " (" + capacity + " ppl) " +  f);
        
   }
    
}
