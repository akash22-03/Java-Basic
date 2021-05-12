import java.util.*;
public class ResgistrationDetails {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your phoneno:");
        long tel = sc.nextLong();
        System.out.println("Enter your qualification");
        String qualification = sc.nextLine();
       sc.nextLine();
        System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String mail= sc.nextLine();
        System.out.println("Enter your noofexperience[if any]:");
        double noofexperience = sc.nextDouble();
        
      System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+mail+" within 2 working days");
	}

}
