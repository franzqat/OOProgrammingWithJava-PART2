
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class Suitcase {


    private ArrayList<Thing> things;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        things = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing t) {
        if (totalWeight() + t.getWeight() <= maxWeight)

        things.add(t);
    }

    public int totalWeight() {
        return things.stream()
                .map(Thing::getWeight)
                .reduce(0, (w, x) -> w + x);
    }
    
    @Override
    public String toString(){
        long num = things.stream().count();
        if (num == 0) return "empty (0 kg)";
        else if (num == 1) return "1 thing (" +  totalWeight() + "kg)";
        return num + " things (" + totalWeight() + "kg)";
    }

    public void printThings(){
        things.stream()
                .forEach(System.out::println);
    }
    
    public Thing heaviestThing(){
        Optional<Thing> t = things.stream()
                .max(Comparator.comparing(x-> x.getWeight()));
        if( t.isPresent()) return t.get();
        return null;
    }
}
