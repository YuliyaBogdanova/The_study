package money;

public class Money {

    protected int money20;
    protected int money50;
    protected int money100;


    public Money(int money100,int money50,int money20) {
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
    }

    public Money(int money20, int money50) {
        this.money20 = money20;
        this.money50 = money50;
    }

    public Money(int money50) {
        this.money50 = money50;
    }

    public int getMoney20() {
        return money20;
    }

    public void setMoney20(int money20) {
        this.money20 = money20;
    }

    public int getMoney50() {
        return money50;
    }

    public void setMoney50(int money50) {
        this.money50 = money50;
    }

    public int getMoney100() {
        return money100;
    }

    public void setMoney100(int money100) {
        this.money100 = money100;
    }

}
