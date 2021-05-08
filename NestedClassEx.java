abstract class ShapeX{
    public abstract void area();
    private int x = 5;

    public class Circle1 extends ShapeX{
        double r;
        Circle1(double r){
            this.r = r;
        }
        public void area(){
            System.out.println("The area of Circle is: "+ (3.141*r*r));
        }
    }
    public static class Rectangle1 extends ShapeX{
        int length;
        int breadth;
        Rectangle1(int length, int breadth){
            this.breadth = breadth;
            this.length = length;
        }
        public void area()
        {
            System.out.println("The area of a rectangle is: "+length*breadth);
        }
    }

}
public class NestedClassEx {
    public static void main(String[] args) {
        ShapeX aShape = new ShapeX.Rectangle1(12,13);
        aShape.area();

        // Instantiate an inner class you must first intanstiate the outer class., then create the inner object within
        ShapeX.Circle1 C1 = aShape.new Circle1(5.5);
        C1.area();
        //object  of nested..
        ShapeX.Rectangle1 r1 = new ShapeX.Rectangle1(4, 6);
        r1.area();

        //  ShapeX.Circle1 c = new Circle1(4.4);



    }
}