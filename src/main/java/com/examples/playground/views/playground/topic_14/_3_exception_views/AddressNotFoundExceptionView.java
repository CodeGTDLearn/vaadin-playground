package com.examples.playground.views.playground.topic_14._3_exception_views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.ErrorParameter;
import com.vaadin.flow.router.HasErrorParameter;
import com.vaadin.flow.router.Route;

@Route("address-not-found")
public class AddressNotFoundExceptionView extends Div
     implements HasErrorParameter<ClientAddressNotFoundException> {

  @Override
  public int setErrorParameter(
       BeforeEnterEvent event,
       ErrorParameter<ClientAddressNotFoundException> parameter
  ) {

    H1 errorTitle = new H1("Address Not Found");

    var errorMessage = new Paragraph(parameter.getException()
                                              .getMessage());

    var homeButton = new Button("Return to Home");
    homeButton.addClickListener(
              e -> homeButton.getUI().ifPresent(
                   ui ->ui.navigate("home-exception-view")));

    add(errorTitle, errorMessage, homeButton);

    // Style components
    getStyle().set("text-align", "center");
    getStyle().set("padding", "2em");

    return 404;
  }
}