package ANimals;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Ànimalforrest {
    public static void main(String[] args){

        Cat c = new Cat("Missie");
        c.sound();

        Dog d = new Dog ("Bobby");
        d.sound();

        Animal a= c;
        a.sound();//kan enkel als er een abstracte methode bestaat voor Animal
    }
}



abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void sound();
}

//cat.java
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void sound(){
        System.out.printf("make cat sound miauw");
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void sound (){
        System.out.printf("Make dog sound woef");
    }
}

class Rabbit extends Animal{
    public Rabbit(String name){
        super(name);
    }
    // je moet een methode sound voor rabbit definiëren

    public void sound(){
        System.out.printf("Make grrrrr");
    }
}