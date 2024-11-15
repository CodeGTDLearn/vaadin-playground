package com.examples.playground.views.playground.topic_16;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "tour", layout = TravelMenuLayout.class)
public class TourView extends Div {
  public TourView() {

    setText("Tour View Content -> Child Layout");
  }
}