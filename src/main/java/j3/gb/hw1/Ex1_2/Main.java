package j3.gb.hw1.Ex1_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* 1.*/
        String[] array = {"Всех", "новым", "наступающим", "с", "годом", "!"};

        swapElements(array);
        System.out.print("1. ");
        System.out.println(array.getClass().getSimpleName() + " " + Arrays.toString(array));

        /*2.*/
        List<String> list = convertToArrayList(array);
        System.out.print("2. ");
        System.out.println(list.getClass().getSimpleName() + " " + list + '\n');

        for (String s : array) {
            System.out.print(s.toUpperCase(Locale.ROOT) + " ");
        }
    }
    //    1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
    private static <T> void swapElements(T[] array) {
        T tmp = array[3];
        array[3] = array[1];
        array[1] = tmp;
    }

    //    2. Написать метод, который преобразует массив в ArrayList;
    private static <M> List<M> convertToArrayList(M[] array) {
        return Arrays.asList(array);
    }
}
