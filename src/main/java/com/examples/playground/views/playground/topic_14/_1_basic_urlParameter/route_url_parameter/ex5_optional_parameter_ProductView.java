package com.examples.playground.views.playground.topic_14._1_basic_urlParameter.route_url_parameter;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;

@Route("product")
public class ex5_optional_parameter_ProductView extends Div
     implements HasUrlParameter<String> {
  @Override
  public void setParameter(BeforeEvent event,
                           @OptionalParameter String productId) {

    if (productId == null) {
      setText("Product ID not provided.");
    } else {
      setText("Product ID: " + productId);
    }
  }
}