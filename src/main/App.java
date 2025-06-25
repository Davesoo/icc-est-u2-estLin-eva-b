package main;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> cola = new LinkedList<>();
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();

        LogicaClasificacion lB = new LogicaClasificacion();

        cola.add("Ana");
        cola.add("Luis");
        cola.add("Pedro");

        System.out.println("Lista original:");
        System.err.println(cola);
        System.out.println("Lista invertida:");
        System.out.println(lB.invertirColaNombres(cola));

        cola1.add(1);
        cola1.add(3);
        cola1.add(5);

        cola2.add(2);
        cola2.add(4);
        cola2.add(6);
        cola2.add(8);

        System.out.println("Cola 1:");
        System.out.println(cola1);
        System.out.println("Cola 2:");
        System.out.println(cola2);
        System.out.println("Cola concatenada");
        System.out.println(lB.intercalarColas(cola1, cola2));
    }
}
