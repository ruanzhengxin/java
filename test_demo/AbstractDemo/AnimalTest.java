package AbstractDemo;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat=new Cat("11",41);
        Dog dog=new Dog("ewq",22);
        dog.eat();
        cat.eat();
        dog.jump();
        cat.jump();
        System.out.println(cat.getAge());
        System.out.println(dog.getAge());
    }
}
