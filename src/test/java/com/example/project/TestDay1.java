package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.beans.Transient;
import java.io.*;

public class TestDay1 {

   @Test
   public void testGenerateElfNameContainsName() {
    String name = "Nina";
    String elfName = Day1.generateElfName(name);
    assertTrue(elfName.endsWith(name), "Elf name should end with the input name");
}
    @Test
    public void testGenerateElfNameHasValidSuffix(){
        String name = "Joe";
        String elfName = Day1.generateElfName(name);
        String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};
        Boolean flag = false;
        for(String i : elf_names){
            if(elfName.startsWith(i)){
                flag = true;
                break;
            }
        }
        assertTrue(flag, "Elf name should start with a valid suffix from instructions");
    }

    @Test
    public void testGenerateElfNameThrowsExceptionForEmptyName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Day1.generateElfName("");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

}
 