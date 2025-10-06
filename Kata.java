public class Kata{

public static int factorOf(int num){

int sum = 0;
for(int counter = 1; counter <= num;counter++){

	if(num % counter == 0){
		sum += 1;

	 	 }



}


return sum;


}


public static boolean isPrime(int num){


int prime = 0;
for(int counter = 1; counter <= num; counter++){

prime += counter;

}

if(prime % 2 != 0 || prime % num == 0){
	return true;
}

else{return false;}


}


public static boolean isOdd(int number){
return number%2!=0;
}

public static boolean isLeapYear(int year){
boolean isLeap = false; 

if(year % 4 == 0 && year % 100 != 0){
isLeap = true;

}

else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
isLeap = true;

}         

else if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
isLeap = false;

}

if(isLeap == true){return true;}
else{return false;}

}



public static double fahrenheitToCelsius(int num){

double celsius = 5 * (num - 32) / 9;

return celsius;

}


public static void printStars(int numOfRows){

for(int counter = 1; counter <=  numOfRows; counter++){

for(int coloumn = 0; coloumn < counter ; coloumn++){


System.out.print("*");
}




System.out.println();
}



}

public static boolean isEven(int number){
return number%2==0;

}


public static int toSubtract(int num1 , int num2){

int subtract = num1 - num2;

if(subtract < 1){
return subtract *= -1;}

else{return subtract;}


}

public static int toDivide(int num1 , int num2){

int divide = num1 / num2;

if(num2 == 0 || num1 == 0){return divide = 0;} 

else{return divide;}



}

public static boolean isSquare(int num){
int number = 0;
int sum = 0;
for(int counter = 1; counter <= num;counter++){

	if(num % counter == 0){
		sum += 1;

}

return sum % 2 != 0;

}

public static int factorial(int number){

int factorial = 1;
for(int count = 1; count <= number; count++){

	factorial *= count;





}

return factorial;

}



public static int isPalindrum(int num){
boolean real = true;
int digit = 0;
int reverse = 0;
int times = 10;
int check = num;
for(int count = 1; number > 0; count++){

	digit = num % 10;
	num = num / 10;
reverse *= times + digit;

if(count == 1){reverse = digit * 1;}
}

if(check == reverse){real = true;}

else{real = false;}


return real;
}





}

