    import java.util.Scanner;
    
    public class PowerOfNumber {
    
    	public static void main(String[] args)
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the number");
    		int num = sc.nextInt();
    		System.out.println("Enter the digit");
    		int dig = sc.nextInt();
    		if(num<0 || dig<0)
    		{
    		    System.out.println("Invalid Input");
    		}
    		else{
   		int temp=1;
    		for(int i=0; i<dig; i++)
    		{
    		    temp = temp*num;
    		}
    		
    		System.out.println(temp);
    		}
    		
    	}
   
    }