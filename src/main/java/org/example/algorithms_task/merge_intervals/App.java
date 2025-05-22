package org.example.algorithms_task.merge_intervals;


import java.util.Comparator;
import java.util.Stack;

public class App {


    public static void main(String[] args) {

        Interval intervals[] = new Interval[7];

        // [[12,15], [12,17], [2,4], [16,18], [4,7], [9,11], [1,2]]
        intervals[0] = new Interval(12, 15);
        intervals[1] = new Interval(12, 17);
        intervals[2] = new Interval(2, 4);
        intervals[3] = new Interval(16, 18);
        intervals[4] = new Interval(4, 7);
        intervals[5] = new Interval(9, 11);
        intervals[6] = new Interval(1, 2);

        System.out.print("The merged intervals via stack: ");
        mergeIntervals(intervals);

        System.out.print("\nThe merged intervals optimized: ");
        mergeIntervalsOptimized(intervals);
    }

    /* O(n log n) runtime and O(n) auxiliary space */
    public static void mergeIntervals(Interval[] intervals) {

        if (intervals == null) {
            throw new IllegalArgumentException("The given array of intervals cannot be null");
        }

        // sort the given intervals in ascending order based on their starts
        java.util.Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        Stack<Interval> stackOfIntervals = new Stack();

        for (Interval interval : intervals) {

            // push the first interval into the stack or
            // if the current interval does not overlap with interval
            // from the top of the stack then push it into the stack
            if (stackOfIntervals.empty() || interval.start > stackOfIntervals.peek().end) {
                stackOfIntervals.push(interval);
            }

            // if the current interval overlaps with the interval from
            // the top of the stack and the end of the current interval
            // is greater than that of the stack top then update the stack
            // top with the end of the current interval
            if (stackOfIntervals.peek().end < interval.end) {
                stackOfIntervals.peek().end = interval.end;
            }
        }

        // print the result
        while (!stackOfIntervals.empty()) {
            System.out.print(stackOfIntervals.pop() + " ");
        }
    }

    /* O(n log n) runtime and O(1) auxiliary space */
    public static void mergeIntervalsOptimized(Interval intervals[]) {
        if (intervals == null) {
            throw new IllegalArgumentException("The given array of intervals cannot be null");
        }

        // sort the given intervals in descending order of their starts
        java.util.Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i2.start - i1.start;
            }
        });

        int index = 0;

        for (int i = 0; i < intervals.length; i++) {

            // check if this is not the first interval and overlaps with the previous one
            if (index != 0 && intervals[index - 1].start <= intervals[i].end) {
                while (index != 0 && intervals[index - 1].start <= intervals[i].end) {

                    // merge the previous interval with the current interval
                    intervals[index - 1].end = Math.max(intervals[index - 1].end, intervals[i].end);
                    intervals[index - 1].start = Math.min(intervals[index - 1].start, intervals[i].start);
                    index--;
                }
                // there is no overlap with the previous interval
            } else {
                intervals[index] = intervals[i];
            }

            index++;
        }

        // print the result
        for (int i = 0; i < index; i++) {
            System.out.print(intervals[i] + " ");
        }
    }
}
