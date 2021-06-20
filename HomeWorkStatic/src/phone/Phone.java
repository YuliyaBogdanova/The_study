package phone;

public class Phone {

    public static int counter = 1;

    public int number;
    public String brand;
    public String model;

    public Phone(int number, String brand, String model) {
        this.number = counter++;
        this.brand = brand;
        this.model = model;
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static int getCounter() { return counter;  }

    public static void setCounter() {
        counter = counter++;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

        public void display() {
            if (number == 0)
                System.out.println(" error ");
            else {
                Caller.showCaller();
            }
        }

}
   

