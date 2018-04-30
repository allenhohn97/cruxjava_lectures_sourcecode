package assignment3;import lecture3.* ;

public class que8_revarray {

	public static void main(String[] args) {
		int[] arr=si.input();
		arr=rev(arr);
		largestintegerinarray.print(arr);
		

	}
	public static int[] rev(int[] arr)
	{for(int i=0;i<arr.length/2;i++)
	{ int temp=arr[i];
	arr[i]=arr[arr.length-1-i];
	arr[arr.length-1-i]=temp;
	}
	return arr;
	}

}
