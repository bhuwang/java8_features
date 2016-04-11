/**
 * 
 */
package com.bhuwan.java8demo.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class FilesReadLinesDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Path path = Paths.get("src/com/bhuwan/java8demo/io", "cities.txt");
        try (Stream<String> stream = Files.lines(path);) {
            stream.filter(line -> line.contains("Pokhara")).findFirst().ifPresent(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

}
