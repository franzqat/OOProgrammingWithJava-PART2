
public class Main {

    public static void addSuitcasesFullOfBricks(Container container) {
        /*
         which adds 100 suitcases into the container it receives as parameter; there is one brick in each suitcase. 
        The bricks weight will then increase by one each time until the weight becomes 100 kg.
        */
       
        
        for (int i = 1;i < 100; i++) { 
            Suitcase s = new Suitcase(100);
            Thing brick = new Thing("brick", i);
           s.addThing(brick);
            container.addSuitcase(s);
            
            
        }
    }

    public static void main(String[] args) {

       Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        System.out.println(tomsCase);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);
 System.out.println(georgesCase);
        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();
    }

}
