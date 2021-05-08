//Demonstarting the implementation of Functional interface using Lambda Expression
interface AreaC{
    //A method with single parameter
    double arreacircle(int i);
}


public class CircleLambda {
    public static void main(String[] args) {
        double pi = 3.142;

        AreaC a = (r) -> pi*r*r;
        System.out.println(a.arreacircle(4));
    }
}
