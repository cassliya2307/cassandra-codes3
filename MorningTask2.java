public class MorningTask2{

public static void main(String[] args){

int [] largest = new int[5];

largest[0] = 10;
largest[1] = 9;
largest[2] = 13;
largest[3] = 2;
largest[4] = 14;

int max = 0;
if(largest[0] > largest[1] && largest[0] > largest[2] && largest[0] > largest[3] && largest[0] > largest[4]){

max = largest[0];
}


else if(largest[1] > largest[0] && largest[1] > largest[2] && largest[1] > largest[3] && largest[1] > largest[4]){

max = largest[1];
}


else if(largest[2] > largest[0] && largest[2] > largest[1] && largest[2] > largest[3] && largest[2] > largest[4]){

max = largest[2];
}

else if(largest[3] > largest[0] && largest[3] > largest[1] && largest[3] > largest[2] && largest[3] > largest[4]){

max = largest[3];
}

else if(largest[4] > largest[0] && largest[4] > largest[1] && largest[4] > largest[3] && largest[4] > largest[2]){

max = largest[4];
}


System.out.print(max);










}

}