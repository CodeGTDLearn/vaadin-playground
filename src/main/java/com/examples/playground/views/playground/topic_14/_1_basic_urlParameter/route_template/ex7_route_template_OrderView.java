package com.examples.playground.views.playground.topic_14._1_basic_urlParameter.route_template;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

@Route("orders/:orderId")
public class ex7_route_template_OrderView extends Div
     implements BeforeEnterObserver {

  public ex7_route_template_OrderView() {

  }

  @Override
  public void beforeEnter(BeforeEnterEvent event) {

    var localVar = event.getRouteParameters()
                        .get("orderId");

    var yourUrl = event.getLocation()
                       .getPath();

    if (localVar.isPresent()) setText("Order ID: " + localVar + " - " + yourUrl);
  }

}