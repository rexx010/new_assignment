public class NumberPrint4{
public static void main(String[] args){


	for(int line = 1; line <= 6; line++){

		for(int space = 6; space >= line; space--){
		System.out.print("  ");

		}

		int num2 = 1;
		for(int num = 1; num <= line; num++){

		System.out.print(num2+++" ");
		}


	System.out.println();
}










}
}