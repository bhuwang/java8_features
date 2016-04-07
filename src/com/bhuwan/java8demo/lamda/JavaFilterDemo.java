/**
 * 
 */
package com.bhuwan.java8demo.lamda;

import java.io.File;
import java.io.FileFilter;

/**
 * @author bhuwan
 *
 */
class JavaFileFilter implements FileFilter {

    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".java");
    }
}

public class JavaFilterDemo {
    public static void main(String[] args) {
        /**
         * Classic way to implement the JavaFileFilter
         */
        System.out.println("Classic way of implementation");
        JavaFileFilter filter = new JavaFileFilter();
        File file = new File("/home/bhuwan/codehome/repo/java8_features/src/com/bhuwan/java8demo/methodreference");
        File[] listFiles = file.listFiles(filter);
        for (File f : listFiles) {
            System.out.println("Files Names: " + f.getName());
        }

        /**
         * 
         * Implement JavaFileFilter using anonymous method.
         */

        FileFilter jf = new FileFilter() {

            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".java");
            }
        };

        System.out.println();
        System.out.println("Using anonymous method.");
        File[] files = file.listFiles(jf);
        for (File f : files) {
            System.out.println("Files Names: " + f.getName());
        }

        /**
         * 
         * Using lamda expression
         */

        // Using Lamda Expression
        FileFilter jFilter = (File f) -> f.getName().endsWith(".java");

        System.out.println();
        System.out.println("Using lamda expression.");
        files = file.listFiles(jFilter);
        for (File f : files) {
            System.out.println("Files Names: " + f.getName());
        }
    }
}
