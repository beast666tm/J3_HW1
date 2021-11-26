package j3.gb.hw1;

import j3.gb.hw1.Ex3.Apple;
import j3.gb.hw1.Ex3.Fruits;
import j3.gb.hw1.Ex3.Orange;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        Apple apple = new Apple();
        Orange orange = new Orange();

        List<Fruits> fruitsList = new ArrayList<>();
        fruitsList.add(apple);
        fruitsList.add(orange);
        fruitsList.add(orange);
        fruitsList.add(orange);

        System.out.println("!!!" + fruitsList + "!!!");

        List<Apple> appleList = new ArrayList<>();
        List<Orange> orangeList = new ArrayList<>();
        for (int i = 0; i < fruitsList.size(); i++) {
            Fruits fruits = fruitsList.get(i);
            System.out.println("*" + fruits);
            if (fruits.getClass().getSimpleName().equals("Apple")) {
                appleList.add(null);

            }
            if (fruits.getClass().getSimpleName().equals("Orange")) {
                orangeList.add(null);
            }
        }
        System.out.println("** appleList:::" + appleList.getClass().getSimpleName() + appleList);
        System.out.println("** orangeList::" + orangeList.getClass().getSimpleName() + orangeList);

        System.out.println(appleList);
        System.out.println("orangeList ==> " + orangeList);


//        for (Fruits fruits : fruitsList) {
//            if (fruits.getClass().getSimpleName().equals("Apple")) {
//                Collections.copy(appleList, fruits);
//
//            }
//            if (fruits.getClass().getSimpleName().equals("Orange")) {
//
//            }
//        }


//        for (int i = 0; i < fruitsList.size(); i++) {
//                if (fruitsList.get(i).getWeight() == 1.0f) {
//                    Collections.copy(appleList, fruitsList);
//                    fruitsList.remove(i);
//                }
//                if (fruitsList.get(i).getWeight() == 1.5f) {
//                    Collections.copy(orangeList, fruitsList);
//                    fruitsList.remove(i);
//                }
//            //System.out.println("i == " + i + " " + fruitsList.get(i));
//        }

        System.out.println("==> apple List ==> " + appleList);
        System.out.println("==> orangeList ==> " + orangeList);
        System.out.println("fruitBox: " + fruitsList);
    }
}
