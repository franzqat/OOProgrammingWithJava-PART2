
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
public class UserInterface {
    private Airport airport;
    private Scanner reader;

    public UserInterface(Scanner r) {
        reader = r;
        airport = new Airport();
    }

    public void printAirportPanel() {  
        System.out.println("Choose operation: \n[1] Add airplane\n[2] Add flight\n[x] Exit");
        System.out.print("> ");
    }
    


    public void start() {        
        airportMenu();
        flightMenu();
    }   

    private void airportMenu() {
        System.out.println("Airport panel\n-------------------\n"); 
        String s;
        do {
            printAirportPanel(); 
            s = reader.nextLine().toLowerCase();
            switch (s) {
                case ("1"):
                    addAirplane();
                    break;
                case ("2"):
                    addFlight();
                    break;
                case ("x"):
                 //   System.out.println("");
                    break;
                default:
                    break;

            }

        } while (!s.equals("x"));
    }
    
    public void printFlightService() {

        System.out.println("Choose operation: \n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit");
        System.out.print("> ");

    }

    private void flightMenu() {
        System.out.println("Flight service\n"
                + "------------\n");

        String s;
        do {
             printFlightService();
            s = reader.nextLine().toLowerCase();
            switch (s) {
                case ("1"):
                    airport.printPlanes();
                    break;
                case ("2"):
                    airport.printFlights();
                    break;
                case ("3"):
                    printPlaneInfo();
                    break;
                case ("x"): 
               //     System.out.println("");
                    break;
                default:
                    break;

            }

        } while (!s.equals("x"));
    
    }
    
    
    private void printPlaneInfo() {
        System.out.println("Give plane ID: ");
        
        String id = reader.nextLine();
        if (planeExists(id)) {
            System.out.println(airport.getPlane(id));
        }
        else
        System.out.println("Plane not found");
    }

    
    private boolean planeExists(String id){
        return airport.getPlane(id)!= null;
        
    }
        
    
    private void addAirplane() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println("Give plane capacity: ");
        int c = Integer.parseInt(reader.nextLine());
        airport.addPlane(id, c);

    }

    private void addFlight() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        if (planeExists(id)){
        System.out.println("Give departure airport code: ");
        String dep = reader.nextLine();

        System.out.println("Give destination airport code: ");
        String dest = reader.nextLine();
        
        airport.addFlight(id,dep,dest);
        }
        else System.out.println("Plane not found!");
    }
}
