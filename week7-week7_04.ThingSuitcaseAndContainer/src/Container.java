
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
public class Container {

    private ArrayList<Suitcase> suitcases;
    private final int maxWeight;

    public Container(int maxWeight) {
        suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return suitcases.stream().count() + " suitcases (" + totalWeight() + "kg)";
    }

    public int totalWeight() {
        return suitcases.stream()
                .map(Suitcase::totalWeight)
                .reduce(0, (w, x) -> w + x);
    }

    public void printThings() {
        suitcases.stream()
                .forEach(Suitcase::printThings);
    }
}
