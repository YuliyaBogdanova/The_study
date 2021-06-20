//Вывести таблицу умножения в обратном порядке

public class TaskFour {

    public static void main(String[] args) {
        int[][] myArr3 = new int[10][10];
        int i = 9;
        int j = 9;
        for (i = 9; i < myArr3.length && i>0; i--) {
            for (j = 9; j < myArr3[i].length && j>0; j++) {
                myArr3[i][j] = i * j;
                System.out.print(myArr3[i][j] + " ");
                }
            System.out.println();
            }
    }
}
