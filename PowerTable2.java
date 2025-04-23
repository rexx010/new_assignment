public class PowerTable2{
public static void main(String[] args){

int a = 1;
int b = 2;

System.out.println("a	b	(pow)");

for(int counter = 1; counter <= 5; counter ++) {

if(a <= counter) System.out.print(a+"\t");
a++;

if(b <= counter + 1) System.out.print(b+"\t");
b++;

int power = (int) Math.pow (counter, a);
System.out.printf("%d%n", power);


System.out.println();
}

}
}