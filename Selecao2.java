import java.util.Scanner;

public class Selecao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	float nota1=0; 
	float nota2=0; 
	double media=0;
	
	Runtime run = Runtime.getRuntime();
	run.exec("cls");
	
	Scanner scan = new Scanner(System.in);
	System.out.println();
	System.out.println("Digite a nota da primeira avaliacao: ");
	nota1 = scan.NextFloat();
	System.out.println("Digite a nota da segunda avaliacao: ");
	nota2 = scan.nextFloat();
	media = (nota1 + nota2) / 2;
	if (media >= 6.0) 
			System.out.println ("PARABENS! Voce foi aprovado");
	;
	System.out.println();
	


}