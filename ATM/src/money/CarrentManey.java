package money;

import java.util.Scanner;

public class CarrentManey {

    private int currentMoney100 ;
    private int currentMoney50;
    private int currentMoney20;

    public CarrentManey(int currentMoney100, int currentMoney50, int currentMoney20) {
        this.currentMoney100 = currentMoney100;
        this.currentMoney50 = currentMoney50;
        this.currentMoney20 = currentMoney20;
    }

    public void CarrentManeyDisplay() {

        Scanner inMoney100 = new Scanner(System.in);
        System.out.println("Enter the number of banknotes in face value 100: ");
        Integer money100 = inMoney100.nextInt();

        Scanner inMoney50 = new Scanner(System.in);
        System.out.println("Enter the number of banknotes in face value 50: ");
        Integer money50 = inMoney50.nextInt();

        Scanner inMoney20 = new Scanner(System.in);
        System.out.println("Enter the number of banknotes in face value 20: ");
        Integer money20 = inMoney20.nextInt();

        currentMoney100 = currentMoney100 + money100;
         System.out.println("currentMoney100: " + currentMoney100);

        currentMoney50 = currentMoney50 + money50;
        System.out.println("currentMoney50: " + currentMoney50);

        currentMoney20 = currentMoney20 + money20;
         System.out.println("currentMoney20: " + currentMoney20);

        int[] arrMoney = {currentMoney100, currentMoney50, currentMoney20};



        if (money20>=0 || money50>=0 || money100>=0) {
            boolean disp = true;
            System.out.println(disp);
        }
        else
            System.out.println("The operation failed. Repeat please.");

        UsersDialog myChoice = new UsersDialog(currentMoney100, currentMoney50, currentMoney20);
        myChoice.Choice();
    }
}
