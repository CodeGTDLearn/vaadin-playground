package com.examples.playground.views.playground.topic_15.basic_navigation;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("topic-15-profile")
public class ProfileView extends Div {
  public ProfileView() {

    add(new H1("Your Profile"));
  }
}