import java.util.Scanner;
public class Selecao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	float x=0;
	float y=0;
	
	Runtime run = Runtime.getRuntime();
	run.exec("cls");
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println();
	System.out.println("Digite um valor: ");
	x = scan.nextFloat();
	
	System.out.println();
	
	System.out.println("Digite outro valor: ");
	y = scan.nextFloat() ;
	System.out.println();
	if (x > y) 
	System.out.println ("O maior eh: ", x/5/2);
	else
		System.out.println ("O maior eh: ", y/5/2);
	
	System.out.println();

}