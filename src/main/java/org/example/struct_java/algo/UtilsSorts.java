package org.example.struct_java.algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class UtilsSorts {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static <T> void bubbleSortWithComparator(T arr[], Comparator<? super T> c) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(c.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static <T> void insertionSortWithComparator(T arr[], Comparator<? super T> c) {
        int n = arr.length;
        for(int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;
            while(j >= 0 && c.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void countingSort(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] counts = new int[max - min + 1];

        for(int i = 0; i < arr.length; i++) {
            counts[arr[i] - min]++;
        }
        //System.out.println("counts show");
        //Arrays.stream(counts).forEach(item -> System.out.print(item + " "));

        int sortedIndex = 0;

        for(int i = 0; i < counts.length; i++) {
            //System.out.println("i = " + i);
            //System.out.println("counts[i] = " + counts[i]);
            while(counts[i] > 0) {
                arr[sortedIndex++] = i + min;
                //System.out.println("before counts[i] = " + counts[i]);
                counts[i]--;
                //System.out.println("after counts[i] = " + counts[i]);
            }
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        buildHeap(arr, n);

        while(n > 1) {
            swap(arr, 0, n - 1);
            n--;
            heapify(arr, n, 0);
        }
    }

    public static boolean containsElementV1(int[] arr, int toContain) {
        for (int element: arr) {
            if(element == toContain) return true;
        }
        return false;
    }

    public static boolean containsElementV2(int[] arr, int toContain) {
        return Arrays.stream(arr)
                .anyMatch(e -> e == toContain);
    }

    public static <T> boolean containsElementV3(T[] arr, T toContain) {
        for(T element: arr) {
            if(element.equals(toContain)) return true;
        }
        return false;
    }

    public static <T> boolean containsElementObjectV1(T[] arr, T toContain, Comparator<? super T> c) {
        for(T element: arr) {
            if(c.compare(element, toContain) == 0) return true;
        }
        return false;
    }

    public static <T> boolean containsElementObjectV2(T[] arr, T toContain, Comparator<? super T> c) {
        Arrays.sort(arr, c);
        int index = Arrays.binarySearch(arr, toContain, c);
        return (index >= 0);
    }

    public static int findIndexOfElementV1(int[] arr, int toFind) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexOfElementV2(int[] arr, int toFind) {
        return IntStream.range(0, arr.length)
                .filter(i -> toFind == arr[i])
                .findFirst()
                .orElse(-1);
    }

    public static <T> int findIndexOfElementV3(T[] arr, T toFind) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(toFind)) {
                return i;
            }
        }
        return  -1;
    }

    public static <T> int findIndexOfElementV4(T[] arr, T toFind, Comparator<? super T> c) {
        for(int i = 0; i < arr.length; i++) {
            if(c.compare(arr[i], toFind) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int findIndexOfElementV5(T[] arr, T toFind, Comparator<? super T> c) {
        return IntStream.range(0, arr.length)
                .filter(i -> c.compare(toFind, arr[i]) == 0)
                .findFirst()
                .orElse(-1);
    }

    //------------------------------------------
    //---Service Code---

    private static void buildHeap(int[] arr, int n) {
        for(int i = arr.length / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int greater;

        if(left < n && arr[left] > arr[i]) {
            greater = left;
        } else {
            greater = i;
        }

        if(right < n && arr[right] > arr[greater]) {
            greater = right;
        }

        if(greater != i) {
            swap(arr, i, greater);
            heapify(arr, n, greater);
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];

        arr[x] = arr[y];
        arr[y] = temp;
    }
}
