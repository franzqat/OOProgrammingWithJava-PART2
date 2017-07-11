
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Dictionary {
    private HashMap<String, String> dictionary;
    public Dictionary(){
        dictionary = new HashMap<>();
    }
    public String translate(String word){ //returning the translation of its parameter. If the word is unknown, it returns null.
      if (dictionary.containsKey(word))
              return dictionary.get(word);
      return null;
    }
    
    public void add(String word, String translation){ // adding a new translation to the dictionary
        dictionary.put(word, translation);        
    }
     public int amountOfWords(){
         return dictionary.size();
     }
     public ArrayList<String> translationList(){
                
        ArrayList<String> t = new ArrayList<>();
         dictionary.keySet().stream().forEach((s) -> {
             t.add(s + " = " + dictionary.get(s));
        });
        return t;
                     
     }
}
