package com.examples.playground.views.playground.topic_14._2_dynamic_routes;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.server.VaadinSession;

@Route("member-area")
public class MemberPage extends VerticalLayout {

  public MemberPage() {

    Button logoutButton = new Button("Logout", event -> {

      // Clears the user session
      VaadinSession.getCurrent().setAttribute("user", null);

      // Remove session routes
      RouteConfiguration.forSessionScope().removeRoute("member-area");

      // Redirects to the public page
      UI.getCurrent().navigate("readersclub");
    });

    add(new Label("Hello Member! Here are your exclusive reading recommendations."),logoutButton);
  }

}