public class PowerTable2{
public static void main(String[] args){

int a = 1;
int b = 2;
int power = 1;
int count = 1;

for(int counter = 1; counter <= 5; counter ++) {

if(a <= counter) System.out.print(a+"  ");
a++;

if(b <= counter + 1) System.out.print(b+"  ");
b++;

for(count = 1; a <= b; a++){
power = a * power;
System.out.print(power+"  ");

break;
}

System.out.println();
}

}
}