//Реализовать любые 5 встроенных функциональных интерфейсов с помощью лямбд, которые появились в Java 8

public class TaskOne {

    @FunctionalInterface
    public interface Function<String, Integer> {
        Integer apply(String str);
    }

    @FunctionalInterface
    public interface BinaryOperator <Double> {
        Double apply (Integer a, Integer r);
   }

   @FunctionalInterface
   public interface UnaryOperator <Double> {
        Integer apply (Integer x);
   }

   @FunctionalInterface
   public interface Predicate<Double> {
        boolean unary (UnaryOperator<Double> x);
   }

    @FunctionalInterface
    public interface Consumer<Double>{
        void accept(Double t);
    }

    public static void main(String[] args) {
        Function<String, Integer> convert = x-> (int)Math.sqrt(Integer.valueOf(x));
        System.out.println(convert.apply("100"));

        BinaryOperator<Double> circumference = (a, r) -> Math.PI*r/180*a;
        System.out.println("arc length : " + circumference.apply(5,12));

        UnaryOperator <Double> smth = t -> t*t*t/2;
        double d = smth.apply (1)%2;
        Predicate<Double> evenNumber = x -> d!=0;
        System.out.println(evenNumber.unary(smth));

        Consumer <Double> printer = x-> System.out.println("Double:  " + x);
        printer.accept(35.325);

    }
}