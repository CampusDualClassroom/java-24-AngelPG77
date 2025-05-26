package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {

        Queue<String> myCola = new LinkedList<>();
        myCola.add("Smith");
        myCola.add("Montessori");
        myCola.add("Peralta");
        myCola.add("House");
        return myCola;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (queue.peek() != null){
            String valor = queue.poll();
            System.out.println(valor);
        }
    }


    public static void main(String[] args) {
    printAndEmptyQueue(createQueue());

    }

}
