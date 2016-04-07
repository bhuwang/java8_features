/**
 * 
 */
package com.bhuwan.java8demo.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author bhuwan
 *
 */
public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // traverse using iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator value: " + iterator.next());
        }

        // traverse using for
        for (Integer integer : numbers) {
            System.out.println("for value: " + integer);
        }

        // traverse using forEach
        numbers.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                System.out.println("forEach value: " + t);
            }

        });

        // custom consumer implementation
        MyNumberConsumber consumer = new MyNumberConsumber();
        numbers.forEach(consumer);

        // Lamda expression way of traversing

        // 1.
        Consumer<Integer> consumer1 = (Integer t) -> {
            System.out.println("Lamda expression way of traversing : " + t);
        };
        numbers.forEach(consumer1);

        // 2.
        numbers.forEach((Integer i) -> System.out.println("Lamda ii way of traversing: " + i));

        // 3
        numbers.forEach(i -> System.out.println("lamda iii way of traversing: "));

    }
}

class MyNumberConsumber implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println("Custom consumer impl value: " + t);

    }
}
