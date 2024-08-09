package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);  // Filling the array with numbers from 0 to 99
        }
        System.out.println("Початковий масив:");
        System.out.println(Arrays.toString(array));

        // Merge sort
        ArrayUtils.mergeSort(array, 0, array.length - 1);
        System.out.println("Відсортованйи масив:");
        System.out.println(Arrays.toString(array));

        // Binary search
        int target = array[5];  // Шукаємо елемент, який знаходиться на 5-й позиції
        int index = ArrayUtils.binarySearch(array, target);
        System.out.println("Шуканий елемент " + target + " знайдено за індексом: " + index);
    }
}
