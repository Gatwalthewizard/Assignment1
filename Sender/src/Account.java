import java.util.Scanner;

public class Account {
    String name;
    int pin;
    int balance;
    int charges;
    int receiver;
    int currentBalance;
    int amount;

    int sent;


    public int getBalance(){
             System.out.println("Your balance is $"+balance);
            return balance;

        }

    public int deposit(){
        System.out.println("How much would you like to deposit?: ");
        amount=new Scanner(System.in).nextInt();
        currentBalance=amount+balance;
        balance=currentBalance;
        System.out.println("Your new balance after deposit is $"+balance);
        return balance;
    }

    public int send(){
        System.out.println("How much do you want to send: ");
        sent=new Scanner(System.in).nextInt();
        if (balance<sent){
            System.out.println("Sorry! you do not have the necessary funds to complete the operation: ");
        } else {
            System.out.println("You have successfully sent $"+sent);
            currentBalance=balance-sent;
            balance=currentBalance;

        }

        return balance;
    }




}
