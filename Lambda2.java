//import java.util.function;
interface Myinterface1{
    String sayHello();
}

//Driver class
public class Lambda2 {
    public static void main(String[] args) {
        //Lambda Expression
        //Here I created a variable of type functional interface
        Myinterface1 msg = () -> {return "Hello Everyone!!!";};
        //Myinterface1 msg = () -> {return"Hello Everyone!!!!!!!!";};
        System.out.println(msg.sayHello());
        //System.out.println(msg.sayHello());
    }
}
