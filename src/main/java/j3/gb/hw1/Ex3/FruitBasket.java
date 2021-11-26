package j3.gb.hw1.Ex3;

public class FruitBasket {
    public static void main(String[] args) {
        System.out.println();// Просто разделитель в консоли

        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Fruits> fruitBox = new Box<>();

        fruitBox.putinBox(apple);
        fruitBox.putinBox(apple);
        fruitBox.putinBox(apple);
        fruitBox.putinBox(apple);
        fruitBox.putinBox(apple);
        fruitBox.putinBox(apple);

        System.out.println(fruitBox.getClass() + ": " + fruitBox + '\n');

        fruitBox.info();

        System.out.println();
        Box<Fruits> appleBox = new Box<>();
        appleBox.putinBox(apple);

        appleBox.putinBox(apple);
        appleBox.putinBox(apple);
        appleBox.putinBox(apple);
        appleBox.putinBox(apple);


        Box<Orange> orangeBox = new Box<>();
        orangeBox.putinBox(orange);
        orangeBox.putinBox(orange);
        orangeBox.putinBox(orange);

        for (int i = 0; i < fruitBox.fruits.size(); i++) {
            if (fruitBox.fruits.get(i).getWeight() == 1.5f) { //попробовать через цикл фор
                System.out.println("1. " + fruitBox.getFruits());
//                Collections.copy(fruitBox.fruits, appleBox); //тут я запарился
            }
            if (fruitBox.fruits.get(i).getWeight() == 1.5f) {
//                Collections.copy(orangeBox, fruitBox.fruits); // тут я запарился
            }
            System.out.println(i + ": " + fruitBox.fruits.get(i));

        }

        System.out.println("Apple Box weight: " + appleBox.getClass().getName() + ": " + appleBox.getBoxWeight() + " " + appleBox);
        System.out.println("Orange Box weight: " + appleBox.getClass().getCanonicalName() + ": " + orangeBox.getBoxWeight() + " " + orangeBox);

        System.out.println('\n' + "orangeBox weight = " + orangeBox.getBoxWeight() + '\n' + "appleBox weight  = " + appleBox.getBoxWeight());

        compBox(appleBox, orangeBox); // сравниваю коробки с фруктами
    }

    public static void compBox(Box<?> o, Box<?> o1) {
        if (o.compare(o1) == 1) {
            System.out.println(o.compare(o1) + " Коробка яблок тяжелее коробки апельсинов");
            System.out.println(o.getBoxWeight() + " > " + o1.getBoxWeight());
        } else if (o.compare(o1) == -1) {
            System.out.println(o.compare(o1) + " Коробка апельсинов тяжелее коробки яблок");
            System.out.println(o.getBoxWeight() + " < " + o1.getBoxWeight());
        } else {
            System.out.println("Вес коробок одинаковый");
            System.out.println(o.getBoxWeight() + " = " + o1.getBoxWeight());
        }
    }

}
