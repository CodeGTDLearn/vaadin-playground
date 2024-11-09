package com.examples.playground.views.playground.topic_14._2_dynamic_routes;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("readersclub")
public class ReadersClubLoginView extends VerticalLayout {

  public ReadersClubLoginView() {

    Button loginButton =
         new Button(
              "Login as Member (Log Simulation)",
              click -> {
                VaadinSession
                     .getCurrent()
                     .setAttribute("user", "member");

                ReadersClubUtils.configureRoutes();

                UI.getCurrent()
                  .navigate("member-area");  // Directs the user to the member area
              }
         );

    Button publicButton = new Button(
         "View Public Page",
         click ->
              UI.getCurrent().navigate("public")
    );

    add(new Label("Welcome to the Book Club!"), loginButton, publicButton);

  }
}