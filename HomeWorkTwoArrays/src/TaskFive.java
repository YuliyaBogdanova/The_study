//Дано три целочисленных массива произвольной длины.
//Определить, в каком массиве сумма всех чисел больше и вывести максимальную сумму на экран

import java.util.Scanner;

public class TaskFive {

    public static void main(String[] ars) {
        Scanner inSizeOne = new Scanner(System.in);
        System.out.println("Enter the size of array one: ");
        int sizeOne = inSizeOne.nextInt();
        Scanner inSizeTwo = new Scanner(System.in);
        System.out.println("Enter the size of array two: ");
        int sizeTwo = inSizeTwo.nextInt();
        Scanner inSizeThree = new Scanner(System.in);
        System.out.println("Enter the size of array three: ");
        int sizeThree = inSizeThree.nextInt();

        System.out.println("The array One is: ");
        int sumOne = 0;
        int[] arrOne = new int[sizeOne];
        for (sizeOne = 0; sizeOne < arrOne.length; sizeOne++) {
            arrOne[sizeOne] = (int) (Math.random() * 100);
            System.out.print(arrOne[sizeOne] + " ");
            sumOne = sumOne + arrOne[sizeOne];
        }

        System.out.println("\nThe array Two is: ");
        int sumTwo = 0;
        int[] arrTwo = new int[sizeTwo];
        for (sizeTwo = 0; sizeTwo < arrTwo.length; sizeTwo++) {
            arrTwo[sizeTwo] = (int) (Math.random() * 100);
            System.out.print(arrTwo[sizeTwo] + " ");
            sumTwo = sumTwo + arrTwo[sizeTwo];
        }

        System.out.println("\nThe array Three is: ");
        int sumThree = 0;
        int[] arrThree = new int[sizeThree];
        for (sizeThree = 0; sizeThree < arrThree.length; sizeThree++) {
            arrThree[sizeThree] = (int) (Math.random() * 100);
            System.out.print(arrThree[sizeThree] + " ");
            sumThree = sumThree + arrThree[sizeThree];
        }

        int[] maxSum = {sumOne, sumTwo, sumThree};
        int max = 0;
        for (int i = 0; i < maxSum.length; i++) {
            if (maxSum[i] > max) {
                max = maxSum[i];
                }
         }
            System.out.print("\nMaximum sum of array elements = " + max + " ");
     }
}