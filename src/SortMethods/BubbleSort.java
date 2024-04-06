package SortMethods;

public class BubbleSort extends ArrayMethods{

    public static void bubbleSort(long[] values){
        int procent = 0;
        System.out.println("Array's bubble sort was started...");
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 1; j < values.length - i; j++) {
                if (values[j - 1] > values[j]) {
                    long tempValue = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = tempValue;
//                    procent = (i*100)/values.length;
//                    System.out.println(procent + " % завершено");
                }

            }
        }
        System.out.println("Bubble sort was finished");
//        System.out.println();
//        for (int i = 0; i < values.length; i++)
//            System.out.print(values[i] + " ");
    }



}
