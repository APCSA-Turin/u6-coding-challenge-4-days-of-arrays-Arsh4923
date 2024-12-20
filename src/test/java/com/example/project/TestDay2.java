package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.io.*;

public class TestDay2 {
    @Test
    public void testSortNames() {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] result = Day2.nameSort(names);

        //assert results
        assertNotNull(result[0],"Nice list should not be null");
        assertNotNull(result[1], "Naughty list should not be null");

        //Verify that all names are in one of the two lists
        int nice_count = 0;
        int naughty_count = 0;
        for(int i=0; i<12; i++){
            if(result[0][i]!=null){nice_count++;}
            if(result[1][i]!=null){naughty_count++;}
        }


        int totalNames = nice_count+naughty_count;
        assertEquals(names.length,totalNames, "All names should be sorted into nice or naughty lists");
    }
}
