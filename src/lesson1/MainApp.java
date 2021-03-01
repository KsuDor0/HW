package lesson1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(floatReturn(2, 4, 5, 2));
        System.out.println(fromTenToTwenty(2, 2));
        positiveOrNegative(3);
        String hi = helloName("Olivia");
        System.out.println(hi);


    }


    public static float floatReturn(int a, int b, int c, int d) {

        return  a * (b+ ((float)c / d));
    }

    public static boolean fromTenToTwenty(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative (int a) {
        if (a >= 0){
            System.out.println("Положительно");
        } else {
            System.out.println("Отрицательно");
        }
    }


    public static String helloName(String name) {
        return "Привет, " + name + "!";
    }

}