package assignment4;

import java.util.Scanner;

public class que4_012 {

	public static void main(String[] args) {
		System.out.println("enter the no. of elements ");
		Scanner scn=new Scanner(System.in);
		
		int N=scn.nextInt();
		int[] arr=new int[N];
		System.out.println("enter the elements");
		for(int i=0;i<N;i++)
		{arr[i]=scn.nextInt();
		
	}
		arr=array2(arr);
		System.out.println("the sorted array is");
		for(int i=0;i<N;i++)
		{ System.out.print(arr[i]);}

	}
	public static int[] array2(int[] arr)
	{int a1=0,a2=0;
		for(int i=0;i<arr.length;i++)
	{if(arr[i]==0)
	{ a1++;
	}
	if(arr[i]==1)
	{a2++;}

	}
		int j=0;
	while(j<a1)
	{arr[j]=0;
	j++;
	}

	while(j<a1+a2)
	{arr[j]=1;
	j++;
	}
	while(j<arr.length)
	{arr[j]=2;
	j++;}
	
	return arr;
	}

}
