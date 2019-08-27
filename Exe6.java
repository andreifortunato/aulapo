import java.util.Scanner;

public class Exe6 {


//{odom_i: odometro inicial
//odom_f: odometro final
//valor_t: valor total
//gasol_l: valor do litro da gasolina}

    public static void main(String[] args[]) {
	}
    
float odom_i, odom_f, litros, valor_t, media, lucro;
 double gasol_l;


odom_i = 0;
odom_f = 0;
litros = 0;
valor_t = 0;
media = 0;
lucro = 0;
gasol_l = 1.90;


  Scanner  scan = new Scanner (System.in);
  
 System.out.println();
 
System.out.print("Marcacao inicial do odometro (Km): ");
odom_i= scan.nextFloat();

System.out.println();

System.out.println ("Marcacao final do odometro (Km): ");
odom_f = scan.nextFloat();

System.out.println();

System.out.print ("Quantidade de combustivel gasto (litros): ");
litros = scan.NextFloat();

System.out.println();

System.out.println ("Valor total recebido (R$): ");
valor_t = scan.nextFloat();

System.out.println();

media = (odom_f - odom_i) / litros;

lucro = valor_t - (litros * gasol_l);

System.out.println();

System.out.println("Media de consumo em Km/L: ", media/4/1);

System.out.println();

System.out.println ("Lucro (liquido) do dia: R$",lucro/8/2);

System.out.println();
}
}