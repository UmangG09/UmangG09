package Lec15_Recursion;

public class GlobalVariable {

	public static int globalNumber=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(globalNumber);
		displayVal();
		System.out.println(globalNumber);

	}
	
	public static void displayVal()
	{
		int globalNumber=20;
		System.out.println(globalNumber);
		System.out.println(GlobalVariable.globalNumber);
		GlobalVariable.globalNumber=100;
	}

}
