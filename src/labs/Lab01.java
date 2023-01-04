package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
	
		Scanner inkey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int int1 = inkey.nextInt();
		System.out.print("Enter another positive integer: ");
		int int2 = inkey.nextInt();
		
		System.out.println(int1+"^"+int2+" = "+Math.pow(int1, int2));
	}
	
	
	
	public static void problem2() {
		
		Scanner inkey = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int num = inkey.nextInt();
		double sq = Math.sqrt(num);
		
		System.out.println("The square root of "+num+" is "+sq);
	}
	
	
	
	public static void problem3() {
		
		Scanner inkey = new Scanner(System.in);
		System.out.print("Length of side A: ");
		int a = inkey.nextInt();
		System.out.print("length of side B: ");
		int b = inkey.nextInt();
		
		System.out.println("Hypotenuse = "+Math.hypot(a, b));
	}
	
	
	
	public static void problem4() {
		
		Scanner inkey = new Scanner(System.in);
		int num = 0;
		int min = 0;
		int max = 0;
		do {
			System.out.print("Enter an integer: ");
			num = inkey.nextInt();
			min = Math.min(num, min);
			max = Math.max(num, max);
		}while(num != 0);
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
	}
	
	
	
}
