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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 600, 400, Color.LIGHTSKYBLUE);
        stage.setTitle("Problem 3");
        String[] yearsList = {"2001", "2002", "2003", "2004", "2005", "2006"," 2007", "2008", "2009",
                "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018","2019", "2020", "2021", "2022"};
        String[] maleOrFemList = {"Male", "Female"};

        File babyRanking2001 = new File("babynameranking2001.txt");
        File babyRanking2002 = new File("babynameranking2002.txt");
        File babyRanking2003 = new File("babynameranking2003.txt");
        File babyRanking2004 = new File("babynameranking2004.txt");
        File babyRanking2005 = new File("babynameranking2005.txt");
        File babyRanking2006 = new File("babynameranking2006.txt");
        File babyRanking2007 = new File("babynameranking2007.txt");
        File babyRanking2008 = new File("babynameranking2008.txt");
        File babyRanking2009 = new File("babynameranking2009.txt");
        File babyRanking2010 = new File("babynameranking2010.txt");
        File babyRanking2011 = new File("babynameranking2011.txt");
        File babyRanking2012 = new File("babynameranking2012.txt");
        File babyRanking2013 = new File("babynameranking2013.txt");
        File babyRanking2014 = new File("babynameranking2014.txt");
        File babyRanking2015 = new File("babynameranking2015.txt");
        File babyRanking2016 = new File("babynameranking2016.txt");
        File babyRanking2017 = new File("babynameranking2017.txt");
        File babyRanking2018 = new File("babynameranking2018.txt");
        File babyRanking2019 = new File("babynameranking2019.txt");
        File babyRanking2020 = new File("babynameranking2020.txt");
        File babyRanking2021 = new File("babynameranking2021.txt");
        File babyRanking2022 = new File("babynameranking2022.txt");


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

        Text enterANameText = new Text("Enter a name: ");
        enterANameText.setX(200);
        enterANameText.setY(220);

        TextField enterANameTextInput = new TextField();
        enterANameTextInput.setLayoutX(300);
        enterANameTextInput.setLayoutY(200);

        Button findRankingButton = new Button("Find Ranking");
        findRankingButton.setLayoutX(270);
        findRankingButton.setLayoutY(250);






        group.getChildren().addAll(yearsListDropDown, maleOrFemDropDown, selectAYearText, maleOrFemText,
                enterANameText, enterANameTextInput, findRankingButton);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}