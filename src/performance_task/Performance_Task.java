package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
		problem();
		
	}
	
	public static void problem() {
		
		Scanner inkey = new Scanner(System.in);
		System.out.print("Enter launch velocity >>> ");
		double lvel = inkey.nextDouble();
		System.out.print("Enter launch angle >>> ");
		double lang = inkey.nextDouble();
		
		lang = Math.toRadians(lang);
		System.out.println("\nProjectile's Path:\n");
		
		int time = 0;
		double xpos;
		double ypos;
		
		do {
			xpos = Math.cos(lang)*time*lvel;
			ypos = Math.sin(lang)*time*lvel-0.5*9.8*Math.pow(time, 2);
			if(ypos<0) {
				ypos=0;
			}
			
			System.out.println("Time: "+time+"s\n\tx-pos: "+xpos+"m\n\ty-pos: "+ypos+"m\n");
			time++;
			
		}while(ypos>0||xpos==0);
		
	}
}
