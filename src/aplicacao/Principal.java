package aplicacao;

import java.util.Scanner;

import servicos.ServicoDeImpressora;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServicoDeImpressora<String> sdi = new ServicoDeImpressora<>();

		System.out.print("Quantos valores entrarão? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String valor = sc.next();
			sdi.entraValor(valor);
		}
		sdi.imprime();
		String x = sdi.primeiro();
		System.out.println("Primeiro: " + x);

		sc.close();

	}

}
