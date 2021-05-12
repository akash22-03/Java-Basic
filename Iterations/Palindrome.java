    import java.util.Scanner;
    
     public class Palindrome {
     
     	public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		int palindrome = sc.nextInt();
     		int rev = 0;
     		
   		if(palindrome<0)
    		{
    		    System.out.println("Invalid Input");
   	}
    		else
    		{
    		    for(int i=palindrome; palindrome!=0; palindrome/=10)
    		    {
    		        rev = rev*10 + palindrome%10;
    		    }
    		    if(palindrome==rev)
    		    {
    		        System.out.println("Palindrome");
    		    }
    		    else
    		    {
    		        System.out.println("Not a Palindrome");
    		    }
    		}
    		
    	}
    
    }
    