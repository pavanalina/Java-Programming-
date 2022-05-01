package recurssion;

import java.util.Scanner;

public class MyString {
	
	public static String[] slice(String[] inputString, int start,int end)
	{
		String[] sliceString=new String[end-start];
		for (int i=0;i<sliceString.length;i++)
		{
			sliceString[i]=inputString[start+i];
			//System.out.println(sliceString[i]);
			
		}
		return sliceString;
		
	}
	
/*	public static String[] toUpper(String[] input)
	{
		
		if(input.length==1)
		{
			input[0]=input[0].toUpperCase();
			return input;
		}
		input[0]=input[0].toUpperCase();
		String[] newSlice=new String[input.length-1];
		newSlice=slice(input,1,input.length-1);
		return toUpper(newSlice);	
	}
	*/
	public static String[] merge(String[] s1,String[] s2)
	{
		String[] result=new String[s1.length+s2.length];
		int i=0;
		while(i<s1.length)
		{
			result[i]=s1[i];
			i++;
		}
		int j=0;
		while(j<s2.length)
		{
			result[i+j]=s2[j];
			j++;
		}
		return result;
		
	}
	public static String[] toUpper(String[] input)
	{
		String temp[]=new String[1];
		if(input.length==0)
		{
			return input;
		}
		temp[0]=input[0].toUpperCase();
		return merge(temp,toUpper(slice(input,1,input.length)));
		
		
	}
/*	public static void toUpper(String[] input)
	{
		if(input.length==0)
		{
			return;
		}
		System.out.println(input[0].toUpperCase());
		toUpper(slice(input,1,input.length));
		
		
	}
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] inputStringArray=new String[5];
		System.out.println("Enter the strings:");
		for(int i=0;i<5;i++)
		{
			inputStringArray[i]=input.nextLine();
		}
		input.close();
		String[] result=new String[5];
		result=toUpper(inputStringArray);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		System.out.println("its working");
		
		
	}

}
