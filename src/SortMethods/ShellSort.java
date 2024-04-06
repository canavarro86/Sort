package SortMethods;

public class ShellSort {
    public static void shellSort(long [] values){
        int h = 1;
        while (h*3 < values.length)
            h = h *3 -1;

        while (h>=1){
            hSort(values,h);
            h = h/3;
        }

    }
    private static void hSort(long[] values, int h){
        int length = values.length;
        for (int i = h; i < values.length; i++){
            for (int j = i; j >= h; j = j - h){
                if (values[j] < values[j-h])
                    swap(values, j, j-h);
                else break;
            }
        }
    }

    private static void swap (long[] values, int i, int j){
        long temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
}

