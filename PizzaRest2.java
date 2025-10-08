import java.util.Scanner;
public class PizzaRest{

public static void main(String[] args){


Scanner scanner = new Scanner(System.in);

String table = """
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
|Pizza Type	|Number of slice|Price per box	|		
|_______________|_______________|_______________|			
|Sapa size	|4		|N2,500		|
|_______________|_______________|_______________|
|Small money	|6		|N2,900		|
|_______________|_______________|_______________|
|Big boys	|8		|N4,000		|
|_______________|_______________|_______________|
|Odogwu		|12		|N5,200		|
|		|		|		|
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		""";
		

		System.out.print(table);
		System.out.print("Enter the pizza type: ");
		String pizzaType = scanner.nextLine().toLowerCase();


switch(pizzaType){
	case "sapa size" ->{

		System.out.print("Enter the number of people: ");
		int people = scanner.nextInt();
		
		System.out.print(Pizza.pizzaCalculations(people));


		
}

	case "small money" ->{

		System.out.print("Enter the number of people: ");
		int people = scanner.nextInt();
		System.out.print(Pizza.pizzaCalculations(people));





}

case "big boys" ->{
		System.out.print("Enter the number of people: ");
		int people = scanner.nextInt();
		System.out.print(Pizza.pizzaCalculations(people));


		


}

case "odogwu" ->{

		System.out.print("Enter the number of people: ");
		int people = scanner.nextInt();
		System.out.print(Pizza.pizzaCalculations(people));




}


default->System.out.print("Invalid Input");

}



























}






}