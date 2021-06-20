//Дан любой угол. Вывести на экран синус и косинус этого угла.

public class TaskThree {

    public static void main (String[] args) {

       int corner = (int) Math.toRadians(60);
        System.out.println(Math.cos(corner));
        System.out.println(Math.sin(corner));
    }
}
