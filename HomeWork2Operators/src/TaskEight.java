import java.util.Scanner;
/* Локатор ориентирован на одну из сторон света («С» – север, «З» – запад, «Ю» – юг, «В» – восток)
и может принимать одну из трех цифровых команд: -1 – поворот налево, 3 – поворот направо, 2 – поворот на 180 градусов.
 */

public class TaskEight {
    public static void main(String[] args) {

        Scanner inStartPoint = new Scanner(System.in);
        System.out.println("Введите исходную ориентацию локатора (кирилица, прописная), где: \n «С» – север \n «З» – запад \n «Ю» – юг \n «В» – восток");
        String strStartPoint = inStartPoint.next();
        Scanner inDirection = new Scanner(System.in);
        System.out.println("Введите направление движения локатора, где: \n «1» – поворот налево \n «3» – поворот направо \n «2» – поворот на 180 градусов");
        int Direction = inDirection.nextInt();
        System.out.println("Введенные Вами данные:\n исходная ориентация локатора: " + strStartPoint + " \n направление движения локатора: " + Direction);

        String south = "Ю";
        String north = "С";
        String west = "З";
        String east = "В";
        String str = null;

        if (strStartPoint.equals(north)) {
            switch (Direction) {
                case 1:
                    str = "З";
                    break;
                case 2:
                    str = "Ю";
                    break;
                case 3:
                    str = "В";
                    break;
            }
        }
        else if (strStartPoint.equals(east)) {
            switch (Direction) {
                case 1:
                    str = "С";
                    break;
                case 2:
                    str = "З";
                    break;
                case 3:
                    str = "Ю";
                    break;
            }
        }
        else if (strStartPoint.equals(south)) {
            switch (Direction) {
                case 1:
                    str = "В";
                    break;
                case 2:
                    str = "С";
                    break;
                case 3:
                    str = "З";
                    break;
            }
        }
        else if (strStartPoint.equals(west)) {
            switch (Direction) {
                case 1:
                    str = "Ю";
                    break;
                case 2:
                    str = "В";
                    break;
                case 3:
                    str = "С";
                    break;
            }
        }
        else
            str = "Введите данные в соответствии с требованиями!!!";

        System.out.print(str);

    }
}
