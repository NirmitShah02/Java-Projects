//To write our own class
class Box {
	
	double l;
	double b;
	double h;
	
	public double volume(double l, double b, double h) {
	double vol = l*b*h;
	return vol;
	}

}

//Driver class
class Rectangle {

	public static void main(String[] args) {
	Box b1 = new Box();			// to instantiate our class
	
	double ans = b1.volume(5, 6, 7);	//to call method.
 	System.out.println("The volume of box is "+ans);

	}


}

