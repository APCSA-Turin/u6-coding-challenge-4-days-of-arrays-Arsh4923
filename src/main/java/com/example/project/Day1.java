package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};


    public static String generateElfName(String name){
        if (name==null || name.isEmpty()) {throw new IllegalArgumentException("Name cannot be null or empty");}
        else {
        int i = (int) (Math.random()*5);
        String select = elf_names[i];
        return select + " " + name;  
        }
    }
}
