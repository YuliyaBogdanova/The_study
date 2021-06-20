//Имеется прямоугольное отверстие размерами a и b.
//Определить, можно ли его полностью закрыть круглой картонкой радиусом r.

public class TaskTwo {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int r = 3;
        double  d = Math.sqrt(a*a+b*b);

        String str2;
        if (r*2 > d)
            str2 = "Можно полностью закрыть картонкой с радиусом ";
        else
            str2 = "Нельзя полностью закрыть картонкой с радиусом ";

        System.out.println(str2 + r);

    }
}
