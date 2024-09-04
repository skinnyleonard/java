package javascript;

import java.util.Scanner;

public class Clase1 {
	public static void main(String[] args) {
		//ejercicio 1
		int count = 0;
		for(int i=0; i<102; i++) {
			if(i%2 ==0) {
				System.out.println("el numero " + i + " es par");
			}
		}
		
		//ejercicio 2
		for(int i=50; i<=100; i++) {
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
		}
		
		//ejercicio 4
		double num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el numero");
        num1 = sc.nextDouble();
        System.out.println("ingresa el operador");
        char op = sc.next().charAt(0);
        System.out.println("ingresa el numero");
        num2 = sc.nextDouble();
        
        double calc = 0;
        
        switch (op) {
            case '+':
                calc = num1 + num2;
                break;
            case '-':
                calc = num1 - num2;
                break;
            case '*':
                calc = num1 * num2;
                break;
            case '/':
                calc = num1 / num2;
                break;
            default:
                System.out.println("no es un caracter valido");
                break;
        }
        System.out.println("resultado final: " + calc);
		
      //ejercicio 5
		/*for-each*/
		String[] autos = {"Ford", "Chevrolet", "Fiat", "Bugatti"};
		/*for (String auto: autos){
			System.out.println(auto);
		}*/
	}
}
