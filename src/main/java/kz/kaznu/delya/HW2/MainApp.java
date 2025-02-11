package kz.kaznu.delya.HW2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        sameSentences(3, "hello everyone");
        //////////////////
        int[] arr1 = {1, 5, 3, 3, 6, 9};
        sumArr(arr1);
        ///////////////
        int[] array = new int[5];
        sameNum(2, array);
        System.out.println(Arrays.toString(array));
        ///////////////
        int[] array2 = {1, 7, 3, 6, 3, 4};
        plusNum(3, array2);
        System.out.println(Arrays.toString(array2));
        ////////////
        int[] arr2 = {2, 1, 1, 2};
        sum1AndSum2(arr2);
    }

    //задание №1
    public static int sameSentences(int arr, String text) {
        for (int i = 0; i < arr; i++) {
            System.out.println(text);
        }
        return arr;
    }

    //задание №2
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма больше 5: " + sum);
        return sum;
    }

    //задание №3
    public static void sameNum(int arr, int[] value) {
        Arrays.fill(value, arr);

    }

    //задание №4
    public static void plusNum(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += value;
        }
    }

    //задание №5
    public static void sum1AndSum2(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (arr.length % 2 != 0) {
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }
        if (sum1 > sum2) {
            System.out.println("Первая часть массива больше:");
            System.out.println(sum1);
        } else if (sum1 < sum2) {
            System.out.println("Вторая часть массива больше:");
            System.out.println(sum2);
        } else {
            System.out.println("Обе части массива равны.");
        }
    }
}