package com.example.project;
import java.util.Random;

public class Day4 {

    private static String[] reindeerNames = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int timeRunning;
        private int timeResting;
        private boolean isRunning;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.distanceTraveled = 0;
            this.timeRunning = 0;
            this.timeResting = 0;
            this.isRunning = true;
        }

        public int getDistanceTraveled() { // this method is required
            return distanceTraveled;
        }

        public void simulateSecond() { // this method is required but not tested
            if (isRunning) {
                distanceTraveled += speed;
                timeRunning++;
                if (timeRunning == runDuration) {
                    isRunning = false;
                    timeRunning = 0;
                }
            } else {
                timeResting++;
                if (timeResting == restDuration) {
                    isRunning = true;
                    timeResting = 0;
                }
            }
        }

        public String getName() {
            return name;
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers) { // you will be tested on this method
        for (int i = 0; i < time; i++) {
            for (Reindeer reindeer : reindeers) {
                reindeer.simulateSecond();
            }
        }

        Reindeer winner = reindeers[0];
        for (Reindeer reindeer : reindeers) {
            if (reindeer.getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeer;
            }
        }
        return winner.getName();
    }

    public static void main(String[] args) { // for testing purposes
        Random rand = new Random();
        Reindeer[] reindeers = new Reindeer[reindeerNames.length];

        for (int i = 0; i < reindeerNames.length; i++) {
            int speed = rand.nextInt(10) + 5; // random speed between 5 and 15
            int runDuration = rand.nextInt(5) + 5; // random run duration between 5 and 10 seconds
            int restDuration = rand.nextInt(5) + 5; // random rest duration between 5 and 10 seconds
            reindeers[i] = new Reindeer(reindeerNames[i], speed, runDuration, restDuration);
        }

        String winner = simulateRace(10, reindeers); // example with 10 seconds
        System.out.println("Winner: " + winner);
    }
}
