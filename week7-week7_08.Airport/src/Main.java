
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        
        String input = "1\n" + "LOL\n" + "12\n"
                + "2\n" + "LOL\n" + "CTA\n" + "FCO\n"
                + "2\n" + "LOL\n" + "HEL\n" + "BEL\n"
                + "x\n" + "1\n" + "2\n" + "3\n" + "LOL\n" + "x";
        Scanner reader = new Scanner(System.in);
        UserInterface textui = new UserInterface(reader);
        
        textui.start();
    }
}
