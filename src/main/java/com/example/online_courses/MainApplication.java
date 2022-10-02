package com.example.online_courses;

import com.example.online_courses.ui.AccordianLayout;
import com.example.online_courses.ui.HomePageLayout;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        HomePageLayout homePageLayout=new HomePageLayout();
        FlowPane flowPane=homePageLayout.setHomeLayout();
        Scene scene = new Scene(flowPane, 600, 600);
        stage.setTitle("Online Courses!");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}