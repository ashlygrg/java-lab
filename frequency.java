package javalab;
import java.util.Scanner;
public class frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		System.out.println("enter the character to be search:");
        char ch=sc.nextLine().charAt(0);
        int len=str.length(),count=0,i;
        for(i=0;i<len;i++) {
        	if(str.charAt(i)==ch) {
        		count++;
        		
        	}
        }
        System.out.println("frequency of "+ch+" is: "+count);
	}
}
		
		


