/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Flight {
    private final String departure;
    private final String destination;
    
    public Flight (String dep, String dest){
        departure = dep;
        destination = dest;       
    }
    
    @Override
    public String toString(){
        return "(" + departure.toUpperCase() + "-" + destination.toUpperCase() +")";
    }
}
