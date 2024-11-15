package com.examples.playground.views.playground.topic_16.simple_layouts;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "details", layout = MainLayout.class)
public class DetailsView extends Div {

  public DetailsView() {
    setText("DetailsView Content -> Child Layout");
  }
}