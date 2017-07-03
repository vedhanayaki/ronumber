package guviset3;
import java.util.Scanner;
public class Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println("Enter the number");
for(int i=0;i<=a;i++){
	System.out.println("i="+i+"->"+RomanNumerals(i));
}

	}

}
