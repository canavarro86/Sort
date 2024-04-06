package SortMethods;

import java.util.Random;

public class ArrayMethods {
    //Генерация случайного массива
    public static long[] ArrayGenerator(int arrayLength) {
        long[] array = new long[arrayLength];
        System.out.println("Array is generating...");
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextLong(500000000)-49999999;
        }
        System.out.println("Array was generated.");
        return array;
    }

    public static long[] copyArray(long[] array){
        long [] newarray1 = new long[array.length];
        for (int i=0; i < array.length; i++){
            newarray1[i] = array[i];
        }
        System.out.println("Array was copied to new array.");
        return newarray1;
    }

    public static void showArray(long[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static long timerStart(){
        return System.currentTimeMillis();
    }

    public static long timerStop(){
        return System.currentTimeMillis();
    }
}
