package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;


/**
 * stream api = it is sequence of object and it have many methods
 *              we combine that method and produce desire result
 *
 * types - sequential and parallel stream(multithreading)
 *
 * operation - intermediate and terminal
 *
 * terminal - forEach(),reduce(),collect()
 * intermediate - map(Function),filter(Predicate),sorted()
 *
 */

public class StreamApi {
    public static void main(String[] args) {
        //
        Function<Integer, Integer> fun = (Integer integer) -> integer * integer;

        System.out.println(fun.apply(7));
        //
        Function<String, Integer> str = (s)-> s.length();

        System.out.println(str.apply("welcome"));

        //
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7).max().getAsInt());//print max number
        System.out.println(Arrays.toString(IntStream.range(1, 100).toArray()));//print 1 to 100 no
        System.out.println(IntStream.range(1, 11).sum());//print 1 to 10 sum.

        Predicate<Integer> max = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                    return integer > 5;
                }
            };

            list.stream().filter(max).forEach(System.out::println);
        }
    }
