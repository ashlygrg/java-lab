package palindrome;
import java.util.Scanner;
interface Human{
	final int jobid=1050;
	void learn (String str);
	void work();
}
interface Recruitment {
	void screening (int score);
}
class Programmer implements Human,Recruitment{
	public void learn (String str){
      System.out.println("Learn using "+str);
}
	public void screening (int score){
	      System.out.println("Test score "+score);
}
	public void work(){
	      System.out.println("Selected to Role Development ");
	}

}
public class Interface{
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your trained area ");
		String area= sc.next();
		System.out.println("Enter test score");
		int testscore=sc.nextInt();
		System.out.println("-----ABOUT MY PLACEMENT----");
		Programmer trainee= new Programmer();
		trainee.learn(area);
		trainee.screening(testscore);
		trainee.work();
		System.out.println("My job's ID is: "+trainee.jobid);
		sc.close();
		
	}
}