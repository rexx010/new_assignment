public class TrianglePrintingProgram{
public static void main(String[] args){

	for(int line = 1; line <= 10; line++){

		for(int ast = 1; ast <= line; ast++){

		System.out.print("* ");
		}


	System.out.println();
}
System.out.println();

	for(int line = 1; line <= 10; line++){

		for(int ast = 10; ast >= line; ast--){

		System.out.print("* ");
		}


	System.out.println();
}

System.out.println();

	for(int line = 1; line <= 10; line++){

		for(int space = 9; space >= line; space--){

		System.out.print("  ");
		}

			for(int ast = 1; ast <= line; ast++){

			System.out.print("* ");
			}


	System.out.println();
}

System.out.println();

	for(int line = 1; line <= 10; line++){

		for(int space = 2; space <= line; space++){

		System.out.print("  ");
		}

			for(int ast = 10; ast >= line; ast--){

			System.out.print("* ");
			}


	System.out.println();
}


}
}