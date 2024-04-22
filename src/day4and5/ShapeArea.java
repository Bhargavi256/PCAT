package day4and5;

public class ShapeArea {

	public static void main(String[] args) {
		Shape shape;
		// TODO Auto-generated method stub
        shape = new Rectangle(3,4);
        System.out.println(shape.area());
        shape = new Circle(4);
        System.out.println(shape.area());
	}

}
