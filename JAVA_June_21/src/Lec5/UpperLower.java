package Lec5;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
			char c = sc.next().charAt(0);  
			
			if(c>='A' && c<='Z')
			{
				System.out.println("Capital Letter");
			}
			else if (c>='a' && c<='z') {
				System.out.println("Lower Letter");
			}
		

	}

}
