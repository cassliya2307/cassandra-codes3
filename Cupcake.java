public class Cupcake{
public static int findSmallest(int[] num){

int min = num[0];

for(int count = 1; count < num.length; count++){

if(num[count] < min)
min = num[count];



}

return min;
}

public static int averageArray(int[] number){

int sum = 0;
int score = 0;
int count = 0;
for(count = 0; count < number.length; count++){

score = number[count];
sum += score;
			
}

int average = sum / count;

return average;

}



public static int countOccurence(int[] num1, int num2){

int target = num2;
int sum = 0;
for(int count = 0; count < num1.length; count++){
if(num2 == num1[count])
sum += 1;

}

return sum;





}


public static int getFirstElement(int [] integer){
int firstNumber = integer[0];



return firstNumber;

}


public static int getLastElement(int [] number){
int lastNumber = 0;
for(int count = 1; count < number.length; count++){
lastNumber = number[number.length - 1];
}


return lastNumber;

}


public static int arrayLength(int [] num){
 int [] length = new int[5];
int sum = 0;
for(int count = 0; count < 5; count++){
sum += 1;
}


return sum;

}


public static int middleElement(int [] number){

int midNumber = 0;
for(int count = 0; count < number.length; count++){
	
midNumber = number[(number.length - 1) / 2];

}

return midNumber;



}


public static boolean containsElement(int [] number1, int number2){

int target = number2;
boolean contain = true;
for(int count = 0; count < number1.length; count++){

if(number2 == number1[count]){
contain = true;}

else{contain = false;}
}

return contain;

}




public static int swapFirstAndLastNumber(int[] number){

int firstNumber = number[0];
int temp = 0;
int lastNumber = 0;
for(int count = 1; count < number.length; count++){
lastNumber = number[number.length - 1];

temp = firstNumber;
firstNumber = lastNumber;
lastNumber = temp;

}



return number[lastNumber];
}

























}