package com.example.online_courses.ui;

import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class HomePageLayout {
    private FlowPane flowPane = new FlowPane();

    public FlowPane setHomeLayout() {
        AccordianLayout accordianLayout = new AccordianLayout();
        Accordion acc = accordianLayout.getAccordion();
        acc.setMinSize(300,300);
        flowPane.getChildren().add(acc);
        flowPane.setAlignment(Pos.CENTER);
        return flowPane;
    }

}
