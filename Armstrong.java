package JDBCPack;
import java.util.Arrays;
import java.util.Scanner;

public class Armstrong {
	
	
	
	

	

	    static boolean isAnagram(String a, String b) {
	    	
	    	String a1=a.toLowerCase();
	    	String b1=b.toLowerCase();
	        
	        char c1[]=a1.toCharArray();
	        char c2[]=b1.toCharArray();
	        
	        if(c1.length != c2.length){
	            return false;
	        }
	        
//	        Arrays.sort(c1);
//	        Arrays.sort(c2);
	        
	        
	        for(int i=0; i<c1.length; i++) {
	        	
	        	for(int j=i+1; j<c1.length; j++) {
	        		if(c1[i] > c1[j]) {
	        			
	        			char temp=c1[i];
	        			c1[i]=c1[j];
	        			c1[j]=temp;
	        		}
	        	}
	        }
	        
	        for(int i=0; i<c2.length; i++) {
	        	
	        	for(int j=i+1; j<c2.length; j++) {
	        		if(c2[i] > c2[j]) {
	        			
	        			char temp=c2[i];
	        			c2[i]=c2[j];
	        			c2[j]=temp;
	        		}
	        	}
	        }
	        System.out.println(c1);
	        System.out.println(c2);
	        
	        
	        
	        for(int i=0; i<c1.length; i++){
	            
	            if(c1[i] != c2[i]){
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enetr String 1:");
	        String a = scan.next();
	        System.out.println("Enetr String 2:");
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	

}
