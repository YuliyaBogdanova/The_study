//Создать собственный функциональный интерфейс, принимающий три параметра.
//Реализовать его с помощью лямбд.

public class TaskTwo {

@FunctionalInterface

    public interface myOwn <Integer, Double> {
    Double operation (Integer a, Integer b, Double h);
}
    public static void main(String[] args) {

        myOwn <Integer, Double> cubeVolume = (a, b, h) -> a*b*h;
        System.out.println("The cube volume : " + cubeVolume.operation(5,12,5.65));
    }
}
