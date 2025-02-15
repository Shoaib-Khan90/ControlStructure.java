package ControlStructure;

import java . util .Scanner;

public class OddandEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
        
		int x=input.nextInt();
        
		if(x%2==0) {
        
			System.out.println("even");
        }
        
		else {
        
			System.out.println("odd");
        }
	}

}
