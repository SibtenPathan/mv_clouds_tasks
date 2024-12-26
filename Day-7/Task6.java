class Animal{
    void eat(){
        System.out.println("Eating....");
    }
}

class Mammal extends Animal{
    void breadth(){
        System.out.println("Breathing....");
    }
}

class Dog extends Mammal{
    void speak(){
        System.out.println("Speaking....");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.eat();
        obj1.breadth();
        obj1.speak();
    }
}