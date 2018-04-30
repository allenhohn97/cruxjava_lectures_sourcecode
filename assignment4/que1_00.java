package assignment4;

import java.util.Scanner;

public class que1_00 {

	public static void main(String[] args) {
		System.out.println("enter the no. of elements of array");
		Scanner s=new Scanner(System.in);
		int N =s.nextInt();
		int[] arr= new int[N];
		for(int i=0;i<N;i++)
		{ arr[i]=s.nextInt();
		}
arr=sortarr(arr);
System.out.println("the new array is");
for(int i=0;i<N;i++)
{System.out.print(arr[i]);}
arr=sortarr1(arr,0);
System.out.println("the new array is");
for(int i=0;i<N;i++)
{System.out.print(arr[i]);}

}
	public static int[] sortarr(int[] arr)
	{for(int i=0;i<arr.length;i++)
	{ for(int j=i;j>0;j--)
	{if(arr[j-1]==0&arr[j]!=0)
	{arr[j-1]=arr[j];
	arr[j]=0;
	}
	else
	{break;
	}
	}
	}
return arr;
	}
	public static int[] sortarr1(int[] arr,int si)
	{ if(si==arr.length||si<0) ;
	{return arr;}
	 
	if(arr[si]==0&arr[si+1]!=0)
	{arr[si]=arr[si+1];
	arr[si+1]=0;
		
	sortarr1(arr,si-1);}
	sortarr1(arr,si+1);}
	}

}





	