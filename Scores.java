import java.util.Scanner;
public class Scores{

public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int[] scores = new int[11];
		int sum = 0;
		for(int count = 1; count <= 10; count++){
			System.out.print("Enter number " + count + " in range(0 - 100):");
			int score = scanner.nextInt();
			scores[count] = score;
			sum += score;
}




System.out.print("The sum is: " + sum);


}
}