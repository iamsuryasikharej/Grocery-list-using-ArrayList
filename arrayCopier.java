import java.util.*;
class array1
{
	public int[] originalArray()
		{
		int[] originalArray=new int[5];

		for(int i=0;i<originalArray.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			originalArray[i]=sc.nextInt();
		}
		System.out.println("below digits are your entered digits");
		for(int i=0;i<originalArray.length;i++)
		{
			System.out.println(originalArray[i]);
		}
		return originalArray;


}
}

class array2
{
	public int[] duplicateArray(int[] copy)
	{
		int[] duplicateArray=new int[10];
		for(int i=0;i<copy.length;i++)
		{
			duplicateArray[i]=copy[i];

		}
		return duplicateArray;
}
}
class arrayCopier
{
	public static void main(String[] args) {
		array1 og=new array1();
		int[] x=og.originalArray();
		array2 dup=new array2();
		int[] y=dup.duplicateArray(x);
		System.out.println(y.length);
		System.out.println("after copying");
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}
