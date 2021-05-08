//Nested Top classes
abstract class ShapeX {										//Top level class is ShapeX
	public abstract void area();							//abstract method should be there
    private double pi = 3.141;
    public class Circle1 extends ShapeX {                  //non-static or inner class begins here
    	double r;
		Circle1(double r){									//Constructor
			this.r = r ;
		}
		public void area() {                                         // method.
			System.out.println("Circle area ="+(pi*r*r));
		}
    }	//Circle1 ends here
	public static class Rectangle extends ShapeX { 			//static nested class (nested-top level class)
		int length;
		int breadth;
		Rectangle(int length, int breadth){			
			this.breadth = breadth; 
			this.length = length;
		}
		public void area() {										//overridden method
			System.out.println("Rectangle area ="+length*breadth);
		}	
	} //static nested class end here.
} // Top-level class ends here
//Driver class.
public class NestedTop {
	public static void main(String[] args) {
		ShapeX aShape = new ShapeX.Rectangle(12, 13);  //we created an object ref. of abstract class to keep the reference of nested sub-class (Rectangle).
		aShape.area();     
	//To instantiate an inner class, you must first instantiate the outer class. 
	//Then, create the inner object within the outer object 
		ShapeX.Circle1 c1 = aShape.new Circle1(2.0);
		c1.area();
		// object of nested top class and inner class can exist individually.
		Rectangle r1 = new Rectangle(4, 6); 
		r1.area();
		Circle1 c2 = new Circle1(3.0);
		c2.area();
		}
}
//Note: The object of abstract class can hold the references of derived (subclass) classes.
//While The abstract classes are generally meant for not instantiating the object.