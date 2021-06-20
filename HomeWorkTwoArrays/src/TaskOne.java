//Создать массив из 5 чисел. Вывести среднее арифметическое число

public class TaskOne {

    public static void main(String[] args) {
        int[] myArr = {1,1,1,1,1};
        int s;
        int sum =0;
        for (s = 0;s<myArr.length; s++) {
            sum = sum + myArr[s];
        }
        System.out.print("Сумма элементов массива равна: " +sum);
    }
}
