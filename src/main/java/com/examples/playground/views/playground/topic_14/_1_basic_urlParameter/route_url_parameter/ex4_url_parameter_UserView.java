package com.examples.playground.views.playground.topic_14._1_basic_urlParameter.route_url_parameter;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;

@Route("user")
public class ex4_url_parameter_UserView extends Div
     implements HasUrlParameter<String> {

  @Override
  public void setParameter(BeforeEvent event, String parameter) {

    setText("User ID: " + parameter);
  }
}