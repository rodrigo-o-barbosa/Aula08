import java.util.Scanner;

public class Desafio02 {
	
	public static String validaAnoBissexto(int ano)
	{
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
			return "O ano é bissexto!";
		}
		return "O ano não é bissexto!";
	}
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o ano para saber se ele é bissexto:");
		System.out.println(validaAnoBissexto(leitor.nextInt()));
		leitor.close();
	}
}
