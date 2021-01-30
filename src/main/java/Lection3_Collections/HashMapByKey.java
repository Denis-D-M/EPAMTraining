package Lection3_Collections;

import java.util.*;

public class HashMapByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Something");
        map.put(1, "Some String");
        map.put(56, "Privet");
        map.put(3, "Bla bla bla");
        map.put(466, "Hi");
        map.put(45, "What's up?");
        map.put(78, "Cheers!");
        //9. Написать программу сортирующую HashMap по ключу.
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("----------");
        //10. Написать программу сортирующую HashMap по значению.
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        //11. Заполнить рандомными значениями LinkedList, вывести содержимое каждого элемента и его индекс.
        List<String> list = new LinkedList<>();
        list.add("Something");
        list.add("Some String");
        list.add("Privet");
        list.add("Bla bla bla");
        list.add("Hi");
        list.add("What's up?");
        list.add("Cheers!");
        list.forEach(e -> {
            System.out.println(list.indexOf(e));
            System.out.println(e);
        });

    }
}
