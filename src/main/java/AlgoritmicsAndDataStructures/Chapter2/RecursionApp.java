package AlgoritmicsAndDataStructures.Chapter2;

import java.util.Arrays;

public class RecursionApp {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 10, 1, 12, 123, 1};
        System.out.println(sum(arr));
        System.out.println(sumOfElems(arr));
    }
    // рекурсия считает сумму элементов
    static int sum(int[] arr){
        if (arr.length == 0){
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
    // рекурсия считает количство элементов (да, бессмысленно, но такое задание :))
    static int sumOfElems(int[] arr){
        if (arr.length == 0){
            return 0;
        } else{
            return  1 + sumOfElems(Arrays.copyOfRange(arr, 0, arr.length - 1));
        }
    }
}
