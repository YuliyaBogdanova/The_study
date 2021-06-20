package money;



public class BillCounter {

    private int moneyIn;

    private int current100;
    private int current50;
    private int current20;

    public BillCounter(int moneyIn, int current100, int current50, int current20) {
        this.moneyIn = moneyIn;
        this.current100 = current100;
        this.current50 = current50;
        this.current20 = current20;
    }

    public int getCurrent100() {  return current100;  }

    public void setCurrent100(int current100) {  this.current100 = current100;   }

    public int getCurrent50() {  return current50;  }

    public void setCurrent50(int current50) {   this.current50 = current50; }

    public int getCurrent20() { return current20;  }

    public void setCurrent20(int current20) {  this.current20 = current20; }

    public int getMoneyIn() { return moneyIn; }

    public void setMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }



        public void BillCounter1() {

              int j = moneyIn;
              int money100 = 0;
              int money50 = 0;
              int money20 = 0;

        money100 = (j - j % 100) / 100;


        if (money100<=current100) {
            money50 = (j % 100 - j % 100 % 50) / 50;
            System.out.println("The requested withdrawal amount of " + moneyIn + "  is available in banknotes of nominal value: "
                    + "\n 100: " + money100 + "\n 50:  " + money50 + "\n 20:  " + ((j % 100 % 50 - j % 100 % 50 % 20) / 20));
        }
        else
            {
            int j2 = moneyIn-current100*100;
            money50 = (j2  - j2%50) / 50;

            if (money50<=current50){
                System.out.println("The requested withdrawal amount of " + moneyIn+ "  is available in banknotes of nominal value: "
                        +"\n 100: " + current100 + "\n 50:  " + money50 + "\n 20:  " + ((j2%50 - j2%50%20) / 20));
            }
            else {
                int j3 = moneyIn-current100*100-(current50)*50;
                int money20a = (j3-j3%20) / 20;

                int money20b = (moneyIn-(current100*100 + (current50-1)*50)) / 20;
                if (money20a<=current20 && j3%20==0)
                     System.out.println("The requested withdrawal amount of " + moneyIn+ "  is available in banknotes of nominal value: "
                        +"\n 100: " + current100 + "\n 50:  " + current50 + "\n 20:  " + money20a);

                   else if (money20a<=current20 && j3%20!=0) {
                                        System.out.println("The requested withdrawal amount of " + moneyIn + "  is available in banknotes of nominal value: "
                            + "\n 100: " + current100 + "\n 50:  " + (current50-1) + "\n 20:  " + money20b);
                }
                    else if (money20a>current20){
                    int money20c = ((moneyIn-current100*100-(current50)*50)-(moneyIn-current100*100-(current50)*50)%20) / 20;
                    System.out.println("The requested withdrawal amount of " + moneyIn+ "  is available in banknotes of nominal value: "
                                +"\n 100: " + current100 + "\n 50:  " + (current50) + "\n 20:  " + money20c);
                                   }

                else
                    System.out.println("There are not enough bills in the ATM");
            }

        }

    }
    public void BillCounter2() {
        int j = moneyIn;
        int money50 = 0;
        int money20 = 0;

        money50 = (j  - j%50) / 50;
        money20 = (j%50 - j%50%20) / 20;


        System.out.println("The requested withdrawal amount of " + moneyIn+ "  is available in banknotes of nominal value: "
                +"\n 50:  " + money50 + "\n 20:  " + money20);
    }
    public void BillCounter3() {
        int j = moneyIn;
        int money20 = 0;

        money20 = (j-j%20) / 20;


        System.out.println("The requested withdrawal amount of " + moneyIn+ "  is available in banknotes of nominal value: "
                + "\n 20:  " + money20);
    }
    public void BillCounter4() {

        int j = moneyIn;
        int money100 = 0;
        int money50 = 0;
        int money20 = 0;

        money100 = ((moneyIn - (moneyIn % 100 + 100)) / 100);
        money50 = 0;
        money20 = 0;

        if (money100 <= current100) {
            int j1 = moneyIn-money100*100;
            money50 = (j1- (j1%50+50)) / 50;
            money20 = (j1 - money50*50) / 20;
            System.out.println("The requested withdrawal amount of " + moneyIn + "  is available in banknotes of nominal value: "
                    + "\n 100: " + money100 + "\n 50:  " + money50 + "\n 20:  " + money20);
        }

        else {
            int j2 = moneyIn-current100*100;
            money50 = (j2 - (j2%50)) / 50-1;

            {
                if (money50 <= current50) {
                    System.out.println("The requested withdrawal amount of " + moneyIn + "  is available in banknotes of nominal value: "
                            + "\n 100: " + current100 + "\n 50:  " + money50 + "\n 20:  " + (j2%50 +50)/20);
                } else {
                    int j3 = moneyIn - current100 * 100 - current50 * 50;
                    money20 = (j3 - j3 % 20) / 20;
                    if (money20 <= current20 & j3%20==0)
                        System.out.println("The requested withdrawal amount of " + moneyIn + "  is available in banknotes of nominal value: "
                                + "\n 100: " + current100 + "\n 50:  " + current50 + "\n 20:  " + money20);
                    else if (money20<=current20 & j3%20!=0) {
                        int money20b = (moneyIn-(current100*100 + (current50-1)*50)) / 20;
                        System.out.println("The requested withdrawal amount of " + moneyIn + "  is available in banknotes of nominal value: "
                                + "\n 100: " + current100 + "\n 50:  " + (current50-1) + "\n 20:  " + money20b);
                    }

                    else
                        System.out.println("There are not enough bills in the ATM");
                }
            }

        }

    }

}