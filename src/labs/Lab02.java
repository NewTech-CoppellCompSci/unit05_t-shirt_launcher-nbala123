package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inkey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int in1 = inkey.nextInt();
		System.out.print("Enter another positive integer: ");
		int in2 = inkey.nextInt();
		
		if (in2<in1) {
			int x = in2;
			in2 = in1;
			in1 = x;
		}
		
		for(int i=0; i<100; i++) {
			System.out.println((int) (Math.random()*((in2+1)-in1))+in1);
		}
	}


	public static void problem2() {
		Scanner inkey = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r = inkey.nextDouble();
		System.out.print("Enter the height: ");
		double h = inkey.nextDouble();
		
		System.out.println(Math.PI*Math.pow(r, 2)*h);
		
	}


	public static void problem3() {
		Scanner inkey = new Scanner(System.in);
		System.out.print("Enter x1: ");
		double x1 = inkey.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = inkey.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = inkey.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = inkey.nextDouble();
		
		System.out.println("Distance between points = "+ Math.sqrt(Math.pow((y2-y1),2) + Math.pow((x2-x1),2)));
	}

	
	
	public static void problem4() {
		Scanner inkey = new Scanner(System.in);
		System.out.print("Enter a-value: ");
		double a = inkey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inkey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inkey.nextDouble();
		
		double x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		double x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		
	}



}
