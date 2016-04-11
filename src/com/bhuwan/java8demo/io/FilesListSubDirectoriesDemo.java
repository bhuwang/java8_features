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
public class FilesListSubDirectoriesDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Path path = Paths.get("/home");
        try (Stream<Path> stream = Files.walk(path, 2);) {
            // print only directories from the /
            stream.filter(p -> p.toFile().isDirectory()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
