package StudentDeatils;

import java.util.Scanner;

public class P_n {
	
	int a;
	Scanner num = new Scanner(System.in);
	
	void Result() {
		 
		 
		  System.out.print("Enter No.=");
		  a = num.nextInt();
		  if(a>=0) {
			  System.out.print(a +" is a positve number." );
			}
		  else {
			System.out.print(a +" is a negative number." );
			}
	 }
	
	public static void main(String[] args) {
			 
		P_n e= new P_n();
		e.Result();
			  
	}
}
