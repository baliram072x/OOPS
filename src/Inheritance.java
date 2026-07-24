public class Inheritance {
    public static void main(String[]args){
        fish shark = new fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.legs = 2;
        dobby.eat();
        System.out.println(dobby.legs);

    }
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// derived class

class fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swims in water");
    }
}

class Mammmal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Dog extends Mammmal{
    String breed;
}

// types of inheritance
//1. single level inheritance
//2. multi level inheritnace
//3. Hierarchical Inheritance
//4. hybrid innheritance