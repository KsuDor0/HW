package lesson5;

public class Bird extends Animal {
    private  final int birdMayRun = 5;
    private final  float birdMayJump = 0.2f;

    public Bird() {

    }

    @Override
    void run(int distance) {
        if ((distance > birdMayRun) || (distance <=0)) {
            System.out.println("Птичка не смогла пробежать дистанцию. У нее остановилось сердце...");
        } else {
            System.out.println("Птичка смогла пробежать дистанцию длиной " + distance + " м");
        }
    }

    @Override
    void jumpOver(float barrier){
        if ((barrier > birdMayJump) || (barrier <=0)) {
            System.out.println("Птичка не смогла перепрыгнуть барьер");
        } else {
            System.out.println("Птичка смогла перепрыгнуть барьер высотой " + barrier + " м");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Птичка не умеет плавать. Она утонула...");
    }
}
