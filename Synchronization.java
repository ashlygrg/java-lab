package javalab;
import java.util.*;
class Table{
	void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(+n+"*"+i+"="+(n*i));
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e);
					
				}
			}
		}
	}
}
class Mythread extends Thread{
	Table t;
	int n;
	Mythread(Table t){
		this.t=t;
		
	}
	public void run() {
		t.printTable(n);
	}}
class Mythread2 extends Thread{
	Table t;
	int n;
	Mythread2 (Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}}
class synchronization{
	public static void main(String args[]) {
		Table t=new Table();
		Scanner sc=new Scanner(System.in);
		Mythread th=new Mythread(t);
		Mythread2 th2=new Mythread2(t);
		System.out.println("Enter the table you want to run by thread 1:");
		th.n=sc.nextInt();

		System.out.println("Enter the table you want to run by thread2:");
		th2.n=sc.nextInt();
		th.start();
		th2.start();
		sc.close();
	}}
		





