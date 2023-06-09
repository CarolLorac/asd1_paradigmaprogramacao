package projetos.encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import projetos.Projeto;

public class TitularConta extends Projeto
{
	@Override
	public void Executar() 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;
		while (true)
		{

		System.out.print("Entre com o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("É um deposito inicial (s/n)? ");
		char response = sc.next().charAt(0);

		if (response == 's') 
		{
			System.out.print("Entre com o valor do deposito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Conta(number, holder, initialDeposit);
		}
		else 
		{
			account = new Conta(number, holder);
		}

		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);

		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);

		System.out.println();
		System.out.print("Entre com o valor de saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		}
	}
}
