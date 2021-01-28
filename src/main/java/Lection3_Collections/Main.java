package Lection3_Collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("Mishin Denis Dmitriievich", 20, "Togliatti", "Sanatornaya", (short) 10, (short) 2));
        humanList.add(new Human("Mishin Denis Dmitriievich", 20, "Togliatti", "Sanatornaya", (short) 10, (short) 2));
        humanList.add(new Human("Yudin Anton Borisovich", 20, "Togliatti", "40 let pobedy", (short) 45, (short) 15));
        humanList.add(new Human("Yudin Anton Borisovich", 20, "Togliatti", "40 let pobedy", (short) 45, (short) 15));
        humanList.add(new Human("Ermochenko Nikita Andreevich", 20, "Togliatti", "Lenina", (short) 11, (short) 4));
        humanList.add(new Human("Ermochenko Nikita Andreevich", 20, "Togliatti", "Lenina", (short) 11, (short) 4));
        humanList.add(new Human("Ivanov Dmitrii Ivanovich", 20, "Togliatti", "Mira", (short) 100, (short) 25));
        humanList.add(new Human("Petrov Petr Dmitrievich", 20, "Togliatti", "Sportivnaya", (short) 6, (short) 3));
        humanList.add(new Human("Sidorov Nikolay Michailovich", 20, "Togliatti", "Frynze", (short) 54, (short) 66));
        humanList.add(new Human("Mikhailov Nikita Igorevich ", 20, "Togliatti", "Revolutsionnaya", (short) 78, (short) 8));
        Set<Human> set = new HashSet<>(humanList);
        for (Human h : set){
            humanList.remove(h);
        }
        sout(humanList);

    }

    public static void sout(Iterable<? extends Human> collection){
        for (Human h : collection){
            System.out.println(h);
        }
    }

}
