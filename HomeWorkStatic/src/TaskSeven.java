//Напишите три цикла выполняющих многократное сложение строк,
//один с помощью оператора сложения и String,
//другой с помощью StringBuilder и метода append, а также аналогично для StringBuffer.
//Сравните и выведите скорость их выполнения.

public class TaskSeven {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String str1 = "Hi! ";
        String str2 = "I'm here!";

        String str;

        int i = 5;
        while (i > 0) {
            str = " " + str1 + str2;
            i--;
            System.out.print(str);
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println(" Total time for 'str1 + str2' is " + (end-start)+ "ms");
//

        long start2 = System.currentTimeMillis();
        StringBuilder myStr = new StringBuilder("Hi! I'm here again!");
        for (i=0; i<=5; i++){
            myStr.append("... and again! ");
                          }
        System.out.println(myStr);
        long end2 = System.currentTimeMillis();
        System.out.println(" Total time for 'StringBuilder' is " + (end2-start2)+ "ms");

        long start3 = System.currentTimeMillis();
        StringBuffer myStr2 = new StringBuffer("Hi! It's me again! ");
        for (i=0; i<=5; i++){
           myStr2.append(" yet......");
        }
        System.out.println(myStr2);
        long end3 = System.currentTimeMillis();
        System.out.println(" Total time for 'StringBuffer' is " + (end3-start3)+ "ms");
    }


    }



