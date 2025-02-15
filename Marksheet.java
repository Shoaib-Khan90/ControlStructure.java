package ControlStructure;

import java . util .Scanner;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner percentage=new Scanner(System.in);
		
		System.out.println(" Marksheet :");
		
		System.out.println("enter the num of urdu:");
		
		int urdu=percentage.nextInt();
		
		System.out.println("enter the num of math:");
		
		int math=percentage.nextInt();
		
		System.out.println("enter the num of english:");
		
		int english=percentage.nextInt();
		
		System.out.println("enter the num of computer:");
		
		int computer=percentage.nextInt();
		
		double obtained=urdu+english+math+computer;
		
		double total=400;
		
		double percentages=obtained/total*100;
		
		if(percentages >= 100) {
		
			System.out.println("your grade is A-One ");
		}
		
		else if (percentages >= 90) {
			
			System.out.println(" your grade is A ");
			
		}
		
		else if (percentages >= 80) {
		
			System.out.println("your grade is B ");
			
		}	
		
		else if(percentages >= 70) {
			
			System.out.println(" your grade is C ");
		}
		
		else if (percentages >= 60) {
			
			System.out.println(" your grade is D ");
		}
		
		else if (percentages >= 50) {
			
			System.out.println(" your grade is E ");
		}
		
		else {
			
			System.out.println(" your fail");
		}
	}
}
