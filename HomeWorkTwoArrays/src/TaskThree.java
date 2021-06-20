//Создать пустой массив на N чисел.
//Заполнить этот массив чётными числами и вывести на экран

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner inSize = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = inSize.nextInt();
        int[] myArr2 = new int[N];
        int a = 2;

            for (N = 0, a=2; N < myArr2.length; N++, a += 2) {
                    if (a % 2 == 0) {
                    myArr2[N] = a;
                System.out.print(myArr2[N] + " ");
            }
        }
        }
    }

