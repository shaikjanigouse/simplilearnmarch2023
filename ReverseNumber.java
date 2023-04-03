package mypackage;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int reverse=0;
		int remainder=0;
		while(number!=0) {
			remainder=number%10;
			reverse=remainder+reverse*10;
			number=number/10;
		}
		System.out.println("reverse of given number is "+reverse);
	}
	

}
