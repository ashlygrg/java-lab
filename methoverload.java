package palindrome;
import java.util.Scanner;
class MethodOverLoading{
	void area(double r) {
		System.out.println("Area of Circle is:"+(3.14*r*r));
	}
	void area(int l,int b) {
		System.out.println("Area of Rectangle is:"+l*b);
	}
	void area(double l,double b) {
		System.out.println("Area of Triangle is:"+(0.5*l*b));
	}
}
public class methoverload {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	
		MethodOverLoading mo= new MethodOverLoading();
		System.out.println("enter the radius of the circle: ");
		double radius=sc.nextDouble();
		mo.area(radius);
		System.out.println("enter the length and breadth of the rectangle: ");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		mo.area(length,breadth);
		System.out.println("enter the base and height of the triangle: ");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		mo.area(base,height);
		sc.close();
	}

}
