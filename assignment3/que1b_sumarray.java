package assignment3;

import java.util.Scanner;

import lecture3.*;

public class que1b_sumarray {

	public static void main(String[] args) {
		 int[] arr1=largestintegerinarray.takeinput();
		 int[] arr2=largestintegerinarray.takeinput();
		
		 int size=0;
		 if(arr2.length>arr1.length)
		 { size=arr2.length;}
		 else
		 { size=arr1.length;}
		 int[] arr3= new int[size];
	
		 int i=0;
		 while(i<(arr1.length&arr2.length))
		 { arr3[i]=arr1[i]+arr2[i];
		 i++;
		 }
		 if(i<arr1.length)
		 {while(i<arr1.length)
		 {arr3[i]=arr1[i];
		 i++;
		 }}
		else if(i<arr2.length) 
		{while(i<arr2.length)
		 {arr3[i]=arr2[i];
		 i++;
		 }}
	
for(int j=0;j<size;j++)
{System.out.print(arr3[j]+"\t");
}
}
}