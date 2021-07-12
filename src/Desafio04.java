import java.util.Scanner;

public class Desafio04 {
	
	public static double salarioBase(int numeroAulas, double horaAula)
	{
		return numeroAulas * 4.5 * horaAula;
	}
	public static double horaAtividade(double salarioBase)
	{
		return salarioBase * 0.05;
	}
	public static double DSR(double salarioBase, double horaAtividade)
	{
		return (salarioBase + horaAtividade) / 6;
	}
	public static double salario(double salarioBase, double horaAtividade, double descansoSemanalRemunerado)
	{
		return salarioBase + horaAtividade + descansoSemanalRemunerado;
	}
	public static void main(String[] args) {
		int numeroAulas, opcao = 0;
		double horaAula;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor, informe o valor da hora-aula praticado na institui��o");
		horaAula = leitor.nextDouble();
		
		System.out.println("Para calcular seu sal�rio base, precisamos saber quantas aulas semanais o professor tem na institui��o");
		numeroAulas = leitor.nextInt();
		System.out.println("Digite o tipo de valor do sal�rio que deseja obter:\n1 - Sal�rio Base\n2 - Hora Atividade\n3 - Descanso Semanal Remunerado\n4 - Sal�rio total");
		opcao = leitor.nextInt();
		switch(opcao)
		{
		case 1: 
			System.out.println("R$ " + salarioBase(numeroAulas, horaAula));
			break;
		case 2: 
			System.out.println("R$ " + horaAtividade(salarioBase(numeroAulas, horaAula)));
			break;
		case 3: 
			System.out.println("R$ " + DSR(salarioBase(numeroAulas, horaAula), horaAtividade(salarioBase(numeroAulas, horaAula))));
			break;
		case 4: 
			System.out.println("R$ " + salario(salarioBase(numeroAulas, horaAula), horaAtividade(salarioBase(numeroAulas, horaAula)), DSR(salarioBase(numeroAulas, horaAula), horaAtividade(salarioBase(numeroAulas, horaAula)))));
			break;
		default: 
			System.out.println("Op��o inv�lida!");
			break;
		}		
		leitor.close();
	}
}
