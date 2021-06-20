//Дано число примитивного типа int.
//Перевести это число в строку и вывести на экран каждый символ этой строки.

public class TaskEight {

    public static void main(String[] args) {

        int a = 298713487;

        String number = Integer.toString(a);

        char k;
        for (int i = 0; i < number.length(); i++) {
            k = number.charAt(i);
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
