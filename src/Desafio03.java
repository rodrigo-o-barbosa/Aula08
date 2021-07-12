import java.util.Scanner;

public class Desafio03 {
	public static String tipoTriangulo(int lado1, int lado2, int lado3){
		if(!validaTriangulo(lado1, lado2, lado3)){
			return "inexistente";
		}
		if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
			return "escaleno";
		}else{
			if (lado1 == lado2 && lado2 == lado3){
				return "equilátero";
			}
		}
		return "isósceles";
	}
	public static boolean validaTriangulo(int lado1, int lado2, int lado3){
		if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int lado1 = 0, lado2 = 0, lado3 = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado 1:");
		lado1 = leitor.nextInt();
		System.out.println("Digite o tamanho do lado 2:");
		lado2 = leitor.nextInt();
		System.out.println("Digite o tamanho do lado 3:");
		lado3 = leitor.nextInt();
		
		System.out.println("O triângulo digitado é do tipo " + tipoTriangulo(lado1, lado2, lado3));
		leitor.close();
	}
}
