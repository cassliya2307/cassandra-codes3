public class Pizza{

public static int pizzaCalculations(int num){
int[] storage = new int[4];


		int slices = 4;
		int pizza = 0; 
		int price = 0;
		int boxes = num / slices;
		int remain = num % slices;
		int remainder = 0;
		if(remain < 4 && remain != 0){
		boxes = boxes + 1;
		pizza = slices * boxes;
		price = 2500 * boxes;
		remainder = pizza - num;
}

		else{boxes = num / slices;
		price = slices * boxes;
		remainder = pizza - num;
}

storage[0] = boxes;
storage[1] = remainder;
storage[2] = price;
storage[3] = pizza;

		System.out.println("Number of boxes of pizza to buy = " + boxes);

		System.out.println("Sapa size contains 4 slices per box " + boxes + " should be enough for " + num + " people as it would contain " + pizza + " slices in all.");

		System.out.println("Number of slices left = " + remainder);

		

return num;


}








}
































