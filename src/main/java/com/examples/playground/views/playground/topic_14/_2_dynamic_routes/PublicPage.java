package com.examples.playground.views.playground.topic_14._2_dynamic_routes;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("public")
public class PublicPage extends VerticalLayout {

  public PublicPage() {

    add(new Label("Welcome to our Book Club! Here’s a list of books available for everyone."));
  }

}