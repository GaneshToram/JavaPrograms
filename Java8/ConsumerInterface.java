package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Functional Interface -> An interface which can be implemented in lambda expressions

/* Consumer interface has accept method. forEach method takes the object of Consumer interface and 
   calls the accept method of it. */

class Example implements Consumer<Integer>
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}

public class ConsumerInterface 
{
    public static void main(String[] args) 
    {
        List<Integer> array = Arrays.asList(1, 2, 3);
        array.forEach(new Example());
        // Consumer<Integer> c = (i) -> { System.out.println(i); };
        array.forEach( i -> System.out.println(i) );
    }
}
