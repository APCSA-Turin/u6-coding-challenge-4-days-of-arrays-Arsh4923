package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestDay3 {
        @Test
    public void testGenerateSnowflakeOddSize() {
        int size = 9; // Odd size for symmetry
        String[][] snowflake = Day3.generateSnowflake(size);

        assertNotNull(snowflake, "Snowflake grid should not be null");
        assertEquals(size, snowflake.length, "Snowflake grid should have the correct number of rows");
        assertEquals(size, snowflake[0].length, "Snowflake grid should have the correct number of columns");

        // Check if the center is marked with a star
        assertEquals("*", snowflake[size / 2][size / 2], "Center of the snowflake should be a star");
    }

    @Test
    public void testGenerateSnowflakeSmallSize() {
        int size = 5; // Small odd size
        String[][] snowflake = Day3.generateSnowflake(size);

        assertNotNull(snowflake, "Snowflake grid should not be null");
        assertEquals(size, snowflake.length, "Snowflake grid should have the correct number of rows");
        assertEquals(size, snowflake[0].length, "Snowflake grid should have the correct number of columns");
    }

    @Test
    public void testGenerateSnowflakeDesign() {
        int size = 7; // Small odd size
        String[][] snowflake = Day3.generateSnowflake(size);
        String[][] check = {
            {"*"," "," ","*"," "," ","*"},
            {" ","*"," ","*"," ","*"," "},
            {" "," ","*","*","*"," "," "},
            {"*","*","*","*","*","*","*"},
            {" "," ","*","*","*"," "," "},
            {" ","*"," ","*"," ","*"," "},
            {"*"," "," ","*"," "," ","*"}
                        };
        assertTrue(Arrays.deepEquals(snowflake, check), "Snowflake design is incorrect");
    }

}
