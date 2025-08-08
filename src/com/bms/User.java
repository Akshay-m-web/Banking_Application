package com.bms;
import java.util.Scanner;

public class User {
    private Scanner scanner;


    User(Scanner scanner){
        this.scanner = scanner;   
    }
    void register(){
        System.out.println("Full name:");
        String full_name=scanner.nextLine();
        System.out.println("Email:");
        String email=scanner.nextLine();
        System.out.println("Password:");
        String password=scanner.nextLine();

    }
    void login(){

    }
    void user_exists(){

    }
}
