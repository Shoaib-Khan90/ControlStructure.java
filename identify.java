package ControlStructure;
import java.util.Scanner;
public class identify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		System.out.println("enter the character: ");
		char character=input.next().charAt(0);
		
		if(character== 'a' || character == 'e' || character== 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'O' || character == 'U' )
		{
			System.out.println("The value is vowel :");
			}
		else{
			System.out.println("The value is constant :");
		}
	}

}
