/**
 * 
 */
package com.bhuwan.java8demo.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author bhuwan
 *
 */
public class JavaFXDemo extends Application{

    /**
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label message = new Label("Hello Bhuwan!");
        message.setFont(new Font(100));
        
        Label message2 = new Label("Good Morning!");
        message2.setFont(new Font(100));
        
        // create a layout and add messages
        VBox box = new VBox(message, message2);
        
        stage.setScene(new Scene(box));
        stage.setTitle("Hello");
        stage.show();
    }

}
