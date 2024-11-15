package com.examples.playground.views.playground.topic_15.basic_navigation;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("topic-15-dashboard")
public class DashboardView extends Div {
  public DashboardView() {

    add(new H1("Welcome to the Dashboard"));
  }
}