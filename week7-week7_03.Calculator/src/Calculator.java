/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Calculator {
 private Reader reader;
 private int stat=0;

    public Calculator() {
        this.reader = new Reader();
    }
 
    private void sum(){
        stat++;
        int value1 = intInput(); 
        int value2 = intInput();                
        System.out.println("sum of the values "+( value1 + value2));
    }

    private int intInput() {
        
        System.out.print("value: ");
        int value1 = reader.readInteger(); // read the value using the Reader-object
        return value1;
    }
    private void difference(){
         stat++;
        int value1 = intInput(); 
        int value2 = intInput();                
        System.out.println("difference of the values " + (value1 - value2));
    }
    private void product(){
        stat++;
        int value1 = intInput(); 
        int value2 = intInput();                
        System.out.println("product of the values " +( value1 * value2));
    }
    private void statistics(){
        System.out.println("Calculations done " + stat);
    }

    public void start(){
        
        while(true){
            System.out.print("command:");

            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
         
        
    
}
