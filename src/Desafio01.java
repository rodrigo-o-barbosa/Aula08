import java.util.Scanner;

public class Desafio01 {
	public static boolean validaEstado(String estado)
	{
		String estados[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		for(int i=0;i<estados.length;i++)
		{
			if (estado.equalsIgnoreCase(estados[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String estado;
		System.out.println("Digite o estado para saber se ele é válido:");
		estado = scanner.next();
		if (validaEstado(estado)) 
		{
			System.out.println("O estado que você digitou é válido!");
		}
		else
		{
			System.out.println("O estado que você digitou não é válido!");
		}
		scanner.close();
	}
}
