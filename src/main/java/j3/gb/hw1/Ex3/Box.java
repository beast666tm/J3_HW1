package j3.gb.hw1.Ex3;

import java.util.*;

public class Box<T extends Fruits> {
    public List<T> getFruits() {
        return fruits;
    }

    private float boxWeight = 0.5f; // Ну типа коробка не может ничего не весить! на работу методов не влияет.

    ArrayList<T> fruits;

    public  Box() {
        this.fruits = new ArrayList<>();
    }

    public void putinBox(T fruit) {
        fruits.add(fruit);
        boxWeight = boxWeight + fruit.getWeight();
    }

    public int compare(Box<?> o) {
        if (this.boxWeight > o.boxWeight) {
            return 1;
        } else if (this.boxWeight < o.boxWeight) {
            return -1;
        } else {
            return 0;
        }
    }

    public static <M> List<M> convertToArrayList(M[] array) {
        return Arrays.asList(array);

    }

    public void info() {
        System.out.println("ArrayList in to Box ==> " + fruits);
    }

    public float getBoxWeight() {
        return boxWeight;
    }

    @Override
    public String toString() {
        return "Box{" + "boxWeight=" + boxWeight +
                ", fruits=" + fruits +
                '}';
    }


}
