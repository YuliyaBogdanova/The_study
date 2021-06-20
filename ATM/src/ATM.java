import money.AddMoney;
import money.WithdrawMoney;

import java.util.Scanner;

public class ATM {


       public static void main (String[] args) {
           int min = 5;
           int current100 = min + (int) (Math.random() * 10);
           int current50 = min + (int) (Math.random() * 10);
           int current20 = min + (int) (Math.random() * 10);

           int sum = current100 * 100 + current50 * 50 + current20 * 20;

           Scanner selectIn = new Scanner(System.in);
           System.out.println("Would you like to add the money? Yes:    1\n" +
                   "Would you like to get cash?      Yes:    2:");
           Integer select = selectIn.nextInt();


           if (select == 2) {

               WithdrawMoney myMoneyAddMoney = new WithdrawMoney(current100, current50,current20);
               myMoneyAddMoney.WithdrawMoney();

           }
           else if (select == 1) {

                   AddMoney myMoneyAddMoney = new AddMoney();
                   myMoneyAddMoney.AddMoneyDisplay();

               }
           }
       }

