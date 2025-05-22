package org.example.algorithms_task;

public class PetrolBunksSolution {

    public static void main(String[] args) {
        int[] dist = {5, 4, 6, 3, 5, 7};
        int[] fuel = {3, 3, 5, 5, 6, 8};
        int startPoint = circularTour(fuel, dist);
        System.out.println("Start point: " + startPoint);
    }


    /* O(n) */
    public static int circularTour(int[] fuel, int[] dist) {

        int sumRemainingFuel = 0; // track current remaining fuel
        int totalFuel = 0;        // track total remaining fuel
        int start = 0;

        for (int i = 0; i < fuel.length; i++) {

            int remainingFuel = fuel[i] - dist[i];

            //if sum remaining fuel of (i-1) >= 0 then continue
            if (sumRemainingFuel >= 0) {
                sumRemainingFuel += remainingFuel;

                //otherwise, reset start index to be current
            } else {
                sumRemainingFuel = remainingFuel;
                start = i;
            }

            totalFuel += remainingFuel;
        }

        if (totalFuel >= 0) {
            return start;
        } else {
            return -1;
        }
    }
}
