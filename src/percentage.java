import java.util.Scanner;

public class percentage {
public static void main(String[] args) {
	int per =100;
	Scanner a =new Scanner(System.in); 
	System.out.println("Enter the first number");
	int one =a.nextInt();
	System.out.println("Enter the second number");
	int two =a.nextInt();
	int total =one *per;
	total/=two;
	System.out.println("the total percentage are: " + total);
	a.close();		
}
}
