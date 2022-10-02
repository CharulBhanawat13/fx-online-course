package com.example.online_courses.ui;

import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class AccordianLayout {

    public Accordion accordion=new Accordion();
    public List<Button> buttonList=new ArrayList<>();

    public Accordion getAccordion() {
        return createAccordian();
    }
    public List<Button> getButtons(){
        return createButtons();
    }


    public Accordion createAccordian(){
        TitledPane syllabusPane=new TitledPane();
        VBox syllabusBox=new VBox();
        syllabusPane.setText("Syllabus");
        syllabusPane.setContent(syllabusBox);

        TitledPane previous_paper=new TitledPane();
        VBox previous_paper_box=new VBox();
        previous_paper.setText("Previous year paper");
        previous_paper.setContent(previous_paper_box);


        TitledPane prev_paper_ak=new TitledPane();
        VBox prev_paper_ak_box=new VBox();
        prev_paper_ak.setText("Previous yr paper with Ans key");
        prev_paper_ak.setContent(prev_paper_ak_box);

        TitledPane study_material=new TitledPane();
        VBox study_material_box=new VBox();
        study_material.setText("Syllabus");
        study_material.setContent(study_material_box);


        accordion.getPanes().add(syllabusPane);
        accordion.getPanes().add(previous_paper);
        accordion.getPanes().add(prev_paper_ak);
        accordion.getPanes().add(study_material);

        return accordion;

    }

    public List<Button> createButtons(){
        return null;
    }

}
