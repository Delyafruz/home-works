package kz.kaznu.delya.HW2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        sameSentences(3, "hello everyone");
        sumArr();
        sameNum1();
        sameNum2();
        plusNum();
        sum1AndSum2();

    }
    public static int sameSentences(int arr, String text) {
        for (int i = 0; i < arr; i++) {
            System.out.println(text);
        }
        return arr;
    }



    
    public static void sumArr() {
        //задание №2
        int[] arr = {3, 6, 7, 9, 2, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }

    public static void sameNum1() {
        //задание №3 а)
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sameNum2() {
        //задание №3 б)
        int[] arr = {7, 3, 8, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 4;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void plusNum() {
        //задание №4
        int[] arr = {3, 6, 2, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sum1AndSum2() {
        //задание №5
        int[] arr = {3, 2, -1, 3, 2, 4};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Первая часть массива больше:");
            System.out.println(sum1);
        } else {
            System.out.println("Вторая часть массива больше:");
            System.out.println(sum2);
        }
        System.out.println(Arrays.toString(arr));
    }
}