package onetwo;

public class evenoddNegPosARRAY {

	public static void main(String[] args) {
         // w a p to chech whether number is even odd pssitive or negative
		int [] a= {1,2,4,5,6,6,7,8,9};
	int even=0,odd=0,pos=0,neg=0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]%2==0)
			even++;
		else
			odd++;
		
		if(a[i]>=0)
		{
			pos++;
		}
		else
		{
			neg++;
		}
	}
	
	System.out.println("even  : " +even);
	System.out.println("odd :  " +odd);
	System.out.println("possitive : " +pos);
	System.out.println("negative : " +neg);
	
	}

}
