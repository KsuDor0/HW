package lesson5;

public class Cat extends Animal {
    private  final int catMayRun = 200;
    private final  float catMayJump = 2;


    public Cat() {

    }

    @Override
    void run(int distance) {
        if ((distance > catMayRun) || (distance <= 0)) {
            System.out.println("Котик не осилил дистанцию");
        } else {
            System.out.println("Кот пробежал " + distance + " метров");
        }
    }

    @Override
    void jumpOver(float barrier) {
        if ((barrier > catMayJump) || (barrier <=0)) {
            System.out.println("Котейка не смог перепрыгнуть препятствие высотой в " + barrier + " м");
        } else {
            System.out.println("Котик смог перепрыгнуть препятствие высотой в " + barrier + " м");
        }
    }
    @Override
    void swim(int distance) {
        System.out.println("Котик не умеет плавать. Он утонул...");
    }
}
