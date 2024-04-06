package SortMethods;

import java.util.Arrays;
import java.util.Random;

import static SortMethods.ArrayMethods.*;
import static SortMethods.BubbleSort.bubbleSort;
import static SortMethods.InsertSort.insertSort;
import static SortMethods.ShellSort.shellSort;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        long [] newarray = new long[length];
        long [] newarray1 = new long[length];
        long [] newarray2 = new long[length];
        long [] newarray3 = new long[length];

        newarray = ArrayGenerator(newarray.length);
        newarray1 = copyArray(newarray);
        newarray2 = copyArray(newarray);
        newarray3 = copyArray(newarray);

        //showArray(newarray1);
        long start = timerStart();
        insertSort(newarray);
        long stop = timerStop();
        System.out.println("Time is: " + ((stop-start)) + " ms.");

        start = timerStart();
        bubbleSort(newarray1);
        stop = timerStop();
        System.out.println("Time is: " + ((stop-start))  + " ms.");

        start = timerStart();
        System.out.println("Array's java's method sort was started...");
        Arrays.sort(newarray2);
        stop = timerStop();
        System.out.println("Array's java's method sort was finished");
        System.out.println("Time is: " + ((stop-start))  + " ms.");

        start = timerStart();
        System.out.println("Shell's method sort was started...");
        shellSort(newarray3);
        stop = timerStop();
        System.out.println("Shell's method sort was finished");
        System.out.println("Time is: " + ((stop-start))  + " ms.");



    }
}