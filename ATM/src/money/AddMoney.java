package money;

import java.util.Scanner;

public class AddMoney {

     protected  int  min = 5; // the minimum amount of money that is constantly in the ATM

    public void AddMoneyDisplay() {

        Scanner inMoney100 = new Scanner(System.in);
        System.out.println("Enter the number of banknotes in face value 100: ");
        Integer money100 = inMoney100.nextInt();

        Scanner inMoney50 = new Scanner(System.in);
        System.out.println("Enter the number of banknotes in face value 50: ");
        Integer money50 = inMoney50.nextInt();

        Scanner inMoney20 = new Scanner(System.in);
        System.out.println("Enter the number of banknotes in face value 20: ");
        Integer money20 = inMoney20.nextInt();

        int currentMoney100 = 0;
        int currentMoney50 = 0;
        int currentMoney20 = 0;

            currentMoney100 = min + money100;
       // System.out.println("currentMoney100: " + currentMoney100);

            currentMoney50 = min + money50;
        //System.out.println("currentMoney50: " + currentMoney50);

            currentMoney20 = min + money20;
       // System.out.println("currentMoney20: " + currentMoney20);

        int[] arrMoney = {currentMoney100, currentMoney50, currentMoney20};



        if (money20>=0 || money50>=0 || money100>=0) {
            boolean disp = true;
            System.out.println(disp);
        }
            else
            System.out.println("The operation failed. Repeat please.");

        UsersDialog myChoise = new UsersDialog(currentMoney100, currentMoney50, currentMoney20);
        myChoise.Choice();
    }
}



