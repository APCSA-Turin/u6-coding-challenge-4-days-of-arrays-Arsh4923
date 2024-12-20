

package com.example.project;
import java.util.Random;


public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[] nice = new String[names.length];
        String[] bad = new String[names.length];
        int niceIn = 0;
        int badIn = 0;
        Random rand = new Random();
        for (String name : names) {
            if (rand.nextBoolean()) {
                nice[niceIn++] = name;
            } else {
                bad[badIn++] = name;
            }
        }
        return new String[][] {nice, bad};
    }


    public static void main(String[] args) {
        String[] names = { "John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby" };
        String[][] sortedLists = nameSort(names);


        System.out.println("Nice List:");
        for (String name : sortedLists[0]) {
            System.out.println(name);
        }


        System.out.println("\nNaughty List:");
        for (String name : sortedLists[1]) {
            System.out.println(name);
        }
    }


    }


