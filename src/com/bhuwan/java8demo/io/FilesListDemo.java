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
public class FilesListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Path path = Paths.get("/");
        try (Stream<Path> stream = Files.list(path);) {
            // print only directories from the /
            stream.filter(p -> p.toFile().isDirectory()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
