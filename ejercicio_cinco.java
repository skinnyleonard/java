package ejercicio_cinco;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio_cinco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un radio");
		sc.useLocale(Locale.US);
		double radio = sc.nextDouble();
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es de: " +area);
	}
}