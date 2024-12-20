package acessmod;

import java.util.function.*;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        Predicate<Integer> isGreaterThan = (num) -> num > 100;

        // Combined predicate: AND condition
        Predicate<Integer> isEvenAndGreaterThan = isEven.and(isGreaterThan);

        // Combined predicate: OR condition
        Predicate<Integer> isEvenOrGreaterThan = isEven.or(isGreaterThan);

        // Negated predicate
        Predicate<Integer> isNotEven = isEven.negate();

        int Number = 120;
        // define a supplier that returns a default message
        Supplier<String> messageSupplier=()->"Hello , Welcome to Java 8 !";
        
        
        // get the message by invoking the get() method of the supplier
        String message=messageSupplier.get();
        System.out.println(message);
        
        //define a consumer message printer
        
        Consumer<String> messageresult=(msg)->System.out.println(msg);
        
        messageresult.accept("This is a message to print");
        System.out.println("Is the number even? " + isEven.test(Number));
        System.out.println("Is the number greater than 100? " + isGreaterThan.test(Number));
        System.out.println("Is the number even AND greater than 100? " + isEvenAndGreaterThan.test(Number));
        System.out.println("Is the number even OR greater than 100? " + isEvenOrGreaterThan.test(Number));
        System.out.println("Is the number NOT even? " + isNotEven.test(Number));
    }
}
