package Lec10;

import java.util.Arrays;

public class InsertElementSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] inputArray= {2,5,7,8,9,4};
		insertElement(inputArray,inputArray.length-1);
		System.out.println(Arrays.toString(inputArray));

	}

	
	public static void insertElement(int [] inputArray,int n)
	{
		int temp=inputArray[n];
		int position=0;
		
		for(int i=n-1;i>=0;i--)
		{
			if(temp>inputArray[i])
			{
				position=i+1;
				break;
			}
			else
			{
				position=i;
				inputArray[i+1]=inputArray[i];
			}
		}
		inputArray[position]=temp;
		
		
	}
}
