package javalab;
import java.util.*;
public class StringToken {
public static void main(String args[]) {
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your integers (with 1 space gap):");
	String str=sc.nextLine();
	StringTokenizer t=new StringTokenizer(str," ");
	while(t.hasMoreTokens()) {
		String s=t.nextToken();
		n=Integer.parseInt(s);
		System.out.println(n);
		sum+=n;
	}
	System.out.println("Sum is:"+sum);
	sc.close();
}
}
