     import java.util.Scanner;
     
     public class DisplayString {
     
    	public static void main(String[] args){
     		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter the String");
     		String str = sc.nextLine();
     		System.out.println("Enter the number");
    		int num = sc.nextInt();
    		
    		if(num<0)
    		{
    		    System.out.println(num+" is not a valid input");
    		}
    		else
    		{
    		    for(int i=0;i<num;i++)
    		    {
    		        System.out.println(str);
   		    }
    		}
    	}
    
   }