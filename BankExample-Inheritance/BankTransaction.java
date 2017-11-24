package com.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankTransaction {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Ac/No. :");
		System.out.println("Enter A/c Holder name:");
		System.out.println("Enter Address:");
		System.out.println("Enter Phone no. :");
		System.out.println("Enter EmailId:");
		System.out.println("Enter Balance:");
		
		int ch = Integer.valueOf(bf.readLine());
		System.out.println("1.Withdraw amount\n2.Deposit amount");
		switch(ch)
		{
		case 1 : System.out.println("1.");
		 
		}
		

	}

}
