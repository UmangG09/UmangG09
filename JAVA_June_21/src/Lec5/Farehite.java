package Lec5;

import java.util.Scanner;

public class Farehite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int minTemp=sc.nextInt();
		int maxTemp=sc.nextInt();
        int step=sc.nextInt();
		int celcius;
		
		for(int i=0;i<=100;i+=step)
		{
			celcius =(int)(( 5 *(i - 32)) / 9);
			System.out.println(i+" "+celcius);
		}

	}

}
