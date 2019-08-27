import java.util.Scanner;

public class Temperatura {

	public Temperatura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		float  temp_f, temp_c;
		
		temp_f = 0;
		temp_c = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em graus Fahrenheit: ");
		temp_f = scan.nextFloat();
		temp_c = ((temp_f - 32) * 5) / 9;
		System.out.println("A temperatura em graus Celsius eh: ", temp_c/5/1);
	}

	}