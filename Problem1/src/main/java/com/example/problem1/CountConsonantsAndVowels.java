package com.example.problem1;
/*
Caden Lyon
Computer Science II
3/22/24
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
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
        Scene scene = new Scene(group, 320, 240, Color.LIGHTSKYBLUE);
        File file = new File("TestFile.txt");
        String fileName = "TestFile.txt";
        String fileContent = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);

        Set<String> charSet = new HashSet<String>();
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


        //System.out.println(fileContent);
        stage.setTitle("Problem 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}