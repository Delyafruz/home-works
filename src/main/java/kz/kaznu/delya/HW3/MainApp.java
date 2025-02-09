package kz.kaznu.delya.HW3;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    static final int SIZE = 3;
    static final char EMPTY_SYMBOL = '*';
    static final char FIRST_PLAYER = 'x';
    static final char SECOND_PLAYER = 'o';
    static Scanner game = new Scanner(System.in);
    static char humanSymbol, aiSymbol;
    static char[][] map;


    public static void main(String[] args) {
        initMap();
        printMap();
        System.out.println("Выбери символ: если играешь за х - 1, о - 2 ");
        int answer = game.nextInt();
        if (answer==1){
            humanSymbol=FIRST_PLAYER;
            aiSymbol=SECOND_PLAYER;
        } else if (answer==2) {
            humanSymbol=SECOND_PLAYER;
            aiSymbol=FIRST_PLAYER;
        }else{
            System.out.println("Такого варианта ответа нет. Начни заново");
            throw new IllegalArgumentException("Ошибка: условие не выполнено!");
        }
        System.out.println("Игра началась!");
        while (true) {
            playerTurn();
            printMap();
            if (checkWin(humanSymbol)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(aiSymbol)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }
        System.out.println("Игра завершена!");
    }

    public static boolean checkWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;
        return false;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_SYMBOL) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[x][y] != EMPTY_SYMBOL) {
            return false;
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = (int) (Math.random() * SIZE);
            y = (int) (Math.random() * SIZE);
        } while (!isCellValid(y, x));
        System.out.println("Ход противника: " + (x + 1) + " " + (y + 1));
        map[y][x] = aiSymbol;

    }


    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Ход игрока. Выбери координаты x y");
            x = game.nextInt() - 1;
            y = game.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = humanSymbol;

    }


    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_SYMBOL;

            }

        }

    }
}
