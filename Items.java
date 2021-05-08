/* Lab Assignment-2 */

/*
Name:- Nirmit Shah
Registation Number:- 19MIM10049
Slot:- E11+E12+E13
 */

import java.util.Scanner;

class PurchaseItem
{
    private String name;
    private double unitPrice;

    public PurchaseItem() {
        this.name = "No Item";
        this.unitPrice = 0;
    }

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public void getData() {
        System.out.println("Name :- "+name);
        System.out.println("Unit Price :- "+unitPrice);
    }

    public void setData(String name, double unitprice) {
        this.name = name;
        this.unitPrice=unitprice;
    }

    public double getPrice(){
        return unitPrice;
    }

    public String toString() {
        return name + " @ " + unitPrice ;
    }
}
class CountedItem extends PurchaseItem
{
    private int quantity;

    public CountedItem() {
    }

    public CountedItem(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity*super.getPrice();
    }

    public String toString() {
        return super.toString()+" "+quantity+"units "+getPrice()+"SR";
    }
}

class WeighedItem extends PurchaseItem
{
    private double weight;

    public WeighedItem() {
    }

    public WeighedItem(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice()
    {
        return weight*super.getPrice();
    }

    public String toString() {

        return super.toString()+" "+weight+"kg "+getPrice()+"SR";
    }
}

public class Items {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Weighted Item:");
        System.out.println("Enter Name, Unit Price, Weight :-");
        WeighedItem W1 = new WeighedItem();
        W1.setData(sc.next(), sc.nextDouble());
        W1.setWeight(sc.nextDouble());
        System.out.println(" "+W1.toString());

        System.out.println("Counted Item:");
        System.out.println("Enter Name, Unit Price, Quantity :-");
        CountedItem C1 = new CountedItem();
        C1.setData(sc.next(), sc.nextDouble());
        C1.setQuantity(sc.nextInt());
        System.out.println(" "+C1.toString());

    }
}

