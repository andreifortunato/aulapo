import java.util.Scanner;

public class LarguraCaixa {

	public LarguraCaixa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* @ raio
		 * @
		 */

		
		float comp, larg, alt, area;
		int caixas;
		//{comp: comprimento, alt: altura}
		
		comp = 0; //{inicializar variaveis}
		larg = 0;
		alt = 0;
		area = 0;
		caixas = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println();;
		System.out.println("Qual o comprimento da cozinha? ");
		comp = scan.nextFloat();
		System.out.println();;
		System.out.println("Qual a largura da cozinha? ");
		larg = scan.nextFloat();
		System.out.println();;
		System.out.println ("Qual a altura da cozinha? ");
		alt = scan.nextFloat();
		System.out.println();;
		area = (comp*alt*2) + (larg*alt*2);
		caixas = Math.round(double area/1,5); 
		System.out.println();
		System.out.println("Quantidade de caixas de azulejos para colocar em todas as paredes:",caixas);
		System.out.println();
		

	}

}