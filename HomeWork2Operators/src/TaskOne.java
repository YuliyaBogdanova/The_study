//Дано число от 0 до 59 включительно.
//Определить в какую четверть часа это число попадает

public class TaskOne {
    public static void main(String[] args) {

        int number = 105;
        String str;
        if (number>=0 && number<15)
            str = "Ваше число попадает в первую четверть часа";
        else if  (number>=15 && number<30)
                str = "Ваше число попадает во вторую четверть часа";
        else if  (number>=30 && number<45)
                str = "Ваше число попадает в третью четверть часа";
        else if  (number>=45 && number<=59)
            str = "Ваше число попадает в четвертую четверть часа";
                else
                    str = "Введите число от 0 до 59 включительно";

        System.out.println(str);
        }
    }
