package com.example.problem1;
/*
Caden Lyon
Computer Science II
3/22/24
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class CountConsonantsAndVowels extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 600, 400, Color.LIGHTSKYBLUE);


        Text title = new Text("Enter your file name");
        title.setFont(Font.font(20));
        title.setX(200);
        title.setY(50);

        TextField userInputFileName = new TextField();
        userInputFileName.setLayoutX(210);
        userInputFileName.setLayoutY(100);

        Button userEnter = new Button("Enter");
        userEnter.setLayoutX(260);
        userEnter.setLayoutY(200);

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String userFileName = userInputFileName.getText();

                File file = new File(userFileName);
                final String[] fileName = {userFileName};
                String fileContent = null;
                try {
                    fileContent = Files.readString(Paths.get(fileName[0]), StandardCharsets.UTF_8);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                Set<String> vowelSet = new HashSet<String>();
                Set<String> consSet = new HashSet<String>();

                int vowelCount = 0;
                int consCount = 0;

                for(int i = 0; i<fileContent.length(); i++){
                    String charString = String.valueOf(fileContent.charAt(i));
                    String lowerCharString = charString.toLowerCase();
                    if (Character.isLetter(fileContent.charAt(i))){
                        if(lowerCharString.matches("[aeiouAEIOU]")){
                            vowelCount += 1;
                            vowelSet.add(lowerCharString);
                        }else{
                            consCount += 1;
                            consSet.add(lowerCharString);
                        }
                    }
                }

                System.out.println(vowelSet);
                System.out.println(consSet);
                System.out.println(vowelCount);
                System.out.println(consCount);
            }
        };

        userEnter.setOnAction(event);







        //System.out.println(fileContent);
        group.getChildren().addAll(userInputFileName, title, userEnter);
        stage.setTitle("Problem 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}