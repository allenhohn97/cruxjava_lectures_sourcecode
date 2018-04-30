package assignment3;

import java.util.Scanner;

public class que6 {

	public static void main(String[] args) {
		System.out.println("enter the no. of arrays");
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
		{System.out.println("enter the "+(i+1)+" element");
		arr[i]=s.nextInt();
		}
		System.out.println("enter the no. whose sum u wanna find");
		int x=s.nextInt();
		for(int i=0;i<N;i++)
		{for(int j=i+1;j<N;j++)
		{ if(arr[i]+arr[j]==x)
			System.out.println(arr[i] +","+arr[j]);
		}
		}

	}

}
