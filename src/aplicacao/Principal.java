package aplicacao;

import java.util.Scanner;

import servicos.ServicoDeImpressora;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServicoDeImpressora sdi = new ServicoDeImpressora();

		System.out.print("Quantos valores entrarão? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer valor = sc.nextInt();
			sdi.entraValor(valor);
		}
		sdi.imprime();
		Integer x = (Integer) sdi.primeiro();
		System.out.println("Primeiro: " + x);

		sc.close();

	}

}
