package com.examples.playground.views.playground.topic_14._3_exception_views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;

@Route("ready-to-go-not-found")
public class CustomRouteNotFoundError extends VerticalLayout
     implements HasErrorParameter<NotFoundException> {

  private H1 errorTitle = new H1();

  public CustomRouteNotFoundError() {

    var homeButton = new Button("Go to Home Page");
    homeButton.addClickListener(
         e -> homeButton.getUI()
                        .ifPresent(ui -> ui.navigate("exception-example-main-view")));

    add(errorTitle, homeButton);

    // Style components
    getStyle().set("text-align", "center");
    getStyle().set("padding", "2em");

    // Add click listener to home button
    homeButton
         .addClickListener(
              e ->
                   homeButton.getUI()
                             .ifPresent(ui ->
                                             ui.navigate("home-exception-view")));
  }

  @Override
  public int setErrorParameter(
       BeforeEnterEvent event,
       ErrorParameter<NotFoundException> parameter) {

    errorTitle.setText("Page Not Found - Ready to Go Exception");

    return 404;
  }
}