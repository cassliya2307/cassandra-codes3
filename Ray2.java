import java.util.Scanner;

public class Ray2{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int[] oddEven = new int[10];

int even = 0;
int count = 0;
int odd = 0;
int num = 0;

for(count = 0; count < 10; count++){
System.out.print("Enter a number: ");
num = scanner.nextInt();
oddEven[count] = num;
if(num % 2 == 0){even += num;
}

else{odd += num;

}

}
System.out.println(even);
System.out.println(odd);
System.out.println(oddEven[1]);

}
}
