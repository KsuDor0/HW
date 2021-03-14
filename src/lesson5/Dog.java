package lesson5;

public class Dog extends Animal {
    private  final int dogMayRun = 500;
    private final  float dogMayJump = 0.5f;
    private final  int dogMaySwim = 10;

    public Dog() {

    }
    @Override
    void run(int distance) {
        if ((distance > dogMayRun) || (distance <= 0)) {
            System.out.println("Пёсиль не смог осилить дистанцию");
        } else {
            System.out.println("Пёсиль пробежал " + distance + " метров");
        }
    }

    @Override
    void jumpOver(float barrier) {
        if ((barrier > dogMayJump) || (barrier <=0)) {
            System.out.println("Собакен не смог перепрыгнуть барьер");
        } else {
            System.out.println("Собакен перепрыгнул барьер высотой " + barrier + " м");
        }
    }

    @Override
    void swim(int distance) {
        if ((distance > dogMaySwim) || (distance <= 0)) {
            System.out.println("Собака не смогла проплыть дистанцию. Она утонула...");
        } else {
            System.out.println("Собака успешно проплыла дистанцию в " + distance + " м");
        }

    }
}
