//Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.

public class TaskFour {

    public static void main(String[] args) {

        int n = 5684;
        int four = n % 10; // 4-я цифра числа
        int nTreeDigitNumber = n / 10 % 10; //трехзначное число
        int tree = nTreeDigitNumber % 10; // 3-я цифра числа
        int nTwoDigitNumber = n / 100 % 100; //двузначное число
        int two = nTwoDigitNumber % 10; // 2-я цифра числа
        int nOneDigitNumber = n / 1000 % 1000; //однозначное число

        System.out.println("Инверсия порядка цифр введенного вами числа: "+four+tree+two+nOneDigitNumber);
        }
}