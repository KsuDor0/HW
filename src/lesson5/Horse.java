package lesson5;

public class Horse extends Animal {
    private  final int horseMayRun = 1500;
    private final  float horseMayJump = 3;
    private final  int horseMaySwim = 100;

    public Horse() {

    }

    @Override
    void run(int distance) {
        if ((distance > horseMayRun) || (distance <=0)) {
            System.out.println("Лошадка не смогла пробежать дистанцию");
        } else {
            System.out.println("Лошадка смогла пробежать дистанцию длиной " + distance + " м");
        }
    }

    @Override
    void jumpOver(float barrier) {
        if ((barrier > horseMayJump) || (barrier <=0)) {
            System.out.println("Лошадка не смогла перепрыгнуть препятствие");
        } else {
            System.out.println("Лошадка смогла пробежать барьер высотой " + barrier + " м");
        }
    }

    @Override
    void swim(int distance) {
        if ((distance > horseMaySwim) || (distance <=0)) {
            System.out.println("Лошадка не смогла проплыть дистанцию. Она утонула...");
        } else {
            System.out.println("Лошадка смогла проплыть дистанцию длиной " + distance + " м");
        }
    }
}
