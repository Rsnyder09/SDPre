import java.util.Scanner;

public class Objective5Lab4 {
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int num;
		num = scan.nextInt();




		if (num % 2 == 0){
		System.out.println("This number is even");
} if (num % 2 == 1){
		System.out.println("This number is odd");}
  


scan.close();

	}
}