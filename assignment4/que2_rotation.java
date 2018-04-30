package assignment4;

import java.util.Scanner;

public class que2_rotation {

	public static void main(String[] args) {
	System.out.println("enter the no. of elements sorted array with rotation");
	Scanner scn=new Scanner(System.in);
	
	int N=scn.nextInt();
	int[] arr=new int[N];
	for(int i=0;i<N;i++)
	{arr[i]=scn.nextInt();}
	int k=rot(arr);
	System.out.println("the rotation is"+k);
	
	System.out.println("the rotation is"+rot1(arr,0));
	}
public static int rot(int[] arr)
{int k=0 ;
for(int i=0;i<arr.length-1;i++)
{if(arr[i]>arr[i+1])
{k=i+1;
break ;
}

}
return k;
}
public static int rot1(int[] arr,int si)
{ if(arr[si]>arr[si+1])
	return si;
if(si==arr.length-1)
	return -1;
rot1(arr,si+1);
return si;
}
}
