package org.example.algorithms_edu.algorithms_solution;

public class HanoiSolution {


    public static void main(String[] args) {

        int n = 3;  // Number of disks

        // A - origin-rod
        // B - intermediate-rod
        // C - target-rod
        moveDisks(n, 'A', 'C', 'B');
    }

    public static void moveDisks(int n, char origin, char target, char intermediate) {

        if (n <= 0) {
            return;
        }

        if (n == 1) {
            System.out.println("Move disk 1 from rod " + origin + " to rod " + target);
            return;
        }

        // move top n - 1 disks from origin to intermediate, using target as a intermediate
        moveDisks(n - 1, origin, intermediate, target);

        System.out.println("Move disk " + n + " from rod " + origin + " to rod " + target);

        // move top n - 1 disks from intermediate to target, using origin as an intermediate
        moveDisks(n - 1, intermediate, target, origin);
    }

}
