package com.elevateLabs;

import java.util.Scanner;

public class BankManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account holder name: ");
		String name = sc.nextLine();
		int choice;
		
		Account a= new Account(name);
		System.out.println("Welcome, "+a.getAccountHolder());
		do {
			
			System.out.println("\n****Bank Menu****");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. View trasaction history");
			System.out.println("4. View total balance");
			System.out.println("5. Exit.!");
			System.out.println("*****************");
			System.out.print("\nEnter the choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter the amount to deposite: ");
				double Damount = sc.nextDouble();
				a.deposit(Damount);
				break;
				
			case 2:
				System.out.print("Enter the amount to withdraw: ");
				double Wamount = sc.nextDouble();
				a.withdraw(Wamount);
				break;
				
			case 3:
				a.TransactionHistory();
				break;
				
			case 4:
				a.getBalance();
				break;
				
			case 5:
				System.out.println("Thanking for banking with us...!");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}while(choice != 5);
		sc.close();
	}

}
