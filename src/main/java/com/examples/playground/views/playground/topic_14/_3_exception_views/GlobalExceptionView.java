package com.examples.playground.views.playground.topic_14._3_exception_views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.ErrorParameter;
import com.vaadin.flow.router.HasErrorParameter;
import com.vaadin.flow.router.Route;

@Route("global-error")
public class GlobalExceptionView extends Div
     implements HasErrorParameter<RuntimeException> {

  @Override
  public int setErrorParameter(
       BeforeEnterEvent event,
       ErrorParameter<RuntimeException> parameter) {

    H1 errorTitle = new H1("Global Error");
    var errorMessage = new Paragraph("An unexpected error occurred.");

    var homeButton = new Button("Return to Home");
    homeButton
         .addClickListener(
              e -> homeButton
                   .getUI()
                   .ifPresent(ui ->
                                   ui.navigate("home-exception-view")));

    add(errorTitle, errorMessage, homeButton);

    // Style components
    getStyle().set("text-align", "center");
    getStyle().set("padding", "2em");

    return 500;
  }
}