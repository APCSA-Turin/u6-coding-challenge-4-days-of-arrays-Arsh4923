package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDay4 {
    @Test
    void testReindeerCreation() {
        Day4.Reindeer reindeer = new Day4.Reindeer("Dasher", 100, 5, 2);
        assertEquals("Dasher", reindeer.getName(), "Reindeer name is not correctly set.");
        assertEquals(0, reindeer.getDistanceTraveled(), "Initial distance should be 0.");
    }

    @Test
    void testSimulateSecondRunning() {
        Day4.Reindeer reindeer = new Day4.Reindeer("Dasher", 100, 5, 2);

        // Simulate 5 seconds of running
        for (int i = 0; i < 5; i++) {
            reindeer.simulateSecond();
        }
        assertEquals(500, reindeer.getDistanceTraveled(), "Distance should be 500 after 5 seconds of running.");

        // Simulate 2 seconds of resting
        for (int i = 0; i < 2; i++) {
            reindeer.simulateSecond();
        }
        assertEquals(500, reindeer.getDistanceTraveled(), "Distance should 500 after  2 seconds of resting.");
    }

    @Test
    void testSimulateRaceWithHardcodedReindeers() {
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 110, 6, 1)
        };

        String winner = Day4.simulateRace(10, reindeers);
        assertNotNull(winner, "Race should have a winner after simulation.");
        assertEquals("Prancer",winner,"Winner should be Prancer");
    }

    @Test
    void testSimulateRaceLongerDuration() {
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 70, 6, 1)
        };

        String winner = Day4.simulateRace(100, reindeers);
        assertNotNull(winner, "Race should have a winner after simulation.");
        assertEquals("Dasher",winner,"Winner should be Dasher");
    }

}
