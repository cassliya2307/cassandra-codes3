import java.util.Scanner;
public class MorningTask{

public static void main(String[] args){

int [] largest = new int[5];

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int max = scanner.nextInt();
largest[0] = max;
 

for(int count = 1; count < 5; count++){
System.out.print("Enter a number: ");
int num = scanner.nextInt();
largest[count] = num;

if(num > max){
max = largest[count];

}

else{
largest[0] = max;
}


}

System.out.println("The largest is " + max);







}

 











}




