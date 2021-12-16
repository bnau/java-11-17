package _06_api;

import java.util.List;
import java.util.stream.Collectors;

record Aggregation(long count, double avg) {}

public class _01_teeing {

    public static void main(String... args) {
        // Let's assume the list is really big
        var list = List.of(0, 1, 65, 96423);

        // The old way
        // We iterate twice
        System.out.println(new Aggregation(
                list.stream().peek(System.out::println).collect(Collectors.counting()),
                list.stream().peek(System.out::println).collect(Collectors.averagingInt(i-> i))
        ));

        // The new way
        // We iterate once
        System.out.println(
                list.stream()
                        .peek(System.out::println)
                        .collect(Collectors.teeing(
                                Collectors.counting(),
                                Collectors.averagingInt(i-> i),
                                Aggregation::new)
        ));
    }
}
