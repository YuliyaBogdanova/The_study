//Создать и вывести нерегулярный двумерный массив в виде треугольника

import java.util.Scanner;

public class TaskSeven {
    public static void main (String[] ars){

        Scanner inSize = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = inSize.nextInt();

        String [][] myTriangle = new String [size][];

        for (size = 0; size<myTriangle.length; size++)
            myTriangle [size] = new String [size+1];

        for (size = 0; size<myTriangle.length; size++) {
            for (int j = 0; j<myTriangle[size].length; j++)
            {
                myTriangle[size][j] = "*";
                System.out.print(myTriangle[size][j]);
            }
            System.out.println();
        }
     }
}

