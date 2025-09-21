//prompt the user to enter one letter
//save it in a variable
//check if the letter entered is a vowel
//if it is display "vowel", if not
//check if it is a consonant
//if it is display "consonant", if not
//display "invalid"

import java.util.Scanner;

public class Letters{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a letter: ");
char letter = scanner.next().charAt(0);


if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){

System.out.print(letter + " " + "is a vowel");

}

else if(letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z'){

System.out.print(letter + " " + "is a consonant");


}

else{

System.out.print("input is invalid");


}



}


}