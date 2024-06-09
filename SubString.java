package JDBCPack;

import java.util.Scanner;

public class SubString {
	
	
	

	

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        
	        char c1[]=S.toCharArray();
	        
	        for(int i=start; i<end; i++){
	            
	            System.out.print(c1[i]);
	        }
	    }
	}


