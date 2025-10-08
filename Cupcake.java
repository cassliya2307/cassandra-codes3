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
int count = 0;
for(count = 0; count < num1.length; count++){
if(num2 == num1[count]){count += 1;}


}

return count;





}


public static int getFirstElement(int [] integer){
int store = 0;
int firstNumber = integer[0]; 
for(int count = 1; count < integer.length; count++){
if(integer.length == 0){

integer[0] = 0;
store = integer[0];
}

else{store = firstNumber;}

}

return store;

}


public static int getLastElement(int [] number){

for(int count = 1; count < number.length; count++){
int store = 0;
int lastNumber = number[0];
if(number.length == 0){

number[0] = 0;
lastNumber = number[0];
}

else{lastNumber = number[0];}


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


public static middleElement(int [] number){

for(int count = 0; count < number.lenght; count++){
if(count % 2 == 0)



}







}