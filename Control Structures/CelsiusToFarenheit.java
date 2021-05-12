    import java.util.Scanner;
    
    public class CelsiusToFarenheit{
        
        public static void main(String[] args){
            
           Scanner sc=new Scanner(System.in);
           double temp = sc.nextDouble();
           double far = ((9*temp)/5)+32;
           System.out.println(far);
            
       }
        
   }