import java.util.Scanner;

public class Max{

public static void main(String[] args){


Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int max = scanner.nextInt();

System.out.print("Enter a number: ");
int max2 = scanner.nextInt(); 

if(max > max2){max = max;}

else if(max > max2){max2 = max;}

for(int count = 2; count < 5; count++){
System.out.print("Enter a number: ");
int num = scanner.nextInt();

if(num > max && num > max2){
max2 = max;
max = num;}

else if(num < max && num > max2){max2 = num;}

else{}


}

System.out.println("The largest is " + max);
System.out.println("The second largest is " + max2);







}







}