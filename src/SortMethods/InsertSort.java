package SortMethods;

public class InsertSort {
    public static void insertSort(long [] values){
        System.out.println("Array's insert sort was started...");
        for (int i = 1; i < values.length; i++) {
            long key = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j = j - 1;
            }
            values[j + 1] = key;
        }
        System.out.println("Insert sort was finished");

//        for (int i = 0; i < values.length; i++) {
//            System.out.print(values[i] + " ");
//
//        }
    }
}
