package com.w3school;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // determine password length
        int passwordLength = 0; 
        //  have final password
        char GeneratedPassword = 0; 

        //  ensure randomness
        Random random = new Random();   

        //  Ask user for password length
        System.out.println("Enter Your Password Length: "); 

        //  create a object for taking input from keyboard
        java.util.Scanner scanner = new Scanner(System.in); 
        //  take input from keyboard
        passwordLength = scanner.nextInt(); 

        //  Create password material
        String passwordCombination = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*()_+{}|:<>?`[];',./";  

        System.out.println("Your Secure Password Is: ");
    
        for(int i = 0; i < passwordLength; i++){
            //  print random password according to password length
        System.out.print(passwordCombination.charAt(random.nextInt(passwordCombination.length())));
        }

    }
}
