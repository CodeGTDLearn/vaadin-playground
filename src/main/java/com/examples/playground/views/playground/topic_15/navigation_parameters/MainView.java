package com.examples.playground.views.playground.topic_15.navigation_parameters;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

// Topic 2: Programmatic Navigation
// Example 2: Button Navigation with Parameters
@Route("main-2")
public class MainView extends Div {

  public MainView() {

    var button = new Button("Go to Course Page");
    button
         .addClickListener(
              e ->
                   button.getUI()
                         .ifPresent(ui ->
                                         ui.navigate(
                                              CourseView.class,
                                              "math"
                                         )
                         )
         );

    add(button);
  }
}