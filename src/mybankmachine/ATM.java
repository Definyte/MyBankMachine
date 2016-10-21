/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;
import java.lang.Math;
/**
 *
 * @author niepp7406
 */
public class ATM {
    
    public double balance;
    public String bankName;
    
    public ATM(String bank, double bal){
        bank = bankName;
        bal = balance;
    }
    
    public void Deposit(double money){
        balance += money;
    }
    public void Withdrawl(double money){
        balance -= money;
    }
    public void CurrentBalance(){
        System.out.println(balance);
    }
    public void Interest(double rate, double days){
     double p = 1+rate;
     double r = Math.pow(p,days);
     balance += balance * r;
    }
    public String toString(){
        String numbers;
        numbers = "Current Balance: " + balance;
        return numbers;
    }
}
