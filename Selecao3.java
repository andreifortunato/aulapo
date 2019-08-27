import java.util.Scanner;


public class Selecao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Runtime run= Runtime.getRuntime();
	run.exec("cls");
	
	float valor=0;
	
	
	run.exec("cls");
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println();
	System.out.println ("Digite um valor: ")
	valor= scan.nextFloat();
	if (valor < 0) 
	System.out.println ("Negativo!");
	else
		System.out.println ("Positivo!");
	
	System.out.println();
	

}
}