//Создайте число. Определите, является ли число трехзначным.
//Определите, является ли его последняя цифра двойкой.
//Определите, является ли число четным.

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        Integer n = in.nextInt();
        String str0 = "Введено число ";
        String str;
        String str2;
        String str3;
        if (n % 10000 >= 100 & n % 10000 < 1000)
            str = ", веденное вами число трёхзначное";

        else {
            str = ", введенное Вами число не является трёхзначным";
            if (n % 10 == 2)
                str2 = ", последняя цифра является двойкой";
            else
                str2 = ", последняя цифра не является двойкой";
            if (n % 2 == 0)
                str3 = ", число чётное";
            else
                str3 = ", число не четное";
            System.out.println(str0 + n + str + str2 + str3);
        }
    }
}
