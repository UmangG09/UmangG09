package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysProductMySelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long [] inputArray=new long[n];
		
		int [] finalArray=new int[n];
		int [] leftProdArray=new int[n];
		int [] rightProdArray=new int[n];
		
		for(int i=0;i<inputArray.length;i++)
		{
			inputArray[i]=sc.nextLong();
		}
		
		
		int prod=1;
		for (int i=0;i<inputArray.length;i++)
		{
			leftProdArray[i]=prod;
			prod=prod*inputArray[i];
				
		}
	     prod=1;
		
	     for (int i=inputArray.length-1;i>=0;i--)
			{
	    	 rightProdArray[i]=prod;
			 prod=prod*inputArray[i];
			}
			
	     for (int i=0;i<finalArray.length;i++)
			{
	    	   finalArray[i]=leftProdArray[i]*rightProdArray[i];
				
					
			}
		

		System.out.println(Arrays.toString(finalArray));
	}

}
