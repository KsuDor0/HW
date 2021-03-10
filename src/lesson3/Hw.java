package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Hw {
    // Обьявление символьного массива для построения карты
    public static char[][] map;
    //Задаем размер карты
    public static int mapSizeX = 3;
    public static int mapSizeY = 3;

    //Задаем отображение ходов и начального состояния
    public static char human = 'X';
    public static char pc = 'O';
    public static char empty = '*';

    //Создаем сканер для ввода ходов
    public static Scanner scan = new Scanner(System.in);
    // Создаем объект рандом для ходов бота
    public static Random random = new Random();

    //  Создаем карту размерностью Sx на Sy и заполняем значениями *
    public static void mapCreate(int Sx, int Sy) {
        map = new char[Sy][Sx];

        for (int y = 0; y < Sy; y++) {
            for (int x = 0; x < Sx; x++) {
                map[y][x] = empty;
            }
        }
    }

    // Отображаем игровое поле
    public static void printMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print("|" + map[y][x] + "|");
            }
            System.out.println();
        }
    }

    //    Ход человека с проверкой на корректность
    public static void humanTurn() {
        int y;
        int x;

        do {
            System.out.println("Ваш ход");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!isTurnValid(y, x) || !isEmptyCell(y, x));
        map[y][x] = human;
    }
    //  Ход бота с проверкой кореектности
    public static void turnPc() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(y, x));
        map[y][x] = pc;

    }
    // Проверка на ничью
    public static boolean fullMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    //    Определяюем выигрышные позиции, после которых игра завершится
    public  static boolean checkWinLine(char player) {
        if(map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if(map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if(map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if(map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if(map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if(map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        if(map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if(map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;

        return false;
    }
    //Определяем валидные ходы
    public static boolean isTurnValid(int y, int x) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    // Определяем пустое поле
    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == empty;
    }


    public static void main(String[] args) {
        mapCreate(mapSizeY, mapSizeX);
        printMap();
// Запускаем игру в цикле из которого выходим обрабатывая ситуации в if
        while (true) {
            humanTurn();
            printMap();

            if (checkWinLine(human)) {
                System.out.println("Человек одолел машину!");
                break;
            }

            if (fullMap()) {
                System.out.println("Ничья!");
                break;
            }

            if (checkWinLine(pc)) {
                System.out.println("Машина победила человека!");
                break;
            }

            turnPc();
            System.out.println();
            printMap();
        }


    }
}

