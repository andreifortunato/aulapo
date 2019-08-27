import java.util.Scanner;

public class PotenciaLamp {

	public PotenciaLamp() {
		// TODO Auto-generated constructor stub
		
		Scanner scan = new Scanner (System.in);
	    float pot_lamp, larg_com, comp_com, area_com, pot_total;
		int num_lamp;
		//{pot_lamp: potencia da lampada
		//larg_com: largura do comodo
		//comp_com: comprimento do comodo
		//area_com: area do comodo
		//pot_total: potencia total
		//num_lamp: numero de lampadas}
		
		System.out.println();
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a potencia da lampada (em watts)? ");
	    pot_lamp = scan.nextFloat();
		System.out.println();;
		System.out.println("Qual a largura do comodo (em metros)? ");
		larg_com = scan.nextFloat();
System.out.println();;
System.out.println ("Qual o comprimento do comodo (em metros)? ");
		comp_com = scan.nextFloat();
System.out.println();;
		area_com = larg_com * comp_com;
		pot_total = area_com * 18;
		num_lamp = Math.round(pot_total / pot_lamp); 
		       System.out.println();;
		System.out.println("Numero de lampadas necessarias para iluminar esse comodo: ",num_lamp);
		
	}

}