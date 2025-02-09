package kz.kaznu.delya.HW3;

public class MainApplication {
    public static void main(String[] args) {
        int[][] matrix = {{3, 2, -2, 4, 2}, {-7, -3, 2, 3}};
        System.out.println("Сумма: " + sumOfPositiveElements(matrix));

        int[][] matrixSize = new int[5][5];
        System.out.println(square(matrixSize));

        diagonal();

        int[][] findddMax = {{3, 5, 2, 1, 5}, {4, 7, 9, 23, 13, 45}};
        System.out.println("Максимальное число: " + findMax(findddMax));

        int[][] matrixSumSecondStr = {{1, 4, 5}, {3, 7, 9, 2}};
        System.out.println("Сумма: " + sumSecondStr(matrixSumSecondStr));

    }

    //1 задание
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {

                    sum += arr[i][j];
                }

            }
        }
        return sum;
    }

    //2 задание
    public static int square(int[][] size) {
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                char symbol = '*';
                System.out.print(symbol);
            }
            System.out.println();
        }

        return 0;
    }

    // 3 задание
    public static void diagonal() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < (1 + j) && j < (i + 1)) {
                    System.out.print("0");
                } else {
                    char symbol = '*';
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }

    }

    //4 задание
    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = Math.max(max, array[i][j]);
            }
        }

        return max;
    }

    //5 задание
    public static int sumSecondStr(int[][] arr) {
        if (arr.length < 2) {
            System.out.println("Нет второй строки.");
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];

        }
        return sum;
    }
}


