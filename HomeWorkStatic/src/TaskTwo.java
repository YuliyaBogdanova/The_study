//Вывести на экран в цикле 5 случайных чисел от 0 до 32.

public class TaskTwo {

    public static void main (String[] args) {
        int size = 5;
        int[] arr = new int[size];
        for (size = 0; size < arr.length; size++) {
            arr[size] = (int) (Math.random() * 32);
            System.out.print(arr[size] + " ");
        }
    }
}
