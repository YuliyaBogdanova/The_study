package money;

import java.util.Scanner;

public class UsersDialog {

    private int currentMoney100;
    private int currentMoney50;
    private int currentMoney20;

    public UsersDialog(int currentMoney100, int currentMoney50, int currentMoney20) {
        this.currentMoney100 = currentMoney100;
        this.currentMoney50 = currentMoney50;
        this.currentMoney20 = currentMoney20;
    }

    public void Choice() {

        Scanner selectIn = new Scanner(System.in);
        System.out.println("Would you like to complete? Yes:    1" +
                "\n                             No:    2: ");
        Integer select = selectIn.nextInt();

        if (select == 1) {
            Scanner selectIn2 = new Scanner(System.in);
            System.out.println("Would you like to add the money? Yes:    1\n" +
                    "Would you like to get cash?      Yes:    2\n");
            Integer select2 = selectIn2.nextInt();

            if (select2 == 2) {

                WithdrawMoney myMoneyAddMoney = new WithdrawMoney(currentMoney100, currentMoney50, currentMoney20);
                myMoneyAddMoney.WithdrawMoney();

            } else if (select2 == 1) {

                CarrentManey myMoneyAddMoney = new CarrentManey(currentMoney100, currentMoney50, currentMoney20);
                myMoneyAddMoney.CarrentManeyDisplay();
            }
        }
    }
    }