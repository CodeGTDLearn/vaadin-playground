package com.examples.playground.views.playground.topic_15.navigation_parameters;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;

@Route("course")
public class CourseView extends Div implements HasUrlParameter<String> {

  @Override
  public void setParameter(BeforeEvent event, String parameter) {

    add(new H1("Welcome to the " + parameter + " course!"));
    
  }
}