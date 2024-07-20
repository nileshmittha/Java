package onetwo;

public class countofTripleWthSumSmaller 
{

	public static void main(String[] args) 
	{
    int [] a= {1,2,5,2,3,6,8,9,7};
    
    for(int i=0; i<a.length; i++) 
    {
    	for(int j=i+1; j<a.length; j++)
    	{
    		for(int k=j+1; k<a.length; k++)
    		{
    			int sum=a[i]+a[j]+a[k];
    			if(sum<12)
    			{
    			System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + "=" + sum);
    			}
    		}
    	}
    }
    
	}

}
