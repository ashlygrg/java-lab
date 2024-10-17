package javalab;
import java.util.*;
class EvenNum implements Runnable{
	public int a;
	public EvenNum(int a) {
		this.a=a;
	}
	public void run() {
		System.out.println("The Thread "+a+" is EVEN and square of "+a+" is "+a*a);
	}}
class OddNum implements Runnable{
	public int a;
	public OddNum(int a) {
		this.a=a;
	}
	public void run() {
		System.out.println("The Thread "+a+" is ODD and cube of "+a+" is :"+a*a*a);
	}}
 class RandomNumGenerator extends Thread{
	public void run() {
		int n=0;
		Random r=new Random();
		try {
			for(int i=0;i<5;i++){
				n=r.nextInt(20);
				System.out.println("Generated Number is:"+n);
				if(n%2==0) {
				Thread thread1 = new Thread(new EvenNum(n));
				thread1.start();
				}else {
					Thread thread2=new Thread(new OddNum(n));
					thread2.start();
				}
					Thread.sleep(1000);
					System.out.println("-----------------------------");
				}}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}}}
	public class Multithreading {
		public static void main(String args[]) {
			RandomNumGenerator r= new RandomNumGenerator();
			r.start();
		}}
				
			
			
		

	
