package javalab;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		int i,len=str.length(),count=0;
		str.toLowerCase();
		for(i=0;i<len;i++) {
	        if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')) {
	        	count++;
	        }
		}
		System.out.println("there are "+count+" vowels in "+str);
	}
}