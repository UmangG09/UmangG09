package Lec13;

public class WordByWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="The sky is Blue";
		String rev="";
		int index=st.lastIndexOf(" ");
		while(index>=0)
		{
	   
	   
		String temp=st.substring(index+1)+" ";
		rev=rev+temp;
		st=st.substring(0,index);
		index=st.lastIndexOf(" ");
		System.out.println(rev);
		}
		

	}

}
