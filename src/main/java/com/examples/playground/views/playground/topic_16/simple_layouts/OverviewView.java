package com.examples.playground.views.playground.topic_16.simple_layouts;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "overview", layout = MainLayout.class)
public class OverviewView extends Div {
  public OverviewView() {

    setText("OverviewView Content -> Child Layout");
  }
}