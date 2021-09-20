import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class mission2 {
    public static void main(String[] args) {
        long time1;
        long time2;
        int n = 10000;
        int[] array = new int[n];
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(n);
            System.out.print(array[i] + " ");
        }
        for(int i=0; i<(array.length)/2; i++) {
            array[i] = array[i]*-1;
        }
        Arrays.sort(array);
        System.out.println();
        for(int i=0; i<(array.length)/2; i++) {
            array[i] = array[i]*-1;
        }

        array1 = copyFullArrayUsingClone(array);
        array2 = copyFullArrayUsingClone(array);
        System.out.println();
        time1 = System.currentTimeMillis();
        shellSort(array);
        time2 = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + "Shell sorting lasted - " + (time2 - time1) + " milliseconds");
        System.out.println();
        time1 = System.currentTimeMillis();
        quickSort(array1, 0, n-1);
        time2 = System.currentTimeMillis();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n" + "Quick sorting lasted - " + (time2 - time1) + " milliseconds");
        System.out.println();
        time1 = System.currentTimeMillis();
        Arrays.sort(array2);
        time2 = System.currentTimeMillis();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n" + "Java standard sorting lasted - " + (time2 - time1) + " milliseconds");
    }

    public static void shellSort(int[] array) {
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
    public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
    private static int[] copyFullArrayUsingClone(int[] source) {
        return source.clone();
    }
}