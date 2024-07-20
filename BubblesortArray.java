package onetwo;

public class BubblesortArray {

	public static void main(String[] args) {

		int [] arr = {3,2,1};
		
		// s1= i loop will run from 0 to length - 1
		for(int i=0; i<arr.length; i++)
			
		{ //s2= j loop will run from 0 to length - 1 as we are comparing arr[j] with arr[j+1]
			for(int j=0; j<arr.length - 1; j++)
				
			{ // s3= verify that the aee[j] greater yhan arr [j+1] to swap
				if(arr[j] > arr[j+1])
					
				{ // s4= actual swap
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				
				}
			}
		}
		// s5= printing the array
		for(int i : arr)
		{
			System.out.println(i + " ");
		}
	}

}
