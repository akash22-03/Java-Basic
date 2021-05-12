
    import java.util.*;
    public class FactorsOfNumber {
    
    	public static void main(String[] args){
    		Scanner sc=new Scanner(System.in);
    		int input = sc.nextInt();
    		
    		if(input==0)
    		{
    		    System.out.println("No Factors");
    		}
   		else
    		{
    		    input= Math.abs(input);
    		    for(int i=1; i<=input;i++)
   		    {
    		        if(input%i==0)
    		        {
    		            System.out.print(i+",");
    		        }
    		    }
    		}
    		
    	}
    
    }