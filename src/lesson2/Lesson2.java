package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int[] roll = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < roll.length; i++) {
            System.out.print(roll[i] + "|");
        }
        System.out.println();
        myRoll(roll);
        for (int i = 0; i < roll.length; i++) {
            System.out.print(roll[i] + "|");
        }
        System.out.println();

        int[] eight = new int[8];
        myEight(eight);
        for (int i = 0; i < eight.length; i++) {
            System.out.print(eight[i] + " ");
        }
        System.out.println();

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        myArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int[] minMax = {18, -6, -1, 5, 2};
        myMin(minMax);
        myMax(minMax);


    }

    public static void myRoll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }


    public static void myEight(int[] full) {
        int a = 1;
        for (int i = 0; i < full.length; i++) {
            full[i] = a;
            a = a + 3;
        }
    }


    public static void myArray(int[] ray) {
        for (int i = 0; i < ray.length; i++) {
            if (ray[i] < 6) {
                ray[i] = ray[i] * 2;
            }
        }


    }


    public static void myMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Я нашла минимальное число" + " " + min);
    }

    public static void myMax(int[] arr) {
        int max = arr[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Я нашла максимальное число" + " " + max);
    }
}


