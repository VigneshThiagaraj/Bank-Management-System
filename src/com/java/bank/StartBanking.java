package com.java.bank;

import java.util.Scanner;

public class StartBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank rbi = new Bank("Reserve Bank of India", "RBI12345", "India");
		Scanner scan = new Scanner(System.in);
		int option = 0;
		do{
			System.out.println("Please select the task you want to perform?\r\n"
					+ "1. Enter 1 to Open An Account\r\n"
					+ "2. Enter 2 to Deposit\r\n"
					+ "3. Enter 3 to Withdraw\r\n"
					+ "4. Enter 4 to Check Balance\r\n"
					+ "5. Enter 5 to Update Account\r\n"
					+ "6. Enter 6 to exit main menu");
			
			option = scan.nextInt();
			switch (option) {
			case 1:
				scan.nextLine();
				System.out.println("Enter account holder name");
				String name = scan.nextLine();
				System.out.println("Enter account holder mobile number");
				long mobileNumber = scan.nextLong();
				scan.nextLine();
				System.out.println("Enter account holder address");
				String address = scan.nextLine();
				System.out.println("Enter account holder pan number");
				String panNumber = scan.nextLine();

				System.out.println("Enter type of account");
				String accountType = scan.nextLine();

				System.out.println("Enter initial amount you want to deposit");
				double initialAmount = scan.nextDouble();
				long accountNumber = System.currentTimeMillis();
				
				Account account = new Account(accountNumber, accountType, initialAmount);
				AccountHolders accountHolders = new AccountHolders(name, mobileNumber, address, panNumber, account);

				rbi.addUsers(name, accountHolders);
				
				System.out.println("Account balance " + rbi.getUsers().get(name).getAccount().getAccountNumber());
				System.out.println("Account balance " + rbi.getUsers().get(name).getAccount().getAccountBalance());
				
				break;
			case 2:
				scan.nextLine();
				System.out.println("Enter account holder name");
				String depositName = scan.nextLine();
				System.out.println("Enter deposit account number");
				long depositAccount = scan.nextLong();
				scan.nextLine();
				System.out.println("Enter deposit amount");
				double amount = scan.nextDouble();
				rbi.deposit(depositName,depositAccount, amount);
				System.out.println("Account balance " + rbi.getUsers().get(depositName).getAccount().getAccountBalance());
				break;
			case 3:
				scan.nextLine();
				System.out.println("Enter account holder name");
				String accHolderName = scan.nextLine();
				System.out.println("Enter deposit account number");
				long acNumber = scan.nextLong();
				scan.nextLine();
				System.out.println("Enter deposit amount");
				double withdrawAmt = scan.nextDouble();
				rbi.withdraw(accHolderName, acNumber, withdrawAmt);
				System.out.println("Account balance " + rbi.getUsers().get(accHolderName).getAccount().getAccountBalance());
				break;
			case 4:
				scan.nextLine();
				System.out.println("Enter account holder name");
				String accountHolderName = scan.nextLine();
				System.out.println("Enter account number");
				long accNumber = scan.nextLong();
				System.out.println(rbi.getUsers().get(accountHolderName).getAccount().getAccountBalance());
				scan.nextLine();
			default:
				break;
			}
			
		}while(option != 6);
		scan.close();
	}

}
