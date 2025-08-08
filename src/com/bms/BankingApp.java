package com.bms;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User(scanner);
        AccountManager accountManager = new AccountManager();
        Accounts accounts = new Accounts();


        while(true){
            System.out.println("Welcome to the Banking Application");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
        }
    }
}
