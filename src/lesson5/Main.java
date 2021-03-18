package lesson5;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.run(400);
        cat.jumpOver(1);
        cat.swim(0);

        Dog dog = new Dog();
        dog.run(400);
        dog.jumpOver(1);
        dog.swim(2);

        Bird bird = new Bird();
        bird.run(6);
        bird.jumpOver(0.1f);
        bird.swim(0);

        Horse horse = new Horse();
        horse.run(700);
        horse.jumpOver(2);
        horse.swim(66);
    }
}
