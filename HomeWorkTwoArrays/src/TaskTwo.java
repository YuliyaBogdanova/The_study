//Дано число N. Вывести сумму всех чисел от единицы до N включительно

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner inSize = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = inSize.nextInt();
        int[] myArr = new int[N];
        int a = 1;
        int sum = 0;

        for (N = 0; N < myArr.length; N++) {
            myArr[N] = a++;
            System.out.print(myArr[N] + " ");
            sum = sum + myArr[N];
        }
        System.out.println();
        System.out.print("Sum of a series of numbers from 1 to " +N+ " is " + sum);

    }
}



