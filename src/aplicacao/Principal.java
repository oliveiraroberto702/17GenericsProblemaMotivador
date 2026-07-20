package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import servicos.ServicoDeImpressora;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServicoDeImpressora sdi = new ServicoDeImpressora();

		System.out.print("Quantos valores entrarão? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int valor = sc.nextInt();
			sdi.entraValor(valor);
		}
		sdi.imprime();
		System.out.println("Primeiro: " + sdi.primeiro());

		sc.close();

	}

}
