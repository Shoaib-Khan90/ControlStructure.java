package ControlStructure;

import java . util .Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter your age");
		
		int age=input.nextInt();
		
		if(age>23) {
		
			System.out.println("your accepted for admission");
		}
		
		else if(age<23){
		
			System.out.println("your admit");
		}
		
		else {
		
			System.out.println("your not accepted for admission");
		}
	}

}
