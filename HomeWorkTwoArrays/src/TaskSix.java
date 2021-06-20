//Дана двумерная матрица. Определить в какой строке матрицы больше всего отрицательных чисел

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] ars) {

        Scanner inLength = new Scanner(System.in);
        Scanner inHeight = new Scanner(System.in);
        System.out.println("Enter the number of  of rows in the array: ");
        int i = inLength.nextInt();
        System.out.println("Enter the number of columns in the array: ");
        int j = inHeight.nextInt();

        int[][] arr = new int[i][j];

         for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 200 - 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int indexI = 0;
        int maxCount = 0;
        System.out.println("\nthe number of negative numbers in each row of the array is:");
        for (i = 0; i < arr.length; i++) {
            int count = 0;

            for (j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < 0)
                    count++;
                if (maxCount <= count) {
                    maxCount = count;
                    indexI = i+1; // нахожу номер строки, НЕ индекс!
                }
            }
            System.out.print(count +" ");
        }
        System.out.println();
        //System.out.println(maxCount);
        System.out.println("\n" +indexI+ " row of the array contains more negative numbers");
    }
}