import java.util.Scanner;
public class PizzaRestaurant{

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
		int slices = 4;
		int pizza = 0; 
		int price = 0;
		int boxes = people / slices;
		int remain = people % slices;
		int remainder = 0;
		if(remain < 4 && remain != 0){
		boxes = boxes + 1;
		pizza = slices * boxes;
		price = 2500 * boxes;
		remainder = pizza - people;
}

		else{boxes = people / slices;
		price = slices * boxes;
		remainder = pizza - people;
}
		System.out.println("Number of boxes of pizza to buy = " + boxes);

System.out.println("Sapa size contains 4 slices per box " + boxes + " should be enough for " + people + " people as it would contain " + pizza + " slices in all.");

System.out.println("Number of slices left = " + remainder);

System.out.print("Price = N" + price );
}

	case "small money" ->{

		System.out.print("Enter the number of people: ");
		int people = scanner.nextInt();
		int slices = 6;
		int pizza = 0; 
		int price = 0;
		int boxes = people / slices;
		int remain = people % slices;
		int remainder = 0;
		if(remain < 6 && remain != 0){
		boxes = boxes + 1;
		pizza = slices * boxes;
		price = 2900 * boxes;
		remainder = pizza - people;
}

		else{boxes = people / slices;
		pizza = slices * boxes;
		price = 2900 * boxes;
		remainder = pizza - people;
}

		System.out.println("Number of boxes of pizza to buy = " + boxes);

System.out.println("Small money contains 6 slices per box " + boxes + " should be enough for " + people + " people as it would contain " + pizza + " slices in all.");

System.out.println("Number of slices left = " + remainder);

System.out.print("Price = N" + price );


}

case "big boys" ->{
System.out.print("Enter the number of people: ");
		int people = scanner.nextInt();
		int slices = 8;
		int pizza = 0; 
		int price = 0;
		int boxes = people / slices;
		int remain = people % slices;
		int remainder = 0;
		if(remain < 8 && remain != 0){
		boxes = boxes + 1;
		pizza = slices * boxes;
		price = 4000 * boxes;
		remainder = pizza - people;
}

		else{boxes = people / slices;
		pizza = slices * boxes;
		price = 4000 * boxes;
		remainder = pizza - people;
}

		System.out.println("Number of boxes of pizza to buy = " + boxes);

System.out.println("Big boys contains 8 slices per box " + boxes + " should be enough for " + people + " people as it would contain " + pizza + " slices in all.");

System.out.println("Number of slices left = " + remainder);

System.out.print("Price = N" + price );


}

case "odogwu" ->{

System.out.print("Enter the number of people: ");
		int people = scanner.nextInt();
		int slices = 12;
		int pizza = 0; 
		int price = 0;
		int boxes = people / slices;
		int remain = people % slices;
		int remainder = 0;
		if(remain < 12 && remain != 0){
		boxes = boxes + 1;
		pizza = slices * boxes;
		price = 5200 * boxes;
		remainder = pizza - people;
}

		else{boxes = people / slices;
		pizza = slices * boxes;
		price = 5200 * boxes;
		remainder = pizza - people;
}

		System.out.println("Number of boxes of pizza to buy = " + boxes);

System.out.println("Odogwu contains 12 slices per box " + boxes + " should be enough for " + people + " people as it would contain " + pizza + " slices in all.");

System.out.println("Number of slices left = " + remainder);

System.out.print("Price = N" + price );

}


default->System.out.print("Invalid Input");

}



























}






}