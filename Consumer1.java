
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class Product {
    private double price = 0.0;
    public void setPrice(int i,double price) {
        this.price = price;
    }
    public void printPrice() {
        System.out.println(price);
    }
}
//Driver Class
public class Consumer1 {
    public static void main(String[] args) {

        Consumer<Product> xyz = p -> p.setPrice(5,9);  //Lambda Expression
        Product p1 = new Product();
        List<Product> Ip = new ArrayList<>();
        xyz.accept(p1);
        p1.printPrice();
    }
}
