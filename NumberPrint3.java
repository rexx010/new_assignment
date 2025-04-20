public class NumberPrint3{
public static void main(String[] args){




	for(int line = 1; line <= 6; line++){

		for(int space = 2; space <= line; space++){
		System.out.print("  ");

		}

		int num2 = 1;
		for(int num = 6; num >= line; num--){

		System.out.print(num2+++" ");
		}


	System.out.println();
}










}
}