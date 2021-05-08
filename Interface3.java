
import java.io.*;
interface Animal
{
    public static final String tname= "Hello";
    void sound(); // no implementation / the methods don't have bodies
    //void name(String tname); //all methods or members are public
    void speed();// by default interface methods are abtract and public // interface cannot contain contructor

    default void show() {
        System.out.println("Hello! I am default method of Animal");
    }
}

interface FastAnimal {
    void run();
    // interface can have default methods
    default void showme()
    {
        System.out.println("Hello! I am method of FastAnimal.");
    }


    //interface can have static methods as well
    static void roar() {
        System.out.println("I am static method of FastAnimal interface");
    }
}


class Tiger implements Animal, FastAnimal{
    public void sound()
    {
        System.out.println("Roar");
    }
    public void speed() {
        System.out.println("Tiger's speed is 30-50kmph");
    }
    public void run() {
        System.out.println("I am a fast animal");
    }

}
//Driver Class
class Interface3 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.run();
        t1.sound();
        t1.speed();
        t1.show();
        t1.showme();
        //t1.run();
        //Animal a = new Anumal(); //not valid
        //FastAnimal f = new FastAnimal(); // not valid
    }
}