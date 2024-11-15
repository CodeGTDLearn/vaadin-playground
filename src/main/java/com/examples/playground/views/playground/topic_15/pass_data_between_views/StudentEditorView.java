package com.examples.playground.views.playground.topic_15.pass_data_between_views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("edit-student")
public class StudentEditorView extends Div  {

    private final Label studentLabel = new Label();
    private final TextField nameField = new TextField("Name");

    public void showStudent(Student student) {

        studentLabel.setText("Editing Student ID: " + student.getId());
        nameField.setValue(student.getName());
        add(studentLabel, nameField);
    }
}