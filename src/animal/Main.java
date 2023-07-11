package animal;

public class Main {


    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Pig pig = new Pig();

        System.out.printf("%s %s %s\n", dog.getClass().getSimpleName(), dog.makeNoise(), dog.eatsWhat());
        System.out.printf("%s %s %s\n", cat.getClass().getSimpleName(), cat.makeNoise(), cat.eatsWhat());
        System.out.printf("%s %s %s\n", bird.getClass().getSimpleName(), bird.makeNoise(), bird.eatsWhat());
        System.out.printf("%s %s %s\n", pig.getClass().getSimpleName(), pig.makeNoise(), pig.eatsWhat());
    }

}   
