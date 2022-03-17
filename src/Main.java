package task1;

//import java.util.Scanner;
import java.util.*;
import task1.Account;
import task1.Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * this class client Integrates the classes (Bank, Account,SpecialAccount,
 * Client, CommercialClient) together to make an integrated working application.
 *
 * @author Samaa, Noura, Sohaila.
 * @version 1.0
 *
 */
public class Main {

	/**
	 * this is the main function that calls menu method to start the application.
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		Bank bank = new Bank();

		while (true) {
			System.out.println("1-Add new client" + "\n" + "2-list all accounts,clients" + "\n"
					+ "3-withdraw or deposit" + "\n" + "4-Exit");
			Scanner scane = new Scanner(System.in);
			Scanner input = new Scanner(System.in);
			int option = scane.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Are you like a " + "\n" + "1 :Normal Client" + "\n" + "2 :Commercial client");
				int client_option;
				scane = new Scanner(System.in);
				client_option = scane.nextInt();

				if (client_option == 1) {
					System.out.println("enter your name");
					String name = input.nextLine();
					System.out.println("enter your national id");
					int nationalid = scane.nextInt();
					System.out.println("enter your address");
					String address = input.nextLine();
					System.out.println("enter your phone");
					int phone = scane.nextInt();
					System.out.println("would you like a " + "\n" + "1 :Normal Account" + "\n" + "2 :Special Account");
					int acc_option;
					scane = new Scanner(System.in);
					acc_option = scane.nextInt();
					Account account;
					if (acc_option == 1) {
						account = new Account();

					} else {
						account = new SpecialAccount();
					}

					Client client = new Client(name, nationalid, address, phone, account);
					bank.AddAccountClient(client);

				} else {
					System.out.println("enter your name");
					String name = input.nextLine();
					System.out.println("enter your national id");
					int nationalid = scane.nextInt();
					System.out.println("enter your address");
					String address = input.nextLine();
					System.out.println("enter your phone");
					int phone = scane.nextInt();
					System.out.println("would you like a " + "\n" + "1 :Normal Account" + "\n" + "2 :Special Account");
					int acc_option;
					scane = new Scanner(System.in);
					acc_option = scane.nextInt();
					Account account;
					if (acc_option == 1) {
						account = new Account();

					} else {
						account = new SpecialAccount();
					}

					Client client = new CommercialClient(name, nationalid, address, phone, account);
					bank.AddAccountClient(client);

				}

				break;
			}

			case 2: {
				bank.Display();
				break;
			}
			case 3: {
				while (true) {

					// Account account1 = new Account();
					System.out.println("enter your account number");
					int accountNumber = scane.nextInt();
					int flag = 0;
					for (int i = 0; i < bank.Accounts.size(); i++) {
						if (accountNumber == bank.Accounts.get(i).GetAccountNum()) {

							// account1 = bank.Accounts.get(i);
							flag = i;
						}

					}
					if (flag != 0) {
						System.out.println("1-withdraw" + "\n" + "2-deposite");
						int choice = scane.nextInt();
						switch (choice) {
						case 1: {
							System.out.println("Enter the requested withdraw value");
							int wd = scane.nextInt();
							bank.Accounts.get(flag).Withdraw(wd);
							break;
						}
						case 2: {
							System.out.println("Enter the requested deposite value");
							int dep = scane.nextInt();
							bank.Accounts.get(flag - 1).deposit(dep);
							break;
						}

						}
						break;
					} else {
						System.out.println("Reenter your account number");
						continue;
					}

				}
				break;

			}
			case 4: {
				System.exit(0);
			}

			}

		}
	}

}