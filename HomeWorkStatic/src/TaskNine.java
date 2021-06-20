//Создать переменную типа Calendar с первоначальной датой 1 января 1970 года.
//Добавить к этой дате 85 дней. Вывести дату в консоль.

import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class TaskNine {

       public static void main(String[] args) {

        GregorianCalendar myDay = new GregorianCalendar();

        myDay.set(YEAR, 1970);
        myDay.set(MONTH, 1);
        myDay.set(DAY_OF_MONTH, 1);

        System.out.println(myDay.get(YEAR) + ":" + myDay.get(MONTH)+ ":" + 	myDay.get(DAY_OF_MONTH));

           myDay.add(GregorianCalendar.DATE, 85);

           System.out.println(myDay.get(YEAR) + ":" + myDay.get(MONTH)+ ":" + 	myDay.get(DAY_OF_MONTH));
    }
}
