import phone.Caller;
import phone.Phone;
import phone.Samsung;
import phone.Xiaomi;

import java.util.Scanner;

public class Hello {

    public static void main (String[] args) {

        Scanner inName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String callerName = inName.next();


        Caller forName = new Caller(callerName);
        Phone samsungPhone = new Samsung("Samsung", "Galaxy S");
        Phone samsungPhone2 = new Samsung(123564,"Samsung","Galaxy Note");
        Phone xiaomiPhone = new Xiaomi(1236875, "Xiaomi", "Redmi Note 10");

        Phone [] phones = {samsungPhone, samsungPhone2,xiaomiPhone};
        displayPhone(phones);
    }

    public static void displayPhone(Phone [] phones){
        for(int i = 0; i < phones.length; i++) {
            phones[i].display();
        }
    }

}
