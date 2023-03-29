import jdk.jshell.execution.JdiExecutionControlProvider;

import java.util.Scanner;

public class Main{
    
   
    
    
    public static void main(String[]args){
        Account account = new Account();


        System.out.println("*****The Sender*****\n\n\n\nWhat would like to do? \n");
        System.out.println("Please Make Your first Deposit: ");
        account.deposit();
        account.getBalance();
        System.out.println("\n\n\n1.Check balance\n2.Deposit\n3.Send Money");
        System.out.println("Please enter the task you want to carry out");
        int reply=new Scanner(System.in).nextInt();

        if(reply==1){
            account.getBalance();
        } else if (reply==2) {
            account.deposit();

        } else if (reply==3) {
            account.send();

        }else{
            System.out.println("Wrong input!");
        }


    }
}