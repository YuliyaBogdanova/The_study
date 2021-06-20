//Создать List, содержащий 10 чисел. Отфильтровать их таким образом, чтобы остались только числа меньше 10.
// Затем эти числа перевести в строку. Вывести на экран получившийся список. Реализовать с помощью стримов.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskThree {

    static List<Integer> numbersRandom = new ArrayList();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
            numbersRandom.add(i, (int) (Math.random() * 100));

        printList(numbersRandom);
        System.out.println();

        List<String> stringList = numbersRandom.stream().filter(x -> x < 10).map((Object s) ->
                String.valueOf(s)).collect(Collectors.toList());

        for (int i = 0; i < stringList.size(); i++)
            System.out.println(stringList.get(i));
    }

    private static void printList(List<Integer> numbersRandom) {
        for (int i = 0; i < numbersRandom.size(); i++) {
            System.out.println(numbersRandom.get(i));
        }
    }
}