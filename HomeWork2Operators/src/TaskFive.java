//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

public class TaskFive {
    public static void main(String[] args) {
        int n = 2353;
        int four = n % 10; // 4-я цифра числа
        int nTreeDigitNumber = n / 10 % 10; //трехзначное число
        int tree = nTreeDigitNumber % 10; // 3-я цифра числа
        int nTwoDigitNumber = n / 100 % 100; //двузначное число
        int two = nTwoDigitNumber % 10; // 2-я цифра числа
        int one = n / 1000 % 1000; //однозначное число или первая цифра
        String str = "Дано число ";
        String str2;
        if (four!=tree && four!=two &&four!=one && tree!=two && tree!=one && two!=one)
            str2 = " , все цифры числа различны";
        else
            str2 = " , это число имеет повторяющиеся цифры";
        System.out.println(str + n + str2);
    }
}
