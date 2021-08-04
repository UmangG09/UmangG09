package Lec10;

import java.util.Arrays;

public class InsertionSortMy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] inputArray= {2,0,1,0,0,2,2};
		
		for(int i=0;i<inputArray.length;i++)
		{   
			insertionSort(inputArray,i);
		}
		
		System.out.println(Arrays.toString(inputArray));

		
		


	}
	
	public static void insertionSort(int [] inputArray,int n)
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
