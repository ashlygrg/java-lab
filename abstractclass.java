package javalab;
import java.util.Scanner;
abstract class Shape{
abstract void numberofsides() ;
}
class Rectangle extends Shape{
	void numberofsides() {
		System.out.println("Rectangle has four sides");
	}
}
class Triangle extends Shape{
	void numberofsides() {
		System.out.println("Triangle  has three sides");
	}
}
class Hexagon extends Shape{
	void numberofsides() {
		System.out.println("Hexagon has six sides");
	}
}
public class abstractclass {
	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	Triangle t=new Triangle();
	Hexagon h=new Hexagon();
	r.numberofsides();
	t.numberofsides();
	h.numberofsides();
	}
}