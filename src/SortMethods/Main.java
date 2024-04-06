package SortMethods;

import java.util.Random;

import static SortMethods.ArrayMethods.*;
import static SortMethods.BubbleSort.bubbleSort;
import static SortMethods.InsertSort.insertSort;

public class Main {
    public static void main(String[] args) {
        int length = 100000;
        long [] newarray = new long[length];
        long [] newarray1 = new long[length];

        newarray = ArrayGenerator(newarray.length);
        newarray1 = copyArray(newarray);
        //showArray(newarray1);
        long start = timerStart();
        insertSort(newarray1);
        long stop = timerStop();
        System.out.println("Time is: " + ((stop-start)/1000) + " seconds.");

        start = timerStart();
        bubbleSort(newarray);
        stop = timerStop();
        System.out.println("Time is: " + ((stop-start)/1000)  + " seconds.");






    }
}