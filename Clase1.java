package mi_primer_programa_de_java;

import java.util.Scanner;

public class Clase1 {
	public static void main(String[] args) {
		int count = 0;
		/*for(int i=0; i<102; i++) {
			if(i%2 ==0) {
				System.out.println("el numero " + i + " es par");
			}
		}*/
		/*for(int i=50; i<=100; i++) {
			count=0;
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {
					count++;
					break;
				}
			}
		if(count==0) {
			System.out.println(i);
		}
		}*/
		Scanner num = new Scanner(System.in);
		System.out.println("escribi un numero");
		String number = num.nextLine();
		System.out.println("tu numero es: " + number);
		
	}
}
