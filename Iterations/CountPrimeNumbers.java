    import java.util.Scanner;
    
    public class CountPrimeNumbers {
    
    	public static void main(String[] args){
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter starting range");
    		int srange = sc.nextInt();
    		System.out.println("Enter ending range");
   		int erange = sc.nextInt();
    		
    		int count=0;
    		for(int i = srange ; i<erange;i++)
    		{
    		    if(isprime(i)==1)
   		        count++;
    		}
    		
    		System.out.println(count);
    		
    	}
    	
    	public static int isprime(int num){
    	    if(num<=1) return 0;
    	    for(int i=2;i<=num/2;i++)
    	    {
    	        if(num%i==0) return 0;
    	    }
    	    return 1;
    	}
    
    }