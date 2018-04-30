package assignment3;

import java.util.Scanner;

public class que4_highestchar {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		int[] arr=new int[20];
		int max=0,k=0 ;
		for(int i=0;i<s.length();i++)
		{ for(int j=i;j<s.length();j++)
		{
			if(s.charAt(j)==s.charAt(i))
		
		{ arr[i]++;
		}
		}
			
		if(arr[i]>max)
		{max=arr[i];
		 k=i;
		}

	}

	System.out.println(s.charAt(k)+"\t"+"comes"+'\t'+max+'\t'+ "times");
}}