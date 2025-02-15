package ControlStructure;

import java . util .Scanner; 

public class ValuesEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int a=input.nextInt();
		
		int b=input.nextInt();
		
		if(a==b) {
		
			System.out.println("values are equal");
		}
		
		else if(a>b) {
		
			System.out.println("a is greater than b");
		}
		
		else {
		
			System.out.println("a is less than b");
		}
	}

}
