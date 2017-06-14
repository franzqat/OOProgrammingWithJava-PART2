/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Thing {
    
    /*
    *    A construsctor, which is given the thing's name and weight as parameter
    public String getName(), which returns the thing's name
    public int getWeight(), which returns the thing's weight
    public String toString(), which returns a string in the form "name (weight kg)"

    */
    
    private final String name;
    private final int weight;    
    
    public Thing(String n, int w){
        name =n;
        weight = w;
       
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return name+"("+weight+" kg)";
    }
    
    
}
