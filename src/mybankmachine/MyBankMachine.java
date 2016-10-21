/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;

import java.util.Scanner;
/**
 *
 * @author niepp7406
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your Bank Name");
        String input1 = sc.nextLine();

        System.out.println("Please enter your current balance: ");
        double input2 = sc.nextDouble();
        
        ATM electron = new ATM(input1, input2);
        
        boolean prompt = true;
        while(prompt = true){
            System.out.println("Press 1 for deposit: " +
                    "Press 2 for withdraw" +
                    "Press 3 for current balance");
        }
    }
    
}
