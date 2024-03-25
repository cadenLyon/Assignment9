package com.example.problem3;
/*
Caden Lyon
Computer Science II
3/24/24
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 600, 400, Color.LIGHTSKYBLUE);
        stage.setTitle("Problem 3");
        String[] yearsList = {"2001", "2002", "2003", "2004", "2005", "2006"," 2007", "2008", "2009",
                "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018","2019", "2020", "2021"};
        String[] maleOrFemList = {"Male", "Female"};

        ComboBox yearsListDropDown = new ComboBox<>(FXCollections.observableArrayList(yearsList));
        yearsListDropDown.setLayoutX(300);
        yearsListDropDown.setLayoutY(100);

        ComboBox maleOrFemDropDown = new ComboBox<>(FXCollections.observableArrayList(maleOrFemList));
        maleOrFemDropDown.setLayoutX(300);
        maleOrFemDropDown.setLayoutY(150);

        Text selectAYearText = new Text("Select a year: ");
        selectAYearText.setX(200);
        selectAYearText.setY(120);

        Text maleOrFemText = new Text("Male or female? ");
        maleOrFemText.setX(200);
        maleOrFemText.setY(170);






        group.getChildren().addAll(yearsListDropDown, maleOrFemDropDown, selectAYearText, maleOrFemText);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}