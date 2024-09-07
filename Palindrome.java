package javalab;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		int i,flag=0,len=str.length();
		for(i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("palindrome");
		else System.out.println("not palindrome");
	}

}
