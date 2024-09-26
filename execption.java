package javalab;
import java.util.Scanner;
public class execption {
	public static void main(String args[]) {
		Scanner scanner=new
				Scanner(System.in);
		char c='y';
		do {
		System.out.println("Choose an operation:");
		System.out.println("1:Arithmetic operation");
		System.out.println("2:Array access");
		int choice=scanner.nextInt();
		switch (choice){
		case 1:
			try {
				System.out.println("Enter numerator:");
				int numerator=scanner.nextInt();
				System.out.println("Enter denominator:");
				int denominator=scanner.nextInt();
				int result=numerator/denominator;
				System.out.println("Result :"+result);
			}
			catch(ArithmeticException e){
				System.out.println("Catch an expression:"+e.getMessage());
			}
			break;
			case 2:
				int[]number= {1,2,3};
				try {
					System.out.println("Enter an array index to access:");
					int index = scanner.nextInt();
					System.out.println("Element as index "+index+" number[index]");
					}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Catch an exception:"+e.getMessage());
				}
				break;
			case 3:
				System.out.println("Successfully exited.");
				break;
				default:
					System.out.println("Invalid choice");
				break;
		}
		System.out.println("Do you want to continue: y/n ");
		c=scanner.next().charAt(0);
		}while(c=='y'||c=='Y');
		System.out.println("Successfully exited");
		scanner.close();
		
	}

}
