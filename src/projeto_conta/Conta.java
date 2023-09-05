package projeto_conta;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		String nome = "Hilberto Fernandes";
		String tipoConta = "Corrente";
		double saldo = 2000;
		int op = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("*************************************");
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("*************************************\n");

		String menu = """
				** Digite sua opção **
				1 - Consultar saldo
				2 - Transferir
				3 - Receber valor
				4 - Sair

				""";

		while (op != 4) {
			System.out.println(menu);
			op = scanner.nextInt();

			if (op == 1) {
				System.out.println("O saldo atualizado é " + saldo);
			} else if (op == 2) {
				System.out.println("Qual o valor que deseja transferir?");
				double valor = scanner.nextDouble();

				if (valor > saldo) {
					System.out.println("Não há saldo para realizar a transferência.");
				} else { 
					saldo -= valor;
					System.out.println("Novo saldo: " + saldo);
				}
			} else if (op == 3) {
				System.out.println("Valor recebido: ");
					double valor = scanner.nextDouble();
					saldo += valor;
				System.out.println("Novo saldo: " + saldo);
			} else if (op != 4) {
				System.out.println("Você saiu do programa!");
			}
		}
		scanner.close();
	}
}
