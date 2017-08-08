
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary d;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        d = dictionary;
    }
  
    public void start() {
        printMenu();
        int i = 1;
        while (i==1) {
            switch (reader.nextLine()) {
                case ("quit"):
                    quit();
                    i=0;
                    break;
                case ("translate"):
                    translate();
                    break;
                case ("add"):
                    add();
                    break;
                default:
                    System.out.println("Unknown statement");
                    break;

            }
        }
    }

    private void add(){
        System.out.print("In Finnish: ");        
        String suomi = reader.nextLine();
        System.out.print("Translation: ");
        String t = reader.nextLine();
        d.add(suomi, t);
    }
    
    private void translate(){
        System.out.print("Give a word: ");
        System.out.println("Translation: " + d.translate(reader.nextLine()));
    }
         
    
    private void quit(){
        System.out.println("Cheers!");
      //  System.exit(0);
        
    }
    
    private void printMenu(){
        System.out.println("Statement:");
        System.out.println("add - adds a word pair to the dictionary\n" +
                            "translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
    }
            
            
}
