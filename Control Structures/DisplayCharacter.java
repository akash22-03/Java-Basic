import java.util.Scanner;

public class DisplayCharacter {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the digits:");
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         int n3 = sc.nextInt();
         int n4 = sc.nextInt();
         
         System.out.println(n1+"-"+(char)n1);
        System.out.println(n2+"-"+(char)n2);
         System.out.println(n3+"-"+(char)n3);
         System.out.println(n4+"-"+(char)n4);

	}

}
