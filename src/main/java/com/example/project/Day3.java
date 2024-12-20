package com.example.project;

public class Day3 {
    public static String[][] generateSnowflake(int size) { // you will be tested on this method
        String[][] grid = new String[size][size];
       
        // Initialize the grid with spaces
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = " ";
            }
        }

        int center = size / 2;

        // Place the stars for the snowflake design
        for (int i = 0; i < size; i++) {
            grid[i][center] = "*";  // Vertical line through the center
            grid[center][i] = "*";  // Horizontal line through the center
            if (i == center) continue; // Avoid overlap of center star

            // Diagonal lines for symmetry
            grid[i][i] = "*";  // Top-left to bottom-right diagonal
            grid[i][size - i - 1] = "*";  // Top-right to bottom-left diagonal
        }

        return grid;
    }

    // Prints the snowflake, will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        for (String[] row : snowflake) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
        int size = 7;  // Example size
        String[][] snowflake = generateSnowflake(size);
        printSnowflake(snowflake);
    }
}
