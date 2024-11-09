package com.examples.playground.views.playground.topic_14._1_basic_urlParameter.basic_route;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route("profile")
@RouteAlias("user-profile")
public class ex3_route_alias_ProfileView extends Div {

  public ex3_route_alias_ProfileView() {

    setText("Welcome to the Profile Page!");

  }
}