//AN
//Q1.
//We can use Abstract classes in the following scenarios:-
//1.When there are many classes with similar methods.
//2.When we need to modify access of classes other than public.
//3.When we need to modify the stationary status


//Q2
abstract class GraphicObject {
    int x, y;
    void Graph() {
        System.out.println("Graphic object!!");
    }
    abstract void draw();
    abstract void resize();
}
class Circle extends GraphicObject {
    void draw() {
        System.out.println("Draw a circle");
    }
    void resize() {
        System.out.println("Resize a acircle");
    }
}
class Rectangle extends GraphicObject {
    void draw() {
        System.out.println("Draw a Rectangle");
    }
    void resize() {
        System.out.println("Resize a rectangle");
    }
}
class Bezier extends GraphicObject {
    void draw() {
        System.out.println("Draw a Bezier");
    }
    void resize() {
        System.out.println("Resize a bezier");
    }
}
class Lines extends GraphicObject {
    void draw() {
        System.out.println("Draw a Line");
    }
    void resize() {
        System.out.println("Resize a Line");
    }
}
public class Abstract {

	public static void main(String[] args) {
		//GraphicObject g = new GraphicObject();
		Circle c = new Circle();
		c.Graph();
		c.resize();
		c.draw();
	}

}
//ANIRUDH LODH
