package com.examples.playground.views.playground.topic_14._1_basic_urlParameter.basic_route;// Import necessary Vaadin packages

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;


@Route("home")
public class ex1_basic_route_config_HomeView extends Div {

  public ex1_basic_route_config_HomeView() {

    setText("Welcome to the Home Page!");
  }

}