package com.practice;

public class pattern1 {

	public static void main(String[] args) {
              int n=10;
              for(int i=0;i<=n-1;i++) {
            	  for(int j=0;j<=n-1;j++) {
            		  if(i==0 || i==n-1) {
            			  System.out.print("*");
            		  }
            		  if((i>0) && (i<n-1)){
            			  if(j==0 || j==n-1) {
            				  System.out.print("*");
            				
            			  }
            			  else {
            				  System.out.print(" ");
            			  }
            		  }
            	  }
            	  System.out.println("\t");
              }
	}
}