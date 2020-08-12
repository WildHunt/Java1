package lambda;

import java.util.function.*;
import java.util.Scanner;

public class FunctionalInterface {

    static class PredicateExample {
        public static void main(String[] args) {
            Predicate<Integer> isPositive = x -> x > 0;
            System.out.println(isPositive.test(-5));
        }
    }

    /**
     * Makes binary operation with 2 params, return <T>
     */
    static class BinaryExample {
        public static void main(String[] args) {
            BinaryOperator<Integer> multiply = (x,y) -> (x*y);
            System.out.println(multiply.apply(2,3));
        }
    }

    /**
     * BinaryOperator - to compare Person age
     */
    static class BinaryExample2 {
        private String name;
        private  int age;

        public BinaryExample2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static void main(String[] args) {
            BinaryExample2 person1 = new BinaryExample2("Roma", 22);
            BinaryExample2 person2 = new BinaryExample2("Luna", 19);
            BinaryOperator<BinaryExample2> maxAge = BinaryOperator.maxBy(
                    (BinaryExample2 p1, BinaryExample2 p2)->p1.age - p2.age);
            System.out.println(maxAge.apply(person1,person2));
        }

        @Override
        public String toString() {
            return "BinaryExample2{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    /**
     * Unary (1) operand. Input&Output same type
     */
    static class UnaryExample {
        public static void main(String[] args) {
            UnaryOperator<String> upperCase = x->x.toUpperCase();
            System.out.println(upperCase.apply("x"));
        }
    }

    /**
     * Function<T, R> transform object T to object R
     */
    static class FunctionExample {
        public static void main(String[] args) {
            Function<Integer, String> convertMoney = x-> String.valueOf(x) + " dollars";
            System.out.println(convertMoney.apply(5));
        }
    }

    /**
     * Consumer<T> makes smth with T, and not return it
     */
    static class ConsumerExample {
        public static void main(String[] args) {
            Consumer<Integer> printer = x-> System.out.printf("%d dollars", x);
            printer.accept(5);
        }
    }

    /**
     * Supplier<T> not arguments, but return <T>
     */
    static class SupplierExample {
        private String name;

        public SupplierExample(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Supplier<SupplierExample> setname = ()->{
                Scanner in = new Scanner(System.in);
                System.out.println("Input name ");
                String name = in.nextLine();
                return new SupplierExample(name);
            };
            SupplierExample se1 = setname.get();
        }
    }

}
