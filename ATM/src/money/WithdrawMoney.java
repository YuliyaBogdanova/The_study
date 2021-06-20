package money;

import java.util.Scanner;

public class WithdrawMoney {

    private int current100;
    private int current50;
    private int current20;

    public WithdrawMoney(int current100, int current50, int current20) {
        this.current100 = current100;
        this.current50 = current50;
        this.current20 = current20;
    }

    public void WithdrawMoney() {

        Integer sum = 100 * current100 + 50 * current50 + 20 * current20;

        System.out.println("Amount of money available for withdrawal is " + sum + " in banknotes of nominal value: "
                + "\n100:  " + current100 + "\n50:   " + current50 + "\n20:   " + current20);

        Scanner inMoney = new Scanner(System.in);
        System.out.println("Enter the summ of money ");
        Integer moneyIn = inMoney.nextInt();

        if (moneyIn <= sum && moneyIn != sum - 10 & moneyIn != sum - 30) {

            if (moneyIn / 100 >= 1 && moneyIn % 100 == 10 | moneyIn % 100 == 30 | moneyIn % 100 == 60 | moneyIn % 100 == 80) {
                BillCounter myMoney = new BillCounter(moneyIn, current100, current50, current20);
                myMoney.BillCounter4();
            } else if (moneyIn / 100 >= 1) {
                BillCounter myMoney = new BillCounter(moneyIn, current100, current50, current20);
                myMoney.BillCounter1();
            } else if ((moneyIn - moneyIn % 50) / 50 == 1 & moneyIn % 50 % 20 == 0) {
                BillCounter myMoney = new BillCounter(moneyIn, current100, current50, current20);
                myMoney.BillCounter2();
            } else if (moneyIn % 20 == 0) {
                BillCounter myMoney = new BillCounter(moneyIn, current100, current50, current20);
                myMoney.BillCounter3();
            } else
                System.out.println("Only 100, 50, and 20 bills are available ");

        } else
            System.out.println("There are not enough banknotes");



    }
}




