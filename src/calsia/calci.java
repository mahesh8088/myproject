package calsia;

import java.util.Scanner;

public class calci {
	public static int add(int a, int b) {
	return (a + b);
	}
	public static int sub(int a, int b) {
	return (a - b);
	}
	public static int mul(int a, int b) {
	return (a * b);
	}
	public static int div(int a, int b) {
	return (a / b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int input = in.nextInt();
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter the Second number");
		int input1 = in1.nextInt();
		System.out.println(" The addition is :"+ calci.add(input,input1));
		System.out.println(" The addition is :"+ calci.sub(input,input1));
		System.out.println(" The addition is :"+ calci.mul(input,input1));
		System.out.println(" The addition is :"+ calci.div(input,input1));
		
	}

}
