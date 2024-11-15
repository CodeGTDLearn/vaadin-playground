package com.examples.playground.views.playground.topic_15.pass_data_between_views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

// Topic 4: Passing Data between Views
// Example 4: Passing and Editing Data Between Views
@Route("student-list")
public class StudentListView extends Div {

  public StudentListView() {

    var student = RepoStudentMock.getStudentById();
    var button = new Button("Edit " + student.getName());

    button
         .addClickListener(
              e ->
                   getUI().
                        ifPresent(
                             ui ->
                                  ui.navigate(StudentEditorView.class)
                                    .ifPresent(classView ->
                                                    classView
                                                         .showStudent(student)
                                    )
                        )
         );
    add(button);
  }
}