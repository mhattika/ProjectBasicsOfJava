package Assignments;



public class FindMissingNumberInArray 
{

	public static void main(String[] args) 
	{

	int a[]= new int[3]; //fixed array
	a[0]=10;
	a[1]=20;
	a[2]=30;
	
	
	int n=5;
	int b[]= {1,2,4,5};
	int totalSum = (n*(n+1))/2;
	int arrySum=0;
	
	for(int i:b)
	{
		arrySum=arrySum + i;
		System.out.println(i);
	}

	int missingNumber = totalSum-arrySum;
	System.out.println("missin numberin array is = " + missingNumber);
	
	}

}
