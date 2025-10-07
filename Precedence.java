import java.util.Scanner;

public class Occur{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = scanner.nextInt();

int digit1 = num / 10000;
int digit2 = (num % 10000) / 1000;
int digit3 = (num % 1000) / 100;
int digit4 = (num % 100) / 10;
int digit5 = num % 10;



if(digit1 > digit2 && digit1 > digit3 && digit1 > digit4 && digit1 > digit5){

System.out.print(digit1 + "is the largest");


}


else if(digit2 > digit1 && digit2 > digit3 && digit2 > digit4 && digit2 > digit5){

System.out.print(digit2 + "is the largest");


}


else if(digit3 > digit2 && digit3 > digit1 && digit3 > digit4 && digit3 > digit5){

System.out.print(digit3 + "is the largest");


}


else if(digit4 > digit2 && digit4 > digit3 && digit4 > digit1 && digit4 > digit5){

System.out.print(digit4 + "is the largest");


}


else if(digit5 > digit2 && digit5 > digit3 && digit5 > digit4 && digit5 > digit1){

System.out.print(digit5 + "is the largest");


}





}


}